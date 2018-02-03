
package ktformation.generated

import ktformation.*

/**
 * [AWS::DynamoDB::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html)
 */
@CloudFormationMarker
class AWSDynamoDBTable(logicalId: String) : Resource<AWSDynamoDBTable.Properties>(logicalId, "AWS::DynamoDB::Table") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [attributeDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeDefinition>
         */
        @JvmField
        var attributeDefinitions: Any? = null

        /**
         * [attributeDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeDefinition>
         */
        fun attributeDefinitions(value: List<AttributeDefinition>) {
          this.attributeDefinitions = value
        }
        
        /**
         * [attributeDefinitions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedef)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeDefinition>
         */
        fun attributeDefinitions(vararg value: IntrinsicFunction) {
          this.attributeDefinitions = value
        }
        
        /**
         * [globalSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi)
         *
         * _Required_: no
         *
         * _Type_: List<GlobalSecondaryIndex>
         */
        @JvmField
        var globalSecondaryIndexes: Any? = null

        /**
         * [globalSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi)
         *
         * _Required_: no
         *
         * _Type_: List<GlobalSecondaryIndex>
         */
        fun globalSecondaryIndexes(value: List<GlobalSecondaryIndex>) {
          this.globalSecondaryIndexes = value
        }
        
        /**
         * [globalSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-gsi)
         *
         * _Required_: no
         *
         * _Type_: List<GlobalSecondaryIndex>
         */
        fun globalSecondaryIndexes(vararg value: IntrinsicFunction) {
          this.globalSecondaryIndexes = value
        }
        
        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        @JvmField
        var keySchema: Any? = null

        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(value: List<KeySchema>) {
          this.keySchema = value
        }
        
        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(vararg value: IntrinsicFunction) {
          this.keySchema = value
        }
        
        /**
         * [localSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi)
         *
         * _Required_: no
         *
         * _Type_: List<LocalSecondaryIndex>
         */
        @JvmField
        var localSecondaryIndexes: Any? = null

        /**
         * [localSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi)
         *
         * _Required_: no
         *
         * _Type_: List<LocalSecondaryIndex>
         */
        fun localSecondaryIndexes(value: List<LocalSecondaryIndex>) {
          this.localSecondaryIndexes = value
        }
        
        /**
         * [localSecondaryIndexes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-lsi)
         *
         * _Required_: no
         *
         * _Type_: List<LocalSecondaryIndex>
         */
        fun localSecondaryIndexes(vararg value: IntrinsicFunction) {
          this.localSecondaryIndexes = value
        }
        
        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        @JvmField
        var provisionedThroughput: Any? = null

        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        fun provisionedThroughput(value: ProvisionedThroughput) {
          this.provisionedThroughput = value
        }
        
        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        fun provisionedThroughput(value: IntrinsicFunction) {
          this.provisionedThroughput = value
        }
        
        /**
         * [streamSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
         *
         * _Required_: no
         *
         * _Type_: StreamSpecification
         */
        @JvmField
        var streamSpecification: Any? = null

        /**
         * [streamSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
         *
         * _Required_: no
         *
         * _Type_: StreamSpecification
         */
        fun streamSpecification(value: StreamSpecification) {
          this.streamSpecification = value
        }
        
        /**
         * [streamSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
         *
         * _Required_: no
         *
         * _Type_: StreamSpecification
         */
        fun streamSpecification(value: IntrinsicFunction) {
          this.streamSpecification = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
        /**
         * [timeToLiveSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
         *
         * _Required_: no
         *
         * _Type_: TimeToLiveSpecification
         */
        @JvmField
        var timeToLiveSpecification: Any? = null

        /**
         * [timeToLiveSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
         *
         * _Required_: no
         *
         * _Type_: TimeToLiveSpecification
         */
        fun timeToLiveSpecification(value: TimeToLiveSpecification) {
          this.timeToLiveSpecification = value
        }
        
        /**
         * [timeToLiveSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
         *
         * _Required_: no
         *
         * _Type_: TimeToLiveSpecification
         */
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
            /**
             * [AttributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val attributeName: String,
            /**
             * [AttributeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val attributeType: String
    )

    class GlobalSecondaryIndex(
            /**
             * [IndexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val indexName: String,
            /**
             * [KeySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema)
             *
             * _Required_: yes
             *
             * _Type_: List<KeySchema>
             */
            val keySchema: List<KeySchema>,
            /**
             * [Projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-projection)
             *
             * _Required_: yes
             *
             * _Type_: Projection
             */
            val projection: Projection,
            /**
             * [ProvisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-provisionedthroughput)
             *
             * _Required_: yes
             *
             * _Type_: ProvisionedThroughput
             */
            val provisionedThroughput: ProvisionedThroughput
    )

    class KeySchema(
            /**
             * [AttributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val attributeName: String,
            /**
             * [KeyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val keyType: String
    )

    class LocalSecondaryIndex(
            /**
             * [IndexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val indexName: String,
            /**
             * [KeySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema)
             *
             * _Required_: yes
             *
             * _Type_: List<KeySchema>
             */
            val keySchema: List<KeySchema>,
            /**
             * [Projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-projection)
             *
             * _Required_: yes
             *
             * _Type_: Projection
             */
            val projection: Projection
    )

    class Projection(
            /**
             * [NonKeyAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val nonKeyAttributes: List<String>? = null,
            /**
             * [ProjectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val projectionType: String? = null
    )

    class ProvisionedThroughput(
            /**
             * [ReadCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits)
             *
             * _Required_: yes
             *
             * _Type_: Long
             */
            val readCapacityUnits: Long,
            /**
             * [WriteCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits)
             *
             * _Required_: yes
             *
             * _Type_: Long
             */
            val writeCapacityUnits: Long
    )

    class StreamSpecification(
            /**
             * [StreamViewType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val streamViewType: String
    )

    class TimeToLiveSpecification(
            /**
             * [AttributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val attributeName: String,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled)
             *
             * _Required_: yes
             *
             * _Type_: Boolean
             */
            val enabled: Boolean
    )

}

/**
 * [AWS::DynamoDB::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html)
 */
fun Resources.awsDynamoDBTable(logicalId: String, init: AWSDynamoDBTable.() -> Unit = {}): AWSDynamoDBTable {
    return AWSDynamoDBTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
