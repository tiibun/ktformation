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
 * [${name} - AWS CloudFormation](${resource.documentation})
 */
@CloudFormationMarker
class ${className}(logicalId: String) : Resource<${className}.Properties>(logicalId, "${name}") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
${props.joinToLines { (k, v) ->
    """
        @JvmField var ${k}: Any? = null
        fun ${k}(value: ${v.typeName()}) { this.${k} = value }
        ${when (v.type) {
        "Map" -> ""
        "List" -> """
        fun ${k}(vararg value: IntrinsicFunction) { this.${k} = value }
        """.trimIndent()
        else -> """
        fun ${k}(value: IntrinsicFunction) { this.${k} = value }
        """.trimIndent()
    }}
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
subproperties.joinToLines { (k, v) ->
    """

    class ${k}(
${v.properties.joinToLines(",") { (k, v) ->
        """
            val ${k.decapitalize()}: ${v.typeName()}${!v.required then "? = null"}
"""
    }}
    )
"""
}}
${customMembers(className)}
}

fun Resources.${className.replace(Regex("^AWS"), "aws")}(logicalId: String, init: ${className}.() -> Unit = {}): ${className} {
    return ${className}(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
"""
