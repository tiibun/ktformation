
package ktformation.generated

import ktformation.*

/**
 * [AWS::SSM::Association - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 */
@CloudFormationMarker
class AWSSSMAssociation(logicalId: String) : Resource<AWSSSMAssociation.Properties>(logicalId, "AWS::SSM::Association") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [associationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var associationName: Any? = null

        /**
         * [associationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun associationName(value: String) {
          this.associationName = value
        }
        
        /**
         * [associationName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-associationname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun associationName(value: IntrinsicFunction) {
          this.associationName = value
        }

        /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var documentVersion: Any? = null

        /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentVersion(value: String) {
          this.documentVersion = value
        }
        
        /**
         * [documentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-documentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun documentVersion(value: IntrinsicFunction) {
          this.documentVersion = value
        }

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [outputLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
         *
         * _Required_: no
         *
         * _Type_: InstanceAssociationOutputLocation
         */
        @JvmField
        var outputLocation: Any? = null

        /**
         * [outputLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
         *
         * _Required_: no
         *
         * _Type_: InstanceAssociationOutputLocation
         */
        fun outputLocation(value: InstanceAssociationOutputLocation) {
          this.outputLocation = value
        }
        
        /**
         * [outputLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-outputlocation)
         *
         * _Required_: no
         *
         * _Type_: InstanceAssociationOutputLocation
         */
        fun outputLocation(value: IntrinsicFunction) {
          this.outputLocation = value
        }

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-parameters)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun parameters(value: Map<String, Any>) {
          this.parameters = value
        }
        
        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var scheduleExpression: Any? = null

        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: String) {
          this.scheduleExpression = value
        }
        
        /**
         * [scheduleExpression](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-scheduleexpression)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun scheduleExpression(value: IntrinsicFunction) {
          this.scheduleExpression = value
        }

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        @JvmField
        var targets: Any? = null

        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        fun targets(value: List<Target>) {
          this.targets = value
        }
        
        /**
         * [targets](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html#cfn-ssm-association-targets)
         *
         * _Required_: no
         *
         * _Type_: List<Target>
         */
        fun targets(vararg value: IntrinsicFunction) {
          this.targets = value
        }

        /**
        * [InstanceAssociationOutputLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
        */
        fun instanceAssociationOutputLocation(init: InstanceAssociationOutputLocation.() -> Unit = {}): InstanceAssociationOutputLocation {
            return InstanceAssociationOutputLocation().also {
                it.init()
            }
        }
        /**
        * [ParameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html)
        */
        fun parameterValues(init: ParameterValues.() -> Unit = {}): ParameterValues {
            return ParameterValues().also {
                it.init()
            }
        }
        /**
        * [S3OutputLocation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html)
        */
        fun s3OutputLocation(init: S3OutputLocation.() -> Unit = {}): S3OutputLocation {
            return S3OutputLocation().also {
                it.init()
            }
        }
        /**
        * [Target](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html)
        */
        fun target(init: Target.() -> Unit = {}): Target {
            return Target().also {
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
    class InstanceAssociationOutputLocation {
            /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html#cfn-ssm-association-instanceassociationoutputlocation-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3OutputLocation
         */
        var s3Location: Any? = null

        /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html#cfn-ssm-association-instanceassociationoutputlocation-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3OutputLocation
         */
        fun s3Location(value: S3OutputLocation) {
          this.s3Location = value
        }
        
        /**
         * [s3Location](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html#cfn-ssm-association-instanceassociationoutputlocation-s3location)
         *
         * _Required_: no
         *
         * _Type_: S3OutputLocation
         */
        fun s3Location(value: IntrinsicFunction) {
          this.s3Location = value
        }

    }

    @CloudFormationMarker
    class ParameterValues {
            /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var parameterValues: Any? = null

        /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun parameterValues(value: List<String>) {
          this.parameterValues = value
        }
        
        /**
         * [parameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun parameterValues(vararg value: IntrinsicFunction) {
          this.parameterValues = value
        }

    }

    @CloudFormationMarker
    class S3OutputLocation {
            /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputS3BucketName: Any? = null

        /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3BucketName(value: String) {
          this.outputS3BucketName = value
        }
        
        /**
         * [outputS3BucketName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3BucketName(value: IntrinsicFunction) {
          this.outputS3BucketName = value
        }

        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var outputS3KeyPrefix: Any? = null

        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3KeyPrefix(value: String) {
          this.outputS3KeyPrefix = value
        }
        
        /**
         * [outputS3KeyPrefix](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun outputS3KeyPrefix(value: IntrinsicFunction) {
          this.outputS3KeyPrefix = value
        }

    }

    @CloudFormationMarker
    class Target {
            /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var key: Any? = null

        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: String) {
          this.key = value
        }
        
        /**
         * [key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun key(value: IntrinsicFunction) {
          this.key = value
        }

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        var values: Any? = null

        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(value: List<String>) {
          this.values = value
        }
        
        /**
         * [values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
         *
         * _Required_: yes
         *
         * _Type_: List<String>
         */
        fun values(vararg value: IntrinsicFunction) {
          this.values = value
        }

    }

}

/**
 * [AWS::SSM::Association - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 */
fun Resources.awsSSMAssociation(logicalId: String, init: AWSSSMAssociation.() -> Unit = {}): AWSSSMAssociation {
    return AWSSSMAssociation(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
