
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Table - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
@CloudFormationMarker
class AWSGlueTable(logicalId: String) : Resource<AWSGlueTable.Properties>(logicalId, "AWS::Glue::Table") {

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
        var databaseName: Any? = null

        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }
        
        @JvmField
        var tableInput: Any? = null

        fun tableInput(value: TableInput) {
          this.tableInput = value
        }
        
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
            val comment: String? = null,
            val name: String,
            val type: String? = null
    )

    class Order(
            val column: String,
            val sortOrder: Int
    )

    class SerdeInfo(
            val name: String? = null,
            val parameters: Json? = null,
            val serializationLibrary: String? = null
    )

    class SkewedInfo(
            val skewedColumnNames: List<String>? = null,
            val skewedColumnValueLocationMaps: Json? = null,
            val skewedColumnValues: List<String>? = null
    )

    class StorageDescriptor(
            val bucketColumns: List<String>? = null,
            val columns: List<Column>? = null,
            val compressed: Boolean? = null,
            val inputFormat: String? = null,
            val location: String? = null,
            val numberOfBuckets: Int? = null,
            val outputFormat: String? = null,
            val parameters: Json? = null,
            val serdeInfo: SerdeInfo? = null,
            val skewedInfo: SkewedInfo? = null,
            val sortColumns: List<Order>? = null,
            val storedAsSubDirectories: Boolean? = null
    )

    class TableInput(
            val description: String? = null,
            val name: String? = null,
            val owner: String? = null,
            val parameters: Json? = null,
            val partitionKeys: List<Column>? = null,
            val retention: Int? = null,
            val storageDescriptor: StorageDescriptor? = null,
            val tableType: String? = null,
            val viewExpandedText: String? = null,
            val viewOriginalText: String? = null
    )

}

fun Resources.awsGlueTable(logicalId: String, init: AWSGlueTable.() -> Unit = {}): AWSGlueTable {
    return AWSGlueTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
