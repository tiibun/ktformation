
package ktformation.generated

import ktformation.*

/**
 * [AWS::OpsWorks::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
 */
@CloudFormationMarker
class AWSOpsWorksStack(logicalId: String) : Resource<AWSOpsWorksStack.Properties>(logicalId, "AWS::OpsWorks::Stack") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var agentVersion: Any? = null

        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun agentVersion(value: String) {
          this.agentVersion = value
        }
        
        /**
         * [agentVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun agentVersion(value: IntrinsicFunction) {
          this.agentVersion = value
        }

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        @JvmField
        var attributes: Any? = null

        /**
         * [attributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
         *
         * _Required_: no
         *
         * _Type_: Map<String, Any>
         */
        fun attributes(value: Map<String, Any>) {
          this.attributes = value
        }
        
        /**
         * [chefConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ChefConfiguration
         */
        @JvmField
        var chefConfiguration: Any? = null

        /**
         * [chefConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ChefConfiguration
         */
        fun chefConfiguration(value: ChefConfiguration) {
          this.chefConfiguration = value
        }
        
        /**
         * [chefConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
         *
         * _Required_: no
         *
         * _Type_: ChefConfiguration
         */
        fun chefConfiguration(value: IntrinsicFunction) {
          this.chefConfiguration = value
        }

        /**
         * [cloneAppIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var cloneAppIds: Any? = null

        /**
         * [cloneAppIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cloneAppIds(value: List<String>) {
          this.cloneAppIds = value
        }
        
        /**
         * [cloneAppIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun cloneAppIds(vararg value: IntrinsicFunction) {
          this.cloneAppIds = value
        }

        /**
         * [clonePermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var clonePermissions: Any? = null

        /**
         * [clonePermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun clonePermissions(value: Boolean) {
          this.clonePermissions = value
        }
        
        /**
         * [clonePermissions](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun clonePermissions(value: IntrinsicFunction) {
          this.clonePermissions = value
        }

        /**
         * [configurationManager](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configmanager)
         *
         * _Required_: no
         *
         * _Type_: StackConfigurationManager
         */
        @JvmField
        var configurationManager: Any? = null

        /**
         * [configurationManager](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configmanager)
         *
         * _Required_: no
         *
         * _Type_: StackConfigurationManager
         */
        fun configurationManager(value: StackConfigurationManager) {
          this.configurationManager = value
        }
        
        /**
         * [configurationManager](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configmanager)
         *
         * _Required_: no
         *
         * _Type_: StackConfigurationManager
         */
        fun configurationManager(value: IntrinsicFunction) {
          this.configurationManager = value
        }

        /**
         * [customCookbooksSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custcookbooksource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        @JvmField
        var customCookbooksSource: Any? = null

        /**
         * [customCookbooksSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custcookbooksource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        fun customCookbooksSource(value: Source) {
          this.customCookbooksSource = value
        }
        
        /**
         * [customCookbooksSource](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custcookbooksource)
         *
         * _Required_: no
         *
         * _Type_: Source
         */
        fun customCookbooksSource(value: IntrinsicFunction) {
          this.customCookbooksSource = value
        }

        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        @JvmField
        var customJson: Any? = null

        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun customJson(value: Json) {
          this.customJson = value
        }
        
        /**
         * [customJson](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson)
         *
         * _Required_: no
         *
         * _Type_: Json
         */
        fun customJson(value: IntrinsicFunction) {
          this.customJson = value
        }

        /**
         * [defaultAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultAvailabilityZone: Any? = null

        /**
         * [defaultAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultAvailabilityZone(value: String) {
          this.defaultAvailabilityZone = value
        }
        
        /**
         * [defaultAvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultAvailabilityZone(value: IntrinsicFunction) {
          this.defaultAvailabilityZone = value
        }

        /**
         * [defaultInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var defaultInstanceProfileArn: Any? = null

        /**
         * [defaultInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun defaultInstanceProfileArn(value: String) {
          this.defaultInstanceProfileArn = value
        }
        
        /**
         * [defaultInstanceProfileArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun defaultInstanceProfileArn(value: IntrinsicFunction) {
          this.defaultInstanceProfileArn = value
        }

        /**
         * [defaultOs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultOs: Any? = null

        /**
         * [defaultOs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultOs(value: String) {
          this.defaultOs = value
        }
        
        /**
         * [defaultOs](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultOs(value: IntrinsicFunction) {
          this.defaultOs = value
        }

        /**
         * [defaultRootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultRootDeviceType: Any? = null

        /**
         * [defaultRootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultRootDeviceType(value: String) {
          this.defaultRootDeviceType = value
        }
        
        /**
         * [defaultRootDeviceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultRootDeviceType(value: IntrinsicFunction) {
          this.defaultRootDeviceType = value
        }

        /**
         * [defaultSshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultSshKeyName: Any? = null

        /**
         * [defaultSshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultSshKeyName(value: String) {
          this.defaultSshKeyName = value
        }
        
        /**
         * [defaultSshKeyName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultSshKeyName(value: IntrinsicFunction) {
          this.defaultSshKeyName = value
        }

        /**
         * [defaultSubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var defaultSubnetId: Any? = null

        /**
         * [defaultSubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultSubnetId(value: String) {
          this.defaultSubnetId = value
        }
        
        /**
         * [defaultSubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun defaultSubnetId(value: IntrinsicFunction) {
          this.defaultSubnetId = value
        }

        /**
         * [ecsClusterArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ecsClusterArn: Any? = null

        /**
         * [ecsClusterArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ecsClusterArn(value: String) {
          this.ecsClusterArn = value
        }
        
        /**
         * [ecsClusterArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ecsClusterArn(value: IntrinsicFunction) {
          this.ecsClusterArn = value
        }

        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticIp>
         */
        @JvmField
        var elasticIps: Any? = null

        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticIp>
         */
        fun elasticIps(value: List<ElasticIp>) {
          this.elasticIps = value
        }
        
        /**
         * [elasticIps](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
         *
         * _Required_: no
         *
         * _Type_: List<ElasticIp>
         */
        fun elasticIps(vararg value: IntrinsicFunction) {
          this.elasticIps = value
        }

        /**
         * [hostnameTheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var hostnameTheme: Any? = null

        /**
         * [hostnameTheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostnameTheme(value: String) {
          this.hostnameTheme = value
        }
        
        /**
         * [hostnameTheme](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun hostnameTheme(value: IntrinsicFunction) {
          this.hostnameTheme = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [rdsDbInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
         *
         * _Required_: no
         *
         * _Type_: List<RdsDbInstance>
         */
        @JvmField
        var rdsDbInstances: Any? = null

        /**
         * [rdsDbInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
         *
         * _Required_: no
         *
         * _Type_: List<RdsDbInstance>
         */
        fun rdsDbInstances(value: List<RdsDbInstance>) {
          this.rdsDbInstances = value
        }
        
        /**
         * [rdsDbInstances](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
         *
         * _Required_: no
         *
         * _Type_: List<RdsDbInstance>
         */
        fun rdsDbInstances(vararg value: IntrinsicFunction) {
          this.rdsDbInstances = value
        }

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceRoleArn: Any? = null

        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: String) {
          this.serviceRoleArn = value
        }
        
        /**
         * [serviceRoleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceRoleArn(value: IntrinsicFunction) {
          this.serviceRoleArn = value
        }

        /**
         * [sourceStackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var sourceStackId: Any? = null

        /**
         * [sourceStackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceStackId(value: String) {
          this.sourceStackId = value
        }
        
        /**
         * [sourceStackId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sourceStackId(value: IntrinsicFunction) {
          this.sourceStackId = value
        }

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        @JvmField
        var tags: Any? = null

        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(value: List<Tag>) {
          this.tags = value
        }
        
        /**
         * [tags](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
         *
         * _Required_: no
         *
         * _Type_: List<Tag>
         */
        fun tags(vararg value: IntrinsicFunction) {
          this.tags = value
        }

        /**
         * [useCustomCookbooks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var useCustomCookbooks: Any? = null

        /**
         * [useCustomCookbooks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useCustomCookbooks(value: Boolean) {
          this.useCustomCookbooks = value
        }
        
        /**
         * [useCustomCookbooks](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useCustomCookbooks(value: IntrinsicFunction) {
          this.useCustomCookbooks = value
        }

        /**
         * [useOpsworksSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        @JvmField
        var useOpsworksSecurityGroups: Any? = null

        /**
         * [useOpsworksSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useOpsworksSecurityGroups(value: Boolean) {
          this.useOpsworksSecurityGroups = value
        }
        
        /**
         * [useOpsworksSecurityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun useOpsworksSecurityGroups(value: IntrinsicFunction) {
          this.useOpsworksSecurityGroups = value
        }

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var vpcId: Any? = null

        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: String) {
          this.vpcId = value
        }
        
        /**
         * [vpcId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun vpcId(value: IntrinsicFunction) {
          this.vpcId = value
        }

        /**
        * [ChefConfiguration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html)
        */
        fun chefConfiguration(init: ChefConfiguration.() -> Unit = {}): ChefConfiguration {
            return ChefConfiguration().also {
                it.init()
            }
        }
        /**
        * [ElasticIp](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html)
        */
        fun elasticIp(init: ElasticIp.() -> Unit = {}): ElasticIp {
            return ElasticIp().also {
                it.init()
            }
        }
        /**
        * [RdsDbInstance](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html)
        */
        fun rdsDbInstance(init: RdsDbInstance.() -> Unit = {}): RdsDbInstance {
            return RdsDbInstance().also {
                it.init()
            }
        }
        /**
        * [Source](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html)
        */
        fun source(init: Source.() -> Unit = {}): Source {
            return Source().also {
                it.init()
            }
        }
        /**
        * [StackConfigurationManager](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html)
        */
        fun stackConfigurationManager(init: StackConfigurationManager.() -> Unit = {}): StackConfigurationManager {
            return StackConfigurationManager().also {
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
    class ChefConfiguration {
            /**
         * [berkshelfVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var berkshelfVersion: Any? = null

        /**
         * [berkshelfVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun berkshelfVersion(value: String) {
          this.berkshelfVersion = value
        }
        
        /**
         * [berkshelfVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun berkshelfVersion(value: IntrinsicFunction) {
          this.berkshelfVersion = value
        }

        /**
         * [manageBerkshelf](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        var manageBerkshelf: Any? = null

        /**
         * [manageBerkshelf](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun manageBerkshelf(value: Boolean) {
          this.manageBerkshelf = value
        }
        
        /**
         * [manageBerkshelf](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
         *
         * _Required_: no
         *
         * _Type_: Boolean
         */
        fun manageBerkshelf(value: IntrinsicFunction) {
          this.manageBerkshelf = value
        }

    }

    @CloudFormationMarker
    class ElasticIp {
            /**
         * [ip](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var ip: Any? = null

        /**
         * [ip](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ip(value: String) {
          this.ip = value
        }
        
        /**
         * [ip](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun ip(value: IntrinsicFunction) {
          this.ip = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

    }

    @CloudFormationMarker
    class RdsDbInstance {
            /**
         * [dbPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dbPassword: Any? = null

        /**
         * [dbPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dbPassword(value: String) {
          this.dbPassword = value
        }
        
        /**
         * [dbPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dbPassword(value: IntrinsicFunction) {
          this.dbPassword = value
        }

        /**
         * [dbUser](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var dbUser: Any? = null

        /**
         * [dbUser](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dbUser(value: String) {
          this.dbUser = value
        }
        
        /**
         * [dbUser](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun dbUser(value: IntrinsicFunction) {
          this.dbUser = value
        }

        /**
         * [rdsDbInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var rdsDbInstanceArn: Any? = null

        /**
         * [rdsDbInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun rdsDbInstanceArn(value: String) {
          this.rdsDbInstanceArn = value
        }
        
        /**
         * [rdsDbInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun rdsDbInstanceArn(value: IntrinsicFunction) {
          this.rdsDbInstanceArn = value
        }

    }

    @CloudFormationMarker
    class Source {
            /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var password: Any? = null

        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: String) {
          this.password = value
        }
        
        /**
         * [password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-password)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun password(value: IntrinsicFunction) {
          this.password = value
        }

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var revision: Any? = null

        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revision(value: String) {
          this.revision = value
        }
        
        /**
         * [revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun revision(value: IntrinsicFunction) {
          this.revision = value
        }

        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var sshKey: Any? = null

        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKey(value: String) {
          this.sshKey = value
        }
        
        /**
         * [sshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun sshKey(value: IntrinsicFunction) {
          this.sshKey = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var url: Any? = null

        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun url(value: String) {
          this.url = value
        }
        
        /**
         * [url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun url(value: IntrinsicFunction) {
          this.url = value
        }

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var username: Any? = null

        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: String) {
          this.username = value
        }
        
        /**
         * [username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun username(value: IntrinsicFunction) {
          this.username = value
        }

    }

    @CloudFormationMarker
    class StackConfigurationManager {
            /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var version: Any? = null

        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: String) {
          this.version = value
        }
        
        /**
         * [version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-version)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun version(value: IntrinsicFunction) {
          this.version = value
        }

    }

}

/**
 * [AWS::OpsWorks::Stack - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
 */
fun Resources.awsOpsWorksStack(logicalId: String, init: AWSOpsWorksStack.() -> Unit = {}): AWSOpsWorksStack {
    return AWSOpsWorksStack(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
