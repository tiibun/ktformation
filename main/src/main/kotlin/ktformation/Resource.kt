package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore

interface ResourceProperties

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
data class Resources(private val map: MutableMap<String, Resource<*>> = linkedMapOf())
    : MutableMap<String, Resource<*>> by map

typealias S3LocationOrString = Any

typealias IAMPolicyDocumentOrString = Any

typealias S3EventSNSEventKinesisEventDynamoDBEventApiEventScheduleEventCloudWatchEventEventIoTRuleEventAlexaSkillEvent = Any
