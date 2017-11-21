import ktformation.generate.Property

infix fun Boolean?.then(then: Any) = if (this == true) then else ""
fun <T, R> Iterable<T>?.join(transform: (T) -> R): String = this?.map(transform)?.joinToString("") ?: ""
val name = bindings["name"] as String
val basename = bindings["basename"] as String
val property = bindings["property"] as Property
val typesJoined = bindings["typesJoined"] as String
fun convertToGoType(pt: String) =
		when (pt) {
			"String" -> "string"
			"Long" -> "int64"
			"Integer" -> "int"
			"Double" -> "float64"
			"Boolean" -> "bool"
			"Timestamp" -> "string"
			"Json" -> "interface{}"
			else -> pt
		}
"""package cloudformation

import (
	"encoding/json"
	${(property.types?.isNotEmpty() ?: false ||
		property.itemTypes?.isNotEmpty() ?: false ||
		property.primitiveItemTypes?.isNotEmpty() ?: false) then """
	"github.com/mitchellh/mapstructure"
	"""}
)

// ${name} is a helper struct that can hold either a ${typesJoined} value
type ${name} struct {
	${property.primitiveTypes.join { type ->
	"""
	$type *${convertToGoType(type)}
	"""
}}
	${property.primitiveItemTypes.join { type ->
	"""
	${type}Array *[]${convertToGoType(type)}
	"""
}}
	${property.types.join { type ->
	"""
	$type *${basename}_$type
	"""
}}
	${property.itemTypes.join { type ->
	"""
	${type}Array *[]${basename}_${type}
	"""
}}
}

func (r ${name}) value() interface{} {

	${property.primitiveTypes.join { type ->
	"""
	if r.${type} != nil {
		return r.${type}
	}
	"""
}}
	${property.primitiveItemTypes.join { type ->
	"""
	if r.${type}Array != nil {
		return r.${type}Array
	}
	"""
}}
	${property.types.join { type ->
	"""
	if r.${type} != nil {
		return r.${type}
	}
	"""
}}
	${property.itemTypes.join { type ->
	"""
	if r.${type}Array != nil {
		return r.${type}Array
	}
	"""
}}

	return nil

}

func (r *${name}) MarshalJSON() ([]byte, error) {
	return json.Marshal(r.value())
}

// Hook into the marshaller
func (r *${name}) UnmarshalJSON(b []byte) error {

	// Unmarshal into interface{} to check it's type
	var typecheck interface{}
	if err := json.Unmarshal(b, &typecheck); err != nil {
		return err
	}

	switch val := typecheck.(type) {

		${property.primitiveTypes.join { type ->
	"""
		case ${convertToGoType(type)}:
			r.${type} = &val
		"""
}}

		${property.primitiveItemTypes.join { type ->
	"""
		case []${convertToGoType(type)}:
			r.${type}Array = &val
		"""
}}

		case map[string]interface{}:
		${property.types.join { type ->
	"""
			mapstructure.Decode(val, &r.${type})
		"""
}}

		case []interface{}:
		${property.primitiveItemTypes.join { type ->
	"""
			mapstructure.Decode(val, &r.${type}Array)
		"""
}}
		${property.itemTypes.join { type ->
	"""
			mapstructure.Decode(val, &r.${type}Array)
		"""
}}

	}

	return nil
}
"""