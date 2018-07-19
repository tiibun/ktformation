
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cognito::UserPoolUser - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
 */
@CloudFormationMarker
class AWSCognitoUserPoolUser(logicalId: String) : Resource<AWSCognitoUserPoolUser.Properties>(logicalId, "AWS::Cognito::UserPoolUser") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [desiredDeliveryMediums](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var desiredDeliveryMediums: Any? = null

        /**
         * [desiredDeliveryMediums](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun desiredDeliveryMediums(value: List<String>) {
          this.desiredDeliveryMediums = value
        }
        
        /**
         * [desiredDeliveryMediums](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun desiredDeliveryMediums(vararg value: IntrinsicFunction) {
          this.desiredDeliveryMediums = value
        }

        /**
         * [forceAliasCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var forceAliasCreation: Any? = null

        /**
         * [forceAliasCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun forceAliasCreation(value: Boolean) {
          this.forceAliasCreation = value
        }
        
        /**
         * [forceAliasCreation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun forceAliasCreation(value: IntrinsicFunction) {
          this.forceAliasCreation = value
        }

        /**
         * [messageAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var messageAction: Any? = null

        /**
         * [messageAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun messageAction(value: String) {
          this.messageAction = value
        }
        
        /**
         * [messageAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun messageAction(value: IntrinsicFunction) {
          this.messageAction = value
        }

        /**
         * [userAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        @JvmField
        var userAttributes: Any? = null

        /**
         * [userAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        fun userAttributes(value: List<AttributeType>) {
          this.userAttributes = value
        }
        
        /**
         * [userAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        fun userAttributes(vararg value: IntrinsicFunction) {
          this.userAttributes = value
        }

        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var userPoolId: Any? = null

        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userPoolId(value: String) {
          this.userPoolId = value
        }
        
        /**
         * [userPoolId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun userPoolId(value: IntrinsicFunction) {
          this.userPoolId = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

        /**
         * [validationData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        @JvmField
        var validationData: Any? = null

        /**
         * [validationData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        fun validationData(value: List<AttributeType>) {
          this.validationData = value
        }
        
        /**
         * [validationData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata)
         *
         * _Required_: no
         *
         * _Type_: List<AttributeType>
         */
        fun validationData(vararg value: IntrinsicFunction) {
          this.validationData = value
        }

        /**
        * [AttributeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html)
        */
        fun attributeType(init: AttributeType.() -> Unit = {}): AttributeType {
            return AttributeType().also {
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
    class AttributeType {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var value: Any? = null

        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: String) {
          this.value = value
        }
        
        /**
         * [value](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html#cfn-cognito-userpooluser-attributetype-value)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun value(value: IntrinsicFunction) {
          this.value = value
        }

    }

}

/**
 * [AWS::Cognito::UserPoolUser - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
 */
fun Resources.awsCognitoUserPoolUser(logicalId: String, init: AWSCognitoUserPoolUser.() -> Unit = {}): AWSCognitoUserPoolUser {
    return AWSCognitoUserPoolUser(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
