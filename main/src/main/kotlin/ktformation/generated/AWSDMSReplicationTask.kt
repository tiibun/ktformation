
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
 */
@CloudFormationMarker
class AWSDMSReplicationTask(logicalId: String) : Resource<AWSDMSReplicationTask.Properties>(logicalId, "AWS::DMS::ReplicationTask") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var cdcStartTime: Any? = null

        fun cdcStartTime(value: Double) {
          this.cdcStartTime = value
        }
        fun cdcStartTime(value: IntrinsicFunction) {
  this.cdcStartTime = value
}
        @JvmField
        var migrationType: Any? = null

        fun migrationType(value: String) {
          this.migrationType = value
        }
        fun migrationType(value: IntrinsicFunction) {
  this.migrationType = value
}
        @JvmField
        var replicationInstanceArn: Any? = null

        fun replicationInstanceArn(value: String) {
          this.replicationInstanceArn = value
        }
        fun replicationInstanceArn(value: IntrinsicFunction) {
  this.replicationInstanceArn = value
}
        @JvmField
        var replicationTaskIdentifier: Any? = null

        fun replicationTaskIdentifier(value: String) {
          this.replicationTaskIdentifier = value
        }
        fun replicationTaskIdentifier(value: IntrinsicFunction) {
  this.replicationTaskIdentifier = value
}
        @JvmField
        var replicationTaskSettings: Any? = null

        fun replicationTaskSettings(value: String) {
          this.replicationTaskSettings = value
        }
        fun replicationTaskSettings(value: IntrinsicFunction) {
  this.replicationTaskSettings = value
}
        @JvmField
        var sourceEndpointArn: Any? = null

        fun sourceEndpointArn(value: String) {
          this.sourceEndpointArn = value
        }
        fun sourceEndpointArn(value: IntrinsicFunction) {
  this.sourceEndpointArn = value
}
        @JvmField
        var tableMappings: Any? = null

        fun tableMappings(value: String) {
          this.tableMappings = value
        }
        fun tableMappings(value: IntrinsicFunction) {
  this.tableMappings = value
}
        @JvmField
        var tags: Any? = null

        fun tags(value: List<Tag>) {
          this.tags = value
        }
        fun tags(vararg value: IntrinsicFunction) {
  this.tags = value
}
        @JvmField
        var targetEndpointArn: Any? = null

        fun targetEndpointArn(value: String) {
          this.targetEndpointArn = value
        }
        fun targetEndpointArn(value: IntrinsicFunction) {
  this.targetEndpointArn = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

fun Resources.awsDMSReplicationTask(logicalId: String, init: AWSDMSReplicationTask.() -> Unit = {}): AWSDMSReplicationTask {
    return AWSDMSReplicationTask(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
