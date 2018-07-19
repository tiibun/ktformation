
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

        /**
        * [PrimaryKey](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
        */
        fun primaryKey(init: PrimaryKey.() -> Unit = {}): PrimaryKey {
            return PrimaryKey().also {
                it.init()
            }
        }
        /**
        * [ProvisionedThroughput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
        */
        fun provisionedThroughput(init: ProvisionedThroughput.() -> Unit = {}): ProvisionedThroughput {
            return ProvisionedThroughput().also {
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
    class PrimaryKey {
            /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#primary-key-object)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class ProvisionedThroughput {
            /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var readCapacityUnits: Any? = null

        /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun readCapacityUnits(value: Int) {
          this.readCapacityUnits = value
        }
        
        /**
         * [readCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun readCapacityUnits(value: IntrinsicFunction) {
          this.readCapacityUnits = value
        }

        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        var writeCapacityUnits: Any? = null

        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun writeCapacityUnits(value: Int) {
          this.writeCapacityUnits = value
        }
        
        /**
         * [writeCapacityUnits](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-provisionedthroughput.html)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun writeCapacityUnits(value: IntrinsicFunction) {
          this.writeCapacityUnits = value
        }

    }

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
