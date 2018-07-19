
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

        /**
        * [ConnectionInput](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html)
        */
        fun connectionInput(init: ConnectionInput.() -> Unit = {}): ConnectionInput {
            return ConnectionInput().also {
                it.init()
            }
        }
        /**
        * [PhysicalConnectionRequirements](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html)
        */
        fun physicalConnectionRequirements(init: PhysicalConnectionRequirements.() -> Unit = {}): PhysicalConnectionRequirements {
            return PhysicalConnectionRequirements().also {
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
    class ConnectionInput {
            /**
         * [connectionProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        var connectionProperties: Any? = null

        /**
         * [connectionProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun connectionProperties(value: Json) {
          this.connectionProperties = value
        }
        
        /**
         * [connectionProperties](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun connectionProperties(value: IntrinsicFunction) {
          this.connectionProperties = value
        }

        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var connectionType: Any? = null

        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun connectionType(value: String) {
          this.connectionType = value
        }
        
        /**
         * [connectionType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun connectionType(value: IntrinsicFunction) {
          this.connectionType = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [matchCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var matchCriteria: Any? = null

        /**
         * [matchCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun matchCriteria(value: List<String>) {
          this.matchCriteria = value
        }
        
        /**
         * [matchCriteria](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun matchCriteria(vararg value: IntrinsicFunction) {
          this.matchCriteria = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [physicalConnectionRequirements](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
         *
         * _Required_: no
         *
         * _Type_: PhysicalConnectionRequirements
         */
        var physicalConnectionRequirements: Any? = null

        /**
         * [physicalConnectionRequirements](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
         *
         * _Required_: no
         *
         * _Type_: PhysicalConnectionRequirements
         */
        fun physicalConnectionRequirements(value: PhysicalConnectionRequirements) {
          this.physicalConnectionRequirements = value
        }
        
        /**
         * [physicalConnectionRequirements](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
         *
         * _Required_: no
         *
         * _Type_: PhysicalConnectionRequirements
         */
        fun physicalConnectionRequirements(value: IntrinsicFunction) {
          this.physicalConnectionRequirements = value
        }

    }

    @CloudFormationMarker
    class PhysicalConnectionRequirements {
            /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var availabilityZone: Any? = null

        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: String) {
          this.availabilityZone = value
        }
        
        /**
         * [availabilityZone](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun availabilityZone(value: IntrinsicFunction) {
          this.availabilityZone = value
        }

        /**
         * [securityGroupIdList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        var securityGroupIdList: Any? = null

        /**
         * [securityGroupIdList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIdList(value: List<String>) {
          this.securityGroupIdList = value
        }
        
        /**
         * [securityGroupIdList](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIdList(vararg value: IntrinsicFunction) {
          this.securityGroupIdList = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

    }

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
