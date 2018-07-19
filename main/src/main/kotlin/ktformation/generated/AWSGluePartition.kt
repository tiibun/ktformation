
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

        /**
        * [Column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html)
        */
        fun column(init: Column.() -> Unit = {}): Column {
            return Column().also {
                it.init()
            }
        }
        /**
        * [Order](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html)
        */
        fun order(init: Order.() -> Unit = {}): Order {
            return Order().also {
                it.init()
            }
        }
        /**
        * [PartitionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html)
        */
        fun partitionInput(init: PartitionInput.() -> Unit = {}): PartitionInput {
            return PartitionInput().also {
                it.init()
            }
        }
        /**
        * [SerdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html)
        */
        fun serdeInfo(init: SerdeInfo.() -> Unit = {}): SerdeInfo {
            return SerdeInfo().also {
                it.init()
            }
        }
        /**
        * [SkewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html)
        */
        fun skewedInfo(init: SkewedInfo.() -> Unit = {}): SkewedInfo {
            return SkewedInfo().also {
                it.init()
            }
        }
        /**
        * [StorageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html)
        */
        fun storageDescriptor(init: StorageDescriptor.() -> Unit = {}): StorageDescriptor {
            return StorageDescriptor().also {
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
    class Column {
            /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class Order {
            /**
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var column: Any? = null

        /**
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun column(value: String) {
          this.column = value
        }
        
        /**
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun column(value: IntrinsicFunction) {
          this.column = value
        }

        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var sortOrder: Any? = null

        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun sortOrder(value: Int) {
          this.sortOrder = value
        }
        
        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun sortOrder(value: IntrinsicFunction) {
          this.sortOrder = value
        }

    }

    @CloudFormationMarker
    class PartitionInput {
            /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        var storageDescriptor: Any? = null

        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        fun storageDescriptor(value: StorageDescriptor) {
          this.storageDescriptor = value
        }
        
        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        fun storageDescriptor(value: IntrinsicFunction) {
          this.storageDescriptor = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

    @CloudFormationMarker
    class SerdeInfo {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serializationLibrary: Any? = null

        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serializationLibrary(value: String) {
          this.serializationLibrary = value
        }
        
        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serializationLibrary(value: IntrinsicFunction) {
          this.serializationLibrary = value
        }

    }

    @CloudFormationMarker
    class SkewedInfo {
            /**
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var skewedColumnNames: Any? = null

        /**
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnNames(value: List<String>) {
          this.skewedColumnNames = value
        }
        
        /**
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnNames(vararg value: IntrinsicFunction) {
          this.skewedColumnNames = value
        }

        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var skewedColumnValueLocationMaps: Any? = null

        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun skewedColumnValueLocationMaps(value: Json) {
          this.skewedColumnValueLocationMaps = value
        }
        
        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun skewedColumnValueLocationMaps(value: IntrinsicFunction) {
          this.skewedColumnValueLocationMaps = value
        }

        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var skewedColumnValues: Any? = null

        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnValues(value: List<String>) {
          this.skewedColumnValues = value
        }
        
        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnValues(vararg value: IntrinsicFunction) {
          this.skewedColumnValues = value
        }

    }

    @CloudFormationMarker
    class StorageDescriptor {
            /**
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var bucketColumns: Any? = null

        /**
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun bucketColumns(value: List<String>) {
          this.bucketColumns = value
        }
        
        /**
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun bucketColumns(vararg value: IntrinsicFunction) {
          this.bucketColumns = value
        }

        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        var columns: Any? = null

        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun columns(value: List<Column>) {
          this.columns = value
        }
        
        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun columns(vararg value: IntrinsicFunction) {
          this.columns = value
        }

        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var compressed: Any? = null

        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compressed(value: Boolean) {
          this.compressed = value
        }
        
        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compressed(value: IntrinsicFunction) {
          this.compressed = value
        }

        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var inputFormat: Any? = null

        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputFormat(value: String) {
          this.inputFormat = value
        }
        
        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputFormat(value: IntrinsicFunction) {
          this.inputFormat = value
        }

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var numberOfBuckets: Any? = null

        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfBuckets(value: Int) {
          this.numberOfBuckets = value
        }
        
        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfBuckets(value: IntrinsicFunction) {
          this.numberOfBuckets = value
        }

        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputFormat: Any? = null

        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputFormat(value: String) {
          this.outputFormat = value
        }
        
        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputFormat(value: IntrinsicFunction) {
          this.outputFormat = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        var serdeInfo: Any? = null

        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        fun serdeInfo(value: SerdeInfo) {
          this.serdeInfo = value
        }
        
        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        fun serdeInfo(value: IntrinsicFunction) {
          this.serdeInfo = value
        }

        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        var skewedInfo: Any? = null

        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        fun skewedInfo(value: SkewedInfo) {
          this.skewedInfo = value
        }
        
        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        fun skewedInfo(value: IntrinsicFunction) {
          this.skewedInfo = value
        }

        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        var sortColumns: Any? = null

        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        fun sortColumns(value: List<Order>) {
          this.sortColumns = value
        }
        
        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        fun sortColumns(vararg value: IntrinsicFunction) {
          this.sortColumns = value
        }

        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var storedAsSubDirectories: Any? = null

        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storedAsSubDirectories(value: Boolean) {
          this.storedAsSubDirectories = value
        }
        
        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storedAsSubDirectories(value: IntrinsicFunction) {
          this.storedAsSubDirectories = value
        }

    }

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
