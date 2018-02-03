
package ktformation.generated

import ktformation.*

/**
 * [AWS::DirectoryService::MicrosoftAD - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html)
 */
@CloudFormationMarker
class AWSDirectoryServiceMicrosoftAD(logicalId: String) : Resource<AWSDirectoryServiceMicrosoftAD.Properties>(logicalId, "AWS::DirectoryService::MicrosoftAD") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var createAlias: Any? = null

        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun createAlias(value: Boolean) {
          this.createAlias = value
        }
        
        /**
         * [createAlias](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-createalias)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun createAlias(value: IntrinsicFunction) {
          this.createAlias = value
        }
        
        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enableSso: Any? = null

        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSso(value: Boolean) {
          this.enableSso = value
        }
        
        /**
         * [enableSso](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-enablesso)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableSso(value: IntrinsicFunction) {
          this.enableSso = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-password)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }
        
        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var shortName: Any? = null

        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortName(value: String) {
          this.shortName = value
        }
        
        /**
         * [shortName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-shortname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun shortName(value: IntrinsicFunction) {
          this.shortName = value
        }
        
        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
         *
         * _Required_: yes
         *
         * _Type_: VpcSettings
         */
        @JvmField
        var vpcSettings: Any? = null

        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
         *
         * _Required_: yes
         *
         * _Type_: VpcSettings
         */
        fun vpcSettings(value: VpcSettings) {
          this.vpcSettings = value
        }
        
        /**
         * [vpcSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html#cfn-directoryservice-microsoftad-vpcsettings)
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
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-subnetids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>,
            /**
             * [VpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-directoryservice-microsoftad-vpcsettings.html#cfn-directoryservice-microsoftad-vpcsettings-vpcid)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val vpcId: String
    )

}

/**
 * [AWS::DirectoryService::MicrosoftAD - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-microsoftad.html)
 */
fun Resources.awsDirectoryServiceMicrosoftAD(logicalId: String, init: AWSDirectoryServiceMicrosoftAD.() -> Unit = {}): AWSDirectoryServiceMicrosoftAD {
    return AWSDirectoryServiceMicrosoftAD(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
