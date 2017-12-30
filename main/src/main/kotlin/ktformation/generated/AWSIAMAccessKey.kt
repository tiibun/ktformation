
package ktformation.generated

import ktformation.*

/**
 * [AWS::IAM::AccessKey - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html)
 */
@CloudFormationMarker
class AWSIAMAccessKey(logicalId: String) : Resource<AWSIAMAccessKey.Properties>(logicalId, "AWS::IAM::AccessKey") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var serial: Any? = null
        fun serial(value: Int) {
            this.serial = value
        }
        fun serial(value: IntrinsicFunction) { this.serial = value }
        @JvmField var status: Any? = null
        fun status(value: String) {
            this.status = value
        }
        fun status(value: IntrinsicFunction) { this.status = value }
        @JvmField var userName: Any? = null
        fun userName(value: String) { this.userName = value }
        fun userName(value: IntrinsicFunction) { this.userName = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsIAMAccessKey(logicalId: String, init: AWSIAMAccessKey.() -> Unit = {}): AWSIAMAccessKey {
    return AWSIAMAccessKey(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
