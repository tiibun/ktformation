
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::DHCPOptions - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html)
 */
@CloudFormationMarker
class AWSEC2DHCPOptions(logicalId: String) : Resource<AWSEC2DHCPOptions.Properties>(logicalId, "AWS::EC2::DHCPOptions") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var domainName: Any? = null

        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainName(value: String) {
          this.domainName = value
        }
        
        /**
         * [domainName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }
        
        /**
         * [domainNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var domainNameServers: Any? = null

        /**
         * [domainNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun domainNameServers(value: List<String>) {
          this.domainNameServers = value
        }
        
        /**
         * [domainNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-domainnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun domainNameServers(vararg value: IntrinsicFunction) {
          this.domainNameServers = value
        }
        
        /**
         * [netbiosNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var netbiosNameServers: Any? = null

        /**
         * [netbiosNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun netbiosNameServers(value: List<String>) {
          this.netbiosNameServers = value
        }
        
        /**
         * [netbiosNameServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnameservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun netbiosNameServers(vararg value: IntrinsicFunction) {
          this.netbiosNameServers = value
        }
        
        /**
         * [netbiosNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var netbiosNodeType: Any? = null

        /**
         * [netbiosNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun netbiosNodeType(value: Int) {
          this.netbiosNodeType = value
        }
        
        /**
         * [netbiosNodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-netbiosnodetype)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun netbiosNodeType(value: IntrinsicFunction) {
          this.netbiosNodeType = value
        }
        
        /**
         * [ntpServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var ntpServers: Any? = null

        /**
         * [ntpServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun ntpServers(value: List<String>) {
          this.ntpServers = value
        }
        
        /**
         * [ntpServers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-ntpservers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun ntpServers(vararg value: IntrinsicFunction) {
          this.ntpServers = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html#cfn-ec2-dhcpoptions-tags)
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
 * [AWS::EC2::DHCPOptions - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html)
 */
fun Resources.awsEC2DHCPOptions(logicalId: String, init: AWSEC2DHCPOptions.() -> Unit = {}): AWSEC2DHCPOptions {
    return AWSEC2DHCPOptions(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
