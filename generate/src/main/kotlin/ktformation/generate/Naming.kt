package ktformation.generate

/**
 * filename takes a resource or property name (e.g. AWS::CloudFront::Distribution.Restrictions)
 * and returns an appropriate filename for the generated class (e.g. AWSCloudfrontDistributionRestrictions.kt)
 */
fun filename(input: String): String = className(input) + ".kt"

/**
 * className takes a resource or property name (e.g. AWS::CloudFront::Distribution.Restrictions)
 * and returns an appropriate struct name for the generated struct (e.g. AWSCloudfrontDistributionRestrictions)
 */
fun className(input: String): String {

    // Remove ::
    return input.replace("::", "")

            // Remove .
            .replace(".", "_")

}
