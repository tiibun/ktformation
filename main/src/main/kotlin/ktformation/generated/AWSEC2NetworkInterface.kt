
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::NetworkInterface - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html)
 */
@CloudFormationMarker
class AWSEC2NetworkInterface(logicalId: String) : Resource<AWSEC2NetworkInterface.Properties>(logicalId, "AWS::EC2::NetworkInterface") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var groupSet: Any? = null

        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groupSet(value: List<String>) {
          this.groupSet = value
        }
        
        /**
         * [groupSet](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-groupset)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun groupSet(vararg value: IntrinsicFunction) {
          this.groupSet = value
        }
        
        /**
         * [interfaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-interfacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var interfaceType: Any? = null

        /**
         * [interfaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-interfacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun interfaceType(value: String) {
          this.interfaceType = value
        }
        
        /**
         * [interfaceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-interfacetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun interfaceType(value: IntrinsicFunction) {
          this.interfaceType = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var ipv6AddressCount: Any? = null

        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: Int) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6AddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresscount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun ipv6AddressCount(value: IntrinsicFunction) {
          this.ipv6AddressCount = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: InstanceIpv6Address
         */
        @JvmField
        var ipv6Addresses: Any? = null

        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: InstanceIpv6Address
         */
        fun ipv6Addresses(value: InstanceIpv6Address) {
          this.ipv6Addresses = value
        }
        
        /**
         * [ipv6Addresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-ec2-networkinterface-ipv6addresses)
         *
         * _Required_: no
         *
         * _Type_: InstanceIpv6Address
         */
        fun ipv6Addresses(value: IntrinsicFunction) {
          this.ipv6Addresses = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var privateIpAddress: Any? = null

        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: String) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddress)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun privateIpAddress(value: IntrinsicFunction) {
          this.privateIpAddress = value
        }
        
        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        @JvmField
        var privateIpAddresses: Any? = null

        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(value: List<PrivateIpAddressSpecification>) {
          this.privateIpAddresses = value
        }
        
        /**
         * [privateIpAddresses](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-privateipaddresses)
         *
         * _Required_: no
         *
         * _Type_: List<PrivateIpAddressSpecification>
         */
        fun privateIpAddresses(vararg value: IntrinsicFunction) {
          this.privateIpAddresses = value
        }
        
        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-secondaryprivateipcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var secondaryPrivateIpAddressCount: Any? = null

        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-secondaryprivateipcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: Int) {
          this.secondaryPrivateIpAddressCount = value
        }
        
        /**
         * [secondaryPrivateIpAddressCount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-secondaryprivateipcount)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun secondaryPrivateIpAddressCount(value: IntrinsicFunction) {
          this.secondaryPrivateIpAddressCount = value
        }
        
        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var sourceDestCheck: Any? = null

        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun sourceDestCheck(value: Boolean) {
          this.sourceDestCheck = value
        }
        
        /**
         * [sourceDestCheck](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-sourcedestcheck)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun sourceDestCheck(value: IntrinsicFunction) {
          this.sourceDestCheck = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-subnetid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html#cfn-awsec2networkinterface-tags)
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


    class InstanceIpv6Address(
            /**
             * [Ipv6Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html#cfn-ec2-networkinterface-instanceipv6address-ipv6address)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ipv6Address: String
    )

    class PrivateIpAddressSpecification(
            /**
             * [Primary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val primary: Boolean,
            /**
             * [PrivateIpAddress](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val privateIpAddress: String
    )

}

/**
 * [AWS::EC2::NetworkInterface - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface.html)
 */
fun Resources.awsEC2NetworkInterface(logicalId: String, init: AWSEC2NetworkInterface.() -> Unit = {}): AWSEC2NetworkInterface {
    return AWSEC2NetworkInterface(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
