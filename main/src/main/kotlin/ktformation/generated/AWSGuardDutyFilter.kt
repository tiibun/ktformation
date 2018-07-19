
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

        /**
        * [Condition](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html)
        */
        fun condition(init: Condition.() -> Unit = {}): Condition {
            return Condition().also {
                it.init()
            }
        }
        /**
        * [FindingCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html)
        */
        fun findingCriteria(init: FindingCriteria.() -> Unit = {}): FindingCriteria {
            return FindingCriteria().also {
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
    class Condition {
            /**
         * [eq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var eq: Any? = null

        /**
         * [eq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eq(value: List<String>) {
          this.eq = value
        }
        
        /**
         * [eq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-eq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun eq(vararg value: IntrinsicFunction) {
          this.eq = value
        }

        /**
         * [gte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var gte: Any? = null

        /**
         * [gte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gte(value: Int) {
          this.gte = value
        }
        
        /**
         * [gte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-gte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun gte(value: IntrinsicFunction) {
          this.gte = value
        }

        /**
         * [lt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var lt: Any? = null

        /**
         * [lt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun lt(value: Int) {
          this.lt = value
        }
        
        /**
         * [lt](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lt)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun lt(value: IntrinsicFunction) {
          this.lt = value
        }

        /**
         * [lte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        var lte: Any? = null

        /**
         * [lte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun lte(value: Int) {
          this.lte = value
        }
        
        /**
         * [lte](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-lte)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun lte(value: IntrinsicFunction) {
          this.lte = value
        }

        /**
         * [neq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var neq: Any? = null

        /**
         * [neq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun neq(value: List<String>) {
          this.neq = value
        }
        
        /**
         * [neq](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html#cfn-guardduty-filter-condition-neq)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun neq(vararg value: IntrinsicFunction) {
          this.neq = value
        }

    }

    @CloudFormationMarker
    class FindingCriteria {
            /**
         * [criterion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var criterion: Any? = null

        /**
         * [criterion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun criterion(value: Json) {
          this.criterion = value
        }
        
        /**
         * [criterion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun criterion(value: IntrinsicFunction) {
          this.criterion = value
        }

        /**
         * [itemType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
         *
         * _Required_: no
         *
         * _Type_: Condition
         */
        var itemType: Any? = null

        /**
         * [itemType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
         *
         * _Required_: no
         *
         * _Type_: Condition
         */
        fun itemType(value: Condition) {
          this.itemType = value
        }
        
        /**
         * [itemType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-itemtype)
         *
         * _Required_: no
         *
         * _Type_: Condition
         */
        fun itemType(value: IntrinsicFunction) {
          this.itemType = value
        }

    }

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
