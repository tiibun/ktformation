
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class JdbcTarget(
            /**
             * [ConnectionName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-connectionname)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val connectionName: String? = null,
            /**
             * [Exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-exclusions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val exclusions: List<String>? = null,
            /**
             * [Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-jdbctarget.html#cfn-glue-crawler-jdbctarget-path)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val path: String? = null
    )

    class S3Target(
            /**
             * [Exclusions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-exclusions)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val exclusions: List<String>? = null,
            /**
             * [Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-s3target.html#cfn-glue-crawler-s3target-path)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val path: String? = null
    )

    class Schedule(
            /**
             * [ScheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val scheduleExpression: String? = null
    )

    class SchemaChangePolicy(
            /**
             * [DeleteBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-deletebehavior)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val deleteBehavior: String? = null,
            /**
             * [UpdateBehavior](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schemachangepolicy.html#cfn-glue-crawler-schemachangepolicy-updatebehavior)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val updateBehavior: String? = null
    )

    class Targets(
            /**
             * [JdbcTargets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-jdbctargets)
             *
             * _Required_: no
             *
             * _Type_: List<JdbcTarget>
             */
            val jdbcTargets: List<JdbcTarget>? = null,
            /**
             * [S3Targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-targets.html#cfn-glue-crawler-targets-s3targets)
             *
             * _Required_: no
             *
             * _Type_: List<S3Target>
             */
            val s3Targets: List<S3Target>? = null
    )

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
