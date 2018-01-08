
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::SimpleTable - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesssimpletable)
 */
@CloudFormationMarker
class AWSServerlessSimpleTable(logicalId: String) : Resource<AWSServerlessSimpleTable.Properties>(logicalId, "AWS::Serverless::SimpleTable") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var primaryKey: Any? = null

        fun primaryKey(value: PrimaryKey) {
          this.primaryKey = value
        }
        fun primaryKey(value: IntrinsicFunction) {
  this.primaryKey = value
}
        @JvmField
        var provisionedThroughput: Any? = null

        fun provisionedThroughput(value: ProvisionedThroughput) {
          this.provisionedThroughput = value
        }
        fun provisionedThroughput(value: IntrinsicFunction) {
  this.provisionedThroughput = value
}
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class PrimaryKey(
            val name: String? = null,
            val type: String
    )

    class ProvisionedThroughput(
            val readCapacityUnits: Int? = null,
            val writeCapacityUnits: Int
    )

}

fun Resources.awsServerlessSimpleTable(logicalId: String, init: AWSServerlessSimpleTable.() -> Unit = {}): AWSServerlessSimpleTable {
    return AWSServerlessSimpleTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
