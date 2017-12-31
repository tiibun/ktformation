import ktformation.*
import ktformation.generated.*
import ktformation.policy.Effect
import ktformation.policy.PolicyDocument
import ktformation.policy.Statement
import ktformation.transform.AWS_SERVERLESS_2016_10_31
import ktformation.transform.transform
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object ServerlessSampleSpec : Spek({
    describe("toJSON") {
        it("outputs JSON") {
            val template = cloudFormation {
                transform(AWS_SERVERLESS_2016_10_31)
                description = "Serverless Express Application/API powered by API Gateway and Lambda\n"
                resources {
                    awsServerlessApi("ApiGatewayApi") {
                        properties {
                            definitionUri("./simple-proxy-api.yaml")
                            stageName("prod")
                            variables(mapOf("ServerlessExpressLambdaFunctionName" to
                                    Ref("YOUR_SERVERLESS_EXPRESS_LAMBDA_FUNCTION_NAME")))
                        }
                    }
                    awsIAMRole("LambdaExecutionRole") {
                        properties {
                            assumeRolePolicyDocument(PolicyDocument(
                                    statement = listOf(Statement(
                                            effect = Effect.ALLOW,
                                            principal = mapOf(
                                                    "Service" to "lambda.amazonaws.com"
                                            ),
                                            action = "sts:AssumeRole"
                                    ))))
                            path("/")
                            policies(listOf(
                                    AWSIAMRole.Policy(policyName = "root",
                                            policyDocument = PolicyDocument(
                                                    statement = listOf(Statement(
                                                            effect = Effect.ALLOW,
                                                            action = listOf(
                                                                    "logs:CreateLogGroup",
                                                                    "logs:CreateLogStream",
                                                                    "logs:PutLogEvents"
                                                            ),
                                                            resource = "arn:aws:logs:*:*:*"
                                                    ))
                                            ))
                            ))
                        }
                    }
                    awsLambdaPermission("LambdaApiGatewayExecutionPermission") {
                        properties {
                            action("lambda:InvokeFunction")
                            functionName(Ref("YOUR_SERVERLESS_EXPRESS_LAMBDA_FUNCTION_NAME"))
                            principal("apigateway.amazonaws.com")
                            sourceArn(FnJoin("", "arn:aws:execute-api:", Ref(AWS.Region), ":",
                                    Ref(AWS.AccountId), ":", Ref("ApiGatewayApi"), "/*/*"))
                        }
                    }
                    awsServerlessFunction("YOUR_SERVERLESS_EXPRESS_LAMBDA_FUNCTION_NAME") {
                        properties {
                            codeUri("./")
                            handler("lambda.handler")
                            memorySize(1024)
                            role(FnGetAtt("LambdaExecutionRole", "Arn"))
                            runtime("nodejs6.10")
                            timeout(30)
                            events(mapOf(
                                    "ProxyApiRoot" to mapOf(
                                            "Type" to "Api",
                                            "Properties" to mapOf(
                                                    "RestApiId" to Ref("ApiGatewayApi"),
                                                    "Path" to "/",
                                                    "Method" to "ANY"
                                            )),
                                    "ProxyApiGreedy" to mapOf(
                                            "Type" to "Api",
                                            "Properties" to mapOf(
                                                    "RestApiId" to Ref("ApiGatewayApi"),
                                                    "Path" to "/{proxy+}",
                                                    "Method" to "ANY"
                                            ))))
                        }
                    }
                }
                outputs {
                    output("LambdaFunctionConsoleUrl") {
                        description("Console URL for the Lambda Function.")
                        value(FnJoin("", "https://", Ref(AWS.Region),
                                ".console.aws.amazon.com/lambda/home?region=", Ref(AWS.Region), "#/functions/",
                                Ref("YOUR_SERVERLESS_EXPRESS_LAMBDA_FUNCTION_NAME")))
                    }
                    output("ApiGatewayApiConsoleUrl") {
                        description("Console URL for the API Gateway API's Stage.")
                        value(FnJoin("", "https://", Ref(AWS.Region),
                                ".console.aws.amazon.com/lambda/home?region=", Ref(AWS.Region), "#/apis/",
                                Ref("ApiGatewayApi"), "/stages/prod"))
                    }
                    output("ApiUrl") {
                        description("""
                            Invoke URL for your API. Clicking this link will perform a GET request
                            on the root resource of your API.
                            """.trimIndent())
                        value(FnJoin("", "https://", Ref("ApiGatewayApi"),
                                ".execute-api.", Ref(AWS.Region), ".amazonaws.com/prod/"))
                    }
                }
            }
            println(template.toYAML(true))
        }
    }
})
