package ktformation

import com.fasterxml.jackson.annotation.JsonProperty
import ktformation.transform.AWSInclude

@DslMarker
annotation class CloudFormationMarker

@CloudFormationMarker
data class CloudFormation(
        @field:JsonProperty("AWSTemplateFormatVersion")
        val awsTemplateFormatVersion: String = "2010-09-09",

        var description: String? = null,

        var metadata: Metadata = Metadata(),

        var parameters: Parameters = Parameters(),

        var mappings: Mappings = Mappings(),

        var conditions: Conditions = Conditions(),

        var transform: Transform? = null,

        var resources: Resources = Resources(),

        var outputs: Outputs = Outputs()
) {
    fun metadata(init: Metadata.() -> Unit): Metadata {
        return Metadata().also {
            it.init()
            metadata.putAll(it)
        }
    }

    fun parameters(init: Parameters.() -> Unit): Parameters {
        return Parameters().also {
            it.init()
            parameters.putAll(it)
        }
    }

    fun mappings(init: Mappings.() -> Unit): Mappings {
        return Mappings().also {
            it.init()
            mappings.putAll(it)
        }
    }

    fun conditions(init: Conditions.() -> Unit): Conditions {
        return Conditions().also {
            it.init()
            conditions.putAll(it)
        }
    }

    fun resources(init: Resources.() -> Unit): Resources {
        return Resources().also {
            it.init()
            resources.putAll(it)
        }
    }

    fun outputs(init: Outputs.() -> Unit): Outputs {
        return Outputs().also {
            it.init()
            outputs.putAll(it)
        }
    }
}

/**
 * String | [AWSInclude]
 */
typealias Transform = Any

fun cloudFormation(block: CloudFormation.() -> Unit): CloudFormation = CloudFormation().apply(block)
