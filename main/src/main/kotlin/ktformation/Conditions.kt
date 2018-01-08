package ktformation

@CloudFormationMarker
data class Conditions(private val map: MutableMap<String, ConditionFunction> = linkedMapOf())
    : MutableMap<String, ConditionFunction> by map
