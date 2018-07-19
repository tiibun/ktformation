
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::ApplicationVersion - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkApplicationVersion(logicalId: String) : Resource<AWSElasticBeanstalkApplicationVersion.Properties>(logicalId, "AWS::ElasticBeanstalk::ApplicationVersion") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var applicationName: Any? = null

        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        /**
         * [applicationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-applicationname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [sourceBundle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * _Required_: yes
         *
         * _Type_: SourceBundle
         */
        @JvmField
        var sourceBundle: Any? = null

        /**
         * [sourceBundle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * _Required_: yes
         *
         * _Type_: SourceBundle
         */
        fun sourceBundle(value: SourceBundle) {
          this.sourceBundle = value
        }
        
        /**
         * [sourceBundle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html#cfn-elasticbeanstalk-applicationversion-sourcebundle)
         *
         * _Required_: yes
         *
         * _Type_: SourceBundle
         */
        fun sourceBundle(value: IntrinsicFunction) {
          this.sourceBundle = value
        }

        /**
        * [SourceBundle](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html)
        */
        fun sourceBundle(init: SourceBundle.() -> Unit = {}): SourceBundle {
            return SourceBundle().also {
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
    class SourceBundle {
            /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3Bucket: Any? = null

        /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Bucket(value: String) {
          this.s3Bucket = value
        }
        
        /**
         * [s3Bucket](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Bucket(value: IntrinsicFunction) {
          this.s3Bucket = value
        }

        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var s3Key: Any? = null

        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Key(value: String) {
          this.s3Key = value
        }
        
        /**
         * [s3Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun s3Key(value: IntrinsicFunction) {
          this.s3Key = value
        }

    }

}

/**
 * [AWS::ElasticBeanstalk::ApplicationVersion - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html)
 */
fun Resources.awsElasticBeanstalkApplicationVersion(logicalId: String, init: AWSElasticBeanstalkApplicationVersion.() -> Unit = {}): AWSElasticBeanstalkApplicationVersion {
    return AWSElasticBeanstalkApplicationVersion(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
