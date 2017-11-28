package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore

class Mapping(@JsonIgnore val name: String,
              private val mapping: Map<String, Map<String, *>> = LinkedHashMap())
    : Map<String, Map<String, *>> by mapping

@CloudFormationMarker
data class Mappings(private val map: MutableMap<String, Mapping> = linkedMapOf())
    : MutableMap<String, Mapping> by map {

    fun mapping(name: String, vararg pairs: Pair<String, Map<String, *>>): Mapping {
        return Mapping(name, mapOf(*pairs)).also { put(name, it) }
    }

    fun mapping(name: String, mapping: Map<String, Map<String, *>>): Mapping {
        return Mapping(name, mapping).also { put(name, it) }
    }
}
