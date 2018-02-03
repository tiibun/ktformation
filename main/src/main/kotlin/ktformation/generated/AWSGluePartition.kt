
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Partition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
 */
@CloudFormationMarker
class AWSGluePartition(logicalId: String) : Resource<AWSGluePartition.Properties>(logicalId, "AWS::Glue::Partition") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var catalogId: Any? = null

        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: String) {
          this.catalogId = value
        }
        
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: IntrinsicFunction) {
          this.catalogId = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }
        
        /**
         * [partitionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
         *
         * _Required_: yes
         *
         * _Type_: PartitionInput
         */
        @JvmField
        var partitionInput: Any? = null

        /**
         * [partitionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
         *
         * _Required_: yes
         *
         * _Type_: PartitionInput
         */
        fun partitionInput(value: PartitionInput) {
          this.partitionInput = value
        }
        
        /**
         * [partitionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
         *
         * _Required_: yes
         *
         * _Type_: PartitionInput
         */
        fun partitionInput(value: IntrinsicFunction) {
          this.partitionInput = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var tableName: Any? = null

        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: String) {
          this.tableName = value
        }
        
        /**
         * [tableName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun tableName(value: IntrinsicFunction) {
          this.tableName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Column(
            /**
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

    class Order(
            /**
             * [Column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val column: String,
            /**
             * [SortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val sortOrder: Int? = null
    )

    class PartitionInput(
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [StorageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
             *
             * _Required_: no
             *
             * _Type_: StorageDescriptor
             */
            val storageDescriptor: StorageDescriptor? = null,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val values: List<String>
    )

    class SerdeInfo(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [SerializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serializationLibrary: String? = null
    )

    class SkewedInfo(
            /**
             * [SkewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val skewedColumnNames: List<String>? = null,
            /**
             * [SkewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val skewedColumnValueLocationMaps: Json? = null,
            /**
             * [SkewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val skewedColumnValues: List<String>? = null
    )

    class StorageDescriptor(
            /**
             * [BucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val bucketColumns: List<String>? = null,
            /**
             * [Columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
             *
             * _Required_: no
             *
             * _Type_: List<Column>
             */
            val columns: List<Column>? = null,
            /**
             * [Compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val compressed: Boolean? = null,
            /**
             * [InputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val inputFormat: String? = null,
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val location: String? = null,
            /**
             * [NumberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val numberOfBuckets: Int? = null,
            /**
             * [OutputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val outputFormat: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [SerdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
             *
             * _Required_: no
             *
             * _Type_: SerdeInfo
             */
            val serdeInfo: SerdeInfo? = null,
            /**
             * [SkewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
             *
             * _Required_: no
             *
             * _Type_: SkewedInfo
             */
            val skewedInfo: SkewedInfo? = null,
            /**
             * [SortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
             *
             * _Required_: no
             *
             * _Type_: List<Order>
             */
            val sortColumns: List<Order>? = null,
            /**
             * [StoredAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val storedAsSubDirectories: Boolean? = null
    )

}

/**
 * [AWS::Glue::Partition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
 */
fun Resources.awsGluePartition(logicalId: String, init: AWSGluePartition.() -> Unit = {}): AWSGluePartition {
    return AWSGluePartition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
