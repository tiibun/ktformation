
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Classifier - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
 */
@CloudFormationMarker
class AWSGlueClassifier(logicalId: String) : Resource<AWSGlueClassifier.Properties>(logicalId, "AWS::Glue::Classifier") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [grokClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
         *
         * _Required_: no
         *
         * _Type_: GrokClassifier
         */
        @JvmField
        var grokClassifier: Any? = null

        /**
         * [grokClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
         *
         * _Required_: no
         *
         * _Type_: GrokClassifier
         */
        fun grokClassifier(value: GrokClassifier) {
          this.grokClassifier = value
        }
        
        /**
         * [grokClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
         *
         * _Required_: no
         *
         * _Type_: GrokClassifier
         */
        fun grokClassifier(value: IntrinsicFunction) {
          this.grokClassifier = value
        }

        /**
        * [GrokClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html)
        */
        fun grokClassifier(init: GrokClassifier.() -> Unit = {}): GrokClassifier {
            return GrokClassifier().also {
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
    class GrokClassifier {
            /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var classification: Any? = null

        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun classification(value: String) {
          this.classification = value
        }
        
        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun classification(value: IntrinsicFunction) {
          this.classification = value
        }

        /**
         * [customPatterns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var customPatterns: Any? = null

        /**
         * [customPatterns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customPatterns(value: String) {
          this.customPatterns = value
        }
        
        /**
         * [customPatterns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun customPatterns(value: IntrinsicFunction) {
          this.customPatterns = value
        }

        /**
         * [grokPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var grokPattern: Any? = null

        /**
         * [grokPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun grokPattern(value: String) {
          this.grokPattern = value
        }
        
        /**
         * [grokPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun grokPattern(value: IntrinsicFunction) {
          this.grokPattern = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

}

/**
 * [AWS::Glue::Classifier - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
 */
fun Resources.awsGlueClassifier(logicalId: String, init: AWSGlueClassifier.() -> Unit = {}): AWSGlueClassifier {
    return AWSGlueClassifier(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
