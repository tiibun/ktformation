
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPC - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
 */
@CloudFormationMarker
class AWSEC2VPC(logicalId: String) : Resource<AWSEC2VPC.Properties>(logicalId, "AWS::EC2::VPC") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cidrBlock: Any? = null

        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }

        /**
         * [enableDnsHostnames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableDnsHostnames: Any? = null

        /**
         * [enableDnsHostnames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableDnsHostnames(value: Boolean) {
          this.enableDnsHostnames = value
        }
        
        /**
         * [enableDnsHostnames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsHostnames)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableDnsHostnames(value: IntrinsicFunction) {
          this.enableDnsHostnames = value
        }

        /**
         * [enableDnsSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableDnsSupport: Any? = null

        /**
         * [enableDnsSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableDnsSupport(value: Boolean) {
          this.enableDnsSupport = value
        }
        
        /**
         * [enableDnsSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-EnableDnsSupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableDnsSupport(value: IntrinsicFunction) {
          this.enableDnsSupport = value
        }

        /**
         * [instanceTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceTenancy: Any? = null

        /**
         * [instanceTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceTenancy(value: String) {
          this.instanceTenancy = value
        }
        
        /**
         * [instanceTenancy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-instancetenancy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceTenancy(value: IntrinsicFunction) {
          this.instanceTenancy = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-aws-ec2-vpc-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::EC2::VPC - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
 */
fun Resources.awsEC2VPC(logicalId: String, init: AWSEC2VPC.() -> Unit = {}): AWSEC2VPC {
    return AWSEC2VPC(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
