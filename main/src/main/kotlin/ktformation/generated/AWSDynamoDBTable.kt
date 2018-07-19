
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
         * [pointInTimeRecoverySpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
         *
         * _Required_: no
         *
         * _Type_: PointInTimeRecoverySpecification
         */
        @JvmField
        var pointInTimeRecoverySpecification: Any? = null

        /**
         * [pointInTimeRecoverySpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
         *
         * _Required_: no
         *
         * _Type_: PointInTimeRecoverySpecification
         */
        fun pointInTimeRecoverySpecification(value: PointInTimeRecoverySpecification) {
          this.pointInTimeRecoverySpecification = value
        }
        
        /**
         * [pointInTimeRecoverySpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
         *
         * _Required_: no
         *
         * _Type_: PointInTimeRecoverySpecification
         */
        fun pointInTimeRecoverySpecification(value: IntrinsicFunction) {
          this.pointInTimeRecoverySpecification = value
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
         * [sSESpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
         *
         * _Required_: no
         *
         * _Type_: SSESpecification
         */
        @JvmField
        var sSESpecification: Any? = null

        /**
         * [sSESpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
         *
         * _Required_: no
         *
         * _Type_: SSESpecification
         */
        fun sSESpecification(value: SSESpecification) {
          this.sSESpecification = value
        }
        
        /**
         * [sSESpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
         *
         * _Required_: no
         *
         * _Type_: SSESpecification
         */
        fun sSESpecification(value: IntrinsicFunction) {
          this.sSESpecification = value
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

        /**
        * [AttributeDefinition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html)
        */
        fun attributeDefinition(init: AttributeDefinition.() -> Unit = {}): AttributeDefinition {
            return AttributeDefinition().also {
                it.init()
            }
        }
        /**
        * [GlobalSecondaryIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html)
        */
        fun globalSecondaryIndex(init: GlobalSecondaryIndex.() -> Unit = {}): GlobalSecondaryIndex {
            return GlobalSecondaryIndex().also {
                it.init()
            }
        }
        /**
        * [KeySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html)
        */
        fun keySchema(init: KeySchema.() -> Unit = {}): KeySchema {
            return KeySchema().also {
                it.init()
            }
        }
        /**
        * [LocalSecondaryIndex](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html)
        */
        fun localSecondaryIndex(init: LocalSecondaryIndex.() -> Unit = {}): LocalSecondaryIndex {
            return LocalSecondaryIndex().also {
                it.init()
            }
        }
        /**
        * [PointInTimeRecoverySpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html)
        */
        fun pointInTimeRecoverySpecification(init: PointInTimeRecoverySpecification.() -> Unit = {}): PointInTimeRecoverySpecification {
            return PointInTimeRecoverySpecification().also {
                it.init()
            }
        }
        /**
        * [Projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html)
        */
        fun projection(init: Projection.() -> Unit = {}): Projection {
            return Projection().also {
                it.init()
            }
        }
        /**
        * [ProvisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
        */
        fun provisionedThroughput(init: ProvisionedThroughput.() -> Unit = {}): ProvisionedThroughput {
            return ProvisionedThroughput().also {
                it.init()
            }
        }
        /**
        * [SSESpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html)
        */
        fun sSESpecification(init: SSESpecification.() -> Unit = {}): SSESpecification {
            return SSESpecification().also {
                it.init()
            }
        }
        /**
        * [StreamSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html)
        */
        fun streamSpecification(init: StreamSpecification.() -> Unit = {}): StreamSpecification {
            return StreamSpecification().also {
                it.init()
            }
        }
        /**
        * [TimeToLiveSpecification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html)
        */
        fun timeToLiveSpecification(init: TimeToLiveSpecification.() -> Unit = {}): TimeToLiveSpecification {
            return TimeToLiveSpecification().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class AttributeDefinition {
            /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var attributeName: Any? = null

        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: String) {
          this.attributeName = value
        }
        
        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: IntrinsicFunction) {
          this.attributeName = value
        }

        /**
         * [attributeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var attributeType: Any? = null

        /**
         * [attributeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeType(value: String) {
          this.attributeType = value
        }
        
        /**
         * [attributeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html#cfn-dynamodb-attributedef-attributename-attributetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeType(value: IntrinsicFunction) {
          this.attributeType = value
        }

    }

    @CloudFormationMarker
    class GlobalSecondaryIndex {
            /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var indexName: Any? = null

        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: String) {
          this.indexName = value
        }
        
        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: IntrinsicFunction) {
          this.indexName = value
        }

        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        var keySchema: Any? = null

        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(value: List<KeySchema>) {
          this.keySchema = value
        }
        
        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(vararg value: IntrinsicFunction) {
          this.keySchema = value
        }

        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        var projection: Any? = null

        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        fun projection(value: Projection) {
          this.projection = value
        }
        
        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        fun projection(value: IntrinsicFunction) {
          this.projection = value
        }

        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        var provisionedThroughput: Any? = null

        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        fun provisionedThroughput(value: ProvisionedThroughput) {
          this.provisionedThroughput = value
        }
        
        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html#cfn-dynamodb-gsi-provisionedthroughput)
         *
         * _Required_: yes
         *
         * _Type_: ProvisionedThroughput
         */
        fun provisionedThroughput(value: IntrinsicFunction) {
          this.provisionedThroughput = value
        }

    }

    @CloudFormationMarker
    class KeySchema {
            /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var attributeName: Any? = null

        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: String) {
          this.attributeName = value
        }
        
        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: IntrinsicFunction) {
          this.attributeName = value
        }

        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var keyType: Any? = null

        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyType(value: String) {
          this.keyType = value
        }
        
        /**
         * [keyType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-keyschema.html#aws-properties-dynamodb-keyschema-keytype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun keyType(value: IntrinsicFunction) {
          this.keyType = value
        }

    }

    @CloudFormationMarker
    class LocalSecondaryIndex {
            /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var indexName: Any? = null

        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: String) {
          this.indexName = value
        }
        
        /**
         * [indexName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-indexname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun indexName(value: IntrinsicFunction) {
          this.indexName = value
        }

        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        var keySchema: Any? = null

        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(value: List<KeySchema>) {
          this.keySchema = value
        }
        
        /**
         * [keySchema](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-keyschema)
         *
         * _Required_: yes
         *
         * _Type_: List<KeySchema>
         */
        fun keySchema(vararg value: IntrinsicFunction) {
          this.keySchema = value
        }

        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        var projection: Any? = null

        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        fun projection(value: Projection) {
          this.projection = value
        }
        
        /**
         * [projection](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-lsi.html#cfn-dynamodb-lsi-projection)
         *
         * _Required_: yes
         *
         * _Type_: Projection
         */
        fun projection(value: IntrinsicFunction) {
          this.projection = value
        }

    }

    @CloudFormationMarker
    class PointInTimeRecoverySpecification {
            /**
         * [pointInTimeRecoveryEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var pointInTimeRecoveryEnabled: Any? = null

        /**
         * [pointInTimeRecoveryEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun pointInTimeRecoveryEnabled(value: Boolean) {
          this.pointInTimeRecoveryEnabled = value
        }
        
        /**
         * [pointInTimeRecoveryEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun pointInTimeRecoveryEnabled(value: IntrinsicFunction) {
          this.pointInTimeRecoveryEnabled = value
        }

    }

    @CloudFormationMarker
    class Projection {
            /**
         * [nonKeyAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var nonKeyAttributes: Any? = null

        /**
         * [nonKeyAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun nonKeyAttributes(value: List<String>) {
          this.nonKeyAttributes = value
        }
        
        /**
         * [nonKeyAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-nonkeyatt)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun nonKeyAttributes(vararg value: IntrinsicFunction) {
          this.nonKeyAttributes = value
        }

        /**
         * [projectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var projectionType: Any? = null

        /**
         * [projectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun projectionType(value: String) {
          this.projectionType = value
        }
        
        /**
         * [projectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-projectionobject.html#cfn-dynamodb-projectionobj-projtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun projectionType(value: IntrinsicFunction) {
          this.projectionType = value
        }

    }

    @CloudFormationMarker
    class ProvisionedThroughput {
            /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        var readCapacityUnits: Any? = null

        /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        fun readCapacityUnits(value: Long) {
          this.readCapacityUnits = value
        }
        
        /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-readcapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        fun readCapacityUnits(value: IntrinsicFunction) {
          this.readCapacityUnits = value
        }

        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        var writeCapacityUnits: Any? = null

        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        fun writeCapacityUnits(value: Long) {
          this.writeCapacityUnits = value
        }
        
        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html#cfn-dynamodb-provisionedthroughput-writecapacityunits)
         *
         * _Required_: yes
         *
         * _Type_: Long
         */
        fun writeCapacityUnits(value: IntrinsicFunction) {
          this.writeCapacityUnits = value
        }

    }

    @CloudFormationMarker
    class SSESpecification {
            /**
         * [sSEEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var sSEEnabled: Any? = null

        /**
         * [sSEEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun sSEEnabled(value: Boolean) {
          this.sSEEnabled = value
        }
        
        /**
         * [sSEEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun sSEEnabled(value: IntrinsicFunction) {
          this.sSEEnabled = value
        }

    }

    @CloudFormationMarker
    class StreamSpecification {
            /**
         * [streamViewType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var streamViewType: Any? = null

        /**
         * [streamViewType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun streamViewType(value: String) {
          this.streamViewType = value
        }
        
        /**
         * [streamViewType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-streamspecification.html#cfn-dynamodb-streamspecification-streamviewtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun streamViewType(value: IntrinsicFunction) {
          this.streamViewType = value
        }

    }

    @CloudFormationMarker
    class TimeToLiveSpecification {
            /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var attributeName: Any? = null

        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: String) {
          this.attributeName = value
        }
        
        /**
         * [attributeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-attributename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun attributeName(value: IntrinsicFunction) {
          this.attributeName = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html#cfn-dynamodb-timetolivespecification-enabled)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

    }

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
