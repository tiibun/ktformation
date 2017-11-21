package ktformation.generate

/**
 * filename takes a resource or property name (e.g. AWS::CloudFront::Distribution.Restrictions)
 * and returns an appropriate filename for the generated struct (e.g. aws-cloudfront-distribution_restrictions.go)
 */
fun filename(input: String): String {

    // Convert to lowercase
    return input.toLowerCase()

            // Replace :: with -
            .replace("::", "-")

            // Replace . with _
            .replace(".", "_") +

            // Suffix with .go
            ".go"
}

/**
 * structName takes a resource or property name (e.g. AWS::CloudFront::Distribution.Restrictions)
 * and returns an appropriate struct name for the generated struct (e.g. AWSCloudfrontDistributionRestrictions)
 */
fun structName(input: String): String {

    // Remove ::
    return input.replace("::", "")

            // Remove .
            .replace(".", "_")

}
