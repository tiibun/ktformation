
package ktformation.generated

import ktformation.*

/**
 * [AWS::SES::ReceiptRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html)
 */
@CloudFormationMarker
class AWSSESReceiptRule(logicalId: String) : Resource<AWSSESReceiptRule.Properties>(logicalId, "AWS::SES::ReceiptRule") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [after](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var after: Any? = null

        /**
         * [after](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun after(value: String) {
          this.after = value
        }
        
        /**
         * [after](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun after(value: IntrinsicFunction) {
          this.after = value
        }
        
        /**
         * [rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
         *
         * _Required_: yes
         *
         * _Type_: Rule
         */
        @JvmField
        var rule: Any? = null

        /**
         * [rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
         *
         * _Required_: yes
         *
         * _Type_: Rule
         */
        fun rule(value: Rule) {
          this.rule = value
        }
        
        /**
         * [rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
         *
         * _Required_: yes
         *
         * _Type_: Rule
         */
        fun rule(value: IntrinsicFunction) {
          this.rule = value
        }
        
        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var ruleSetName: Any? = null

        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleSetName(value: String) {
          this.ruleSetName = value
        }
        
        /**
         * [ruleSetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ruleSetName(value: IntrinsicFunction) {
          this.ruleSetName = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Action(
            /**
             * [AddHeaderAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
             *
             * _Required_: no
             *
             * _Type_: AddHeaderAction
             */
            val addHeaderAction: AddHeaderAction? = null,
            /**
             * [BounceAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
             *
             * _Required_: no
             *
             * _Type_: BounceAction
             */
            val bounceAction: BounceAction? = null,
            /**
             * [LambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
             *
             * _Required_: no
             *
             * _Type_: LambdaAction
             */
            val lambdaAction: LambdaAction? = null,
            /**
             * [S3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
             *
             * _Required_: no
             *
             * _Type_: S3Action
             */
            val s3Action: S3Action? = null,
            /**
             * [SNSAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
             *
             * _Required_: no
             *
             * _Type_: SNSAction
             */
            val sNSAction: SNSAction? = null,
            /**
             * [StopAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
             *
             * _Required_: no
             *
             * _Type_: StopAction
             */
            val stopAction: StopAction? = null,
            /**
             * [WorkmailAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
             *
             * _Required_: no
             *
             * _Type_: WorkmailAction
             */
            val workmailAction: WorkmailAction? = null
    )

    class AddHeaderAction(
            /**
             * [HeaderName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val headerName: String,
            /**
             * [HeaderValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val headerValue: String
    )

    class BounceAction(
            /**
             * [Message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val message: String,
            /**
             * [Sender](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val sender: String,
            /**
             * [SmtpReplyCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val smtpReplyCode: String,
            /**
             * [StatusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val statusCode: String? = null,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

    class LambdaAction(
            /**
             * [FunctionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val functionArn: String,
            /**
             * [InvocationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val invocationType: String? = null,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

    class Rule(
            /**
             * [Actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
             *
             * _Required_: no
             *
             * _Type_: List<Action>
             */
            val actions: List<Action>? = null,
            /**
             * [Enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val enabled: Boolean? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Recipients](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val recipients: List<String>? = null,
            /**
             * [ScanEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val scanEnabled: Boolean? = null,
            /**
             * [TlsPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val tlsPolicy: String? = null
    )

    class S3Action(
            /**
             * [BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val bucketName: String,
            /**
             * [KmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val kmsKeyArn: String? = null,
            /**
             * [ObjectKeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val objectKeyPrefix: String? = null,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

    class SNSAction(
            /**
             * [Encoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val encoding: String? = null,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

    class StopAction(
            /**
             * [Scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val scope: String,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

    class WorkmailAction(
            /**
             * [OrganizationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val organizationArn: String,
            /**
             * [TopicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val topicArn: String? = null
    )

}

/**
 * [AWS::SES::ReceiptRule - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html)
 */
fun Resources.awsSESReceiptRule(logicalId: String, init: AWSSESReceiptRule.() -> Unit = {}): AWSSESReceiptRule {
    return AWSSESReceiptRule(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
