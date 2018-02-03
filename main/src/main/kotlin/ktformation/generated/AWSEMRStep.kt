
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::Step - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
@CloudFormationMarker
class AWSEMRStep(logicalId: String) : Resource<AWSEMRStep.Properties>(logicalId, "AWS::EMR::Step") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var actionOnFailure: Any? = null

        fun actionOnFailure(value: String) {
          this.actionOnFailure = value
        }
        
        fun actionOnFailure(value: IntrinsicFunction) {
          this.actionOnFailure = value
        }
        
        @JvmField
        var hadoopJarStep: Any? = null

        fun hadoopJarStep(value: HadoopJarStepConfig) {
          this.hadoopJarStep = value
        }
        
        fun hadoopJarStep(value: IntrinsicFunction) {
          this.hadoopJarStep = value
        }
        
        @JvmField
        var jobFlowId: Any? = null

        fun jobFlowId(value: String) {
          this.jobFlowId = value
        }
        
        fun jobFlowId(value: IntrinsicFunction) {
          this.jobFlowId = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class HadoopJarStepConfig(
            val args: List<String>? = null,
            val jar: String,
            val mainClass: String? = null,
            val stepProperties: List<KeyValue>? = null
    )

    class KeyValue(
            val key: String? = null,
            val value: String? = null
    )

}

fun Resources.awsEMRStep(logicalId: String, init: AWSEMRStep.() -> Unit = {}): AWSEMRStep {
    return AWSEMRStep(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
