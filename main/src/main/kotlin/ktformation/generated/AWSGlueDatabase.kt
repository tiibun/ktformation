
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Database - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
@CloudFormationMarker
class AWSGlueDatabase(logicalId: String) : Resource<AWSGlueDatabase.Properties>(logicalId, "AWS::Glue::Database") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var catalogId: Any? = null

        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: String) {
          this.catalogId = value
        }
        
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: IntrinsicFunction) {
          this.catalogId = value
        }
        
        /**
         * [databaseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
         *
         * _Required_: yes
         *
         * _Type_: DatabaseInput
         */
        @JvmField
        var databaseInput: Any? = null

        /**
         * [databaseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
         *
         * _Required_: yes
         *
         * _Type_: DatabaseInput
         */
        fun databaseInput(value: DatabaseInput) {
          this.databaseInput = value
        }
        
        /**
         * [databaseInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
         *
         * _Required_: yes
         *
         * _Type_: DatabaseInput
         */
        fun databaseInput(value: IntrinsicFunction) {
          this.databaseInput = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class DatabaseInput(
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [LocationUri](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-locationuri)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val locationUri: String? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-parameters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val parameters: Json? = null
    )

}

/**
 * [AWS::Glue::Database - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
fun Resources.awsGlueDatabase(logicalId: String, init: AWSGlueDatabase.() -> Unit = {}): AWSGlueDatabase {
    return AWSGlueDatabase(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
