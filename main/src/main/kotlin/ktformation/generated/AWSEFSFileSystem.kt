
package ktformation.generated

import ktformation.*

/**
 * [AWS::EFS::FileSystem - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
@CloudFormationMarker
class AWSEFSFileSystem(logicalId: String) : Resource<AWSEFSFileSystem.Properties>(logicalId, "AWS::EFS::FileSystem") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var encrypted: Any? = null

        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: Boolean) {
          this.encrypted = value
        }
        
        /**
         * [encrypted](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun encrypted(value: IntrinsicFunction) {
          this.encrypted = value
        }

        /**
         * [fileSystemTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticFileSystemTag>
         */
        @JvmField
        var fileSystemTags: Any? = null

        /**
         * [fileSystemTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticFileSystemTag>
         */
        fun fileSystemTags(value: List<ElasticFileSystemTag>) {
          this.fileSystemTags = value
        }
        
        /**
         * [fileSystemTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticFileSystemTag>
         */
        fun fileSystemTags(vararg value: IntrinsicFunction) {
          this.fileSystemTags = value
        }

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kmsKeyId: Any? = null

        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: String) {
          this.kmsKeyId = value
        }
        
        /**
         * [kmsKeyId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyId(value: IntrinsicFunction) {
          this.kmsKeyId = value
        }

        /**
         * [performanceMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var performanceMode: Any? = null

        /**
         * [performanceMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun performanceMode(value: String) {
          this.performanceMode = value
        }
        
        /**
         * [performanceMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun performanceMode(value: IntrinsicFunction) {
          this.performanceMode = value
        }

        /**
         * [provisionedThroughputInMibps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var provisionedThroughputInMibps: Any? = null

        /**
         * [provisionedThroughputInMibps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun provisionedThroughputInMibps(value: Double) {
          this.provisionedThroughputInMibps = value
        }
        
        /**
         * [provisionedThroughputInMibps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-provisionedthroughputinmibps)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun provisionedThroughputInMibps(value: IntrinsicFunction) {
          this.provisionedThroughputInMibps = value
        }

        /**
         * [throughputMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var throughputMode: Any? = null

        /**
         * [throughputMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun throughputMode(value: String) {
          this.throughputMode = value
        }
        
        /**
         * [throughputMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-elasticfilesystem-filesystem-throughputmode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun throughputMode(value: IntrinsicFunction) {
          this.throughputMode = value
        }

        /**
        * [ElasticFileSystemTag](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html)
        */
        fun elasticFileSystemTag(init: ElasticFileSystemTag.() -> Unit = {}): ElasticFileSystemTag {
            return ElasticFileSystemTag().also {
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
    class ElasticFileSystemTag {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemtags.html#cfn-efs-filesystem-filesystemtags-value)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

}

/**
 * [AWS::EFS::FileSystem - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
fun Resources.awsEFSFileSystem(logicalId: String, init: AWSEFSFileSystem.() -> Unit = {}): AWSEFSFileSystem {
    return AWSEFSFileSystem(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
