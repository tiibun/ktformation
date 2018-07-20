package ktformation

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object IntrinsicFunctionSpec : Spek({
    describe("FnBase64") {
        it("outputs Fn::Base64") {
            val testee = mapOf("Test" to FnBase64("AWS CloudFormation"))
            assertEquals("""{"Test":{"Fn::Base64":"AWS CloudFormation"}}""", testee.toJSON())
            assertEquals("""
                Test:
                  Fn::Base64: AWS CloudFormation

                """.trimIndent(), testee.toYAML())
            assertEquals("""
                Test: !Base64 'AWS CloudFormation'

                """.trimIndent(), testee.toYAML(true))
        }
    }

    describe("FnFindInMap") {
        it("outputs Fn::FindInMap") {
            val testee = mapOf("Test" to FnFindInMap("RegionMap", Ref(AWS.Region), "32"))
            assertEquals("""{"Test":{"Fn::FindInMap":["RegionMap",{"Ref":"AWS::Region"},"32"]}}""", testee.toJSON())
            assertEquals("""
                Test: !FindInMap
                - RegionMap
                - !Ref 'AWS::Region'
                - '32'

                """.trimIndent(), testee.toYAML(true))
        }
    }

    describe("FnGetAtt") {
        it("outputs Fn::GetAtt") {
            val testee = mapOf("Test" to FnGetAtt("Res", "Attr"))
            assertEquals("""{"Test":{"Fn::GetAtt":["Res","Attr"]}}""", testee.toJSON())
            assertEquals("""
                Test: !GetAtt 'Res.Attr'

                """.trimIndent(), testee.toYAML(true))
            assertEquals("""
                Test:
                  Fn::GetAtt:
                  - Res
                  - Attr

                """.trimIndent(), testee.toYAML(false))
        }
    }

    describe("FnAnd") {
        it("outputs Fn::And") {
            val testee = mapOf("Test" to FnAnd(FnEquals("sg-mysggroup", Ref("ASecurityGroup")),
                    Condition("SomeOtherCondition")))
            assertEquals("""
                {
                  "Test" : {
                    "Fn::And" : [ {
                      "Fn::Equals" : [ "sg-mysggroup", {
                        "Ref" : "ASecurityGroup"
                      } ]
                    }, {
                      "Condition" : "SomeOtherCondition"
                    } ]
                  }
                }
                """.trimIndent(), testee.toJSON(true))
            assertEquals("""
                Test: !And
                - !Equals
                  - sg-mysggroup
                  - !Ref 'ASecurityGroup'
                - !Condition 'SomeOtherCondition'

                """.trimIndent(), testee.toYAML(true))
        }
    }
})
