
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Partition - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
 */
@CloudFormationMarker
class AWSGluePartition(logicalId: String) : Resource<AWSGluePartition.Properties>(logicalId, "AWS::Glue::Partition") {

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
        var partitionInput: Any? = null

        fun partitionInput(value: PartitionInput) {
          this.partitionInput = value
        }
        fun partitionInput(value: IntrinsicFunction) {
  this.partitionInput = value
}
        @JvmField
        var tableName: Any? = null

        fun tableName(value: String) {
          this.tableName = value
        }
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
            val comment: String? = null,
            val name: String,
            val type: String? = null
    )

    class Order(
            val column: String,
            val sortOrder: Int? = null
    )

    class PartitionInput(
            val parameters: Json? = null,
            val storageDescriptor: StorageDescriptor? = null,
            val values: List<String>
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

}

fun Resources.awsGluePartition(logicalId: String, init: AWSGluePartition.() -> Unit = {}): AWSGluePartition {
    return AWSGluePartition(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
