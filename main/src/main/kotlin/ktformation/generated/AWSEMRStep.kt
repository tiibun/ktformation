
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

        /**
        * [HadoopJarStepConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html)
        */
        fun hadoopJarStepConfig(init: HadoopJarStepConfig.() -> Unit = {}): HadoopJarStepConfig {
            return HadoopJarStepConfig().also {
                it.init()
            }
        }
        /**
        * [KeyValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html)
        */
        fun keyValue(init: KeyValue.() -> Unit = {}): KeyValue {
            return KeyValue().also {
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
    class HadoopJarStepConfig {
            /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var args: Any? = null

        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(value: List<String>) {
          this.args = value
        }
        
        /**
         * [args](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-args)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun args(vararg value: IntrinsicFunction) {
          this.args = value
        }

        /**
         * [jar](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var jar: Any? = null

        /**
         * [jar](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jar(value: String) {
          this.jar = value
        }
        
        /**
         * [jar](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-jar)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jar(value: IntrinsicFunction) {
          this.jar = value
        }

        /**
         * [mainClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var mainClass: Any? = null

        /**
         * [mainClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mainClass(value: String) {
          this.mainClass = value
        }
        
        /**
         * [mainClass](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-mainclass)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun mainClass(value: IntrinsicFunction) {
          this.mainClass = value
        }

        /**
         * [stepProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValue>
         */
        var stepProperties: Any? = null

        /**
         * [stepProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValue>
         */
        fun stepProperties(value: List<KeyValue>) {
          this.stepProperties = value
        }
        
        /**
         * [stepProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html#cfn-elasticmapreduce-step-hadoopjarstepconfig-stepproperties)
         *
         * _Required_: no
         *
         * _Type_: List<KeyValue>
         */
        fun stepProperties(vararg value: IntrinsicFunction) {
          this.stepProperties = value
        }

    }

    @CloudFormationMarker
    class KeyValue {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-key)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html#cfn-elasticmapreduce-step-keyvalue-value)
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
 * [AWS::EMR::Step - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
fun Resources.awsEMRStep(logicalId: String, init: AWSEMRStep.() -> Unit = {}): AWSEMRStep {
    return AWSEMRStep(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
