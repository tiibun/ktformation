import ktformation.generate.Resource

infix fun Boolean?.then(then: Any) = if (this == true) then else ""
val name = bindings["name"] as String
val resource = bindings["resource"] as Resource
val isCustomProperty = bindings["isCustomProperty"] as Boolean
"""
"${name}": {
    "type": "object",
    ${if (isCustomProperty) """
    ${resource.required.isNotEmpty() then """
    "required": [${resource.required}],
    """}
    "properties": {
        ${resource.properties.map { (name, property) -> property.schema(name, name) }.joinToString(",")}
    },
    """ else """
    "required": ${if (resource.required.isNotEmpty()) """["Type", "Properties"]""" else """["Type"]"""},
    "properties": {
        "Properties": {
            "type": "object",
            "properties": {
                ${resource.properties.map { (name, property) -> property.schema(name, name) }.joinToString(",")}
            },
            ${resource.required.isNotEmpty() then """"required": [${resource.required}],"""}
            "additionalProperties": false
        },
        "Type": {
            "type": "string",
            "enum": [
                "${name}"
            ]
        },
        ${(name in listOf("AWS::AutoScaling::AutoScalingGroup", "AWS::EC2::Instance", "AWS::CloudFormation::WaitCondition")) then """
        "CreationPolicy": {
            "type": "object"
        },
        """}
        ${(name == "AWS::AutoScaling::AutoScalingGroup") then """
        "UpdatePolicy": {
            "type": "object"
        },
        """}
        "DeletionPolicy": {
            "type": "string",
            "enum": [
                "Delete",
                "Retain",
                "Snapshot"
            ]
        },
        "DependsOn": {
            "anyOf": [
                {
                    "type": "string",
                    "pattern": "^[a-zA-Z0-9]+$"
                },
                {
                    "items": {
                        "type": "string",
                        "pattern": "^[a-zA-Z0-9]+$"
                    },
                    "type": "array"
                }
            ]
        },
        "Metadata": {
            "type": "object"
        }
    },
    """}
    "additionalProperties": false
}
"""