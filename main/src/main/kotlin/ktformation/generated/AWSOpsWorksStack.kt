
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ChefConfiguration(
            /**
             * [BerkshelfVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val berkshelfVersion: String? = null,
            /**
             * [ManageBerkshelf](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val manageBerkshelf: Boolean? = null
    )

    class ElasticIp(
            /**
             * [Ip](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val ip: String,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null
    )

    class RdsDbInstance(
            /**
             * [DbPassword](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dbPassword: String,
            /**
             * [DbUser](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dbUser: String,
            /**
             * [RdsDbInstanceArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val rdsDbInstanceArn: String
    )

    class Source(
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-password)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val password: String? = null,
            /**
             * [Revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-revision)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val revision: String? = null,
            /**
             * [SshKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-sshkey)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val sshKey: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-type)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val type: String? = null,
            /**
             * [Url](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-url)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val url: String? = null,
            /**
             * [Username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-custcookbooksource-username)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val username: String? = null
    )

    class StackConfigurationManager(
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [Version](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html#cfn-opsworks-configmanager-version)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val version: String? = null
    )

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
