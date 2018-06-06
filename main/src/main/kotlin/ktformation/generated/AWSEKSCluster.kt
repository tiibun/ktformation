
package ktformation.generated

import ktformation.*

/**
 * [AWS::EKS::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
 */
@CloudFormationMarker
class AWSEKSCluster(logicalId: String) : Resource<AWSEKSCluster.Properties>(logicalId, "AWS::EKS::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }
        
        /**
         * [resourcesVpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
         *
         * _Required_: yes
         *
         * _Type_: ResourcesVpcConfig
         */
        @JvmField
        var resourcesVpcConfig: Any? = null

        /**
         * [resourcesVpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
         *
         * _Required_: yes
         *
         * _Type_: ResourcesVpcConfig
         */
        fun resourcesVpcConfig(value: ResourcesVpcConfig) {
          this.resourcesVpcConfig = value
        }
        
        /**
         * [resourcesVpcConfig](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-resourcesvpcconfig)
         *
         * _Required_: yes
         *
         * _Type_: ResourcesVpcConfig
         */
        fun resourcesVpcConfig(value: IntrinsicFunction) {
          this.resourcesVpcConfig = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html#cfn-eks-cluster-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ResourcesVpcConfig(
            /**
             * [SecurityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-securitygroupids)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroupIds: List<String>? = null,
            /**
             * [SubnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html#cfn-eks-cluster-resourcesvpcconfig-subnetids)
             *
             * _Required_: yes
             *
             * _Type_: List<String>
             */
            val subnetIds: List<String>
    )

}

/**
 * [AWS::EKS::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
 */
fun Resources.awsEKSCluster(logicalId: String, init: AWSEKSCluster.() -> Unit = {}): AWSEKSCluster {
    return AWSEKSCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
