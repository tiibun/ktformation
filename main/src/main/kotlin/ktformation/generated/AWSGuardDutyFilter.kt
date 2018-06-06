
package ktformation.generated

import ktformation.*

/**
 * [AWS::GuardDuty::Filter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
 */
@CloudFormationMarker
class AWSGuardDutyFilter(logicalId: String) : Resource<AWSGuardDutyFilter.Properties>(logicalId, "AWS::GuardDuty::Filter") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var action: Any? = null

        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun action(value: String) {
          this.action = value
        }
        
        /**
         * [action](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun action(value: IntrinsicFunction) {
          this.action = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var detectorId: Any? = null

        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: String) {
          this.detectorId = value
        }
        
        /**
         * [detectorId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun detectorId(value: IntrinsicFunction) {
          this.detectorId = value
        }
        
        /**
         * [findingCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
         *
         * _Required_: yes
         *
         * _Type_: FindingCriteria
         */
        @JvmField
        var findingCriteria: Any? = null

        /**
         * [findingCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
         *
         * _Required_: yes
         *
         * _Type_: FindingCriteria
         */
        fun findingCriteria(value: FindingCriteria) {
          this.findingCriteria = value
        }
        
        /**
         * [findingCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-findingcriteria)
         *
         * _Required_: yes
         *
         * _Type_: FindingCriteria
         */
        fun findingCriteria(value: IntrinsicFunction) {
          this.findingCriteria = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [rank](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var rank: Any? = null

        /**
         * [rank](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun rank(value: Int) {
          this.rank = value
        }
        
        /**
         * [rank](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun rank(value: IntrinsicFunction) {
          this.rank = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Condition(
            /**
             * [Eq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val eq: List<String>? = null,
            /**
             * [Gte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val gte: Int? = null,
            /**
             * [Lt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val lt: Int? = null,
            /**
             * [Lte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
             *
             * _Required_: no
             *
             * _Type_: Int
             */
            val lte: Int? = null,
            /**
             * [Neq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val neq: List<String>? = null
    )

    class FindingCriteria(
            /**
             * [Criterion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val criterion: Json? = null,
            /**
             * [ItemType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
             *
             * _Required_: no
             *
             * _Type_: Condition
             */
            val itemType: Condition? = null
    )

}

/**
 * [AWS::GuardDuty::Filter - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html)
 */
fun Resources.awsGuardDutyFilter(logicalId: String, init: AWSGuardDutyFilter.() -> Unit = {}): AWSGuardDutyFilter {
    return AWSGuardDutyFilter(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
