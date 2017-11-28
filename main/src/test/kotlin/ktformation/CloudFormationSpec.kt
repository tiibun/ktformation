package ktformation

import ktformation.generated.awsEC2VPC
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object CloudFormationSpec : Spek({
    describe("toJson") {
        it("outputs JSON") {
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
                    mapping("AWSRegionToAMI",
                            "ap-southeast-2" to mapOf("AMIID" to "ami-5781be34"))
                }
                resources {
                    awsEC2VPC("VPC") {
                        properties {
                            cidrBlock(Ref(cidrBlock))
                        }
                    }
                }
            }
            val json = template.toJSON(true)
            assertEquals("""
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
                """.trimIndent(), json)

            val yaml = template.toYAML(false)
            assertEquals("""
                AWSTemplateFormatVersion: '2010-09-09'
                Mappings:
                  AWSRegionToAMI:
                    ap-southeast-2:
                      AMIID: ami-5781be34
                Parameters:
                  CidrBlock:
                    Default: 10.0.0
                    Description: CIDR block.
                    Type: String
                Resources:
                  VPC:
                    Properties:
                      CidrBlock:
                        Ref: CidrBlock
                    Type: AWS::EC2::VPC

                """.trimIndent(), yaml)

            val shortYaml = template.toYAML(true)
            assertEquals("""
                AWSTemplateFormatVersion: '2010-09-09'
                Mappings:
                  AWSRegionToAMI:
                    ap-southeast-2:
                      AMIID: ami-5781be34
                Parameters:
                  CidrBlock:
                    Default: 10.0.0
                    Description: CIDR block.
                    Type: String
                Resources:
                  VPC:
                    Properties:
                      CidrBlock: !Ref 'CidrBlock'
                    Type: AWS::EC2::VPC

                """.trimIndent(), shortYaml)
        }
    }
})
