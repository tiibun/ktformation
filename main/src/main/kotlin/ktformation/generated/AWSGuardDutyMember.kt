
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::Member - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html)
 */
@CloudFormationMarker
class AWSGuardDutyMember(logicalId: String) : Resource<AWSGuardDutyMember.Properties>(logicalId, "AWS::GuardDuty::Member") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var detectorId: Any? = null

        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: String) {
          this.detectorId = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: IntrinsicFunction) {
          this.detectorId = value
        }
        
        /**
         * [disableEmailNotification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var disableEmailNotification: Any? = null

        /**
         * [disableEmailNotification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableEmailNotification(value: Boolean) {
          this.disableEmailNotification = value
        }
        
        /**
         * [disableEmailNotification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-disableemailnotification)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun disableEmailNotification(value: IntrinsicFunction) {
          this.disableEmailNotification = value
        }
        
        /**
         * [email](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var email: Any? = null

        /**
         * [email](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun email(value: String) {
          this.email = value
        }
        
        /**
         * [email](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-email)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun email(value: IntrinsicFunction) {
          this.email = value
        }
        
        /**
         * [memberId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var memberId: Any? = null

        /**
         * [memberId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun memberId(value: String) {
          this.memberId = value
        }
        
        /**
         * [memberId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-memberid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun memberId(value: IntrinsicFunction) {
          this.memberId = value
        }
        
        /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var message: Any? = null

        /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun message(value: String) {
          this.message = value
        }
        
        /**
         * [message](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-message)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun message(value: IntrinsicFunction) {
          this.message = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var status: Any? = null

        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun status(value: String) {
          this.status = value
        }
        
        /**
         * [status](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html#cfn-guardduty-member-status)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun status(value: IntrinsicFunction) {
          this.status = value
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
 * [AWS::GuardDuty::Member - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-member.html)
 */
fun Resources.awsGuardDutyMember(logicalId: String, init: AWSGuardDutyMember.() -> Unit = {}): AWSGuardDutyMember {
    return AWSGuardDutyMember(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
