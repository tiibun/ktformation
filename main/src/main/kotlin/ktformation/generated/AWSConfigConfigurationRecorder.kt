
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::ConfigurationRecorder - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
@CloudFormationMarker
class AWSConfigConfigurationRecorder(logicalId: String) : Resource<AWSConfigConfigurationRecorder.Properties>(logicalId, "AWS::Config::ConfigurationRecorder") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var recordingGroup: Any? = null
        fun recordingGroup(value: RecordingGroup?) { this.recordingGroup = value }
        fun recordingGroup(value: IntrinsicFunction) { this.recordingGroup = value }
        @JvmField var roleARN: Any? = null
        fun roleARN(value: String) { this.roleARN = value }
        fun roleARN(value: IntrinsicFunction) { this.roleARN = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class RecordingGroup(
            val allSupported: Boolean? = null,
            val includeGlobalResourceTypes: Boolean? = null,
            val resourceTypes: List<String>? = null
    )

}

fun Resources.awsConfigConfigurationRecorder(logicalId: String, init: AWSConfigConfigurationRecorder.() -> Unit = {}): AWSConfigConfigurationRecorder {
    return AWSConfigConfigurationRecorder(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
