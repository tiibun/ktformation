
package ktformation.generated

import ktformation.*

/**
 * [AWS::GameLift::Build - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
@CloudFormationMarker
class AWSGameLiftBuild(logicalId: String) : Resource<AWSGameLiftBuild.Properties>(logicalId, "AWS::GameLift::Build") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var name: Any? = null
        fun name(value: String?) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var storageLocation: Any? = null
        fun storageLocation(value: S3Location?) { this.storageLocation = value }
        fun storageLocation(value: IntrinsicFunction) { this.storageLocation = value }
        @JvmField var version: Any? = null
        fun version(value: String?) { this.version = value }
        fun version(value: IntrinsicFunction) { this.version = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class S3Location(
            val bucket: String,
            val key: String,
            val roleArn: String
    )

}

fun Resources.awsGameLiftBuild(logicalId: String, init: AWSGameLiftBuild.() -> Unit = {}): AWSGameLiftBuild {
    return AWSGameLiftBuild(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
