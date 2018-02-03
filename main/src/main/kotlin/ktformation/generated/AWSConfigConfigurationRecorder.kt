
package ktformation.generated

import ktformation.*

/**
 * [AWS::Config::ConfigurationRecorder - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
@CloudFormationMarker
class AWSConfigConfigurationRecorder(logicalId: String) : Resource<AWSConfigConfigurationRecorder.Properties>(logicalId, "AWS::Config::ConfigurationRecorder") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [recordingGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
         *
         * _Required_: no
         *
         * _Type_: RecordingGroup
         */
        @JvmField
        var recordingGroup: Any? = null

        /**
         * [recordingGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
         *
         * _Required_: no
         *
         * _Type_: RecordingGroup
         */
        fun recordingGroup(value: RecordingGroup) {
          this.recordingGroup = value
        }
        
        /**
         * [recordingGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-recordinggroup)
         *
         * _Required_: no
         *
         * _Type_: RecordingGroup
         */
        fun recordingGroup(value: IntrinsicFunction) {
          this.recordingGroup = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleARN: Any? = null

        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: String) {
          this.roleARN = value
        }
        
        /**
         * [roleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleARN(value: IntrinsicFunction) {
          this.roleARN = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class RecordingGroup(
            /**
             * [AllSupported](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val allSupported: Boolean? = null,
            /**
             * [IncludeGlobalResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val includeGlobalResourceTypes: Boolean? = null,
            /**
             * [ResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val resourceTypes: List<String>? = null
    )

}

/**
 * [AWS::Config::ConfigurationRecorder - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 */
fun Resources.awsConfigConfigurationRecorder(logicalId: String, init: AWSConfigConfigurationRecorder.() -> Unit = {}): AWSConfigConfigurationRecorder {
    return AWSConfigConfigurationRecorder(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
