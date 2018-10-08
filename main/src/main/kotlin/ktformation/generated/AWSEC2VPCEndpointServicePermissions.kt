
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPCEndpointServicePermissions - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
 */
@CloudFormationMarker
class AWSEC2VPCEndpointServicePermissions(logicalId: String) : Resource<AWSEC2VPCEndpointServicePermissions.Properties>(logicalId, "AWS::EC2::VPCEndpointServicePermissions") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [allowedPrincipals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var allowedPrincipals: Any? = null

        /**
         * [allowedPrincipals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedPrincipals(value: List<String>) {
          this.allowedPrincipals = value
        }
        
        /**
         * [allowedPrincipals](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun allowedPrincipals(vararg value: IntrinsicFunction) {
          this.allowedPrincipals = value
        }

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceId: Any? = null

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceId(value: String) {
          this.serviceId = value
        }
        
        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceId(value: IntrinsicFunction) {
          this.serviceId = value
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
 * [AWS::EC2::VPCEndpointServicePermissions - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
 */
fun Resources.awsEC2VPCEndpointServicePermissions(logicalId: String, init: AWSEC2VPCEndpointServicePermissions.() -> Unit = {}): AWSEC2VPCEndpointServicePermissions {
    return AWSEC2VPCEndpointServicePermissions(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
