package ktformation

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object PolicyDocumentSpec : Spek({
    describe("toJson") {
        it("outputs JSON") {
            val policy = PolicyDocument(
                    statement = listOf(PolicyDocument.Statement(
                            sid = "InventoryAndAnalyticsExamplePolicy",
                            effect = PolicyDocument.Effect.ALLOW,
                            principal = mapOf("Service" to "s3.amazonaws.com"),
                            action = listOf("s3:PutObject"),
                            resource = listOf("arn:aws:s3:::destination-bucket/*"),
                            condition = mapOf(
                                    "ArnLike" to mapOf<Any, Any>(
                                            "aws:SourceArn" to "arn:aws:s3:::source-bucket"
                                    ),
                                    "StringEquals" to mapOf(
                                            "aws:SourceAccount" to "1234567890",
                                            "s3:x-amz-acl" to "bucket-owner-full-control"
                                    )
                            )
                    )))

            assertEquals("""
            {
              "Version" : "2012-10-17",
              "Statement" : [ {
                "Sid" : "InventoryAndAnalyticsExamplePolicy",
                "Principal" : {
                  "Service" : "s3.amazonaws.com"
                },
                "Effect" : "Allow",
                "Action" : [ "s3:PutObject" ],
                "Resource" : [ "arn:aws:s3:::destination-bucket/*" ],
                "Condition" : {
                  "ArnLike" : {
                    "aws:SourceArn" : "arn:aws:s3:::source-bucket"
                  },
                  "StringEquals" : {
                    "aws:SourceAccount" : "1234567890",
                    "s3:x-amz-acl" : "bucket-owner-full-control"
                  }
                }
              } ]
            }
            """.trimIndent(), policy.toJSON(true))
            assertEquals("""
            Version: '2012-10-17'
            Statement:
            - Action:
              - s3:PutObject
              Condition:
                ArnLike:
                  aws:SourceArn: arn:aws:s3:::source-bucket
                StringEquals:
                  aws:SourceAccount: '1234567890'
                  s3:x-amz-acl: bucket-owner-full-control
              Effect: Allow
              Principal:
                Service: s3.amazonaws.com
              Resource:
              - arn:aws:s3:::destination-bucket/*
              Sid: InventoryAndAnalyticsExamplePolicy

            """.trimIndent(), policy.toYAML())
        }
    }
})
