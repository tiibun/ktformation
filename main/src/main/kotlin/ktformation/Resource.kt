package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty

abstract class ResourceProperties {
    @JsonProperty("Fn::Transform")
    var fnTransform: MutableList<AWSInclude> = arrayListOf()

    fun fnTransform(vararg awsInclude: AWSInclude) {
        fnTransform.addAll(awsInclude)
    }
}

abstract class Resource<T : ResourceProperties>(
        @JsonIgnore val logicalId: String,
        val type: String,
        var properties: T? = null,
        var creationPolicy: CreationPolicy? = null,
        var deletionPolicy: Any? = null, // TODO
        var dependsOn: Array<String>? = null,
        var metadata: Any? = null,
        var updatePolicy: UpdatePolicy? = null) {

    fun creationPolicy(init: CreationPolicy.() -> Unit): CreationPolicy {
        return CreationPolicy().also {
            it.init()
            creationPolicy = it
        }
    }

    class CreationPolicy(
            var autoScalingCreationPolicy: AutoScalingCreationPolicy? = null,
            var resourceSignal: ResourceSignal? = null) {

        class AutoScalingCreationPolicy(var minSuccessfulInstancesPercent: Int? = null)

        class ResourceSignal(var count: Int? = null, var timeout: String? = null)

        fun autoScalingCreationPolicy(init: AutoScalingCreationPolicy.() -> Unit): AutoScalingCreationPolicy {
            return AutoScalingCreationPolicy().also {
                it.init()
                autoScalingCreationPolicy = it
            }
        }

        fun resourceSignal(init: ResourceSignal.() -> Unit): ResourceSignal {
            return ResourceSignal().also {
                it.init()
                resourceSignal = it
            }
        }
    }

    interface UpdatePolicy
}

@CloudFormationMarker
data class Resources(private val map: MutableMap<String, Any> = linkedMapOf())
    : MutableMap<String, Any> by map {

    fun fnTransform(vararg awsInclude: AWSInclude) {
        put("Fn::Transform", awsInclude)
    }
}

typealias S3LocationOrString = Any

typealias IAMPolicyDocumentOrString = Any

typealias S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent = Any
