
package ktformation.generated

import ktformation.*

/**
 * [AWS::DAX::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
 */
@CloudFormationMarker
class AWSDAXCluster(logicalId: String) : Resource<AWSDAXCluster.Properties>(logicalId, "AWS::DAX::Cluster") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var availabilityZones: Any? = null

        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(value: List<String>) {
          this.availabilityZones = value
        }
        
        /**
         * [availabilityZones](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun availabilityZones(vararg value: IntrinsicFunction) {
          this.availabilityZones = value
        }

        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var clusterName: Any? = null

        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterName(value: String) {
          this.clusterName = value
        }
        
        /**
         * [clusterName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun clusterName(value: IntrinsicFunction) {
          this.clusterName = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var iAMRoleARN: Any? = null

        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iAMRoleARN(value: String) {
          this.iAMRoleARN = value
        }
        
        /**
         * [iAMRoleARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun iAMRoleARN(value: IntrinsicFunction) {
          this.iAMRoleARN = value
        }

        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var nodeType: Any? = null

        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun nodeType(value: String) {
          this.nodeType = value
        }
        
        /**
         * [nodeType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun nodeType(value: IntrinsicFunction) {
          this.nodeType = value
        }

        /**
         * [notificationTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var notificationTopicARN: Any? = null

        /**
         * [notificationTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicARN(value: String) {
          this.notificationTopicARN = value
        }
        
        /**
         * [notificationTopicARN](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun notificationTopicARN(value: IntrinsicFunction) {
          this.notificationTopicARN = value
        }

        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var parameterGroupName: Any? = null

        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun parameterGroupName(value: String) {
          this.parameterGroupName = value
        }
        
        /**
         * [parameterGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun parameterGroupName(value: IntrinsicFunction) {
          this.parameterGroupName = value
        }

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var preferredMaintenanceWindow: Any? = null

        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: String) {
          this.preferredMaintenanceWindow = value
        }
        
        /**
         * [preferredMaintenanceWindow](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun preferredMaintenanceWindow(value: IntrinsicFunction) {
          this.preferredMaintenanceWindow = value
        }

        /**
         * [replicationFactor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        @JvmField
        var replicationFactor: Any? = null

        /**
         * [replicationFactor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun replicationFactor(value: Int) {
          this.replicationFactor = value
        }
        
        /**
         * [replicationFactor](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor)
         *
         * _Required_: yes
         *
         * _Type_: Int
         */
        fun replicationFactor(value: IntrinsicFunction) {
          this.replicationFactor = value
        }

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }

        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetGroupName: Any? = null

        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetGroupName(value: String) {
          this.subnetGroupName = value
        }
        
        /**
         * [subnetGroupName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetGroupName(value: IntrinsicFunction) {
          this.subnetGroupName = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun tags(value: Json) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun tags(value: IntrinsicFunction) {
          this.tags = value
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
 * [AWS::DAX::Cluster - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
 */
fun Resources.awsDAXCluster(logicalId: String, init: AWSDAXCluster.() -> Unit = {}): AWSDAXCluster {
    return AWSDAXCluster(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
