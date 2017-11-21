infix fun Boolean?.then(then: Any) = if (this == true) then else ""
val name = bindings["name"] as String
val structName = bindings["structName"] as String
val basename = bindings["basename"] as String
val isCustomProperty = bindings["isCustomProperty"] as Boolean
val resource = bindings["resource"] as ktformation.generate.Resource
"""
package cloudformation
${!isCustomProperty then """
import (
	"encoding/json"
	"errors"
	"fmt"
)
"""}
// ${structName} AWS CloudFormation Resource (${name})
// See: ${resource.documentation}
type ${structName} struct {
${resource.properties.map { (name, property) ->
    """
	// ${name} AWS CloudFormation Property
	// Required: ${property.required}
	// See: ${property.documentation}
	${name} ${(property.isPolymorphic() || property.isCustomType()) then "*"}${property.goType(basename, name)} `json:"${name},omitempty"`
"""
}.joinToString("")}}

// AWSCloudFormationType returns the AWS CloudFormation resource type
func (r *${structName}) AWSCloudFormationType() string {
	return "${name}"
}
${!isCustomProperty then """
// MarshalJSON is a custom JSON marshalling hook that embeds this object into
// an AWS CloudFormation JSON resource's 'Properties' field and adds a 'Type'.
func (r *${structName}) MarshalJSON() ([]byte, error) {
	type Properties ${structName}
	return json.Marshal(&struct {
		Type string
		${if (isCustomProperty) "Properties" else "Properties Properties"}
	}{
		Type: r.AWSCloudFormationType(),
		Properties: (Properties)(*r),
	})
}

// UnmarshalJSON is a custom JSON unmarshalling hook that strips the outer
// AWS CloudFormation resource object, and just keeps the 'Properties' field.
func (r *${structName}) UnmarshalJSON(b []byte) error {
	type Properties ${structName}
	res := &struct {
		Type string
		${if (isCustomProperty) "Properties" else "Properties *Properties"}
	}{}
	if err := json.Unmarshal(b, &res); err != nil {
		fmt.Printf("ERROR: %s\n", err)
		return err
	}

	// If the resource has no Properties set, it could be nil
	if res.Properties != nil {
		*r = ${structName}(*res.Properties)
	}
	
	return nil	
}

// GetAll${structName}Resources retrieves all ${structName} items from an AWS CloudFormation template
func (t *Template) GetAll${structName}Resources() map[string]${structName} {
	results := map[string]${structName}{}
	for name, untyped := range t.Resources {
		switch resource := untyped.(type) {
		case ${structName}:
			// We found a strongly typed resource of the correct type; use it
			results[name] = resource
		case map[string]interface{}:
			// We found an untyped resource (likely from JSON) which *might* be
			// the correct type, but we need to check it's 'Type' field
			if resType, ok := resource["Type"]; ok {
				if resType == "${name}" {
					// The resource is correct, unmarshal it into the results
					if b, err := json.Marshal(resource); err == nil {
						var result ${structName}
						if err := json.Unmarshal(b, &result); err == nil {
							results[name] = result
						}
					}
				}
			}
		}
	}
	return results
}

// Get${structName}WithName retrieves all ${structName} items from an AWS CloudFormation template
// whose logical ID matches the provided name. Returns an error if not found.
func (t *Template) Get${structName}WithName(name string) (${structName}, error) {
	if untyped, ok := t.Resources[name]; ok {
		switch resource := untyped.(type) {
		case ${structName}:
			// We found a strongly typed resource of the correct type; use it
			return resource, nil
		case map[string]interface{}:
			// We found an untyped resource (likely from JSON) which *might* be
			// the correct type, but we need to check it's 'Type' field
			if resType, ok := resource["Type"]; ok {
				if resType == "${name}" {
					// The resource is correct, unmarshal it into the results
					if b, err := json.Marshal(resource); err == nil {
						var result ${structName}
						if err := json.Unmarshal(b, &result); err == nil {
							return result, nil
						}
					}
				}
			}	
		}
	}
	return ${structName}{}, errors.New("resource not found")
}
"""}
""".trimIndent()