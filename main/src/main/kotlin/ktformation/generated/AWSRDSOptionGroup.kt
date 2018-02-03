
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class OptionConfiguration(
            /**
             * [DBSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-dbsecuritygroupmemberships)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val dBSecurityGroupMemberships: List<String>? = null,
            /**
             * [OptionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val optionName: String,
            /**
             * [OptionSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-optionsettings)
             *
             * _Required_: no
             *
             * _Type_: OptionSetting
             */
            val optionSettings: OptionSetting? = null,
            /**
             * [OptionVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfiguration-optionversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val optionVersion: String? = null,
            /**
             * [Port](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-port)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val port: Int? = null,
            /**
             * [VpcSecurityGroupMemberships](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations.html#cfn-rds-optiongroup-optionconfigurations-vpcsecuritygroupmemberships)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val vpcSecurityGroupMemberships: List<String>? = null
    )

    class OptionSetting(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-optiongroup-optionconfigurations-optionsettings.html#cfn-rds-optiongroup-optionconfigurations-optionsettings-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

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
