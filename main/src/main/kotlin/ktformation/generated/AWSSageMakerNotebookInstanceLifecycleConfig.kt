
package ktformation.generated

import ktformation.*

/**
 * [AWS::SageMaker::NotebookInstanceLifecycleConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html)
 */
@CloudFormationMarker
class AWSSageMakerNotebookInstanceLifecycleConfig(logicalId: String) : Resource<AWSSageMakerNotebookInstanceLifecycleConfig.Properties>(logicalId, "AWS::SageMaker::NotebookInstanceLifecycleConfig") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [notebookInstanceLifecycleConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notebookInstanceLifecycleConfigName: Any? = null

        /**
         * [notebookInstanceLifecycleConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notebookInstanceLifecycleConfigName(value: String) {
          this.notebookInstanceLifecycleConfigName = value
        }
        
        /**
         * [notebookInstanceLifecycleConfigName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecycleconfigname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notebookInstanceLifecycleConfigName(value: IntrinsicFunction) {
          this.notebookInstanceLifecycleConfigName = value
        }

        /**
         * [onCreate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        @JvmField
        var onCreate: Any? = null

        /**
         * [onCreate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        fun onCreate(value: List<NotebookInstanceLifecycleHook>) {
          this.onCreate = value
        }
        
        /**
         * [onCreate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-oncreate)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        fun onCreate(vararg value: IntrinsicFunction) {
          this.onCreate = value
        }

        /**
         * [onStart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        @JvmField
        var onStart: Any? = null

        /**
         * [onStart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        fun onStart(value: List<NotebookInstanceLifecycleHook>) {
          this.onStart = value
        }
        
        /**
         * [onStart](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html#cfn-sagemaker-notebookinstancelifecycleconfig-onstart)
         *
         * _Required_: no
         *
         * _Type_: List<NotebookInstanceLifecycleHook>
         */
        fun onStart(vararg value: IntrinsicFunction) {
          this.onStart = value
        }

        /**
        * [NotebookInstanceLifecycleHook](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html)
        */
        fun notebookInstanceLifecycleHook(init: NotebookInstanceLifecycleHook.() -> Unit = {}): NotebookInstanceLifecycleHook {
            return NotebookInstanceLifecycleHook().also {
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
    class NotebookInstanceLifecycleHook {
            /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var content: Any? = null

        /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun content(value: String) {
          this.content = value
        }
        
        /**
         * [content](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook.html#cfn-sagemaker-notebookinstancelifecycleconfig-notebookinstancelifecyclehook-content)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun content(value: IntrinsicFunction) {
          this.content = value
        }

    }

}

/**
 * [AWS::SageMaker::NotebookInstanceLifecycleConfig - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-notebookinstancelifecycleconfig.html)
 */
fun Resources.awsSageMakerNotebookInstanceLifecycleConfig(logicalId: String, init: AWSSageMakerNotebookInstanceLifecycleConfig.() -> Unit = {}): AWSSageMakerNotebookInstanceLifecycleConfig {
    return AWSSageMakerNotebookInstanceLifecycleConfig(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
