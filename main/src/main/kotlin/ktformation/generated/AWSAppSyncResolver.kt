
package ktformation.generated

import ktformation.*

/**
 * [AWS::AppSync::Resolver - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
 */
@CloudFormationMarker
class AWSAppSyncResolver(logicalId: String) : Resource<AWSAppSyncResolver.Properties>(logicalId, "AWS::AppSync::Resolver") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var apiId: Any? = null

        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: String) {
          this.apiId = value
        }
        
        /**
         * [apiId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-apiid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun apiId(value: IntrinsicFunction) {
          this.apiId = value
        }

        /**
         * [dataSourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var dataSourceName: Any? = null

        /**
         * [dataSourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataSourceName(value: String) {
          this.dataSourceName = value
        }
        
        /**
         * [dataSourceName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-datasourcename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dataSourceName(value: IntrinsicFunction) {
          this.dataSourceName = value
        }

        /**
         * [fieldName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var fieldName: Any? = null

        /**
         * [fieldName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fieldName(value: String) {
          this.fieldName = value
        }
        
        /**
         * [fieldName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-fieldname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun fieldName(value: IntrinsicFunction) {
          this.fieldName = value
        }

        /**
         * [requestMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var requestMappingTemplate: Any? = null

        /**
         * [requestMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestMappingTemplate(value: String) {
          this.requestMappingTemplate = value
        }
        
        /**
         * [requestMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestMappingTemplate(value: IntrinsicFunction) {
          this.requestMappingTemplate = value
        }

        /**
         * [requestMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var requestMappingTemplateS3Location: Any? = null

        /**
         * [requestMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestMappingTemplateS3Location(value: String) {
          this.requestMappingTemplateS3Location = value
        }
        
        /**
         * [requestMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-requestmappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun requestMappingTemplateS3Location(value: IntrinsicFunction) {
          this.requestMappingTemplateS3Location = value
        }

        /**
         * [responseMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var responseMappingTemplate: Any? = null

        /**
         * [responseMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responseMappingTemplate(value: String) {
          this.responseMappingTemplate = value
        }
        
        /**
         * [responseMappingTemplate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplate)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responseMappingTemplate(value: IntrinsicFunction) {
          this.responseMappingTemplate = value
        }

        /**
         * [responseMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var responseMappingTemplateS3Location: Any? = null

        /**
         * [responseMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responseMappingTemplateS3Location(value: String) {
          this.responseMappingTemplateS3Location = value
        }
        
        /**
         * [responseMappingTemplateS3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-responsemappingtemplates3location)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun responseMappingTemplateS3Location(value: IntrinsicFunction) {
          this.responseMappingTemplateS3Location = value
        }

        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var typeName: Any? = null

        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun typeName(value: String) {
          this.typeName = value
        }
        
        /**
         * [typeName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html#cfn-appsync-resolver-typename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun typeName(value: IntrinsicFunction) {
          this.typeName = value
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
 * [AWS::AppSync::Resolver - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
 */
fun Resources.awsAppSyncResolver(logicalId: String, init: AWSAppSyncResolver.() -> Unit = {}): AWSAppSyncResolver {
    return AWSAppSyncResolver(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
