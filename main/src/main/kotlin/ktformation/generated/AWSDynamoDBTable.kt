
package ktformation.generated

import ktformation.*

/**
 * [AWS::DynamoDB::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html)
 */
@CloudFormationMarker
class AWSDynamoDBTable(logicalId: String) : Resource<AWSDynamoDBTable.Properties>(logicalId, "AWS::DynamoDB::Table") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var attributeDefinitions: Any? = null

        fun attributeDefinitions(value: List<AttributeDefinition>) {
          this.attributeDefinitions = value
        }
        
        fun attributeDefinitions(vararg value: IntrinsicFunction) {
          this.attributeDefinitions = value
        }
        
        @JvmField
        var globalSecondaryIndexes: Any? = null

        fun globalSecondaryIndexes(value: List<GlobalSecondaryIndex>) {
          this.globalSecondaryIndexes = value
        }
        
        fun globalSecondaryIndexes(vararg value: IntrinsicFunction) {
          this.globalSecondaryIndexes = value
        }
        
        @JvmField
        var keySchema: Any? = null

        fun keySchema(value: List<KeySchema>) {
          this.keySchema = value
        }
        
        fun keySchema(vararg value: IntrinsicFunction) {
          this.keySchema = value
        }
        
        @JvmField
        var localSecondaryIndexes: Any? = null

        fun localSecondaryIndexes(value: List<LocalSecondaryIndex>) {
          this.localSecondaryIndexes = value
        }
        
        fun localSecondaryIndexes(vararg value: IntrinsicFunction) {
          this.localSecondaryIndexes = value
        }
        
        @JvmField
        var provisionedThroughput: Any? = null

        fun provisionedThroughput(value: ProvisionedThroughput) {
          this.provisionedThroughput = value
        }
        
        fun provisionedThroughput(value: IntrinsicFunction) {
          this.provisionedThroughput = value
        }
        
        @JvmField
        var streamSpecification: Any? = null

        fun streamSpecification(value: StreamSpecification) {
          this.streamSpecification = value
        }
        
        fun streamSpecification(value: IntrinsicFunction) {
          this.streamSpecification = value
        }
        
        @JvmField
        var tableName: Any? = null

        fun tableName(value: String) {
          this.tableName = value
        }
        
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
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
        var timeToLiveSpecification: Any? = null

        fun timeToLiveSpecification(value: TimeToLiveSpecification) {
          this.timeToLiveSpecification = value
        }
        
        fun timeToLiveSpecification(value: IntrinsicFunction) {
          this.timeToLiveSpecification = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class AttributeDefinition(
            val attributeName: String,
            val attributeType: String
    )

    class GlobalSecondaryIndex(
            val indexName: String,
            val keySchema: List<KeySchema>,
            val projection: Projection,
            val provisionedThroughput: ProvisionedThroughput
    )

    class KeySchema(
            val attributeName: String,
            val keyType: String
    )

    class LocalSecondaryIndex(
            val indexName: String,
            val keySchema: List<KeySchema>,
            val projection: Projection
    )

    class Projection(
            val nonKeyAttributes: List<String>? = null,
            val projectionType: String? = null
    )

    class ProvisionedThroughput(
            val readCapacityUnits: Long,
            val writeCapacityUnits: Long
    )

    class StreamSpecification(
            val streamViewType: String
    )

    class TimeToLiveSpecification(
            val attributeName: String,
            val enabled: Boolean
    )

}

fun Resources.awsDynamoDBTable(logicalId: String, init: AWSDynamoDBTable.() -> Unit = {}): AWSDynamoDBTable {
    return AWSDynamoDBTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
