
package ktformation.generated

import ktformation.*

/**
 * [AWS::CloudFormation::WaitConditionHandle - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
 */
@CloudFormationMarker
class AWSCloudFormationWaitConditionHandle(logicalId: String) : Resource<AWSCloudFormationWaitConditionHandle.Properties>(logicalId, "AWS::CloudFormation::WaitConditionHandle") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {


    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::CloudFormation::WaitConditionHandle - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
 */
fun Resources.awsCloudFormationWaitConditionHandle(logicalId: String, init: AWSCloudFormationWaitConditionHandle.() -> Unit = {}): AWSCloudFormationWaitConditionHandle {
    return AWSCloudFormationWaitConditionHandle(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
