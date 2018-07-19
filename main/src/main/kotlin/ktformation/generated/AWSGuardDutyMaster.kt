
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::Master - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
@CloudFormationMarker
class AWSGuardDutyMaster(logicalId: String) : Resource<AWSGuardDutyMaster.Properties>(logicalId, "AWS::GuardDuty::Master") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var detectorId: Any? = null

        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: String) {
          this.detectorId = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: IntrinsicFunction) {
          this.detectorId = value
        }

        /**
         * [invitationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var invitationId: Any? = null

        /**
         * [invitationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun invitationId(value: String) {
          this.invitationId = value
        }
        
        /**
         * [invitationId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun invitationId(value: IntrinsicFunction) {
          this.invitationId = value
        }

        /**
         * [masterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var masterId: Any? = null

        /**
         * [masterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterId(value: String) {
          this.masterId = value
        }
        
        /**
         * [masterId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun masterId(value: IntrinsicFunction) {
          this.masterId = value
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
 * [AWS::GuardDuty::Master - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
fun Resources.awsGuardDutyMaster(logicalId: String, init: AWSGuardDutyMaster.() -> Unit = {}): AWSGuardDutyMaster {
    return AWSGuardDutyMaster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
