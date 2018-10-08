
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
         * [jsonClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
         *
         * _Required_: no
         *
         * _Type_: JsonClassifier
         */
        @JvmField
        var jsonClassifier: Any? = null

        /**
         * [jsonClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
         *
         * _Required_: no
         *
         * _Type_: JsonClassifier
         */
        fun jsonClassifier(value: JsonClassifier) {
          this.jsonClassifier = value
        }
        
        /**
         * [jsonClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
         *
         * _Required_: no
         *
         * _Type_: JsonClassifier
         */
        fun jsonClassifier(value: IntrinsicFunction) {
          this.jsonClassifier = value
        }

        /**
         * [xMLClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
         *
         * _Required_: no
         *
         * _Type_: XMLClassifier
         */
        @JvmField
        var xMLClassifier: Any? = null

        /**
         * [xMLClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
         *
         * _Required_: no
         *
         * _Type_: XMLClassifier
         */
        fun xMLClassifier(value: XMLClassifier) {
          this.xMLClassifier = value
        }
        
        /**
         * [xMLClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
         *
         * _Required_: no
         *
         * _Type_: XMLClassifier
         */
        fun xMLClassifier(value: IntrinsicFunction) {
          this.xMLClassifier = value
        }

        /**
        * [GrokClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html)
        */
        fun grokClassifier(init: GrokClassifier.() -> Unit = {}): GrokClassifier {
            return GrokClassifier().also {
                it.init()
            }
        }
        /**
        * [JsonClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html)
        */
        fun jsonClassifier(init: JsonClassifier.() -> Unit = {}): JsonClassifier {
            return JsonClassifier().also {
                it.init()
            }
        }
        /**
        * [XMLClassifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html)
        */
        fun xMLClassifier(init: XMLClassifier.() -> Unit = {}): XMLClassifier {
            return XMLClassifier().also {
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

    @CloudFormationMarker
    class JsonClassifier {
            /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var jsonPath: Any? = null

        /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jsonPath(value: String) {
          this.jsonPath = value
        }
        
        /**
         * [jsonPath](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-jsonpath)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun jsonPath(value: IntrinsicFunction) {
          this.jsonPath = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html#cfn-glue-classifier-jsonclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class XMLClassifier {
            /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var classification: Any? = null

        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun classification(value: String) {
          this.classification = value
        }
        
        /**
         * [classification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-classification)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun classification(value: IntrinsicFunction) {
          this.classification = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [rowTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var rowTag: Any? = null

        /**
         * [rowTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun rowTag(value: String) {
          this.rowTag = value
        }
        
        /**
         * [rowTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html#cfn-glue-classifier-xmlclassifier-rowtag)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun rowTag(value: IntrinsicFunction) {
          this.rowTag = value
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
