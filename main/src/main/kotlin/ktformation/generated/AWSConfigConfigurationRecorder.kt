
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

        /**
        * [RecordingGroup](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html)
        */
        fun recordingGroup(init: RecordingGroup.() -> Unit = {}): RecordingGroup {
            return RecordingGroup().also {
                it.init()
            }
        }
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    @CloudFormationMarker
    class RecordingGroup {
            /**
         * [allSupported](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var allSupported: Any? = null

        /**
         * [allSupported](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allSupported(value: Boolean) {
          this.allSupported = value
        }
        
        /**
         * [allSupported](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-allsupported)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun allSupported(value: IntrinsicFunction) {
          this.allSupported = value
        }

        /**
         * [includeGlobalResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var includeGlobalResourceTypes: Any? = null

        /**
         * [includeGlobalResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeGlobalResourceTypes(value: Boolean) {
          this.includeGlobalResourceTypes = value
        }
        
        /**
         * [includeGlobalResourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-includeglobalresourcetypes)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun includeGlobalResourceTypes(value: IntrinsicFunction) {
          this.includeGlobalResourceTypes = value
        }

        /**
         * [resourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var resourceTypes: Any? = null

        /**
         * [resourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun resourceTypes(value: List<String>) {
          this.resourceTypes = value
        }
        
        /**
         * [resourceTypes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html#cfn-config-configurationrecorder-recordinggroup-resourcetypes)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun resourceTypes(vararg value: IntrinsicFunction) {
          this.resourceTypes = value
        }

    }

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
