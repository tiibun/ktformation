
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ParameterValues(
            /**
             * [ParameterValues](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-parametervalues.html#cfn-ssm-association-parametervalues-parametervalues)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val parameterValues: List<String>
    )

    class Target(
            /**
             * [Key](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-key)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val key: String,
            /**
             * [Values](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-target.html#cfn-ssm-association-target-values)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val values: List<String>
    )

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
