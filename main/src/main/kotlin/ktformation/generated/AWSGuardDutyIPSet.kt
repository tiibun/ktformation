
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
 */
@CloudFormationMarker
class AWSGuardDutyIPSet(logicalId: String) : Resource<AWSGuardDutyIPSet.Properties>(logicalId, "AWS::GuardDuty::IPSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var activate: Any? = null

        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun activate(value: Boolean) {
          this.activate = value
        }
        
        /**
         * [activate](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun activate(value: IntrinsicFunction) {
          this.activate = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var detectorId: Any? = null

        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: String) {
          this.detectorId = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: IntrinsicFunction) {
          this.detectorId = value
        }
        
        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var format: Any? = null

        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun format(value: String) {
          this.format = value
        }
        
        /**
         * [format](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun format(value: IntrinsicFunction) {
          this.format = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var location: Any? = null

        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun location(value: String) {
          this.location = value
        }
        
        /**
         * [location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun location(value: IntrinsicFunction) {
          this.location = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
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
 * [AWS::GuardDuty::IPSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
 */
fun Resources.awsGuardDutyIPSet(logicalId: String, init: AWSGuardDutyIPSet.() -> Unit = {}): AWSGuardDutyIPSet {
    return AWSGuardDutyIPSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
