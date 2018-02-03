
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::EgressOnlyInternetGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
@CloudFormationMarker
class AWSEC2EgressOnlyInternetGateway(logicalId: String) : Resource<AWSEC2EgressOnlyInternetGateway.Properties>(logicalId, "AWS::EC2::EgressOnlyInternetGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
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
 * [AWS::EC2::EgressOnlyInternetGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
fun Resources.awsEC2EgressOnlyInternetGateway(logicalId: String, init: AWSEC2EgressOnlyInternetGateway.() -> Unit = {}): AWSEC2EgressOnlyInternetGateway {
    return AWSEC2EgressOnlyInternetGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
