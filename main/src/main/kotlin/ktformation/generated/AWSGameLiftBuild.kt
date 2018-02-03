
package ktformation.generated

import ktformation.*

/**
 * [AWS::GameLift::Build - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
@CloudFormationMarker
class AWSGameLiftBuild(logicalId: String) : Resource<AWSGameLiftBuild.Properties>(logicalId, "AWS::GameLift::Build") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [storageLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        @JvmField
        var storageLocation: Any? = null

        /**
         * [storageLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun storageLocation(value: S3Location) {
          this.storageLocation = value
        }
        
        /**
         * [storageLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
         *
         * _Required_: no
         *
         * _Type_: S3Location
         */
        fun storageLocation(value: IntrinsicFunction) {
          this.storageLocation = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class S3Location(
            /**
             * [Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-bucket)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucket: String,
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [RoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-rolearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val roleArn: String
    )

}

/**
 * [AWS::GameLift::Build - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
fun Resources.awsGameLiftBuild(logicalId: String, init: AWSGameLiftBuild.() -> Unit = {}): AWSGameLiftBuild {
    return AWSGameLiftBuild(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
