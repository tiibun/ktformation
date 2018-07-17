
package ktformation.generated

import ktformation.*

/**
 * [AWS::AmazonMQ::Broker - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html)
 */
@CloudFormationMarker
class AWSAmazonMQBroker(logicalId: String) : Resource<AWSAmazonMQBroker.Properties>(logicalId, "AWS::AmazonMQ::Broker") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var autoMinorVersionUpgrade: Any? = null

        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: Boolean) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [autoMinorVersionUpgrade](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun autoMinorVersionUpgrade(value: IntrinsicFunction) {
          this.autoMinorVersionUpgrade = value
        }
        
        /**
         * [brokerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var brokerName: Any? = null

        /**
         * [brokerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun brokerName(value: String) {
          this.brokerName = value
        }
        
        /**
         * [brokerName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun brokerName(value: IntrinsicFunction) {
          this.brokerName = value
        }
        
        /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
         *
         * _Required_: no
         *
         * _Type_: ConfigurationId
         */
        @JvmField
        var configuration: Any? = null

        /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
         *
         * _Required_: no
         *
         * _Type_: ConfigurationId
         */
        fun configuration(value: ConfigurationId) {
          this.configuration = value
        }
        
        /**
         * [configuration](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
         *
         * _Required_: no
         *
         * _Type_: ConfigurationId
         */
        fun configuration(value: IntrinsicFunction) {
          this.configuration = value
        }
        
        /**
         * [deploymentMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var deploymentMode: Any? = null

        /**
         * [deploymentMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deploymentMode(value: String) {
          this.deploymentMode = value
        }
        
        /**
         * [deploymentMode](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun deploymentMode(value: IntrinsicFunction) {
          this.deploymentMode = value
        }
        
        /**
         * [engineType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engineType: Any? = null

        /**
         * [engineType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineType(value: String) {
          this.engineType = value
        }
        
        /**
         * [engineType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineType(value: IntrinsicFunction) {
          this.engineType = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var engineVersion: Any? = null

        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineVersion(value: String) {
          this.engineVersion = value
        }
        
        /**
         * [engineVersion](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun engineVersion(value: IntrinsicFunction) {
          this.engineVersion = value
        }
        
        /**
         * [hostInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var hostInstanceType: Any? = null

        /**
         * [hostInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostInstanceType(value: String) {
          this.hostInstanceType = value
        }
        
        /**
         * [hostInstanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun hostInstanceType(value: IntrinsicFunction) {
          this.hostInstanceType = value
        }
        
        /**
         * [maintenanceWindowStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindow
         */
        @JvmField
        var maintenanceWindowStartTime: Any? = null

        /**
         * [maintenanceWindowStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindow
         */
        fun maintenanceWindowStartTime(value: MaintenanceWindow) {
          this.maintenanceWindowStartTime = value
        }
        
        /**
         * [maintenanceWindowStartTime](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
         *
         * _Required_: no
         *
         * _Type_: MaintenanceWindow
         */
        fun maintenanceWindowStartTime(value: IntrinsicFunction) {
          this.maintenanceWindowStartTime = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        @JvmField
        var publiclyAccessible: Any? = null

        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: Boolean) {
          this.publiclyAccessible = value
        }
        
        /**
         * [publiclyAccessible](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
         *
         * _Required_: yes
         *
         * _Type_: Boolean
         */
        fun publiclyAccessible(value: IntrinsicFunction) {
          this.publiclyAccessible = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroups: Any? = null

        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(value: List<String>) {
          this.securityGroups = value
        }
        
        /**
         * [securityGroups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroups(vararg value: IntrinsicFunction) {
          this.securityGroups = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var subnetIds: Any? = null

        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(value: List<String>) {
          this.subnetIds = value
        }
        
        /**
         * [subnetIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun subnetIds(vararg value: IntrinsicFunction) {
          this.subnetIds = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
         *
         * _Required_: yes
         *
         * _Type_: List<User>
         */
        @JvmField
        var users: Any? = null

        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
         *
         * _Required_: yes
         *
         * _Type_: List<User>
         */
        fun users(value: List<User>) {
          this.users = value
        }
        
        /**
         * [users](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
         *
         * _Required_: yes
         *
         * _Type_: List<User>
         */
        fun users(vararg value: IntrinsicFunction) {
          this.users = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConfigurationId(
            /**
             * [Id](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val id: String,
            /**
             * [Revision](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision)
             *
             * _Required_: yes
             *
             * _Type_: Int
             */
            val revision: Int
    )

    class MaintenanceWindow(
            /**
             * [DayOfWeek](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val dayOfWeek: String,
            /**
             * [TimeOfDay](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeOfDay: String,
            /**
             * [TimeZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val timeZone: String
    )

    class User(
            /**
             * [ConsoleAccess](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess)
             *
             * _Required_: no
             *
             * _Type_: Boolean
             */
            val consoleAccess: Boolean? = null,
            /**
             * [Groups](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val groups: List<String>? = null,
            /**
             * [Password](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val password: String,
            /**
             * [Username](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val username: String
    )

}

/**
 * [AWS::AmazonMQ::Broker - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html)
 */
fun Resources.awsAmazonMQBroker(logicalId: String, init: AWSAmazonMQBroker.() -> Unit = {}): AWSAmazonMQBroker {
    return AWSAmazonMQBroker(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
