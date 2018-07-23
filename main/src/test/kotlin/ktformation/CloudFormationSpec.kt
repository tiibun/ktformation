package ktformation

import ktformation.generated.awsEC2VPC
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object CloudFormationSpec : Spek({
    describe("toJson") {
        val template = cloudFormation {
            lateinit var cidrBlock: Parameter
            parameters {
                cidrBlock = parameter("CidrBlock") {
                    type = ParameterType.STRING
                    default = "10.0.0"
                    description = "CIDR block."
                }
            }
            mappings {
                mapping(
                    "AWSRegionToAMI",
                    "ap-southeast-2" to mapOf("AMIID" to "ami-5781be34")
                )
            }
            resources {
                awsEC2VPC("VPC") {
                    properties {
                        cidrBlock(Ref(cidrBlock))
                    }
                }
            }
        }

        it("outputs JSON") {
            val json = template.toJSON(true)
            assertEquals(
                """
                {
                  "AWSTemplateFormatVersion" : "2010-09-09",
                  "Parameters" : {
                    "CidrBlock" : {
                      "Type" : "String",
                      "Default" : "10.0.0",
                      "Description" : "CIDR block."
                    }
                  },
                  "Mappings" : {
                    "AWSRegionToAMI" : {
                      "ap-southeast-2" : {
                        "AMIID" : "ami-5781be34"
                      }
                    }
                  },
                  "Resources" : {
                    "VPC" : {
                      "Type" : "AWS::EC2::VPC",
                      "Properties" : {
                        "CidrBlock" : {
                          "Ref" : "CidrBlock"
                        }
                      }
                    }
                  }
                }
                """.trimIndent(), json
            )
        }

        it("outputs YAML long format") {
            val yaml = template.toYAML(false)
            assertEquals(
                """
                AWSTemplateFormatVersion: '2010-09-09'
                Parameters:
                  CidrBlock:
                    Type: String
                    Default: 10.0.0
                    Description: CIDR block.
                Mappings:
                  AWSRegionToAMI:
                    ap-southeast-2:
                      AMIID: ami-5781be34
                Resources:
                  VPC:
                    Type: AWS::EC2::VPC
                    Properties:
                      CidrBlock:
                        Ref: CidrBlock

                """.trimIndent(), yaml
            )
        }

        it("outputs YAML short format") {
            val shortYaml = template.toYAML(true)
            assertEquals(
                """
                AWSTemplateFormatVersion: '2010-09-09'
                Parameters:
                  CidrBlock:
                    Type: String
                    Default: 10.0.0
                    Description: CIDR block.
                Mappings:
                  AWSRegionToAMI:
                    ap-southeast-2:
                      AMIID: ami-5781be34
                Resources:
                  VPC:
                    Type: AWS::EC2::VPC
                    Properties:
                      CidrBlock: !Ref 'CidrBlock'

                """.trimIndent(), shortYaml
            )
        }
    }
})
