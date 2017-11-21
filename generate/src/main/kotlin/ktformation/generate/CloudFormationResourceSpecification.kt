package ktformation.generate

/**
 * CloudFormationResourceSpecification represents a resource specification document as
 * published by the AWS CloudFormation team
 *
 * @property resourceSpecificationVersion is the AWS CloudFormation Specification Version
 * The version format is majorVersion.minorVersion.patch, where each release increments
 * the version number. All resources have the same version number regardless of whether
 * the resource was updated.
 *
 * AWS CloudFormation increments the patch number when the service makes a backwards-compatible
 * bug fix, such as fixing a broken documentation link. When AWS CloudFormation adds resources
 * or properties that are backwards compatible, it increments the minor version number.
 * For example, later versions of a specification might add additional resource properties to
 * support new features of an AWS service.
 *
 * Backwards incompatible changes increment the major version number. A backwards incompatible
 *  change can result from a change in the resource specification, such as a name change to a
 * field, or a change to a resource, such as the making an optional resource property required.
 *
 * @property resourceSpecificationTransform is not a valid key in the official AWS CloudFormation
 * Specification.  It is used in this package to indicate the relevant Transform value to use
 * for the resources in this spec.
 *
 * @property resourceTypes The list of resources and information about each resource's properties, such as its property names,
 *  which properties are requires, and their update behavior. For more information, see
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-resource-specification-format.html#cfn-resource-specification-eval-resourcetype
 *
 * @property propertyTypes For resources that have properties within a property (also known as subproperties), a list of
 * subproperty specifications, such as which properties are required, the type of allowed value
 * for each property, and their update behavior. For more information, see Property Specification.
 */
data class CloudFormationResourceSpecification(
        val resourceSpecificationVersion: String?,
        val resourceSpecificationTransform: String?,
        val resourceTypes: MutableMap<String, Resource>,
        val propertyTypes: MutableMap<String, Resource>
)
