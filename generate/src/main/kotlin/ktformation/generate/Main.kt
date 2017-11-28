package ktformation.generate

fun main(args: Array<String>) {

    println("GoFormation Resource Generator")

    val cloudformationSpec = "https://d1uauaxba7bl26.cloudfront.net/latest/gzip/CloudFormationResourceSpecification.json"

    val otherSpecs = mapOf(
            "sam" to "sam-2016-10-31.json"
    )

    val rg = newResourceGenerator(cloudformationSpec, otherSpecs)

    rg.generate()

    if (rg.results.updatedResources.isNotEmpty()) {
        println()
        println("Updated the following AWS CloudFormation resources:")
        println()
        println()
        for (updated in rg.results.updatedResources) {
            println(" - $updated")
        }
        println()
    }

    println("Processed ${rg.results.processedCount} resources")
}
