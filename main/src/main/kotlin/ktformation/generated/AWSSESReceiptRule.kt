
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

        /**
        * [Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html)
        */
        fun action(init: Action.() -> Unit = {}): Action {
            return Action().also {
                it.init()
            }
        }
        /**
        * [AddHeaderAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html)
        */
        fun addHeaderAction(init: AddHeaderAction.() -> Unit = {}): AddHeaderAction {
            return AddHeaderAction().also {
                it.init()
            }
        }
        /**
        * [BounceAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html)
        */
        fun bounceAction(init: BounceAction.() -> Unit = {}): BounceAction {
            return BounceAction().also {
                it.init()
            }
        }
        /**
        * [LambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html)
        */
        fun lambdaAction(init: LambdaAction.() -> Unit = {}): LambdaAction {
            return LambdaAction().also {
                it.init()
            }
        }
        /**
        * [Rule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html)
        */
        fun rule(init: Rule.() -> Unit = {}): Rule {
            return Rule().also {
                it.init()
            }
        }
        /**
        * [S3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html)
        */
        fun s3Action(init: S3Action.() -> Unit = {}): S3Action {
            return S3Action().also {
                it.init()
            }
        }
        /**
        * [SNSAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html)
        */
        fun sNSAction(init: SNSAction.() -> Unit = {}): SNSAction {
            return SNSAction().also {
                it.init()
            }
        }
        /**
        * [StopAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html)
        */
        fun stopAction(init: StopAction.() -> Unit = {}): StopAction {
            return StopAction().also {
                it.init()
            }
        }
        /**
        * [WorkmailAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html)
        */
        fun workmailAction(init: WorkmailAction.() -> Unit = {}): WorkmailAction {
            return WorkmailAction().also {
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
    class Action {
            /**
         * [addHeaderAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
         *
         * _Required_: no
         *
         * _Type_: AddHeaderAction
         */
        var addHeaderAction: Any? = null

        /**
         * [addHeaderAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
         *
         * _Required_: no
         *
         * _Type_: AddHeaderAction
         */
        fun addHeaderAction(value: AddHeaderAction) {
          this.addHeaderAction = value
        }
        
        /**
         * [addHeaderAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-addheaderaction)
         *
         * _Required_: no
         *
         * _Type_: AddHeaderAction
         */
        fun addHeaderAction(value: IntrinsicFunction) {
          this.addHeaderAction = value
        }

        /**
         * [bounceAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
         *
         * _Required_: no
         *
         * _Type_: BounceAction
         */
        var bounceAction: Any? = null

        /**
         * [bounceAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
         *
         * _Required_: no
         *
         * _Type_: BounceAction
         */
        fun bounceAction(value: BounceAction) {
          this.bounceAction = value
        }
        
        /**
         * [bounceAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-bounceaction)
         *
         * _Required_: no
         *
         * _Type_: BounceAction
         */
        fun bounceAction(value: IntrinsicFunction) {
          this.bounceAction = value
        }

        /**
         * [lambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        var lambdaAction: Any? = null

        /**
         * [lambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        fun lambdaAction(value: LambdaAction) {
          this.lambdaAction = value
        }
        
        /**
         * [lambdaAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-lambdaaction)
         *
         * _Required_: no
         *
         * _Type_: LambdaAction
         */
        fun lambdaAction(value: IntrinsicFunction) {
          this.lambdaAction = value
        }

        /**
         * [s3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        var s3Action: Any? = null

        /**
         * [s3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        fun s3Action(value: S3Action) {
          this.s3Action = value
        }
        
        /**
         * [s3Action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-s3action)
         *
         * _Required_: no
         *
         * _Type_: S3Action
         */
        fun s3Action(value: IntrinsicFunction) {
          this.s3Action = value
        }

        /**
         * [sNSAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
         *
         * _Required_: no
         *
         * _Type_: SNSAction
         */
        var sNSAction: Any? = null

        /**
         * [sNSAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
         *
         * _Required_: no
         *
         * _Type_: SNSAction
         */
        fun sNSAction(value: SNSAction) {
          this.sNSAction = value
        }
        
        /**
         * [sNSAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-snsaction)
         *
         * _Required_: no
         *
         * _Type_: SNSAction
         */
        fun sNSAction(value: IntrinsicFunction) {
          this.sNSAction = value
        }

        /**
         * [stopAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
         *
         * _Required_: no
         *
         * _Type_: StopAction
         */
        var stopAction: Any? = null

        /**
         * [stopAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
         *
         * _Required_: no
         *
         * _Type_: StopAction
         */
        fun stopAction(value: StopAction) {
          this.stopAction = value
        }
        
        /**
         * [stopAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-stopaction)
         *
         * _Required_: no
         *
         * _Type_: StopAction
         */
        fun stopAction(value: IntrinsicFunction) {
          this.stopAction = value
        }

        /**
         * [workmailAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
         *
         * _Required_: no
         *
         * _Type_: WorkmailAction
         */
        var workmailAction: Any? = null

        /**
         * [workmailAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
         *
         * _Required_: no
         *
         * _Type_: WorkmailAction
         */
        fun workmailAction(value: WorkmailAction) {
          this.workmailAction = value
        }
        
        /**
         * [workmailAction](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html#cfn-ses-receiptrule-action-workmailaction)
         *
         * _Required_: no
         *
         * _Type_: WorkmailAction
         */
        fun workmailAction(value: IntrinsicFunction) {
          this.workmailAction = value
        }

    }

    @CloudFormationMarker
    class AddHeaderAction {
            /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var headerName: Any? = null

        /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerName(value: String) {
          this.headerName = value
        }
        
        /**
         * [headerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerName(value: IntrinsicFunction) {
          this.headerName = value
        }

        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var headerValue: Any? = null

        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerValue(value: String) {
          this.headerValue = value
        }
        
        /**
         * [headerValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html#cfn-ses-receiptrule-addheaderaction-headervalue)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun headerValue(value: IntrinsicFunction) {
          this.headerValue = value
        }

    }

    @CloudFormationMarker
    class BounceAction {
            /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var message: Any? = null

        /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun message(value: String) {
          this.message = value
        }
        
        /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-message)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun message(value: IntrinsicFunction) {
          this.message = value
        }

        /**
         * [sender](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var sender: Any? = null

        /**
         * [sender](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sender(value: String) {
          this.sender = value
        }
        
        /**
         * [sender](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-sender)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun sender(value: IntrinsicFunction) {
          this.sender = value
        }

        /**
         * [smtpReplyCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var smtpReplyCode: Any? = null

        /**
         * [smtpReplyCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun smtpReplyCode(value: String) {
          this.smtpReplyCode = value
        }
        
        /**
         * [smtpReplyCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-smtpreplycode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun smtpReplyCode(value: IntrinsicFunction) {
          this.smtpReplyCode = value
        }

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var statusCode: Any? = null

        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statusCode(value: String) {
          this.statusCode = value
        }
        
        /**
         * [statusCode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-statuscode)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun statusCode(value: IntrinsicFunction) {
          this.statusCode = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html#cfn-ses-receiptrule-bounceaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

    @CloudFormationMarker
    class LambdaAction {
            /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var functionArn: Any? = null

        /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionArn(value: String) {
          this.functionArn = value
        }
        
        /**
         * [functionArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun functionArn(value: IntrinsicFunction) {
          this.functionArn = value
        }

        /**
         * [invocationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var invocationType: Any? = null

        /**
         * [invocationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun invocationType(value: String) {
          this.invocationType = value
        }
        
        /**
         * [invocationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun invocationType(value: IntrinsicFunction) {
          this.invocationType = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

    @CloudFormationMarker
    class Rule {
            /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
         *
         * _Required_: no
         *
         * _Type_: List<Action>
         */
        var actions: Any? = null

        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
         *
         * _Required_: no
         *
         * _Type_: List<Action>
         */
        fun actions(value: List<Action>) {
          this.actions = value
        }
        
        /**
         * [actions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-actions)
         *
         * _Required_: no
         *
         * _Type_: List<Action>
         */
        fun actions(vararg value: IntrinsicFunction) {
          this.actions = value
        }

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var enabled: Any? = null

        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: Boolean) {
          this.enabled = value
        }
        
        /**
         * [enabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-enabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun enabled(value: IntrinsicFunction) {
          this.enabled = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [recipients](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var recipients: Any? = null

        /**
         * [recipients](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun recipients(value: List<String>) {
          this.recipients = value
        }
        
        /**
         * [recipients](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-recipients)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun recipients(vararg value: IntrinsicFunction) {
          this.recipients = value
        }

        /**
         * [scanEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var scanEnabled: Any? = null

        /**
         * [scanEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun scanEnabled(value: Boolean) {
          this.scanEnabled = value
        }
        
        /**
         * [scanEnabled](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-scanenabled)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun scanEnabled(value: IntrinsicFunction) {
          this.scanEnabled = value
        }

        /**
         * [tlsPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var tlsPolicy: Any? = null

        /**
         * [tlsPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tlsPolicy(value: String) {
          this.tlsPolicy = value
        }
        
        /**
         * [tlsPolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html#cfn-ses-receiptrule-rule-tlspolicy)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tlsPolicy(value: IntrinsicFunction) {
          this.tlsPolicy = value
        }

    }

    @CloudFormationMarker
    class S3Action {
            /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var bucketName: Any? = null

        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: String) {
          this.bucketName = value
        }
        
        /**
         * [bucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun bucketName(value: IntrinsicFunction) {
          this.bucketName = value
        }

        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var kmsKeyArn: Any? = null

        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: String) {
          this.kmsKeyArn = value
        }
        
        /**
         * [kmsKeyArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun kmsKeyArn(value: IntrinsicFunction) {
          this.kmsKeyArn = value
        }

        /**
         * [objectKeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var objectKeyPrefix: Any? = null

        /**
         * [objectKeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun objectKeyPrefix(value: String) {
          this.objectKeyPrefix = value
        }
        
        /**
         * [objectKeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun objectKeyPrefix(value: IntrinsicFunction) {
          this.objectKeyPrefix = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

    @CloudFormationMarker
    class SNSAction {
            /**
         * [encoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var encoding: Any? = null

        /**
         * [encoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun encoding(value: String) {
          this.encoding = value
        }
        
        /**
         * [encoding](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-encoding)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun encoding(value: IntrinsicFunction) {
          this.encoding = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html#cfn-ses-receiptrule-snsaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

    @CloudFormationMarker
    class StopAction {
            /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var scope: Any? = null

        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scope(value: String) {
          this.scope = value
        }
        
        /**
         * [scope](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun scope(value: IntrinsicFunction) {
          this.scope = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

    @CloudFormationMarker
    class WorkmailAction {
            /**
         * [organizationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var organizationArn: Any? = null

        /**
         * [organizationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun organizationArn(value: String) {
          this.organizationArn = value
        }
        
        /**
         * [organizationArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun organizationArn(value: IntrinsicFunction) {
          this.organizationArn = value
        }

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var topicArn: Any? = null

        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: String) {
          this.topicArn = value
        }
        
        /**
         * [topicArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun topicArn(value: IntrinsicFunction) {
          this.topicArn = value
        }

    }

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
