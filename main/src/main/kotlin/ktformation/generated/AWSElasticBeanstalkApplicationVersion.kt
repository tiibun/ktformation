
package ktformation.generated

import ktformation.*

/**
 * [AWS::ElasticBeanstalk::ApplicationVersion - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-version.html)
 */
@CloudFormationMarker
class AWSElasticBeanstalkApplicationVersion(logicalId: String) : Resource<AWSElasticBeanstalkApplicationVersion.Properties>(logicalId, "AWS::ElasticBeanstalk::ApplicationVersion") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var applicationName: Any? = null

        fun applicationName(value: String) {
          this.applicationName = value
        }
        
        fun applicationName(value: IntrinsicFunction) {
          this.applicationName = value
        }
        
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var sourceBundle: Any? = null

        fun sourceBundle(value: SourceBundle) {
          this.sourceBundle = value
        }
        
        fun sourceBundle(value: IntrinsicFunction) {
          this.sourceBundle = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class SourceBundle(
            val s3Bucket: String,
            val s3Key: String
    )

}

fun Resources.awsElasticBeanstalkApplicationVersion(logicalId: String, init: AWSElasticBeanstalkApplicationVersion.() -> Unit = {}): AWSElasticBeanstalkApplicationVersion {
    return AWSElasticBeanstalkApplicationVersion(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
