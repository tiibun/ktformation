
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
 */
@CloudFormationMarker
class AWSEC2VPCEndpoint(logicalId: String) : Resource<AWSEC2VPCEndpoint.Properties>(logicalId, "AWS::EC2::VPCEndpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var policyDocument: Any? = null

        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun policyDocument(value: Json) {
          this.policyDocument = value
        }
        
        /**
         * [policyDocument](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun policyDocument(value: IntrinsicFunction) {
          this.policyDocument = value
        }

        /**
         * [privateDnsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var privateDnsEnabled: Any? = null

        /**
         * [privateDnsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privateDnsEnabled(value: Boolean) {
          this.privateDnsEnabled = value
        }
        
        /**
         * [privateDnsEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun privateDnsEnabled(value: IntrinsicFunction) {
          this.privateDnsEnabled = value
        }

        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var routeTableIds: Any? = null

        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun routeTableIds(value: List<String>) {
          this.routeTableIds = value
        }
        
        /**
         * [routeTableIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun routeTableIds(vararg value: IntrinsicFunction) {
          this.routeTableIds = value
        }

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceName: Any? = null

        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceName(value: String) {
          this.serviceName = value
        }
        
        /**
         * [serviceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceName(value: IntrinsicFunction) {
          this.serviceName = value
        }

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }

        /**
         * [vPCEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vPCEndpointType: Any? = null

        /**
         * [vPCEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vPCEndpointType(value: String) {
          this.vPCEndpointType = value
        }
        
        /**
         * [vPCEndpointType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vPCEndpointType(value: IntrinsicFunction) {
          this.vPCEndpointType = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }


    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::EC2::VPCEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
 */
fun Resources.awsEC2VPCEndpoint(logicalId: String, init: AWSEC2VPCEndpoint.() -> Unit = {}): AWSEC2VPCEndpoint {
    return AWSEC2VPCEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
