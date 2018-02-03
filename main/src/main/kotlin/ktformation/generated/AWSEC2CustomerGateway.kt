
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::CustomerGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html)
 */
@CloudFormationMarker
class AWSEC2CustomerGateway(logicalId: String) : Resource<AWSEC2CustomerGateway.Properties>(logicalId, "AWS::EC2::CustomerGateway") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [bgpAsn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var bgpAsn: Any? = null

        /**
         * [bgpAsn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun bgpAsn(value: Int) {
          this.bgpAsn = value
        }
        
        /**
         * [bgpAsn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-bgpasn)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun bgpAsn(value: IntrinsicFunction) {
          this.bgpAsn = value
        }
        
        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ipAddress: Any? = null

        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipAddress(value: String) {
          this.ipAddress = value
        }
        
        /**
         * [ipAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-ipaddress)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ipAddress(value: IntrinsicFunction) {
          this.ipAddress = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html#cfn-ec2-customergateway-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
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
 * [AWS::EC2::CustomerGateway - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customer-gateway.html)
 */
fun Resources.awsEC2CustomerGateway(logicalId: String, init: AWSEC2CustomerGateway.() -> Unit = {}): AWSEC2CustomerGateway {
    return AWSEC2CustomerGateway(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
