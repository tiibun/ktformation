package ktformation.policy

import ktformation.Json

class PolicyDocument(version: String = "2012-10-17", id: String? = null, statement: List<Statement>) : Json() {

    init {
        put("Version", version)
        if (id != null) put("Id", id)
        put("Statement", statement)
    }
}

data class Statement(val sid: String? = null,
                     val principal: Any? = null, // "*" | Map<String, List<String>>
                     val notPrincipal: Any? = null, // "*" | Map<String, List<String>>
                     val effect: Effect,
                     val action: Any, // "*" | String | List<String>
                     val notAction: Any? = null, // "*" | String | List<String>
                     val resource: Any? = null, // "*" | String | List<String>
                     val notResource: Any? = null, // "*" | String | List<String>
                     val condition: Any? = null)

enum class Effect(val value: String) {
    ALLOW("Allow"),
    DENY("Deny");

    override fun toString(): String = value
}
