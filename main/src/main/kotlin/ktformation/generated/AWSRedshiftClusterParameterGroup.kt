
package ktformation.generated

import ktformation.*

/**
 * [AWS::Redshift::ClusterParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
 */
@CloudFormationMarker
class AWSRedshiftClusterParameterGroup(logicalId: String) : Resource<AWSRedshiftClusterParameterGroup.Properties>(logicalId, "AWS::Redshift::ClusterParameterGroup") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }
        
        /**
         * [parameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var parameterGroupFamily: Any? = null

        /**
         * [parameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterGroupFamily(value: String) {
          this.parameterGroupFamily = value
        }
        
        /**
         * [parameterGroupFamily](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun parameterGroupFamily(value: IntrinsicFunction) {
          this.parameterGroupFamily = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters)
         *
         * _Required_: no
         *
         * _Type_: List<Parameter>
         */
        @JvmField
        var parameters: Any? = null

        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters)
         *
         * _Required_: no
         *
         * _Type_: List<Parameter>
         */
        fun parameters(value: List<Parameter>) {
          this.parameters = value
        }
        
        /**
         * [parameters](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters)
         *
         * _Required_: no
         *
         * _Type_: List<Parameter>
         */
        fun parameters(vararg value: IntrinsicFunction) {
          this.parameters = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class Parameter(
            /**
             * [ParameterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val parameterName: String,
            /**
             * [ParameterValue](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-property-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val parameterValue: String
    )

}

/**
 * [AWS::Redshift::ClusterParameterGroup - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
 */
fun Resources.awsRedshiftClusterParameterGroup(logicalId: String, init: AWSRedshiftClusterParameterGroup.() -> Unit = {}): AWSRedshiftClusterParameterGroup {
    return AWSRedshiftClusterParameterGroup(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
