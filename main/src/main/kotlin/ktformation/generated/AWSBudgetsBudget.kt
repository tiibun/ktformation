
package ktformation.generated

import ktformation.*

/**
 * [AWS::Budgets::Budget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html)
 */
@CloudFormationMarker
class AWSBudgetsBudget(logicalId: String) : Resource<AWSBudgetsBudget.Properties>(logicalId, "AWS::Budgets::Budget") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [budget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
         *
         * _Required_: yes
         *
         * _Type_: BudgetData
         */
        @JvmField
        var budget: Any? = null

        /**
         * [budget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
         *
         * _Required_: yes
         *
         * _Type_: BudgetData
         */
        fun budget(value: BudgetData) {
          this.budget = value
        }
        
        /**
         * [budget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
         *
         * _Required_: yes
         *
         * _Type_: BudgetData
         */
        fun budget(value: IntrinsicFunction) {
          this.budget = value
        }
        
        /**
         * [notificationsWithSubscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationWithSubscribers>
         */
        @JvmField
        var notificationsWithSubscribers: Any? = null

        /**
         * [notificationsWithSubscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationWithSubscribers>
         */
        fun notificationsWithSubscribers(value: List<NotificationWithSubscribers>) {
          this.notificationsWithSubscribers = value
        }
        
        /**
         * [notificationsWithSubscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
         *
         * _Required_: no
         *
         * _Type_: List<NotificationWithSubscribers>
         */
        fun notificationsWithSubscribers(vararg value: IntrinsicFunction) {
          this.notificationsWithSubscribers = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class BudgetData(
            /**
             * [BudgetLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
             *
             * _Required_: no
             *
             * _Type_: Spend
             */
            val budgetLimit: Spend? = null,
            /**
             * [BudgetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val budgetName: String? = null,
            /**
             * [BudgetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val budgetType: String,
            /**
             * [CostFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
             *
             * _Required_: no
             *
             * _Type_: Json
             */
            val costFilters: Json? = null,
            /**
             * [CostTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
             *
             * _Required_: no
             *
             * _Type_: CostTypes
             */
            val costTypes: CostTypes? = null,
            /**
             * [TimePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
             *
             * _Required_: no
             *
             * _Type_: TimePeriod
             */
            val timePeriod: TimePeriod? = null,
            /**
             * [TimeUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeUnit: String
    )

    class CostTypes(
            /**
             * [IncludeCredit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeCredit: Boolean? = null,
            /**
             * [IncludeDiscount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeDiscount: Boolean? = null,
            /**
             * [IncludeOtherSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeOtherSubscription: Boolean? = null,
            /**
             * [IncludeRecurring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeRecurring: Boolean? = null,
            /**
             * [IncludeRefund](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeRefund: Boolean? = null,
            /**
             * [IncludeSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeSubscription: Boolean? = null,
            /**
             * [IncludeSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeSupport: Boolean? = null,
            /**
             * [IncludeTax](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeTax: Boolean? = null,
            /**
             * [IncludeUpfront](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeUpfront: Boolean? = null,
            /**
             * [UseAmortized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val useAmortized: Boolean? = null,
            /**
             * [UseBlended](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val useBlended: Boolean? = null
    )

    class Notification(
            /**
             * [ComparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val comparisonOperator: String,
            /**
             * [NotificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val notificationType: String,
            /**
             * [Threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val threshold: Double,
            /**
             * [ThresholdType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val thresholdType: String? = null
    )

    class NotificationWithSubscribers(
            /**
             * [Notification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
             *
             * _Required_: yes
             *
             * _Type_: Notification
             */
            val notification: Notification,
            /**
             * [Subscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
             *
             * _Required_: yes
             *
             * _Type_: List<Subscriber>
             */
            val subscribers: List<Subscriber>
    )

    class Spend(
            /**
             * [Amount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
             *
             * _Required_: yes
             *
             * _Type_: Double
             */
            val amount: Double,
            /**
             * [Unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val unit: String
    )

    class Subscriber(
            /**
             * [Address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val address: String,
            /**
             * [SubscriptionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val subscriptionType: String
    )

    class TimePeriod(
            /**
             * [End](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val end: String? = null,
            /**
             * [Start](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val start: String? = null
    )

}

/**
 * [AWS::Budgets::Budget - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html)
 */
fun Resources.awsBudgetsBudget(logicalId: String, init: AWSBudgetsBudget.() -> Unit = {}): AWSBudgetsBudget {
    return AWSBudgetsBudget(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
