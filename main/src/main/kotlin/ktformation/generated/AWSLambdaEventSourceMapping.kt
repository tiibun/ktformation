
package ktformation.generated

import ktformation.*

/**
 * [AWS::Lambda::EventSourceMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
 */
@CloudFormationMarker
class AWSLambdaEventSourceMapping(logicalId: String) : Resource<AWSLambdaEventSourceMapping.Properties>(logicalId, "AWS::Lambda::EventSourceMapping") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [batchSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var batchSize: Any? = null

        /**
         * [batchSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun batchSize(value: Int) {
          this.batchSize = value
        }
        
        /**
         * [batchSize](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun batchSize(value: IntrinsicFunction) {
          this.batchSize = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }
        
        /**
         * [eventSourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var eventSourceArn: Any? = null

        /**
         * [eventSourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eventSourceArn(value: String) {
          this.eventSourceArn = value
        }
        
        /**
         * [eventSourceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun eventSourceArn(value: IntrinsicFunction) {
          this.eventSourceArn = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var functionName: Any? = null

        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: String) {
          this.functionName = value
        }
        
        /**
         * [functionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionName(value: IntrinsicFunction) {
          this.functionName = value
        }
        
        /**
         * [startingPosition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var startingPosition: Any? = null

        /**
         * [startingPosition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun startingPosition(value: String) {
          this.startingPosition = value
        }
        
        /**
         * [startingPosition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun startingPosition(value: IntrinsicFunction) {
          this.startingPosition = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::Lambda::EventSourceMapping - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
 */
fun Resources.awsLambdaEventSourceMapping(logicalId: String, init: AWSLambdaEventSourceMapping.() -> Unit = {}): AWSLambdaEventSourceMapping {
    return AWSLambdaEventSourceMapping(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
