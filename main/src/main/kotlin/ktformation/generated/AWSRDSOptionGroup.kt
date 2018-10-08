
package ktformation.generated

import ktformation.*

/**
 * [AWS::RDS::OptionGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
 */
@CloudFormationMarker
class AWSRDSOptionGroup(logicalId: String) : Resource<AWSRDSOptionGroup.Properties>(logicalId, "AWS::RDS::OptionGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engineName: Any? = null

        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineName(value: String) {
          this.engineName = value
        }
        
        /**
         * [engineName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-enginename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineName(value: IntrinsicFunction) {
          this.engineName = value
        }

        /**
         * [majorEngineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var majorEngineVersion: Any? = null

        /**
         * [majorEngineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun majorEngineVersion(value: String) {
          this.majorEngineVersion = value
        }
        
        /**
         * [majorEngineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-majorengineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun majorEngineVersion(value: IntrinsicFunction) {
          this.majorEngineVersion = value
        }

        /**
         * [optionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<OptionConfiguration>
         */
        @JvmField
        var optionConfigurations: Any? = null

        /**
         * [optionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<OptionConfiguration>
         */
        fun optionConfigurations(value: List<OptionConfiguration>) {
          this.optionConfigurations = value
        }
        
        /**
         * [optionConfigurations](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optionconfigurations)
         *
         * _Required_: yes
         *
         * _Type_: List<OptionConfiguration>
         */
        fun optionConfigurations(vararg value: IntrinsicFunction) {
          this.optionConfigurations = value
        }

        /**
         * [optionGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var optionGroupDescription: Any? = null

        /**
         * [optionGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionGroupDescription(value: String) {
          this.optionGroupDescription = value
        }
        
        /**
         * [optionGroupDescription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-optiongroupdescription)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionGroupDescription(value: IntrinsicFunction) {
          this.optionGroupDescription = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html#cfn-rds-optiongroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
        * [OptionConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html)
        */
        fun optionConfiguration(init: OptionConfiguration.() -> Unit = {}): OptionConfiguration {
            return OptionConfiguration().also {
                it.init()
            }
        }
        /**
        * [OptionSetting](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html)
        */
        fun optionSetting(init: OptionSetting.() -> Unit = {}): OptionSetting {
            return OptionSetting().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class OptionConfiguration {
            /**
         * [dBSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var dBSecurityGroupMemberships: Any? = null

        /**
         * [dBSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dBSecurityGroupMemberships(value: List<String>) {
          this.dBSecurityGroupMemberships = value
        }
        
        /**
         * [dBSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun dBSecurityGroupMemberships(vararg value: IntrinsicFunction) {
          this.dBSecurityGroupMemberships = value
        }

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var optionName: Any? = null

        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: String) {
          this.optionName = value
        }
        
        /**
         * [optionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun optionName(value: IntrinsicFunction) {
          this.optionName = value
        }

        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        var optionSettings: Any? = null

        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        fun optionSettings(value: List<OptionSetting>) {
          this.optionSettings = value
        }
        
        /**
         * [optionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings)
         *
         * _Required_: no
         *
         * _Type_: List<OptionSetting>
         */
        fun optionSettings(vararg value: IntrinsicFunction) {
          this.optionSettings = value
        }

        /**
         * [optionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var optionVersion: Any? = null

        /**
         * [optionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun optionVersion(value: String) {
          this.optionVersion = value
        }
        
        /**
         * [optionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun optionVersion(value: IntrinsicFunction) {
          this.optionVersion = value
        }

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var port: Any? = null

        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: Int) {
          this.port = value
        }
        
        /**
         * [port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun port(value: IntrinsicFunction) {
          this.port = value
        }

        /**
         * [vpcSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var vpcSecurityGroupMemberships: Any? = null

        /**
         * [vpcSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupMemberships(value: List<String>) {
          this.vpcSecurityGroupMemberships = value
        }
        
        /**
         * [vpcSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun vpcSecurityGroupMemberships(vararg value: IntrinsicFunction) {
          this.vpcSecurityGroupMemberships = value
        }

    }

    @CloudFormationMarker
    class OptionSetting {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

}

/**
 * [AWS::RDS::OptionGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
 */
fun Resources.awsRDSOptionGroup(logicalId: String, init: AWSRDSOptionGroup.() -> Unit = {}): AWSRDSOptionGroup {
    return AWSRDSOptionGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
