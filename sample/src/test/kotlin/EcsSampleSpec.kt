import ktformation.*
import ktformation.generated.*
import ktformation.policy.Effect
import ktformation.policy.PolicyDocument
import ktformation.policy.Statement
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object EcsSampleSpec : Spek({
    describe("toJson") {
        it("outputs JSON") {
            // https://github.com/awslabs/amazon-ecs-nodejs-microservices/blob/master/2-containerized/infrastructure/ecs.yml
            val template = cloudFormation {
                lateinit var desiredCapacity: Parameter
                lateinit var maxSize: Parameter
                lateinit var instanceType: Parameter
                parameters {
                    desiredCapacity = parameter("DesiredCapacity") {
                        type(ParameterType.NUMBER)
                        default(2)
                        description("Number of instances to launch in your ECS cluster.")
                    }
                    maxSize = parameter("MaxSize") {
                        type = ParameterType.NUMBER
                        default = 2
                        description = "Maximum number of instances that can be launched in your ECS cluster."
                    }
                    instanceType = parameter("InstanceType") {
                        description("EC2 instance type")
                        default("t2.micro")
                        allowedValues(
                            arrayOf(
                                "t2.micro",
                                "t2.small",
                                "t2.medium",
                                "t2.large",
                                "m3.medium",
                                "m3.large",
                                "m3.xlarge",
                                "m3.2xlarge",
                                "m4.large",
                                "m4.xlarge",
                                "m4.2xlarge",
                                "m4.4xlarge",
                                "m4.10xlarge",
                                "c4.large",
                                "c4.xlarge",
                                "c4.2xlarge",
                                "c4.4xlarge",
                                "c4.8xlarge",
                                "c3.large",
                                "c3.xlarge",
                                "c3.2xlarge",
                                "c3.4xlarge",
                                "c3.8xlarge",
                                "r3.large",
                                "r3.xlarge",
                                "r3.2xlarge",
                                "r3.4xlarge",
                                "r3.8xlarge",
                                "i2.xlarge",
                                "i2.2xlarge",
                                "i2.4xlarge",
                                "i2.8xlarge"
                            )
                        )
                        constraintDescription("Please choose a valid instance type.")
                    }
                }
                lateinit var awsRegionToAMI: Mapping
                lateinit var subnetConfig: Mapping
                mappings {
                    awsRegionToAMI = mapping(
                        "AWSRegionToAMI",
                        "us-east-1" to mapOf("AMIID" to "ami-eca289fb"),
                        "us-east-2" to mapOf("AMIID" to "ami-446f3521"),
                        "us-west-1" to mapOf("AMIID" to "ami-9fadf8ff"),
                        "us-west-2" to mapOf("AMIID" to "ami-7abc111a"),
                        "eu-west-1" to mapOf("AMIID" to "ami-a1491ad2"),
                        "eu-central-1" to mapOf("AMIID" to "ami-54f5303b"),
                        "ap-northeast-1" to mapOf("AMIID" to "ami-9cd57ffd"),
                        "ap-southeast-1" to mapOf("AMIID" to "ami-a900a3ca"),
                        "ap-southeast-2" to mapOf("AMIID" to "ami-5781be34")
                    )

                    subnetConfig = mapping(
                        "SubnetConfig",
                        "VPC" to mapOf("CIDR" to "10.0.0.0/16"),
                        "PublicOne" to mapOf("CIDR" to "10.0.0.0/24"),
                        "PublicTwo" to mapOf("CIDR" to "10.0.1.0/24")
                    )
                }
                lateinit var vpc: AWSEC2VPC
                lateinit var ecsCluster: AWSECSCluster
                lateinit var ecsALB: AWSElasticLoadBalancingV2LoadBalancer
                resources {
                    vpc = awsEC2VPC("VPC") {
                        properties {
                            cidrBlock(FnFindInMap("SubnetConfig", "VPC", "CIDR"))
                        }
                    }
                    val publicSubnetOne = awsEC2Subnet("PublicSubnetOne") {
                        properties {
                            availabilityZone(FnSelect(0, FnGetAZs(Ref("AWS::Region"))))
                            vpcId(Ref(vpc))
                            cidrBlock(FnFindInMap("SubnetConfig", "PublicOne", "CIDR"))
                            mapPublicIpOnLaunch(true)
                        }
                    }
                    val publicSubnetTwo = awsEC2Subnet("PublicSubnetTwo") {
                        properties {
                            availabilityZone(FnSelect(1, FnGetAZs(Ref("AWS::Region"))))
                            vpcId(Ref(vpc))
                            cidrBlock(FnFindInMap(subnetConfig, "PublicTwo", "CIDR"))
                            mapPublicIpOnLaunch(true)
                        }
                    }
                    val internetGateway = awsEC2InternetGateway("InternetGateway")
                    awsEC2VPCGatewayAttachment("GatewayAttachement") {
                        properties {
                            vpcId(Ref(vpc))
                            internetGatewayId(Ref(internetGateway))
                        }
                    }
                    val publicRouteTable = awsEC2RouteTable("PublicRouteTable") {
                        properties {
                            vpcId(Ref(vpc))
                        }
                    }
                    awsEC2Route("PublicRoute") {
                        dependsOn = arrayOf("GatewayAttachement")
                        properties {
                            routeTableId(Ref(publicRouteTable))
                            destinationCidrBlock("0.0.0.0/0")
                            gatewayId(Ref(internetGateway))
                        }
                    }
                    awsEC2SubnetRouteTableAssociation("PublicSubnetOneRouteTableAssociation") {
                        properties {
                            subnetId(Ref(publicSubnetOne))
                            routeTableId(Ref(publicRouteTable))
                        }
                    }
                    awsEC2SubnetRouteTableAssociation("PublicSubnetTwoRouteTableAssociation") {
                        properties {
                            subnetId(Ref(publicSubnetTwo))
                            routeTableId(Ref(publicRouteTable))
                        }
                    }
                    // ECS Resource
                    ecsCluster = awsECSCluster("ECSCluster")
                    val ecsSecurityGroup = awsEC2SecurityGroup("EcsSecurityGroup") {
                        properties {
                            groupDescription("ECS Security Group")
                            vpcId(Ref(vpc))
                        }
                    }
                    awsEC2SecurityGroupIngress("EcsSecurityGroupHTTPinbound") {
                        properties {
                            groupId(Ref(ecsSecurityGroup))
                            ipProtocol("tcp")
                            fromPort(80)
                            toPort(80)
                            cidrIp("0.0.0.0/0")
                        }
                    }
                    awsEC2SecurityGroupIngress("EcsSecurityGroupSSHinbound") {
                        properties {
                            groupId(Ref(ecsSecurityGroup))
                            ipProtocol("tcp")
                            fromPort(22)
                            toPort(22)
                            cidrIp("0.0.0.0/0")
                        }
                    }
                    awsEC2SecurityGroupIngress("EcsSecurityGroupALBports") {
                        properties {
                            groupId(Ref(ecsSecurityGroup))
                            ipProtocol("tcp")
                            fromPort(31000)
                            toPort(61000)
                            sourceSecurityGroupId(Ref(ecsSecurityGroup))
                        }
                    }
                    awsLogsLogGroup("CloudwatchLogsGroup") {
                        properties {
                            logGroupName(FnJoin("-", "ECSLogGroup", Ref(AWS.StackName)))
                            retentionInDays(14)
                        }
                    }
                    ecsALB = awsElasticLoadBalancingV2LoadBalancer("ECSALB") {
                        properties {
                            name("demo")
                            scheme("internet-facing")
                            loadBalancerAttributes(listOf(
                                loadBalancerAttribute {
                                    key("idle_timeout.timeout_seconds")
                                    value("30")
                                }
                            ))
                            subnets(publicSubnetOne.ref(), publicSubnetTwo.ref())
                            securityGroups(ecsSecurityGroup.ref())
                        }
                    }
                    awsIAMRole("ECSServiceRole") {
                        properties {
                            assumeRolePolicyDocument(
                                PolicyDocument(
                                    statement = listOf(
                                        Statement(
                                            effect = Effect.ALLOW,
                                            principal = mapOf("Service" to listOf("ecs.amazonaws.com")),
                                            action = listOf("sts:AssumeRole")
                                        )
                                    )
                                )
                            )
                            path("/")
                            policies(
                                listOf(
                                    policy {
                                        policyDocument(
                                            PolicyDocument(
                                                statement = listOf(
                                                    Statement(
                                                        effect = Effect.ALLOW,
                                                        action = listOf(
                                                            "elasticloadbalancing:DeregisterInstancesFromLoadBalancer",
                                                            "elasticloadbalancing:DeregisterTargets",
                                                            "elasticloadbalancing:Describe*",
                                                            "elasticloadbalancing:RegisterInstancesWithLoadBalancer",
                                                            "elasticloadbalancing:RegisterTargets",
                                                            "ec2:Describe*",
                                                            "ec2:AuthorizeSecurityGroupIngress"
                                                        ),
                                                        resource = "*"
                                                    )
                                                )
                                            )
                                        )
                                        policyName("ecs-service")
                                    })
                            )
                        }
                    }
                    val ec2Role = awsIAMRole("EC2Role") {
                        properties {
                            assumeRolePolicyDocument(
                                PolicyDocument(
                                    statement = listOf(
                                        Statement(
                                            effect = Effect.ALLOW,
                                            principal = mapOf("Service" to listOf("ec2.amazonaws.com")),
                                            action = listOf("sts:AssumeRole")
                                        )
                                    )
                                )
                            )
                            path("/")
                            policies(listOf(policy {
                                policyDocument(
                                    PolicyDocument(
                                        statement = listOf(
                                            Statement(
                                                effect = Effect.ALLOW,
                                                action = listOf(
                                                    "ecs:CreateCluster",
                                                    "ecs:DeregisterContainerInstance",
                                                    "ecs:DiscoverPollEndpoint",
                                                    "ecs:Poll",
                                                    "ecs:RegisterContainerInstance",
                                                    "ecs:StartTelemetrySession",
                                                    "ecs:Submit*",
                                                    "logs:CreateLogStream",
                                                    "logs:PutLogEvents",
                                                    "ecr:GetAuthorizationToken",
                                                    "ecr:BatchGetImage",
                                                    "ecr:GetDownloadUrlForLayer"
                                                ),
                                                resource = "*"
                                            )
                                        )
                                    )
                                )
                                policyName("ecs-service")
                            }))
                        }
                    }
                    awsIAMRole("AutoscalingRole") {
                        properties {
                            assumeRolePolicyDocument(
                                PolicyDocument(
                                    statement = listOf(
                                        Statement(
                                            effect = Effect.ALLOW,
                                            principal = mapOf("Service" to listOf("application-autoscaling.amazonaws.com")),
                                            action = listOf("sts:AssumeRole")
                                        )
                                    )
                                )
                            )
                            path("/")
                            policies(listOf(policy {
                                policyDocument(
                                    PolicyDocument(
                                        statement = listOf(
                                            Statement(
                                                effect = Effect.ALLOW,
                                                action = listOf(
                                                    "application-autoscaling:*",
                                                    "cloudwatch:DescribeAlarms",
                                                    "cloudwatch:PutMetricAlarm",
                                                    "ecs:DescribeServices",
                                                    "ecs:UpdateServic"
                                                ),
                                                resource = "*"
                                            )
                                        )
                                    )
                                )
                                policyName("service-autoscaling")
                            }))
                        }
                    }
                    val ec2InstanceProfile = awsIAMInstanceProfile("EC2InstanceProfile") {
                        properties {
                            path("/")
                            roles(ec2Role.ref())
                        }
                    }
                    val containerInstance = awsAutoScalingLaunchConfiguration("ContainerInstances") {
                        properties {
                            imageId(FnFindInMap(awsRegionToAMI, Ref(AWS.Region), "AMIID"))
                            securityGroups(ecsSecurityGroup.ref())
                            instanceType(instanceType.ref())
                            iamInstanceProfile(ec2InstanceProfile.ref())
                            userData(
                                FnBase64(
                                    FnSub(
                                        """
                                #!/bin/bash -xe
                                echo ECS_CLUSTER=${'$'}{ECSCluster} >> /etc/ecs/ecs.config
                                yum install -y aws-cfn-bootstrap
                                /opt/aws/bin/cfn-signal -e ${'$'}? --stack ${'$'}{AWS::StackName} --resource ECSAutoScalingGroup --region ${'$'}{AWS::Region}
                                """.trimIndent()
                                    )
                                )
                            )
                        }
                    }
                    awsAutoScalingAutoScalingGroup("ECSAutoScalingGroup") {
                        properties {
                            vPCZoneIdentifier(publicSubnetOne.ref(), publicSubnetTwo.ref())
                            launchConfigurationName(containerInstance.ref())
                            minSize("1")
                            maxSize(maxSize.ref())
                            desiredCapacity(desiredCapacity.ref())
                        }
                        creationPolicy {
                            resourceSignal {
                                timeout = "PT15M"
                            }
                        }
                        updatePolicy {
                            autoScalingReplacingUpdate {
                                willReplace = true
                            }
                        }
                    }
                }
                outputs {
                    output("ClusterName") {
                        description("The name of the ECS cluster, used by the deploy script")
                        value(ecsCluster)
                        export(name = FnJoin(":", AWS.StackName.ref(), "ClusterName"))
                    }
                    output("Url") {
                        description("The url at which the application is available")
                        value(FnJoin("", FnGetAtt(ecsALB, "DNSName")))
                    }
                    output("ALBArn") {
                        description("The ARN of the ALB, exported for later use in creating services")
                        value(ecsALB)
                        export(name = FnJoin(":", AWS.StackName.ref(), "ALBArn"))
                    }
                    output("ECSRole") {
                        description("The ARN of the ECS role, exports for later use in creating services")
                        value(FnGetAtt("ECSServiceRole", "Arn"))
                        export(name = FnJoin(":", AWS.StackName.ref(), "ECSRole"))
                    }
                    output("VPCId") {
                        description("The ID of the VPC that this stack is deployed in")
                        value(vpc)
                        export(FnJoin(":", AWS.StackName.ref(), "VPCId"))
                    }
                }
            }
            assertEquals(
                EcsSampleSpec::class.java.getResource("esc_sample.json").readText(),
                template.toJSON(true)
            )
            assertEquals(
                EcsSampleSpec::class.java.getResource("esc_sample.yaml").readText(),
                template.toYAML(true)
            )
        }
    }
})
