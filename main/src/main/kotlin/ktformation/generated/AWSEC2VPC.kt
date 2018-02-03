
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::VPC - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html)
 */
@CloudFormationMarker
class AWSEC2VPC(logicalId: String) : Resource<AWSEC2VPC.Properties>(logicalId, "AWS::EC2::VPC") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cidrBlock: Any? = null

        fun cidrBlock(value: String) {
          this.cidrBlock = value
        }
        
        fun cidrBlock(value: IntrinsicFunction) {
          this.cidrBlock = value
        }
        
        @JvmField
        var enableDnsHostnames: Any? = null

        fun enableDnsHostnames(value: Boolean) {
          this.enableDnsHostnames = value
        }
        
        fun enableDnsHostnames(value: IntrinsicFunction) {
          this.enableDnsHostnames = value
        }
        
        @JvmField
        var enableDnsSupport: Any? = null

        fun enableDnsSupport(value: Boolean) {
          this.enableDnsSupport = value
        }
        
        fun enableDnsSupport(value: IntrinsicFunction) {
          this.enableDnsSupport = value
        }
        
        @JvmField
        var instanceTenancy: Any? = null

        fun instanceTenancy(value: String) {
          this.instanceTenancy = value
        }
        
        fun instanceTenancy(value: IntrinsicFunction) {
          this.instanceTenancy = value
        }
        
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsEC2VPC(logicalId: String, init: AWSEC2VPC.() -> Unit = {}): AWSEC2VPC {
    return AWSEC2VPC(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
