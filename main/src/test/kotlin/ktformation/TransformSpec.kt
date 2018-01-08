package ktformation

import ktformation.generated.awsCloudFormationWaitConditionHandle
import ktformation.generated.awsS3Bucket
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object TransformSpec : Spek({
    describe("Fn::Transform") {
        it("contained in properties") {
            val testee = cloudFormation {
                resources {
                    awsS3Bucket("MyBucket") {
                        properties {
                            fnTransform(
                                    awsInclude("s3://bucket/myBucketName.json"),
                                    awsInclude("s3://bucket/myBucketAcl.json"))
                        }
                    }
                }
            }
            assertEquals("""
            {
              "AWSTemplateFormatVersion" : "2010-09-09",
              "Resources" : {
                "MyBucket" : {
                  "Type" : "AWS::S3::Bucket",
                  "Properties" : {
                    "Fn::Transform" : [ {
                      "Parameters" : {
                        "Location" : "s3://bucket/myBucketName.json"
                      },
                      "Name" : "AWS::Include"
                    }, {
                      "Parameters" : {
                        "Location" : "s3://bucket/myBucketAcl.json"
                      },
                      "Name" : "AWS::Include"
                    } ]
                  }
                }
              }
            }
            """.trimIndent(), testee.toJSON(true))
        }

        it("contained in resources") {
            // [AWS::Include Transform - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html#aws-include-example.json)
            val testee = cloudFormation {
                resources {
                    awsCloudFormationWaitConditionHandle("MyWaitHandle")
                    fnTransform(awsInclude("s3://MyAmazonS3BucketName/single_wait_condition.yaml"))
                }
            }

            assertEquals("""
            {
              "AWSTemplateFormatVersion" : "2010-09-09",
              "Resources" : {
                "MyWaitHandle" : {
                  "Type" : "AWS::CloudFormation::WaitConditionHandle"
                },
                "Fn::Transform" : [ {
                  "Parameters" : {
                    "Location" : "s3://MyAmazonS3BucketName/single_wait_condition.yaml"
                  },
                  "Name" : "AWS::Include"
                } ]
              }
            }
            """.trimIndent(), testee.toJSON(true))
        }
    }
})
