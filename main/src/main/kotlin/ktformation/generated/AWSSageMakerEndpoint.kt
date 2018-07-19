
package ktformation.generated

import ktformation.*

/**
 * [AWS::SageMaker::Endpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html)
 */
@CloudFormationMarker
class AWSSageMakerEndpoint(logicalId: String) : Resource<AWSSageMakerEndpoint.Properties>(logicalId, "AWS::SageMaker::Endpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var endpointConfigName: Any? = null

        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpointConfigName(value: String) {
          this.endpointConfigName = value
        }
        
        /**
         * [endpointConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointconfigname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun endpointConfigName(value: IntrinsicFunction) {
          this.endpointConfigName = value
        }

        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endpointName: Any? = null

        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointName(value: String) {
          this.endpointName = value
        }
        
        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointName(value: IntrinsicFunction) {
          this.endpointName = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html#cfn-sagemaker-endpoint-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::SageMaker::Endpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-endpoint.html)
 */
fun Resources.awsSageMakerEndpoint(logicalId: String, init: AWSSageMakerEndpoint.() -> Unit = {}): AWSSageMakerEndpoint {
    return AWSSageMakerEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
