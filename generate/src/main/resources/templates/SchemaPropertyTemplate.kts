import ktformation.generate.Property

infix fun Boolean?.then(then: Any) = if (this == true) then else ""
infix fun Boolean?.then(then: () -> Any) = if (this == true) then() else ""
infix fun Boolean?.or(target: Boolean?) = this == true || target == true
val name = bindings["name"] as String
val parent = bindings["parent"] as String
val property = bindings["property"] as Property
fun convertToJSONType(name: String) =
        when (name) {
            "String" -> "string"
            "Long" -> "number"
            "Integer" -> "number"
            "Double" -> "number"
            "Boolean" -> "boolean"
            "Timestamp" -> "string"
            "Json" -> "object"
            else -> name
        }
"""
"${name}": {

${if (property.isPolymorphic()) """
    "anyOf": [
        ${property.primitiveTypes?.isNotEmpty() then {
    """
            {
                "type": [
                    ${property.primitiveTypes!!.joinToString(",") { primitiveType ->
                        convertToJSONType(primitiveType)
    }}
                ]
            }${(property.primitiveItemTypes?.isNotEmpty() or
            property.types?.isNotEmpty() or
            property.itemTypes?.isNotEmpty()) then ","}
        """
}}

        ${property.primitiveItemTypes?.isNotEmpty() then {
    """
            ${property.primitiveItemTypes!!.joinToString(",\n") { primitiveItemType -> """
            {
                "type": "array",
                "items": {
                    "type": "${convertToJSONType(primitiveItemType)}"
                }
            }"""
    }}${((property.types?.isNotEmpty() or property.itemTypes?.isNotEmpty()) then ",")}
        """
}}

        ${property.types?.isNotEmpty() then {
    """
            ${property.types!!.joinToString(",\n") { customType -> """
            { "${'$'}ref": "#/definitions/${parent}.${customType}" }
            """
    }}${property.itemTypes?.isNotEmpty() then ","}
        """
}}

        ${property.itemTypes?.isNotEmpty() then {
    """
            ${property.itemTypes!!.joinToString(",\n") { itemType -> """
            {
                "type": "array",
                "items": {
                    "${'$'}ref": "#/definitions/${parent}.${itemType}"
                }
            }
            """}}
        """
}}
    ]
""" else """

    ${property.isCustomType() then """
        "${'$'}ref": "#/definitions/${parent}.${property.type}"
    """}

    ${property.isPrimitive() then """
        "type": "${property.getJSONPrimitiveType()}"
    """}

    ${property.isMap() then """
        "type": "object",
        ${if (property.isMapOfPrimitives()) """
        "patternProperties": {
            "^[a-zA-Z0-9]+$": {
                "type": "${property.getJSONPrimitiveType()}"
            }
        },
        """ else """
        "patternProperties": {
            "^[a-zA-Z0-9]+$": {
                ${if (property.itemType == "Tag") """
                    "${'$'}ref": "#/definitions/Tag"
                """ else """
                    "${'$'}ref": "#/definitions/${parent}.${property.itemType}"
                """}
            }
        },
        """}
        "additionalProperties": false
    """}

    ${property.isList() then """
        "type": "array",
        ${if (property.isListOfPrimitives()) """
        "items": {
            "type": "${property.getJSONPrimitiveType()}"
        }
        """ else """
        "items": {
            ${if (property.itemType == "Tag") """
                "${'$'}ref": "#/definitions/Tag"
            """ else """
                "${'$'}ref": "#/definitions/${parent}.${property.itemType}"
            """}
        }
        """}
    """}

"""}
}
"""