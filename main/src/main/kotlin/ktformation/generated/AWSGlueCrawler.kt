
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Crawler - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
 */
@CloudFormationMarker
class AWSGlueCrawler(logicalId: String) : Resource<AWSGlueCrawler.Properties>(logicalId, "AWS::Glue::Crawler") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [classifiers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var classifiers: Any? = null

        /**
         * [classifiers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun classifiers(value: List<String>) {
          this.classifiers = value
        }
        
        /**
         * [classifiers](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun classifiers(vararg value: IntrinsicFunction) {
          this.classifiers = value
        }

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var databaseName: Any? = null

        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: String) {
          this.databaseName = value
        }
        
        /**
         * [databaseName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun databaseName(value: IntrinsicFunction) {
          this.databaseName = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var role: Any? = null

        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: String) {
          this.role = value
        }
        
        /**
         * [role](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun role(value: IntrinsicFunction) {
          this.role = value
        }

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
         *
         * _Required_: no
         *
         * _Type_: Schedule
         */
        @JvmField
        var schedule: Any? = null

        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
         *
         * _Required_: no
         *
         * _Type_: Schedule
         */
        fun schedule(value: Schedule) {
          this.schedule = value
        }
        
        /**
         * [schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
         *
         * _Required_: no
         *
         * _Type_: Schedule
         */
        fun schedule(value: IntrinsicFunction) {
          this.schedule = value
        }

        /**
         * [schemaChangePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
         *
         * _Required_: no
         *
         * _Type_: SchemaChangePolicy
         */
        @JvmField
        var schemaChangePolicy: Any? = null

        /**
         * [schemaChangePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
         *
         * _Required_: no
         *
         * _Type_: SchemaChangePolicy
         */
        fun schemaChangePolicy(value: SchemaChangePolicy) {
          this.schemaChangePolicy = value
        }
        
        /**
         * [schemaChangePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
         *
         * _Required_: no
         *
         * _Type_: SchemaChangePolicy
         */
        fun schemaChangePolicy(value: IntrinsicFunction) {
          this.schemaChangePolicy = value
        }

        /**
         * [tablePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var tablePrefix: Any? = null

        /**
         * [tablePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tablePrefix(value: String) {
          this.tablePrefix = value
        }
        
        /**
         * [tablePrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun tablePrefix(value: IntrinsicFunction) {
          this.tablePrefix = value
        }

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
         *
         * _Required_: yes
         *
         * _Type_: Targets
         */
        @JvmField
        var targets: Any? = null

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
         *
         * _Required_: yes
         *
         * _Type_: Targets
         */
        fun targets(value: Targets) {
          this.targets = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
         *
         * _Required_: yes
         *
         * _Type_: Targets
         */
        fun targets(value: IntrinsicFunction) {
          this.targets = value
        }

        /**
        * [JdbcTarget](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html)
        */
        fun jdbcTarget(init: JdbcTarget.() -> Unit = {}): JdbcTarget {
            return JdbcTarget().also {
                it.init()
            }
        }
        /**
        * [S3Target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html)
        */
        fun s3Target(init: S3Target.() -> Unit = {}): S3Target {
            return S3Target().also {
                it.init()
            }
        }
        /**
        * [Schedule](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html)
        */
        fun schedule(init: Schedule.() -> Unit = {}): Schedule {
            return Schedule().also {
                it.init()
            }
        }
        /**
        * [SchemaChangePolicy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html)
        */
        fun schemaChangePolicy(init: SchemaChangePolicy.() -> Unit = {}): SchemaChangePolicy {
            return SchemaChangePolicy().also {
                it.init()
            }
        }
        /**
        * [Targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html)
        */
        fun targets(init: Targets.() -> Unit = {}): Targets {
            return Targets().also {
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
    class JdbcTarget {
            /**
         * [connectionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var connectionName: Any? = null

        /**
         * [connectionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionName(value: String) {
          this.connectionName = value
        }
        
        /**
         * [connectionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun connectionName(value: IntrinsicFunction) {
          this.connectionName = value
        }

        /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var exclusions: Any? = null

        /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exclusions(value: List<String>) {
          this.exclusions = value
        }
        
        /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exclusions(vararg value: IntrinsicFunction) {
          this.exclusions = value
        }

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }

    }

    @CloudFormationMarker
    class S3Target {
            /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var exclusions: Any? = null

        /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exclusions(value: List<String>) {
          this.exclusions = value
        }
        
        /**
         * [exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun exclusions(vararg value: IntrinsicFunction) {
          this.exclusions = value
        }

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var path: Any? = null

        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: String) {
          this.path = value
        }
        
        /**
         * [path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun path(value: IntrinsicFunction) {
          this.path = value
        }

    }

    @CloudFormationMarker
    class Schedule {
            /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var scheduleExpression: Any? = null

        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: String) {
          this.scheduleExpression = value
        }
        
        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: IntrinsicFunction) {
          this.scheduleExpression = value
        }

    }

    @CloudFormationMarker
    class SchemaChangePolicy {
            /**
         * [deleteBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var deleteBehavior: Any? = null

        /**
         * [deleteBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deleteBehavior(value: String) {
          this.deleteBehavior = value
        }
        
        /**
         * [deleteBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun deleteBehavior(value: IntrinsicFunction) {
          this.deleteBehavior = value
        }

        /**
         * [updateBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var updateBehavior: Any? = null

        /**
         * [updateBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun updateBehavior(value: String) {
          this.updateBehavior = value
        }
        
        /**
         * [updateBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun updateBehavior(value: IntrinsicFunction) {
          this.updateBehavior = value
        }

    }

    @CloudFormationMarker
    class Targets {
            /**
         * [jdbcTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
         *
         * _Required_: no
         *
         * _Type_: List<JdbcTarget>
         */
        var jdbcTargets: Any? = null

        /**
         * [jdbcTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
         *
         * _Required_: no
         *
         * _Type_: List<JdbcTarget>
         */
        fun jdbcTargets(value: List<JdbcTarget>) {
          this.jdbcTargets = value
        }
        
        /**
         * [jdbcTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
         *
         * _Required_: no
         *
         * _Type_: List<JdbcTarget>
         */
        fun jdbcTargets(vararg value: IntrinsicFunction) {
          this.jdbcTargets = value
        }

        /**
         * [s3Targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
         *
         * _Required_: no
         *
         * _Type_: List<S3Target>
         */
        var s3Targets: Any? = null

        /**
         * [s3Targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
         *
         * _Required_: no
         *
         * _Type_: List<S3Target>
         */
        fun s3Targets(value: List<S3Target>) {
          this.s3Targets = value
        }
        
        /**
         * [s3Targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
         *
         * _Required_: no
         *
         * _Type_: List<S3Target>
         */
        fun s3Targets(vararg value: IntrinsicFunction) {
          this.s3Targets = value
        }

    }

}

/**
 * [AWS::Glue::Crawler - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
 */
fun Resources.awsGlueCrawler(logicalId: String, init: AWSGlueCrawler.() -> Unit = {}): AWSGlueCrawler {
    return AWSGlueCrawler(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
