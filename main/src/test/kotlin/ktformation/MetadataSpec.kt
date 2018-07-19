package ktformation

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object MetadataSpec : Spek({
    describe("Metadata") {
        it("outputs JSON") {
            val testee = Metadata(linkedMapOf(
                "Instances" to mapOf("Description" to "Information about the instances"),
                "Databases" to mapOf("Description" to "Information about the databases")
            ))

            assertEquals("""
            {
              "Instances" : {
                "Description" : "Information about the instances"
              },
              "Databases" : {
                "Description" : "Information about the databases"
              }
            }
            """.trimIndent(), testee.toJSON(true))
            assertEquals("""
            Instances:
              Description: Information about the instances
            Databases:
              Description: Information about the databases

            """.trimIndent(), testee.toYAML(true))
        }
    }

    describe("AWS::CloudFormation::Init") {
        it("outputs JSON") {
            val testee = cloudFormation {
                metadata {
                    awsCloudFormationInit {
                        configSets(mapOf(
                                "ascending" to listOf("config1", "config2"),
                                "descending" to listOf("config2", "config1")
                        ))
                        put("config1", mapOf(
                                "commands" to mapOf(
                                        "test" to mapOf(
                                                "command" to "echo \"\$CFNTEST\" > test.txt",
                                                "env" to mapOf(
                                                        "CFNTEST" to "I come from config1."
                                                ),
                                                "cwd" to "~"
                                        )
                                )
                        ))
                        put("config2", mapOf(
                                "commands" to mapOf(
                                        "test" to mapOf(
                                                "command" to "echo \"\$CFNTEST\" > test.txt",
                                                "env" to mapOf(
                                                        "CFNTEST" to "I come from config2"
                                                ),
                                                "cwd" to "~"
                                        )
                                )
                        ))
                    }
                }
            }
            assertEquals("""
                {
                  "AWSTemplateFormatVersion" : "2010-09-09",
                  "Metadata" : {
                    "AWS::CloudFormation::Init" : {
                      "configSets" : {
                        "ascending" : [ "config1", "config2" ],
                        "descending" : [ "config2", "config1" ]
                      },
                      "config1" : {
                        "commands" : {
                          "test" : {
                            "command" : "echo \"${'$'}CFNTEST\" > test.txt",
                            "env" : {
                              "CFNTEST" : "I come from config1."
                            },
                            "cwd" : "~"
                          }
                        }
                      },
                      "config2" : {
                        "commands" : {
                          "test" : {
                            "command" : "echo \"${'$'}CFNTEST\" > test.txt",
                            "env" : {
                              "CFNTEST" : "I come from config2"
                            },
                            "cwd" : "~"
                          }
                        }
                      }
                    }
                  }
                }
                """.trimIndent(), testee.toJSON(true))
        }
    }

    describe("AWS::CloudFormation::Interface") {
        it("outputs JSON") {
            val testee = cloudFormation {
                metadata {
                    awsCloudFormationInterface {
                        parameterGroups({
                            label("Network Configuration")
                            parameters("VPCID", "SubnetId", "SecurityGroupID")
                        }, {
                            label("Amazon EC2 Configuration")
                            parameters("InstanceType", "KeyName")
                        })
                        parameterLabels("VPCID" to "Which VPC should this be deployed to?")
                    }
                }
            }

            assertEquals("""
                {
                  "AWSTemplateFormatVersion" : "2010-09-09",
                  "Metadata" : {
                    "AWS::CloudFormation::Interface" : {
                      "ParameterGroups" : [ {
                        "Label" : {
                          "default" : "Network Configuration"
                        },
                        "Parameters" : [ "VPCID", "SubnetId", "SecurityGroupID" ]
                      }, {
                        "Label" : {
                          "default" : "Amazon EC2 Configuration"
                        },
                        "Parameters" : [ "InstanceType", "KeyName" ]
                      } ],
                      "ParameterLabels" : {
                        "VPCID" : {
                          "default" : "Which VPC should this be deployed to?"
                        }
                      }
                    }
                  }
                }
                """.trimIndent(), testee.toJSON(true))
        }
    }

    describe("AWS::CloudFormation::Designer") {
        it("outputs JSON") {
            val testee = cloudFormation {
                metadata {
                    awsCloudFormationDesigner {
                        put("6b56eaae-0bb6-4215-aad6-12345EXAMPLE", mapOf(
                                "size" to mapOf(
                                        "width" to 60,
                                        "height" to 60),
                                "position" to mapOf(
                                        "x" to 340,
                                        "y" to 430
                                ),
                                "z" to 2,
                                "parent" to "21ccc9b0-29e9-4a86-9cf2-12345EXAMPLE",
                                "ismemberof" to listOf("c3eead73-6a76-4532-9268-12345EXAMPLE")
                        ))
                    }
                }
            }

            assertEquals("""
                {
                  "AWSTemplateFormatVersion" : "2010-09-09",
                  "Metadata" : {
                    "AWS::CloudFormation::Designer" : {
                      "6b56eaae-0bb6-4215-aad6-12345EXAMPLE" : {
                        "size" : {
                          "width" : 60,
                          "height" : 60
                        },
                        "position" : {
                          "x" : 340,
                          "y" : 430
                        },
                        "z" : 2,
                        "parent" : "21ccc9b0-29e9-4a86-9cf2-12345EXAMPLE",
                        "ismemberof" : [ "c3eead73-6a76-4532-9268-12345EXAMPLE" ]
                      }
                    }
                  }
                }
                """.trimIndent(), testee.toJSON(true))
        }
    }
})
