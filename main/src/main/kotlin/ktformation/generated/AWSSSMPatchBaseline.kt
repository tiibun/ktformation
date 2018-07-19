
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

        /**
        * [PatchFilter](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html)
        */
        fun patchFilter(init: PatchFilter.() -> Unit = {}): PatchFilter {
            return PatchFilter().also {
                it.init()
            }
        }
        /**
        * [PatchFilterGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
        */
        fun patchFilterGroup(init: PatchFilterGroup.() -> Unit = {}): PatchFilterGroup {
            return PatchFilterGroup().also {
                it.init()
            }
        }
        /**
        * [PatchSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html)
        */
        fun patchSource(init: PatchSource.() -> Unit = {}): PatchSource {
            return PatchSource().also {
                it.init()
            }
        }
        /**
        * [Rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
        */
        fun rule(init: Rule.() -> Unit = {}): Rule {
            return Rule().also {
                it.init()
            }
        }
        /**
        * [RuleGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
        */
        fun ruleGroup(init: RuleGroup.() -> Unit = {}): RuleGroup {
            return RuleGroup().also {
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
    class PatchFilter {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

    @CloudFormationMarker
    class PatchFilterGroup {
            /**
         * [patchFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
         *
         * _Required_: no
         *
         * _Type_: List<PatchFilter>
         */
        var patchFilters: Any? = null

        /**
         * [patchFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
         *
         * _Required_: no
         *
         * _Type_: List<PatchFilter>
         */
        fun patchFilters(value: List<PatchFilter>) {
          this.patchFilters = value
        }
        
        /**
         * [patchFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters)
         *
         * _Required_: no
         *
         * _Type_: List<PatchFilter>
         */
        fun patchFilters(vararg value: IntrinsicFunction) {
          this.patchFilters = value
        }

    }

    @CloudFormationMarker
    class PatchSource {
            /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var configuration: Any? = null

        /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun configuration(value: String) {
          this.configuration = value
        }
        
        /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-configuration)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun configuration(value: IntrinsicFunction) {
          this.configuration = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [products](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var products: Any? = null

        /**
         * [products](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun products(value: List<String>) {
          this.products = value
        }
        
        /**
         * [products](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchsource.html#cfn-ssm-patchbaseline-patchsource-products)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun products(vararg value: IntrinsicFunction) {
          this.products = value
        }

    }

    @CloudFormationMarker
    class Rule {
            /**
         * [approveAfterDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var approveAfterDays: Any? = null

        /**
         * [approveAfterDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun approveAfterDays(value: Int) {
          this.approveAfterDays = value
        }
        
        /**
         * [approveAfterDays](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun approveAfterDays(value: IntrinsicFunction) {
          this.approveAfterDays = value
        }

        /**
         * [complianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var complianceLevel: Any? = null

        /**
         * [complianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun complianceLevel(value: String) {
          this.complianceLevel = value
        }
        
        /**
         * [complianceLevel](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun complianceLevel(value: IntrinsicFunction) {
          this.complianceLevel = value
        }

        /**
         * [enableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enableNonSecurity: Any? = null

        /**
         * [enableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableNonSecurity(value: Boolean) {
          this.enableNonSecurity = value
        }
        
        /**
         * [enableNonSecurity](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enableNonSecurity(value: IntrinsicFunction) {
          this.enableNonSecurity = value
        }

        /**
         * [patchFilterGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        var patchFilterGroup: Any? = null

        /**
         * [patchFilterGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        fun patchFilterGroup(value: PatchFilterGroup) {
          this.patchFilterGroup = value
        }
        
        /**
         * [patchFilterGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-patchfiltergroup)
         *
         * _Required_: no
         *
         * _Type_: PatchFilterGroup
         */
        fun patchFilterGroup(value: IntrinsicFunction) {
          this.patchFilterGroup = value
        }

    }

    @CloudFormationMarker
    class RuleGroup {
            /**
         * [patchRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
         */
        var patchRules: Any? = null

        /**
         * [patchRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
         */
        fun patchRules(value: List<Rule>) {
          this.patchRules = value
        }
        
        /**
         * [patchRules](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules)
         *
         * _Required_: no
         *
         * _Type_: List<Rule>
         */
        fun patchRules(vararg value: IntrinsicFunction) {
          this.patchRules = value
        }

    }

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
