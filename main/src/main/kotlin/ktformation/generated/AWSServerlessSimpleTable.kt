
package ktformation.generated

import ktformation.*

/**
 * [AWS::Serverless::SimpleTable - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesssimpletable)
 */
@CloudFormationMarker
class AWSServerlessSimpleTable(logicalId: String) : Resource<AWSServerlessSimpleTable.Properties>(logicalId, "AWS::Serverless::SimpleTable") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [primaryKey](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: PrimaryKey
         */
        @JvmField
        var primaryKey: Any? = null

        /**
         * [primaryKey](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: PrimaryKey
         */
        fun primaryKey(value: PrimaryKey) {
          this.primaryKey = value
        }
        
        /**
         * [primaryKey](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: PrimaryKey
         */
        fun primaryKey(value: IntrinsicFunction) {
          this.primaryKey = value
        }
        
        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: ProvisionedThroughput
         */
        @JvmField
        var provisionedThroughput: Any? = null

        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: ProvisionedThroughput
         */
        fun provisionedThroughput(value: ProvisionedThroughput) {
          this.provisionedThroughput = value
        }
        
        /**
         * [provisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: ProvisionedThroughput
         */
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
            /**
             * [Name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class ProvisionedThroughput(
            /**
             * [ReadCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val readCapacityUnits: Int? = null,
            /**
             * [WriteCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val writeCapacityUnits: Int
    )

}

/**
 * [AWS::Serverless::SimpleTable - AWS CloudFormation](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesssimpletable)
 */
fun Resources.awsServerlessSimpleTable(logicalId: String, init: AWSServerlessSimpleTable.() -> Unit = {}): AWSServerlessSimpleTable {
    return AWSServerlessSimpleTable(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
