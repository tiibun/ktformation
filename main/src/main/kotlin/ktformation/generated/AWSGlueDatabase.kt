
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Database - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
@CloudFormationMarker
class AWSGlueDatabase(logicalId: String) : Resource<AWSGlueDatabase.Properties>(logicalId, "AWS::Glue::Database") {

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
        var databaseInput: Any? = null

        fun databaseInput(value: DatabaseInput) {
          this.databaseInput = value
        }
        
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
            val description: String? = null,
            val locationUri: String? = null,
            val name: String? = null,
            val parameters: Json? = null
    )

}

fun Resources.awsGlueDatabase(logicalId: String, init: AWSGlueDatabase.() -> Unit = {}): AWSGlueDatabase {
    return AWSGlueDatabase(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
