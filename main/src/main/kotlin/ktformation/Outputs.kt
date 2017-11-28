package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore

@CloudFormationMarker
data class Outputs(private val map: MutableMap<String, Output> = linkedMapOf())
    : MutableMap<String, Output> by map {

    fun output(name: String, init: Output.() -> Unit): Output {
        return Output(name).also {
            it.init()
            put(name, it)
        }
    }
}

data class Output(@JsonIgnore val name: String) {
    var description: Any? = null
    lateinit var value: Any
    var export: Map<String, Any>? = null

    fun description(description: String) {
        this.description = description
    }

    fun value(value: String) {
        this.value = value
    }

    fun value(value: Resource<*>) {
        this.value = value.ref()
    }

    fun value(value: IntrinsicFunction) {
        this.value = value
    }

    fun export(name: Any) {
        this.export = mapOf("Name" to name)
    }
}
