
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::PatchBaseline - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 */
@CloudFormationMarker
class AWSSSMPatchBaseline(logicalId: String) : Resource<AWSSSMPatchBaseline.Properties>(logicalId, "AWS::SSM::PatchBaseline") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var approvalRules: Any? = null

        fun approvalRules(value: RuleGroup) {
          this.approvalRules = value
        }
        
        fun approvalRules(value: IntrinsicFunction) {
          this.approvalRules = value
        }
        
        @JvmField
        var approvedPatches: Any? = null

        fun approvedPatches(value: List<String>) {
          this.approvedPatches = value
        }
        
        fun approvedPatches(vararg value: IntrinsicFunction) {
          this.approvedPatches = value
        }
        
        @JvmField
        var approvedPatchesComplianceLevel: Any? = null

        fun approvedPatchesComplianceLevel(value: String) {
          this.approvedPatchesComplianceLevel = value
        }
        
        fun approvedPatchesComplianceLevel(value: IntrinsicFunction) {
          this.approvedPatchesComplianceLevel = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var globalFilters: Any? = null

        fun globalFilters(value: PatchFilterGroup) {
          this.globalFilters = value
        }
        
        fun globalFilters(value: IntrinsicFunction) {
          this.globalFilters = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var operatingSystem: Any? = null

        fun operatingSystem(value: String) {
          this.operatingSystem = value
        }
        
        fun operatingSystem(value: IntrinsicFunction) {
          this.operatingSystem = value
        }
        
        @JvmField
        var patchGroups: Any? = null

        fun patchGroups(value: List<String>) {
          this.patchGroups = value
        }
        
        fun patchGroups(vararg value: IntrinsicFunction) {
          this.patchGroups = value
        }
        
        @JvmField
        var rejectedPatches: Any? = null

        fun rejectedPatches(value: List<String>) {
          this.rejectedPatches = value
        }
        
        fun rejectedPatches(vararg value: IntrinsicFunction) {
          this.rejectedPatches = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class PatchFilter(
            val key: String? = null,
            val values: List<String>? = null
    )

    class PatchFilterGroup(
            val patchFilters: List<PatchFilter>? = null
    )

    class Rule(
            val approveAfterDays: Int? = null,
            val complianceLevel: String? = null,
            val patchFilterGroup: PatchFilterGroup? = null
    )

    class RuleGroup(
            val patchRules: List<Rule>? = null
    )

}

fun Resources.awsSSMPatchBaseline(logicalId: String, init: AWSSSMPatchBaseline.() -> Unit = {}): AWSSSMPatchBaseline {
    return AWSSSMPatchBaseline(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
