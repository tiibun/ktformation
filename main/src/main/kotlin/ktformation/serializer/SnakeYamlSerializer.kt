package ktformation.serializer

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import ktformation.FnGetAtt
import ktformation.IntrinsicFunction
import ktformation.ParameterType
import ktformation.policy.Effect
import ktformation.util.ClassFinder
import org.yaml.snakeyaml.DumperOptions
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.introspector.BeanAccess
import org.yaml.snakeyaml.introspector.Property
import org.yaml.snakeyaml.introspector.PropertyUtils
import org.yaml.snakeyaml.nodes.*
import org.yaml.snakeyaml.representer.Represent
import org.yaml.snakeyaml.representer.Representer
import java.lang.reflect.Field

class SnakeYamlSerializer {

    fun serialize(source: Any, short: Boolean): String {
        return Yaml(object : Representer() {
            init {
                propertyUtils = ReservedOrderedPropertyUtils()
                addFunctionRepresents()
                representers[ParameterType::class.java] = EnumRepresent()
                representers[Effect::class.java] = EnumRepresent()
            }

            private fun addFunctionRepresents() {
                ClassFinder.getChildren(IntrinsicFunction::class.java).forEach {
                    representers[it] = IntrinsicFunctionRepresent()
                }
            }

            override fun representScalar(tag: Tag?, value: String?): Node {
                // if value is multi line,
                if (value?.contains("\n") == true)
                    return super.representScalar(tag, value, '|')
                else
                    return super.representScalar(tag, value)
            }

            override fun representJavaBean(properties: MutableSet<Property>, javaBean: Any): MappingNode {
                // suppress tag
                classTags.putIfAbsent(javaBean.javaClass, Tag.MAP)
                return super.representJavaBean(properties, javaBean)
            }

            override fun representJavaBeanProperty(
                javaBean: Any, property: Property, propertyValue: Any?,
                customTag: Tag?
            ): NodeTuple? {
                // suppress null or empty collection
                if (propertyValue == null) return null
                if (propertyValue is List<*> && propertyValue.isEmpty()) return null
                if (propertyValue is Map<*, *> && propertyValue.isEmpty()) return null

                // JsonIgnore annotation
                val member = getJavaField(javaBean.javaClass, property.name)
                val jsonIgnore = member?.getAnnotation(JsonIgnore::class.java)
                if (jsonIgnore?.value == true) return null

                // JsonProperty annotation
                val jsonProperty = member?.getAnnotation(JsonProperty::class.java)
                val propertyName = jsonProperty?.value ?: property.name.capitalize()

                val tuple = super.representJavaBeanProperty(javaBean, property, propertyValue, customTag)
                return NodeTuple(
                    ScalarNode(
                        tuple.keyNode.tag,
                        propertyName,
                        tuple.keyNode.startMark,
                        tuple.keyNode.endMark,
                        (tuple.keyNode as ScalarNode).style
                    ),
                    tuple.valueNode
                )
            }

            fun getJavaField(jClass: Class<*>, name: String): Field? {
                return jClass.declaredFields.find { it.name == name } ?: if (jClass.superclass != null) {
                    getJavaField(jClass.superclass, name)
                } else {
                    null
                }
            }

            inner class IntrinsicFunctionRepresent : Represent {
                override fun representData(data: Any?): Node {
                    if (data !is IntrinsicFunction) error("is not IntrinsicFunction")
                    return representIntrinsicFunction(data)
                }

                fun representIntrinsicFunction(data: IntrinsicFunction): Node {
                    return if (short) {
                        val tag = Tag("!" + data.name.replace("Fn::", ""))
                        if (data is FnGetAtt) {
                            representScalar(tag, data.shortValue)
                        } else {
                            when (data.value) {
                                is Map<*, *> -> representMapping(tag, data.value as Map<*, *>, false)
                                is List<*> -> representSequence(tag, data.value as List<*>, false)
                                is Array<*> -> representSequence(tag, (data.value as Array<*>).toList(), false)
                                is IntrinsicFunction -> representMapping(Tag.MAP, mapOf(data.name to data.value), false)
                                else -> representScalar(tag, data.value.toString())
                            }
                        }
                    } else {
                        representMapping(Tag.MAP, mapOf(data.name to data.value), null)
                    }
                }
            }

            /**
             * use toString to dump an enum
             */
            inner class EnumRepresent : Represent {
                override fun representData(data: Any?): Node {
                    return ScalarNode(Tag.STR, data.toString(), null, null, null)
                }
            }
        }, DumperOptions().apply {
            isAllowReadOnlyProperties = true
        }).dumpAsMap(source)
    }

    class ReservedOrderedPropertyUtils : PropertyUtils() {
        override fun createPropertySet(type: Class<out Any>?, bAccess: BeanAccess?): MutableSet<Property> {
            // super.createPropertySet returns TreeSet
            return getPropertiesMap(type, BeanAccess.FIELD).values.filter { it.isReadable }.toMutableSet()
        }
    }
}
