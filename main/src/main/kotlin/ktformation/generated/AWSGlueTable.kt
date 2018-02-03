
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
@CloudFormationMarker
class AWSGlueTable(logicalId: String) : Resource<AWSGlueTable.Properties>(logicalId, "AWS::Glue::Table") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var catalogId: Any? = null

        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: String) {
          this.catalogId = value
        }
        
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: IntrinsicFunction) {
          this.catalogId = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }
        
        /**
         * [tableInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
         *
         * _Required_: yes
         *
         * _Type_: TableInput
         */
        @JvmField
        var tableInput: Any? = null

        /**
         * [tableInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
         *
         * _Required_: yes
         *
         * _Type_: TableInput
         */
        fun tableInput(value: TableInput) {
          this.tableInput = value
        }
        
        /**
         * [tableInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
         *
         * _Required_: yes
         *
         * _Type_: TableInput
         */
        fun tableInput(value: IntrinsicFunction) {
          this.tableInput = value
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
             * [Comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val comment: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val name: String,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null
    )

    class Order(
            /**
             * [Column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val column: String,
            /**
             * [SortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val sortOrder: Int
    )

    class SerdeInfo(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [SerializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val serializationLibrary: String? = null
    )

    class SkewedInfo(
            /**
             * [SkewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val skewedColumnNames: List<String>? = null,
            /**
             * [SkewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val skewedColumnValueLocationMaps: Json? = null,
            /**
             * [SkewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val skewedColumnValues: List<String>? = null
    )

    class StorageDescriptor(
            /**
             * [BucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val bucketColumns: List<String>? = null,
            /**
             * [Columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
             *
             * _Required_: no
             *
             * _Type_: List<Column>
             */
            val columns: List<Column>? = null,
            /**
             * [Compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val compressed: Boolean? = null,
            /**
             * [InputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val inputFormat: String? = null,
            /**
             * [Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val location: String? = null,
            /**
             * [NumberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val numberOfBuckets: Int? = null,
            /**
             * [OutputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val outputFormat: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [SerdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
             *
             * _Required_: no
             *
             * _Type_: SerdeInfo
             */
            val serdeInfo: SerdeInfo? = null,
            /**
             * [SkewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
             *
             * _Required_: no
             *
             * _Type_: SkewedInfo
             */
            val skewedInfo: SkewedInfo? = null,
            /**
             * [SortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
             *
             * _Required_: no
             *
             * _Type_: List<Order>
             */
            val sortColumns: List<Order>? = null,
            /**
             * [StoredAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val storedAsSubDirectories: Boolean? = null
    )

    class TableInput(
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val owner: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null,
            /**
             * [PartitionKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
             *
             * _Required_: no
             *
             * _Type_: List<Column>
             */
            val partitionKeys: List<Column>? = null,
            /**
             * [Retention](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val retention: Int? = null,
            /**
             * [StorageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
             *
             * _Required_: no
             *
             * _Type_: StorageDescriptor
             */
            val storageDescriptor: StorageDescriptor? = null,
            /**
             * [TableType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tableType: String? = null,
            /**
             * [ViewExpandedText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val viewExpandedText: String? = null,
            /**
             * [ViewOriginalText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val viewOriginalText: String? = null
    )

}

/**
 * [AWS::Glue::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
fun Resources.awsGlueTable(logicalId: String, init: AWSGlueTable.() -> Unit = {}): AWSGlueTable {
    return AWSGlueTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
