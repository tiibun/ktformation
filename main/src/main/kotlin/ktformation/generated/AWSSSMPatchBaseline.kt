
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::PatchBaseline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 */
@CloudFormationMarker
class AWSSSMPatchBaseline(logicalId: String) : Resource<AWSSSMPatchBaseline.Properties>(logicalId, "AWS::SSM::PatchBaseline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [approvalRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
         *
         * _Required_: no
         *
         * _Type_: RuleGroup
         */
        @JvmField
        var approvalRules: Any? = null

        /**
         * [approvalRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
         *
         * _Required_: no
         *
         * _Type_: RuleGroup
         */
        fun approvalRules(value: RuleGroup) {
          this.approvalRules = value
        }
        
        /**
         * [approvalRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvalrules)
         *
         * _Required_: no
         *
         * _Type_: RuleGroup
         */
        fun approvalRules(value: IntrinsicFunction) {
          this.approvalRules = value
        }
        
        /**
         * [approvedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var approvedPatches: Any? = null

        /**
         * [approvedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun approvedPatches(value: List<String>) {
          this.approvedPatches = value
        }
        
        /**
         * [approvedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun approvedPatches(vararg value: IntrinsicFunction) {
          this.approvedPatches = value
        }
        
        /**
         * [approvedPatchesComplianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var approvedPatchesComplianceLevel: Any? = null

        /**
         * [approvedPatchesComplianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun approvedPatchesComplianceLevel(value: String) {
          this.approvedPatchesComplianceLevel = value
        }
        
        /**
         * [approvedPatchesComplianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun approvedPatchesComplianceLevel(value: IntrinsicFunction) {
          this.approvedPatchesComplianceLevel = value
        }
        
        /**
         * [approvedPatchesEnableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var approvedPatchesEnableNonSecurity: Any? = null

        /**
         * [approvedPatchesEnableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun approvedPatchesEnableNonSecurity(value: Boolean) {
          this.approvedPatchesEnableNonSecurity = value
        }
        
        /**
         * [approvedPatchesEnableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun approvedPatchesEnableNonSecurity(value: IntrinsicFunction) {
          this.approvedPatchesEnableNonSecurity = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [globalFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        @JvmField
        var globalFilters: Any? = null

        /**
         * [globalFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        fun globalFilters(value: PatchFilterGroup) {
          this.globalFilters = value
        }
        
        /**
         * [globalFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-globalfilters)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        fun globalFilters(value: IntrinsicFunction) {
          this.globalFilters = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [operatingSystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var operatingSystem: Any? = null

        /**
         * [operatingSystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun operatingSystem(value: String) {
          this.operatingSystem = value
        }
        
        /**
         * [operatingSystem](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun operatingSystem(value: IntrinsicFunction) {
          this.operatingSystem = value
        }
        
        /**
         * [patchGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var patchGroups: Any? = null

        /**
         * [patchGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun patchGroups(value: List<String>) {
          this.patchGroups = value
        }
        
        /**
         * [patchGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun patchGroups(vararg value: IntrinsicFunction) {
          this.patchGroups = value
        }
        
        /**
         * [rejectedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var rejectedPatches: Any? = null

        /**
         * [rejectedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun rejectedPatches(value: List<String>) {
          this.rejectedPatches = value
        }
        
        /**
         * [rejectedPatches](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun rejectedPatches(vararg value: IntrinsicFunction) {
          this.rejectedPatches = value
        }
        
        /**
         * [sources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
         *
         * _Required_: no
         *
         * _Type_: List<PatchSource>
         */
        @JvmField
        var sources: Any? = null

        /**
         * [sources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
         *
         * _Required_: no
         *
         * _Type_: List<PatchSource>
         */
        fun sources(value: List<PatchSource>) {
          this.sources = value
        }
        
        /**
         * [sources](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources)
         *
         * _Required_: no
         *
         * _Type_: List<PatchSource>
         */
        fun sources(vararg value: IntrinsicFunction) {
          this.sources = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class PatchFilter(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val values: List<String>? = null
    )

    class PatchFilterGroup(
            /**
             * [PatchFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
             *
             * _Required_: no
             *
             * _Type_: List<PatchFilter>
             */
            val patchFilters: List<PatchFilter>? = null
    )

    class PatchSource(
            /**
             * [Configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val configuration: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Products](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val products: List<String>? = null
    )

    class Rule(
            /**
             * [ApproveAfterDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val approveAfterDays: Int? = null,
            /**
             * [ComplianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val complianceLevel: String? = null,
            /**
             * [EnableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enableNonSecurity: Boolean? = null,
            /**
             * [PatchFilterGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
             *
             * _Required_: no
             *
             * _Type_: PatchFilterGroup
             */
            val patchFilterGroup: PatchFilterGroup? = null
    )

    class RuleGroup(
            /**
             * [PatchRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
             *
             * _Required_: no
             *
             * _Type_: List<Rule>
             */
            val patchRules: List<Rule>? = null
    )

}

/**
 * [AWS::SSM::PatchBaseline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 */
fun Resources.awsSSMPatchBaseline(logicalId: String, init: AWSSSMPatchBaseline.() -> Unit = {}): AWSSSMPatchBaseline {
    return AWSSSMPatchBaseline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
