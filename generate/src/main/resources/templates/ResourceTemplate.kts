import ktformation.generate.*

val name = bindings["name"] as String
val resource = bindings["resource"] as Resource
@Suppress("UNCHECKED_CAST")
val subproperties = bindings["subproperties"] as Map<String, Resource>
val className = className(name)
val props = resource.properties.mapKeys { it.key.decapitalize() }
"""
package ktformation.generated

import ktformation.*

/**
 * [$name - AWS CloudFormation](${resource.documentation})
 */
@CloudFormationMarker
class $className(logicalId: String) : Resource<$className.Properties>(logicalId, "$name") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
${props.joinToLines { (k, v) ->
    """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        @JvmField
        var $k: Any? = null

        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(value: ${v.typeName()}) {
          this.$k = value
        }
        ${when (v.type) {
        "Map" -> ""
        "List" -> """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(vararg value: IntrinsicFunction) {
          this.$k = value
        }
"""
        else -> """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(value: IntrinsicFunction) {
          this.$k = value
        }
"""
        }}
"""
}}
${subproperties.joinToLines { (subClassName, v) ->
        """
        /**
        * [$subClassName](${v.documentation})
        */
        fun ${subClassName.decapitalize()}(init: $subClassName.() -> Unit = {}): $subClassName {
            return $subClassName().also {
                it.init()
            }
        }
"""
}}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }

${// Subproperty classes
subproperties.joinToLines { (subClassName, v) ->
    """

    @CloudFormationMarker
    class $subClassName {
    ${v.properties.mapKeys { it.key.decapitalize() }.joinToLines { (k, v) ->
        """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        var ${k.decapitalize()}: Any? = null

        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(value: ${v.typeName()}) {
          this.$k = value
        }
        ${when (v.type) {
        "Map" -> ""
        "List" -> """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(vararg value: IntrinsicFunction) {
          this.$k = value
        }
"""
        else -> """
        /**
         * [$k](${v.documentation})
         *
         * _Required_: ${if (v.required) "yes" else "no"}
         *
         * _Type_: ${v.typeName()}
         */
        fun $k(value: IntrinsicFunction) {
          this.$k = value
        }
"""
        }}
"""
}}
    }
"""
}}
${customMembers(className)}
}

/**
 * [$name - AWS CloudFormation](${resource.documentation})
 */
fun Resources.${className.replace(Regex("^AWS"), "aws")}(logicalId: String, init: $className.() -> Unit = {}): $className {
    return $className(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
"""
