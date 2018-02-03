
package ktformation.generated

import ktformation.*

/**
 * [AWS::EC2::DHCPOptions - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcp-options.html)
 */
@CloudFormationMarker
class AWSEC2DHCPOptions(logicalId: String) : Resource<AWSEC2DHCPOptions.Properties>(logicalId, "AWS::EC2::DHCPOptions") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var domainName: Any? = null

        fun domainName(value: String) {
          this.domainName = value
        }
        
        fun domainName(value: IntrinsicFunction) {
          this.domainName = value
        }
        
        @JvmField
        var domainNameServers: Any? = null

        fun domainNameServers(value: List<String>) {
          this.domainNameServers = value
        }
        
        fun domainNameServers(vararg value: IntrinsicFunction) {
          this.domainNameServers = value
        }
        
        @JvmField
        var netbiosNameServers: Any? = null

        fun netbiosNameServers(value: List<String>) {
          this.netbiosNameServers = value
        }
        
        fun netbiosNameServers(vararg value: IntrinsicFunction) {
          this.netbiosNameServers = value
        }
        
        @JvmField
        var netbiosNodeType: Any? = null

        fun netbiosNodeType(value: Int) {
          this.netbiosNodeType = value
        }
        
        fun netbiosNodeType(value: IntrinsicFunction) {
          this.netbiosNodeType = value
        }
        
        @JvmField
        var ntpServers: Any? = null

        fun ntpServers(value: List<String>) {
          this.ntpServers = value
        }
        
        fun ntpServers(vararg value: IntrinsicFunction) {
          this.ntpServers = value
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

fun Resources.awsEC2DHCPOptions(logicalId: String, init: AWSEC2DHCPOptions.() -> Unit = {}): AWSEC2DHCPOptions {
    return AWSEC2DHCPOptions(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
