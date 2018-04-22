
package ktformation.generated

import ktformation.*

/**
 * [AWS::AppSync::GraphQLSchema - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html)
 */
@CloudFormationMarker
class AWSAppSyncGraphQLSchema(logicalId: String) : Resource<AWSAppSyncGraphQLSchema.Properties>(logicalId, "AWS::AppSync::GraphQLSchema") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var apiId: Any? = null

        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: String) {
          this.apiId = value
        }
        
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: IntrinsicFunction) {
          this.apiId = value
        }
        
        /**
         * [definition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var definition: Any? = null

        /**
         * [definition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun definition(value: String) {
          this.definition = value
        }
        
        /**
         * [definition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun definition(value: IntrinsicFunction) {
          this.definition = value
        }
        
        /**
         * [definitionS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var definitionS3Location: Any? = null

        /**
         * [definitionS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun definitionS3Location(value: String) {
          this.definitionS3Location = value
        }
        
        /**
         * [definitionS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun definitionS3Location(value: IntrinsicFunction) {
          this.definitionS3Location = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::AppSync::GraphQLSchema - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html)
 */
fun Resources.awsAppSyncGraphQLSchema(logicalId: String, init: AWSAppSyncGraphQLSchema.() -> Unit = {}): AWSAppSyncGraphQLSchema {
    return AWSAppSyncGraphQLSchema(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
