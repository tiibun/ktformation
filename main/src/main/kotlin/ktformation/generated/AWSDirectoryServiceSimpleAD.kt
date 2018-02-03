
package ktformation.generated

import ktformation.*

/**
 * [AWS::DirectoryService::SimpleAD - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
 */
@CloudFormationMarker
class AWSDirectoryServiceSimpleAD(logicalId: String) : Resource<AWSDirectoryServiceSimpleAD.Properties>(logicalId, "AWS::DirectoryService::SimpleAD") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var createAlias: Any? = null

        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun createAlias(value: Boolean) {
          this.createAlias = value
        }
        
        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun createAlias(value: IntrinsicFunction) {
          this.createAlias = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableSso: Any? = null

        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSso(value: Boolean) {
          this.enableSso = value
        }
        
        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSso(value: IntrinsicFunction) {
          this.enableSso = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }
        
        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var shortName: Any? = null

        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortName(value: String) {
          this.shortName = value
        }
        
        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortName(value: IntrinsicFunction) {
          this.shortName = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var size: Any? = null

        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun size(value: String) {
          this.size = value
        }
        
        /**
         * [size](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-size)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun size(value: IntrinsicFunction) {
          this.size = value
        }
        
        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
         *
         * _Required_: yes
         *
         * _Type_: VpcSettings
         */
        @JvmField
        var vpcSettings: Any? = null

        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
         *
         * _Required_: yes
         *
         * _Type_: VpcSettings
         */
        fun vpcSettings(value: VpcSettings) {
          this.vpcSettings = value
        }
        
        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html#cfn-directoryservice-simplead-vpcsettings)
         *
         * _Required_: yes
         *
         * _Type_: VpcSettings
         */
        fun vpcSettings(value: IntrinsicFunction) {
          this.vpcSettings = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class VpcSettings(
            /**
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-subnetids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>,
            /**
             * [VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-simplead-vpcsettings.html#cfn-directoryservice-simplead-vpcsettings-vpcid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val vpcId: String
    )

}

/**
 * [AWS::DirectoryService::SimpleAD - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
 */
fun Resources.awsDirectoryServiceSimpleAD(logicalId: String, init: AWSDirectoryServiceSimpleAD.() -> Unit = {}): AWSDirectoryServiceSimpleAD {
    return AWSDirectoryServiceSimpleAD(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
