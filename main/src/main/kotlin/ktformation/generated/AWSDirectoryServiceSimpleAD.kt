
package ktformation.generated

import ktformation.*

/**
 * [AWS::DirectoryService::SimpleAD - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html)
 */
@CloudFormationMarker
class AWSDirectoryServiceSimpleAD(logicalId: String) : Resource<AWSDirectoryServiceSimpleAD.Properties>(logicalId, "AWS::DirectoryService::SimpleAD") {

    @CloudFormationMarker
    class Properties : ResourceProperties {
        @JvmField var createAlias: Any? = null
        fun createAlias(value: Boolean) {
            this.createAlias = value
        }
        fun createAlias(value: IntrinsicFunction) { this.createAlias = value }
        @JvmField var description: Any? = null
        fun description(value: String) {
            this.description = value
        }
        fun description(value: IntrinsicFunction) { this.description = value }
        @JvmField var enableSso: Any? = null
        fun enableSso(value: Boolean) {
            this.enableSso = value
        }
        fun enableSso(value: IntrinsicFunction) { this.enableSso = value }
        @JvmField var name: Any? = null
        fun name(value: String) { this.name = value }
        fun name(value: IntrinsicFunction) { this.name = value }
        @JvmField var password: Any? = null
        fun password(value: String) { this.password = value }
        fun password(value: IntrinsicFunction) { this.password = value }
        @JvmField var shortName: Any? = null
        fun shortName(value: String) {
            this.shortName = value
        }
        fun shortName(value: IntrinsicFunction) { this.shortName = value }
        @JvmField var size: Any? = null
        fun size(value: String) { this.size = value }
        fun size(value: IntrinsicFunction) { this.size = value }
        @JvmField var vpcSettings: Any? = null
        fun vpcSettings(value: VpcSettings) { this.vpcSettings = value }
        fun vpcSettings(value: IntrinsicFunction) { this.vpcSettings = value }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class VpcSettings(
            val subnetIds: List<String>,
            val vpcId: String
    )

}

fun Resources.awsDirectoryServiceSimpleAD(logicalId: String, init: AWSDirectoryServiceSimpleAD.() -> Unit = {}): AWSDirectoryServiceSimpleAD {
    return AWSDirectoryServiceSimpleAD(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
