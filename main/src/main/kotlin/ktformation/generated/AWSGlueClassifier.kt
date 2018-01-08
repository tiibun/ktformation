
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Classifier - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
 */
@CloudFormationMarker
class AWSGlueClassifier(logicalId: String) : Resource<AWSGlueClassifier.Properties>(logicalId, "AWS::Glue::Classifier") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var grokClassifier: Any? = null

        fun grokClassifier(value: GrokClassifier) {
          this.grokClassifier = value
        }
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
            val classification: String,
            val customPatterns: String? = null,
            val grokPattern: String,
            val name: String? = null
    )

}

fun Resources.awsGlueClassifier(logicalId: String, init: AWSGlueClassifier.() -> Unit = {}): AWSGlueClassifier {
    return AWSGlueClassifier(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
