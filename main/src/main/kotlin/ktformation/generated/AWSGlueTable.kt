
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

        /**
        * [Column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html)
        */
        fun column(init: Column.() -> Unit = {}): Column {
            return Column().also {
                it.init()
            }
        }
        /**
        * [Order](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html)
        */
        fun order(init: Order.() -> Unit = {}): Order {
            return Order().also {
                it.init()
            }
        }
        /**
        * [SerdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html)
        */
        fun serdeInfo(init: SerdeInfo.() -> Unit = {}): SerdeInfo {
            return SerdeInfo().also {
                it.init()
            }
        }
        /**
        * [SkewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html)
        */
        fun skewedInfo(init: SkewedInfo.() -> Unit = {}): SkewedInfo {
            return SkewedInfo().also {
                it.init()
            }
        }
        /**
        * [StorageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html)
        */
        fun storageDescriptor(init: StorageDescriptor.() -> Unit = {}): StorageDescriptor {
            return StorageDescriptor().also {
                it.init()
            }
        }
        /**
        * [TableInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html)
        */
        fun tableInput(init: TableInput.() -> Unit = {}): TableInput {
            return TableInput().also {
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
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var comment: Any? = null

        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: String) {
          this.comment = value
        }
        
        /**
         * [comment](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun comment(value: IntrinsicFunction) {
          this.comment = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
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
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var column: Any? = null

        /**
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun column(value: String) {
          this.column = value
        }
        
        /**
         * [column](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun column(value: IntrinsicFunction) {
          this.column = value
        }

        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var sortOrder: Any? = null

        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sortOrder(value: Int) {
          this.sortOrder = value
        }
        
        /**
         * [sortOrder](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun sortOrder(value: IntrinsicFunction) {
          this.sortOrder = value
        }

    }

    @CloudFormationMarker
    class SerdeInfo {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var serializationLibrary: Any? = null

        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun serializationLibrary(value: String) {
          this.serializationLibrary = value
        }
        
        /**
         * [serializationLibrary](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
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
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var skewedColumnNames: Any? = null

        /**
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnNames(value: List<String>) {
          this.skewedColumnNames = value
        }
        
        /**
         * [skewedColumnNames](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnNames(vararg value: IntrinsicFunction) {
          this.skewedColumnNames = value
        }

        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var skewedColumnValueLocationMaps: Any? = null

        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun skewedColumnValueLocationMaps(value: Json) {
          this.skewedColumnValueLocationMaps = value
        }
        
        /**
         * [skewedColumnValueLocationMaps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun skewedColumnValueLocationMaps(value: IntrinsicFunction) {
          this.skewedColumnValueLocationMaps = value
        }

        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var skewedColumnValues: Any? = null

        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun skewedColumnValues(value: List<String>) {
          this.skewedColumnValues = value
        }
        
        /**
         * [skewedColumnValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
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
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var bucketColumns: Any? = null

        /**
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun bucketColumns(value: List<String>) {
          this.bucketColumns = value
        }
        
        /**
         * [bucketColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun bucketColumns(vararg value: IntrinsicFunction) {
          this.bucketColumns = value
        }

        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        var columns: Any? = null

        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun columns(value: List<Column>) {
          this.columns = value
        }
        
        /**
         * [columns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun columns(vararg value: IntrinsicFunction) {
          this.columns = value
        }

        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var compressed: Any? = null

        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compressed(value: Boolean) {
          this.compressed = value
        }
        
        /**
         * [compressed](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun compressed(value: IntrinsicFunction) {
          this.compressed = value
        }

        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var inputFormat: Any? = null

        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputFormat(value: String) {
          this.inputFormat = value
        }
        
        /**
         * [inputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun inputFormat(value: IntrinsicFunction) {
          this.inputFormat = value
        }

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }

        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var numberOfBuckets: Any? = null

        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfBuckets(value: Int) {
          this.numberOfBuckets = value
        }
        
        /**
         * [numberOfBuckets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfBuckets(value: IntrinsicFunction) {
          this.numberOfBuckets = value
        }

        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputFormat: Any? = null

        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputFormat(value: String) {
          this.outputFormat = value
        }
        
        /**
         * [outputFormat](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputFormat(value: IntrinsicFunction) {
          this.outputFormat = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        var serdeInfo: Any? = null

        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        fun serdeInfo(value: SerdeInfo) {
          this.serdeInfo = value
        }
        
        /**
         * [serdeInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
         *
         * _Required_: no
         *
         * _Type_: SerdeInfo
         */
        fun serdeInfo(value: IntrinsicFunction) {
          this.serdeInfo = value
        }

        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        var skewedInfo: Any? = null

        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        fun skewedInfo(value: SkewedInfo) {
          this.skewedInfo = value
        }
        
        /**
         * [skewedInfo](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
         *
         * _Required_: no
         *
         * _Type_: SkewedInfo
         */
        fun skewedInfo(value: IntrinsicFunction) {
          this.skewedInfo = value
        }

        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        var sortColumns: Any? = null

        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        fun sortColumns(value: List<Order>) {
          this.sortColumns = value
        }
        
        /**
         * [sortColumns](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
         *
         * _Required_: no
         *
         * _Type_: List<Order>
         */
        fun sortColumns(vararg value: IntrinsicFunction) {
          this.sortColumns = value
        }

        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var storedAsSubDirectories: Any? = null

        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storedAsSubDirectories(value: Boolean) {
          this.storedAsSubDirectories = value
        }
        
        /**
         * [storedAsSubDirectories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun storedAsSubDirectories(value: IntrinsicFunction) {
          this.storedAsSubDirectories = value
        }

    }

    @CloudFormationMarker
    class TableInput {
            /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var owner: Any? = null

        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun owner(value: String) {
          this.owner = value
        }
        
        /**
         * [owner](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun owner(value: IntrinsicFunction) {
          this.owner = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: Json) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun parameters(value: IntrinsicFunction) {
          this.parameters = value
        }

        /**
         * [partitionKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        var partitionKeys: Any? = null

        /**
         * [partitionKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun partitionKeys(value: List<Column>) {
          this.partitionKeys = value
        }
        
        /**
         * [partitionKeys](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
         *
         * _Required_: no
         *
         * _Type_: List<Column>
         */
        fun partitionKeys(vararg value: IntrinsicFunction) {
          this.partitionKeys = value
        }

        /**
         * [retention](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var retention: Any? = null

        /**
         * [retention](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retention(value: Int) {
          this.retention = value
        }
        
        /**
         * [retention](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun retention(value: IntrinsicFunction) {
          this.retention = value
        }

        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        var storageDescriptor: Any? = null

        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        fun storageDescriptor(value: StorageDescriptor) {
          this.storageDescriptor = value
        }
        
        /**
         * [storageDescriptor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
         *
         * _Required_: no
         *
         * _Type_: StorageDescriptor
         */
        fun storageDescriptor(value: IntrinsicFunction) {
          this.storageDescriptor = value
        }

        /**
         * [tableType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tableType: Any? = null

        /**
         * [tableType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableType(value: String) {
          this.tableType = value
        }
        
        /**
         * [tableType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tableType(value: IntrinsicFunction) {
          this.tableType = value
        }

        /**
         * [viewExpandedText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var viewExpandedText: Any? = null

        /**
         * [viewExpandedText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun viewExpandedText(value: String) {
          this.viewExpandedText = value
        }
        
        /**
         * [viewExpandedText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun viewExpandedText(value: IntrinsicFunction) {
          this.viewExpandedText = value
        }

        /**
         * [viewOriginalText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var viewOriginalText: Any? = null

        /**
         * [viewOriginalText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun viewOriginalText(value: String) {
          this.viewOriginalText = value
        }
        
        /**
         * [viewOriginalText](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun viewOriginalText(value: IntrinsicFunction) {
          this.viewOriginalText = value
        }

    }

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
