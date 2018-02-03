
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Connection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
@CloudFormationMarker
class AWSGlueConnection(logicalId: String) : Resource<AWSGlueConnection.Properties>(logicalId, "AWS::Glue::Connection") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var catalogId: Any? = null

        fun catalogId(value: String) {
          this.catalogId = value
        }
        
        fun catalogId(value: IntrinsicFunction) {
          this.catalogId = value
        }
        
        @JvmField
        var connectionInput: Any? = null

        fun connectionInput(value: ConnectionInput) {
          this.connectionInput = value
        }
        
        fun connectionInput(value: IntrinsicFunction) {
          this.connectionInput = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConnectionInput(
            val connectionProperties: Json,
            val connectionType: String,
            val description: String? = null,
            val matchCriteria: List<String>? = null,
            val name: String? = null,
            val physicalConnectionRequirements: PhysicalConnectionRequirements? = null
    )

    class PhysicalConnectionRequirements(
            val availabilityZone: String? = null,
            val securityGroupIdList: List<String>? = null,
            val subnetId: String? = null
    )

}

fun Resources.awsGlueConnection(logicalId: String, init: AWSGlueConnection.() -> Unit = {}): AWSGlueConnection {
    return AWSGlueConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
