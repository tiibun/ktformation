
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

        /**
        * [BudgetData](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html)
        */
        fun budgetData(init: BudgetData.() -> Unit = {}): BudgetData {
            return BudgetData().also {
                it.init()
            }
        }
        /**
        * [CostTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html)
        */
        fun costTypes(init: CostTypes.() -> Unit = {}): CostTypes {
            return CostTypes().also {
                it.init()
            }
        }
        /**
        * [Notification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html)
        */
        fun notification(init: Notification.() -> Unit = {}): Notification {
            return Notification().also {
                it.init()
            }
        }
        /**
        * [NotificationWithSubscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html)
        */
        fun notificationWithSubscribers(init: NotificationWithSubscribers.() -> Unit = {}): NotificationWithSubscribers {
            return NotificationWithSubscribers().also {
                it.init()
            }
        }
        /**
        * [Spend](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html)
        */
        fun spend(init: Spend.() -> Unit = {}): Spend {
            return Spend().also {
                it.init()
            }
        }
        /**
        * [Subscriber](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html)
        */
        fun subscriber(init: Subscriber.() -> Unit = {}): Subscriber {
            return Subscriber().also {
                it.init()
            }
        }
        /**
        * [TimePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html)
        */
        fun timePeriod(init: TimePeriod.() -> Unit = {}): TimePeriod {
            return TimePeriod().also {
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
    class BudgetData {
            /**
         * [budgetLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
         *
         * _Required_: no
         *
         * _Type_: Spend
         */
        var budgetLimit: Any? = null

        /**
         * [budgetLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
         *
         * _Required_: no
         *
         * _Type_: Spend
         */
        fun budgetLimit(value: Spend) {
          this.budgetLimit = value
        }
        
        /**
         * [budgetLimit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
         *
         * _Required_: no
         *
         * _Type_: Spend
         */
        fun budgetLimit(value: IntrinsicFunction) {
          this.budgetLimit = value
        }

        /**
         * [budgetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var budgetName: Any? = null

        /**
         * [budgetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun budgetName(value: String) {
          this.budgetName = value
        }
        
        /**
         * [budgetName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun budgetName(value: IntrinsicFunction) {
          this.budgetName = value
        }

        /**
         * [budgetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var budgetType: Any? = null

        /**
         * [budgetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun budgetType(value: String) {
          this.budgetType = value
        }
        
        /**
         * [budgetType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun budgetType(value: IntrinsicFunction) {
          this.budgetType = value
        }

        /**
         * [costFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        var costFilters: Any? = null

        /**
         * [costFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun costFilters(value: Json) {
          this.costFilters = value
        }
        
        /**
         * [costFilters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun costFilters(value: IntrinsicFunction) {
          this.costFilters = value
        }

        /**
         * [costTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
         *
         * _Required_: no
         *
         * _Type_: CostTypes
         */
        var costTypes: Any? = null

        /**
         * [costTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
         *
         * _Required_: no
         *
         * _Type_: CostTypes
         */
        fun costTypes(value: CostTypes) {
          this.costTypes = value
        }
        
        /**
         * [costTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
         *
         * _Required_: no
         *
         * _Type_: CostTypes
         */
        fun costTypes(value: IntrinsicFunction) {
          this.costTypes = value
        }

        /**
         * [timePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
         *
         * _Required_: no
         *
         * _Type_: TimePeriod
         */
        var timePeriod: Any? = null

        /**
         * [timePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
         *
         * _Required_: no
         *
         * _Type_: TimePeriod
         */
        fun timePeriod(value: TimePeriod) {
          this.timePeriod = value
        }
        
        /**
         * [timePeriod](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
         *
         * _Required_: no
         *
         * _Type_: TimePeriod
         */
        fun timePeriod(value: IntrinsicFunction) {
          this.timePeriod = value
        }

        /**
         * [timeUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var timeUnit: Any? = null

        /**
         * [timeUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeUnit(value: String) {
          this.timeUnit = value
        }
        
        /**
         * [timeUnit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun timeUnit(value: IntrinsicFunction) {
          this.timeUnit = value
        }

    }

    @CloudFormationMarker
    class CostTypes {
            /**
         * [includeCredit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeCredit: Any? = null

        /**
         * [includeCredit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeCredit(value: Boolean) {
          this.includeCredit = value
        }
        
        /**
         * [includeCredit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeCredit(value: IntrinsicFunction) {
          this.includeCredit = value
        }

        /**
         * [includeDiscount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeDiscount: Any? = null

        /**
         * [includeDiscount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeDiscount(value: Boolean) {
          this.includeDiscount = value
        }
        
        /**
         * [includeDiscount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeDiscount(value: IntrinsicFunction) {
          this.includeDiscount = value
        }

        /**
         * [includeOtherSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeOtherSubscription: Any? = null

        /**
         * [includeOtherSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeOtherSubscription(value: Boolean) {
          this.includeOtherSubscription = value
        }
        
        /**
         * [includeOtherSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeOtherSubscription(value: IntrinsicFunction) {
          this.includeOtherSubscription = value
        }

        /**
         * [includeRecurring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeRecurring: Any? = null

        /**
         * [includeRecurring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeRecurring(value: Boolean) {
          this.includeRecurring = value
        }
        
        /**
         * [includeRecurring](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeRecurring(value: IntrinsicFunction) {
          this.includeRecurring = value
        }

        /**
         * [includeRefund](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeRefund: Any? = null

        /**
         * [includeRefund](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeRefund(value: Boolean) {
          this.includeRefund = value
        }
        
        /**
         * [includeRefund](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeRefund(value: IntrinsicFunction) {
          this.includeRefund = value
        }

        /**
         * [includeSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeSubscription: Any? = null

        /**
         * [includeSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeSubscription(value: Boolean) {
          this.includeSubscription = value
        }
        
        /**
         * [includeSubscription](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeSubscription(value: IntrinsicFunction) {
          this.includeSubscription = value
        }

        /**
         * [includeSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeSupport: Any? = null

        /**
         * [includeSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeSupport(value: Boolean) {
          this.includeSupport = value
        }
        
        /**
         * [includeSupport](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeSupport(value: IntrinsicFunction) {
          this.includeSupport = value
        }

        /**
         * [includeTax](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeTax: Any? = null

        /**
         * [includeTax](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeTax(value: Boolean) {
          this.includeTax = value
        }
        
        /**
         * [includeTax](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeTax(value: IntrinsicFunction) {
          this.includeTax = value
        }

        /**
         * [includeUpfront](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeUpfront: Any? = null

        /**
         * [includeUpfront](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeUpfront(value: Boolean) {
          this.includeUpfront = value
        }
        
        /**
         * [includeUpfront](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeUpfront(value: IntrinsicFunction) {
          this.includeUpfront = value
        }

        /**
         * [useAmortized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var useAmortized: Any? = null

        /**
         * [useAmortized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useAmortized(value: Boolean) {
          this.useAmortized = value
        }
        
        /**
         * [useAmortized](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useAmortized(value: IntrinsicFunction) {
          this.useAmortized = value
        }

        /**
         * [useBlended](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var useBlended: Any? = null

        /**
         * [useBlended](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useBlended(value: Boolean) {
          this.useBlended = value
        }
        
        /**
         * [useBlended](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useBlended(value: IntrinsicFunction) {
          this.useBlended = value
        }

    }

    @CloudFormationMarker
    class Notification {
            /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var comparisonOperator: Any? = null

        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: String) {
          this.comparisonOperator = value
        }
        
        /**
         * [comparisonOperator](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun comparisonOperator(value: IntrinsicFunction) {
          this.comparisonOperator = value
        }

        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var notificationType: Any? = null

        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun notificationType(value: String) {
          this.notificationType = value
        }
        
        /**
         * [notificationType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun notificationType(value: IntrinsicFunction) {
          this.notificationType = value
        }

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var threshold: Any? = null

        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: Double) {
          this.threshold = value
        }
        
        /**
         * [threshold](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun threshold(value: IntrinsicFunction) {
          this.threshold = value
        }

        /**
         * [thresholdType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var thresholdType: Any? = null

        /**
         * [thresholdType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thresholdType(value: String) {
          this.thresholdType = value
        }
        
        /**
         * [thresholdType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun thresholdType(value: IntrinsicFunction) {
          this.thresholdType = value
        }

    }

    @CloudFormationMarker
    class NotificationWithSubscribers {
            /**
         * [notification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
         *
         * _Required_: yes
         *
         * _Type_: Notification
         */
        var notification: Any? = null

        /**
         * [notification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
         *
         * _Required_: yes
         *
         * _Type_: Notification
         */
        fun notification(value: Notification) {
          this.notification = value
        }
        
        /**
         * [notification](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
         *
         * _Required_: yes
         *
         * _Type_: Notification
         */
        fun notification(value: IntrinsicFunction) {
          this.notification = value
        }

        /**
         * [subscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
         *
         * _Required_: yes
         *
         * _Type_: List<Subscriber>
         */
        var subscribers: Any? = null

        /**
         * [subscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
         *
         * _Required_: yes
         *
         * _Type_: List<Subscriber>
         */
        fun subscribers(value: List<Subscriber>) {
          this.subscribers = value
        }
        
        /**
         * [subscribers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
         *
         * _Required_: yes
         *
         * _Type_: List<Subscriber>
         */
        fun subscribers(vararg value: IntrinsicFunction) {
          this.subscribers = value
        }

    }

    @CloudFormationMarker
    class Spend {
            /**
         * [amount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        var amount: Any? = null

        /**
         * [amount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun amount(value: Double) {
          this.amount = value
        }
        
        /**
         * [amount](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
         *
         * _Required_: yes
         *
         * _Type_: Double
         */
        fun amount(value: IntrinsicFunction) {
          this.amount = value
        }

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var unit: Any? = null

        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun unit(value: String) {
          this.unit = value
        }
        
        /**
         * [unit](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun unit(value: IntrinsicFunction) {
          this.unit = value
        }

    }

    @CloudFormationMarker
    class Subscriber {
            /**
         * [address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var address: Any? = null

        /**
         * [address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun address(value: String) {
          this.address = value
        }
        
        /**
         * [address](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun address(value: IntrinsicFunction) {
          this.address = value
        }

        /**
         * [subscriptionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var subscriptionType: Any? = null

        /**
         * [subscriptionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subscriptionType(value: String) {
          this.subscriptionType = value
        }
        
        /**
         * [subscriptionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun subscriptionType(value: IntrinsicFunction) {
          this.subscriptionType = value
        }

    }

    @CloudFormationMarker
    class TimePeriod {
            /**
         * [end](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var end: Any? = null

        /**
         * [end](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun end(value: String) {
          this.end = value
        }
        
        /**
         * [end](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun end(value: IntrinsicFunction) {
          this.end = value
        }

        /**
         * [start](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var start: Any? = null

        /**
         * [start](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun start(value: String) {
          this.start = value
        }
        
        /**
         * [start](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun start(value: IntrinsicFunction) {
          this.start = value
        }

    }

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
