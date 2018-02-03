
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::Connection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
@CloudFormationMarker
class AWSGlueConnection(logicalId: String) : Resource<AWSGlueConnection.Properties>(logicalId, "AWS::Glue::Connection") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var catalogId: Any? = null

        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: String) {
          this.catalogId = value
        }
        
        /**
         * [catalogId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun catalogId(value: IntrinsicFunction) {
          this.catalogId = value
        }
        
        /**
         * [connectionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
         *
         * _Required_: yes
         *
         * _Type_: ConnectionInput
         */
        @JvmField
        var connectionInput: Any? = null

        /**
         * [connectionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
         *
         * _Required_: yes
         *
         * _Type_: ConnectionInput
         */
        fun connectionInput(value: ConnectionInput) {
          this.connectionInput = value
        }
        
        /**
         * [connectionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
         *
         * _Required_: yes
         *
         * _Type_: ConnectionInput
         */
        fun connectionInput(value: IntrinsicFunction) {
          this.connectionInput = value
        }
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class ConnectionInput(
            /**
             * [ConnectionProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
             *
             * _Required_: yes
             *
             * _Type_: Json
             */
            val connectionProperties: Json,
            /**
             * [ConnectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val connectionType: String,
            /**
             * [Description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val description: String? = null,
            /**
             * [MatchCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val matchCriteria: List<String>? = null,
            /**
             * [Name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val name: String? = null,
            /**
             * [PhysicalConnectionRequirements](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
             *
             * _Required_: no
             *
             * _Type_: PhysicalConnectionRequirements
             */
            val physicalConnectionRequirements: PhysicalConnectionRequirements? = null
    )

    class PhysicalConnectionRequirements(
            /**
             * [AvailabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val availabilityZone: String? = null,
            /**
             * [SecurityGroupIdList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
             *
             * _Required_: no
             *
             * _Type_: List<String>
             */
            val securityGroupIdList: List<String>? = null,
            /**
             * [SubnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val subnetId: String? = null
    )

}

/**
 * [AWS::Glue::Connection - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
fun Resources.awsGlueConnection(logicalId: String, init: AWSGlueConnection.() -> Unit = {}): AWSGlueConnection {
    return AWSGlueConnection(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
