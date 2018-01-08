
package ktformation.generated

import ktformation.*

/**
 * [AWS::EFS::FileSystem - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
@CloudFormationMarker
class AWSEFSFileSystem(logicalId: String) : Resource<AWSEFSFileSystem.Properties>(logicalId, "AWS::EFS::FileSystem") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var encrypted: Any? = null

        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        fun encrypted(value: IntrinsicFunction) {
  this.encrypted = value
}
        @JvmField
        var fileSystemTags: Any? = null

        fun fileSystemTags(value: List<ElasticFileSystemTag>) {
          this.fileSystemTags = value
        }
        fun fileSystemTags(vararg value: IntrinsicFunction) {
  this.fileSystemTags = value
}
        @JvmField
        var kmsKeyId: Any? = null

        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        fun kmsKeyId(value: IntrinsicFunction) {
  this.kmsKeyId = value
}
        @JvmField
        var performanceMode: Any? = null

        fun performanceMode(value: String) {
          this.performanceMode = value
        }
        fun performanceMode(value: IntrinsicFunction) {
  this.performanceMode = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ElasticFileSystemTag(
            val key: String,
            val value: String
    )

}

fun Resources.awsEFSFileSystem(logicalId: String, init: AWSEFSFileSystem.() -> Unit = {}): AWSEFSFileSystem {
    return AWSEFSFileSystem(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
