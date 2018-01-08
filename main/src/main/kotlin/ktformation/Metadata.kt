package ktformation

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * String | CloudFormationMetadata
 */
typealias Metadatum = Any

interface CloudFormationMetadata

/**
 * [AWS::CloudFormation::Init - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-init.html)
 */
@CloudFormationMarker
class AWSCloudFormationInit(private val map: MutableMap<String, Metadatum> = linkedMapOf())
    : CloudFormationMetadata, MutableMap<String, Metadatum> by map {

    fun configSets(configSets: Map<String, List<*>>) {
        put("configSets", configSets)
    }
}

/**
 * [AWS::CloudFormation::Interface - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-interface.html)
 */
@CloudFormationMarker
class AWSCloudFormationInterface(
        var parameterGroups: MutableList<ParameterGroup> = arrayListOf(),
        var parameterLabels: MutableMap<String, Label> = linkedMapOf()
) : CloudFormationMetadata {

    /**
     * [AWS CloudFormation Interface ParameterGroup - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-interface-parametergroup.html)
     */
    class ParameterGroup(
            var label: Label? = null,
            var parameters: MutableList<String> = arrayListOf()
    ) {
        fun label(default: String) {
            label = Label(default)
        }

        fun parameters(vararg args: String) {
            parameters.addAll(args)
        }
    }

    /**
     * [AWS CloudFormation Interface Label - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-interface-label.html)
     */
    class Label(@field:JsonProperty("default") val default: String)

    fun parameterGroups(vararg inits: ParameterGroup.() -> Unit) {
        inits.forEach {
            parameterGroups.add(ParameterGroup().apply(it))
        }
    }

    fun parameterLabels(vararg labelMaps: Pair<String, String>) {
        labelMaps.forEach {
            parameterLabels[it.first] = Label(it.second)
        }
    }
}

/**
 * [Why Use AWS CloudFormation Designer? - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/working-with-templates-cfn-designer-why.html)
 */
@CloudFormationMarker
class AWSCloudFormationDesigner(private val map: MutableMap<String, Any> = linkedMapOf())
    : MutableMap<String, Any> by map, CloudFormationMetadata

@CloudFormationMarker
data class Metadata(private val map: MutableMap<String, Metadatum> = linkedMapOf())
    : MutableMap<String, Metadatum> by map {

    fun awsCloudFormationInit(init: AWSCloudFormationInit.() -> Unit): AWSCloudFormationInit {
        return AWSCloudFormationInit().also {
            put("AWS::CloudFormation::Init", it.apply(init))
        }
    }

    fun awsCloudFormationInterface(init: AWSCloudFormationInterface.() -> Unit): AWSCloudFormationInterface {
        return AWSCloudFormationInterface().also {
            put("AWS::CloudFormation::Interface", it.apply(init))
        }
    }

    fun awsCloudFormationDesigner(init: AWSCloudFormationDesigner.() -> Unit): AWSCloudFormationDesigner {
        return AWSCloudFormationDesigner().also {
            put("AWS::CloudFormation::Designer", it.apply(init))
        }
    }
}
