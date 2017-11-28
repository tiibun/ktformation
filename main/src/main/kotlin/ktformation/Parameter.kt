package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore

@CloudFormationMarker
data class Parameter(@JsonIgnore val name: String) {
    var type: ParameterType = ParameterType.STRING
    var allowedPattern: String? = null
    var allowedValues: Any? = null
    var constraintDescription: String? = null
    var default: Any? = null
    var description: String? = null
    var maxLength: Int? = null
    var maxValue: Number? = null
    var minLength: Int? = null
    var minValue: Number? = null
    var noEcho: Boolean? = null

    fun type(type: ParameterType) {
        this.type = type
    }

    fun allowedPattern(allowedPattern: String) {
        this.allowedPattern = allowedPattern
    }

    fun allowedValues(allowedValues: Any) {
        this.allowedValues = allowedValues
    }

    fun constraintDescription(constraintDescription: String) {
        this.constraintDescription = constraintDescription
    }

    fun default(default: Any) {
        this.default = default
    }

    fun description(description: String) {
        this.description = description
    }

    fun maxLength(maxLength: Int) {
        this.maxLength = maxLength
    }

    fun maxValue(maxValue: Number) {
        this.maxValue = maxValue
    }

    fun minLength(minLength: Int) {
        this.minLength = minLength
    }

    fun minValue(minValue: Number) {
        this.minValue = minValue
    }

    fun noEcho(noEcho: Boolean) {
        this.noEcho = noEcho
    }
}


enum class ParameterType(private val typeName: String) {
    NUMBER("Number"),
    STRING("String"),
    LIST_NUMBER("List<Number>"),
    COMMA_DELIMITED_LIST("CommaDelimitedList");

    override fun toString() = typeName
}

@CloudFormationMarker
data class Parameters(private val map: MutableMap<String, Parameter> = linkedMapOf())
    : MutableMap<String, Parameter> by map {

    fun parameter(name: String, init: Parameter.() -> Unit): Parameter {
        return Parameter(name).also {
            it.init()
            put(name, it)
        }
    }
}
