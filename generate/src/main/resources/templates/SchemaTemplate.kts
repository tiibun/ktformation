val spec = bindings["spec"] as ktformation.generate.CloudFormationResourceSpecification
"""
{
    "${'$'}schema": "http://json-schema.org/draft-04/schema#",
    "type": "object",
    "properties": {

        "AWSTemplateFormatVersion": {
            "type": "string",
            "enum": [
                "2010-09-09"
            ]
        },

        "Description": {
            "description": "Template description",
            "type": "string",
            "maxLength": 1024
        },

        "Metadata": {
            "type": "object"
        },

        "Transform": {${if (!spec.resourceSpecificationTransform.isNullOrEmpty()) """
            "type": "string",
            "enum": [
                "${spec.resourceSpecificationTransform}"
            ]
        """ else """
            "type": ["object","string"]
        """}},

        "Parameters": {
            "type": "object",
            "patternProperties": {
                "^[a-zA-Z0-9]+$": {
                    "${'$'}ref": "#/definitions/Parameter"
                }
            },
            "maxProperties": 50,
            "additionalProperties": false
        },

        "Mappings": {
            "type": "object",
            "patternProperties": {
                "^[a-zA-Z0-9]+$": {
                    "type": "object"
                }
            },
            "additionalProperties": false
        },

        "Conditions": {
            "type": "object",
            "patternProperties": {
                "^[a-zA-Z0-9]+$": {
                    "type": "object"
                }
            },
            "additionalProperties": false
        },

        "Outputs": {
            "type": "object",
            "patternProperties": {
                "^[a-zA-Z0-9]+$": {
                    "type": "object"
                }
            },
            "minProperties": 1,
            "maxProperties": 60,
            "additionalProperties": false
        },

        "Resources": {
            "type": "object",
            "patternProperties": {
                "^[a-zA-Z0-9]+$": {
                    "anyOf": [
                        ${spec.resourceTypes.map {(name, _) -> """
                        { "${'$'}ref": "#/definitions/{$name}" }
                        """}.joinToString(", ")}
                    ]
                }
            },
            "additionalProperties": false
        }
    },
    "required": [
        ${if (!spec.resourceSpecificationTransform.isNullOrEmpty()) """
            "Transform",
        """ else ""}

        "Resources"
    ],
    "additionalProperties": false,
    "definitions": {
        "Parameter": {
            "type": "object",
            "properties": {
                "Type": {
                    "type": "string",
                    "enum": [
                        "String",
                        "Number",
                        "List<Number>",
                        "CommaDelimitedList",
                        "AWS::EC2::AvailabilityZone::Name",
                        "AWS::EC2::Image::Id",
                        "AWS::EC2::Instance::Id",
                        "AWS::EC2::KeyPair::KeyName",
                        "AWS::EC2::SecurityGroup::GroupName",
                        "AWS::EC2::SecurityGroup::Id",
                        "AWS::EC2::Subnet::Id",
                        "AWS::EC2::Volume::Id",
                        "AWS::EC2::VPC::Id",
                        "AWS::Route53::HostedZone::Id",
                        "List<AWS::EC2::AvailabilityZone::Name>",
                        "List<AWS::EC2::Image::Id>",
                        "List<AWS::EC2::Instance::Id>",
                        "List<AWS::EC2::SecurityGroup::GroupName>",
                        "List<AWS::EC2::SecurityGroup::Id>",
                        "List<AWS::EC2::Subnet::Id>",
                        "List<AWS::EC2::Volume::Id>",
                        "List<AWS::EC2::VPC::Id>",
                        "List<AWS::Route53::HostedZone::Id>",
                        "List<String>"
                    ]
                },
                "AllowedPattern": {
                    "type": "string"
                },
                "AllowedValues": {
                    "type": "array"
                },
                "ConstraintDescription": {
                    "type": "string"
                },
                "Default": {
                    "type": "string"
                },
                "Description": {
                    "type": "string"
                },
                "MaxLength": {
                    "type": "string"
                },
                "MaxValue": {
                    "type": "string"
                },
                "MinLength": {
                    "type": "string"
                },
                "MinValue": {
                    "type": "string"
                },
                "NoEcho": {
                    "type": [
                        "string",
                        "boolean"
                    ]
                }
            },
            "additionalProperties": false,
            "required": [
                "Type"
            ]
        },

        ${spec.resourceTypes.map { (name, resource) ->
            resource.schema(name, false)
}.joinToString(",\n")},

        ${spec.propertyTypes.map { (name, resource) ->
            resource.schema(name, true)
        }.joinToString(",\n")}

    }
}
"""