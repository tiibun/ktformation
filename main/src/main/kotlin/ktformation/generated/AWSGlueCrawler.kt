
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Crawler - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html)
 */
@CloudFormationMarker
class AWSGlueCrawler(logicalId: String) : Resource<AWSGlueCrawler.Properties>(logicalId, "AWS::Glue::Crawler") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        @JvmField
        var classifiers: Any? = null

        fun classifiers(value: List<String>) {
          this.classifiers = value
        }
        fun classifiers(vararg value: IntrinsicFunction) {
  this.classifiers = value
}
        @JvmField
        var databaseName: Any? = null

        fun databaseName(value: String) {
          this.databaseName = value
        }
        fun databaseName(value: IntrinsicFunction) {
  this.databaseName = value
}
        @JvmField
        var description: Any? = null

        fun description(value: String) {
          this.description = value
        }
        fun description(value: IntrinsicFunction) {
  this.description = value
}
        @JvmField
        var name: Any? = null

        fun name(value: String) {
          this.name = value
        }
        fun name(value: IntrinsicFunction) {
  this.name = value
}
        @JvmField
        var role: Any? = null

        fun role(value: String) {
          this.role = value
        }
        fun role(value: IntrinsicFunction) {
  this.role = value
}
        @JvmField
        var schedule: Any? = null

        fun schedule(value: Schedule) {
          this.schedule = value
        }
        fun schedule(value: IntrinsicFunction) {
  this.schedule = value
}
        @JvmField
        var schemaChangePolicy: Any? = null

        fun schemaChangePolicy(value: SchemaChangePolicy) {
          this.schemaChangePolicy = value
        }
        fun schemaChangePolicy(value: IntrinsicFunction) {
  this.schemaChangePolicy = value
}
        @JvmField
        var tablePrefix: Any? = null

        fun tablePrefix(value: String) {
          this.tablePrefix = value
        }
        fun tablePrefix(value: IntrinsicFunction) {
  this.tablePrefix = value
}
        @JvmField
        var targets: Any? = null

        fun targets(value: Targets) {
          this.targets = value
        }
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
            val connectionName: String? = null,
            val exclusions: List<String>? = null,
            val path: String? = null
    )

    class S3Target(
            val exclusions: List<String>? = null,
            val path: String? = null
    )

    class Schedule(
            val scheduleExpression: String? = null
    )

    class SchemaChangePolicy(
            val deleteBehavior: String? = null,
            val updateBehavior: String? = null
    )

    class Targets(
            val jdbcTargets: List<JdbcTarget>? = null,
            val s3Targets: List<S3Target>? = null
    )

}

fun Resources.awsGlueCrawler(logicalId: String, init: AWSGlueCrawler.() -> Unit = {}): AWSGlueCrawler {
    return AWSGlueCrawler(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
