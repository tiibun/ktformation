
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::ResourceDataSync - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html)
 */
@CloudFormationMarker
class AWSSSMResourceDataSync(logicalId: String) : Resource<AWSSSMResourceDataSync.Properties>(logicalId, "AWS::SSM::ResourceDataSync") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var bucketName: Any? = null

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }

        /**
         * [bucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var bucketPrefix: Any? = null

        /**
         * [bucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketPrefix(value: String) {
          this.bucketPrefix = value
        }
        
        /**
         * [bucketPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun bucketPrefix(value: IntrinsicFunction) {
          this.bucketPrefix = value
        }

        /**
         * [bucketRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var bucketRegion: Any? = null

        /**
         * [bucketRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketRegion(value: String) {
          this.bucketRegion = value
        }
        
        /**
         * [bucketRegion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketRegion(value: IntrinsicFunction) {
          this.bucketRegion = value
        }

        /**
         * [kMSKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var kMSKeyArn: Any? = null

        /**
         * [kMSKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSKeyArn(value: String) {
          this.kMSKeyArn = value
        }
        
        /**
         * [kMSKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kMSKeyArn(value: IntrinsicFunction) {
          this.kMSKeyArn = value
        }

        /**
         * [syncFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var syncFormat: Any? = null

        /**
         * [syncFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun syncFormat(value: String) {
          this.syncFormat = value
        }
        
        /**
         * [syncFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun syncFormat(value: IntrinsicFunction) {
          this.syncFormat = value
        }

        /**
         * [syncName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var syncName: Any? = null

        /**
         * [syncName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun syncName(value: String) {
          this.syncName = value
        }
        
        /**
         * [syncName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun syncName(value: IntrinsicFunction) {
          this.syncName = value
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
 * [AWS::SSM::ResourceDataSync - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html)
 */
fun Resources.awsSSMResourceDataSync(logicalId: String, init: AWSSSMResourceDataSync.() -> Unit = {}): AWSSSMResourceDataSync {
    return AWSSSMResourceDataSync(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
