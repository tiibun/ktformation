
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class GrokClassifier(
            /**
             * [Classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-classification)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val classification: String,
            /**
             * [CustomPatterns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-custompatterns)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val customPatterns: String? = null,
            /**
             * [GrokPattern](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-grokpattern)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val grokPattern: String,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html#cfn-glue-classifier-grokclassifier-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

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
