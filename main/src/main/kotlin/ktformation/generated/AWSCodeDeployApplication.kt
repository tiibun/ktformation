
package ktformation.generated

import ktformation.*

/**
 * [AWS::CodeDeploy::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
 */
@CloudFormationMarker
class AWSCodeDeployApplication(logicalId: String) : Resource<AWSCodeDeployApplication.Properties>(logicalId, "AWS::CodeDeploy::Application") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        /**
         * [computePlatform](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var computePlatform: Any? = null

        /**
         * [computePlatform](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun computePlatform(value: String) {
          this.computePlatform = value
        }
        
        /**
         * [computePlatform](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun computePlatform(value: IntrinsicFunction) {
          this.computePlatform = value
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
 * [AWS::CodeDeploy::Application - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
 */
fun Resources.awsCodeDeployApplication(logicalId: String, init: AWSCodeDeployApplication.() -> Unit = {}): AWSCodeDeployApplication {
    return AWSCodeDeployApplication(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
