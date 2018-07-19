
package ktformation.generated

import ktformation.*

/**
 * [AWS::Inspector::ResourceGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html)
 */
@CloudFormationMarker
class AWSInspectorResourceGroup(logicalId: String) : Resource<AWSInspectorResourceGroup.Properties>(logicalId, "AWS::Inspector::ResourceGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [resourceGroupTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
         *
         * _Required_: yes
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var resourceGroupTags: Any? = null

        /**
         * [resourceGroupTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
         *
         * _Required_: yes
         *
         * _Type_: List<Tag>
         */
        fun resourceGroupTags(value: List<Tag>) {
          this.resourceGroupTags = value
        }
        
        /**
         * [resourceGroupTags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
         *
         * _Required_: yes
         *
         * _Type_: List<Tag>
         */
        fun resourceGroupTags(vararg value: IntrinsicFunction) {
          this.resourceGroupTags = value
        }


    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }



}

/**
 * [AWS::Inspector::ResourceGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html)
 */
fun Resources.awsInspectorResourceGroup(logicalId: String, init: AWSInspectorResourceGroup.() -> Unit = {}): AWSInspectorResourceGroup {
    return AWSInspectorResourceGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
