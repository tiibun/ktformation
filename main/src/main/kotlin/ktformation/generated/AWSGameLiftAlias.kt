
package ktformation.generated

import ktformation.*

/**
 * [AWS::GameLift::Alias - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html)
 */
@CloudFormationMarker
class AWSGameLiftAlias(logicalId: String) : Resource<AWSGameLiftAlias.Properties>(logicalId, "AWS::GameLift::Alias") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        @JvmField
        var routingStrategy: Any? = null

        fun routingStrategy(value: RoutingStrategy) {
          this.routingStrategy = value
        }
        
        fun routingStrategy(value: IntrinsicFunction) {
          this.routingStrategy = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class RoutingStrategy(
            val fleetId: String? = null,
            val message: String? = null,
            val type: String
    )

}

fun Resources.awsGameLiftAlias(logicalId: String, init: AWSGameLiftAlias.() -> Unit = {}): AWSGameLiftAlias {
    return AWSGameLiftAlias(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
