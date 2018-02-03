
package ktformation.generated

import ktformation.*

/**
 * [AWS::EMR::Step - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
@CloudFormationMarker
class AWSEMRStep(logicalId: String) : Resource<AWSEMRStep.Properties>(logicalId, "AWS::EMR::Step") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [actionOnFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var actionOnFailure: Any? = null

        /**
         * [actionOnFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun actionOnFailure(value: String) {
          this.actionOnFailure = value
        }
        
        /**
         * [actionOnFailure](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun actionOnFailure(value: IntrinsicFunction) {
          this.actionOnFailure = value
        }
        
        /**
         * [hadoopJarStep](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-hadoopjarstep)
         *
         * _Required_: yes
         *
         * _Type_: HadoopJarStepConfig
         */
        @JvmField
        var hadoopJarStep: Any? = null

        /**
         * [hadoopJarStep](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-hadoopjarstep)
         *
         * _Required_: yes
         *
         * _Type_: HadoopJarStepConfig
         */
        fun hadoopJarStep(value: HadoopJarStepConfig) {
          this.hadoopJarStep = value
        }
        
        /**
         * [hadoopJarStep](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-hadoopjarstep)
         *
         * _Required_: yes
         *
         * _Type_: HadoopJarStepConfig
         */
        fun hadoopJarStep(value: IntrinsicFunction) {
          this.hadoopJarStep = value
        }
        
        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var jobFlowId: Any? = null

        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowId(value: String) {
          this.jobFlowId = value
        }
        
        /**
         * [jobFlowId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jobFlowId(value: IntrinsicFunction) {
          this.jobFlowId = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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
            /**
             * [Args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val args: List<String>? = null,
            /**
             * [Jar](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val jar: String,
            /**
             * [MainClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val mainClass: String? = null,
            /**
             * [StepProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties)
             *
             * _Required_: no
             *
             * _Type_: List<KeyValue>
             */
            val stepProperties: List<KeyValue>? = null
    )

    class KeyValue(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-key)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val key: String? = null,
            /**
             * [Value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-value)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val value: String? = null
    )

}

/**
 * [AWS::EMR::Step - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
fun Resources.awsEMRStep(logicalId: String, init: AWSEMRStep.() -> Unit = {}): AWSEMRStep {
    return AWSEMRStep(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
