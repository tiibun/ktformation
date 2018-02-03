
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::Subnet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
@CloudFormationMarker
class AWSEC2Subnet(logicalId: String) : Resource<AWSEC2Subnet.Properties>(logicalId, "AWS::EC2::Subnet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [assignIpv6AddressOnCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var assignIpv6AddressOnCreation: Any? = null

        /**
         * [assignIpv6AddressOnCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun assignIpv6AddressOnCreation(value: Boolean) {
          this.assignIpv6AddressOnCreation = value
        }
        
        /**
         * [assignIpv6AddressOnCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-assignipv6addressoncreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun assignIpv6AddressOnCreation(value: IntrinsicFunction) {
          this.assignIpv6AddressOnCreation = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var cidrBlock: Any? = null

        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        /**
         * [cidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-cidrblock)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }
        
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ipv6CidrBlock: Any? = null

        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: String) {
          this.ipv6CidrBlock = value
        }
        
        /**
         * [ipv6CidrBlock](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-ipv6cidrblock)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ipv6CidrBlock(value: IntrinsicFunction) {
          this.ipv6CidrBlock = value
        }
        
        /**
         * [mapPublicIpOnLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var mapPublicIpOnLaunch: Any? = null

        /**
         * [mapPublicIpOnLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun mapPublicIpOnLaunch(value: Boolean) {
          this.mapPublicIpOnLaunch = value
        }
        
        /**
         * [mapPublicIpOnLaunch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-mappubliciponlaunch)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun mapPublicIpOnLaunch(value: IntrinsicFunction) {
          this.mapPublicIpOnLaunch = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-ec2-subnet-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html#cfn-awsec2subnet-prop-vpcid)
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
 * [AWS::EC2::Subnet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
fun Resources.awsEC2Subnet(logicalId: String, init: AWSEC2Subnet.() -> Unit = {}): AWSEC2Subnet {
    return AWSEC2Subnet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
