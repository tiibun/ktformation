
package ktformation.generated

import ktformation.*

/**
 * [AWS::DMS::ReplicationTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
 */
@CloudFormationMarker
class AWSDMSReplicationTask(logicalId: String) : Resource<AWSDMSReplicationTask.Properties>(logicalId, "AWS::DMS::ReplicationTask") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [cdcStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        @JvmField
        var cdcStartTime: Any? = null

        /**
         * [cdcStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun cdcStartTime(value: Double) {
          this.cdcStartTime = value
        }
        
        /**
         * [cdcStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime)
         *
         * _Required_: no
         *
         * _Type_: Double
         */
        fun cdcStartTime(value: IntrinsicFunction) {
          this.cdcStartTime = value
        }
        
        /**
         * [migrationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var migrationType: Any? = null

        /**
         * [migrationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun migrationType(value: String) {
          this.migrationType = value
        }
        
        /**
         * [migrationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun migrationType(value: IntrinsicFunction) {
          this.migrationType = value
        }
        
        /**
         * [replicationInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var replicationInstanceArn: Any? = null

        /**
         * [replicationInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationInstanceArn(value: String) {
          this.replicationInstanceArn = value
        }
        
        /**
         * [replicationInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun replicationInstanceArn(value: IntrinsicFunction) {
          this.replicationInstanceArn = value
        }
        
        /**
         * [replicationTaskIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationTaskIdentifier: Any? = null

        /**
         * [replicationTaskIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationTaskIdentifier(value: String) {
          this.replicationTaskIdentifier = value
        }
        
        /**
         * [replicationTaskIdentifier](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationTaskIdentifier(value: IntrinsicFunction) {
          this.replicationTaskIdentifier = value
        }
        
        /**
         * [replicationTaskSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var replicationTaskSettings: Any? = null

        /**
         * [replicationTaskSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationTaskSettings(value: String) {
          this.replicationTaskSettings = value
        }
        
        /**
         * [replicationTaskSettings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun replicationTaskSettings(value: IntrinsicFunction) {
          this.replicationTaskSettings = value
        }
        
        /**
         * [sourceEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var sourceEndpointArn: Any? = null

        /**
         * [sourceEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sourceEndpointArn(value: String) {
          this.sourceEndpointArn = value
        }
        
        /**
         * [sourceEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sourceEndpointArn(value: IntrinsicFunction) {
          this.sourceEndpointArn = value
        }
        
        /**
         * [tableMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var tableMappings: Any? = null

        /**
         * [tableMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableMappings(value: String) {
          this.tableMappings = value
        }
        
        /**
         * [tableMappings](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableMappings(value: IntrinsicFunction) {
          this.tableMappings = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [targetEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var targetEndpointArn: Any? = null

        /**
         * [targetEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun targetEndpointArn(value: String) {
          this.targetEndpointArn = value
        }
        
        /**
         * [targetEndpointArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
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

/**
 * [AWS::DMS::ReplicationTask - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
 */
fun Resources.awsDMSReplicationTask(logicalId: String, init: AWSDMSReplicationTask.() -> Unit = {}): AWSDMSReplicationTask {
    return AWSDMSReplicationTask(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
