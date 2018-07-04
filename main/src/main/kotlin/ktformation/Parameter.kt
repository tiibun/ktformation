package ktformation

import com.fasterxml.jackson.annotation.JsonIgnore

@CloudFormationMarker
data class Parameter(@JsonIgnore val name: String) {
    var type: ParameterType = ParameterType.STRING
    var allowedPattern: String? = null
    var allowedValues: Any? = null
    var constraintDescription: String? = null
    var default: Any? = null
    var description: String? = null
    var maxLength: Int? = null
    var maxValue: Number? = null
    var minLength: Int? = null
    var minValue: Number? = null
    var noEcho: Boolean? = null

    fun type(type: ParameterType) {
        this.type = type
    }

    fun allowedPattern(allowedPattern: String) {
        this.allowedPattern = allowedPattern
    }

    fun allowedValues(allowedValues: Any) {
        this.allowedValues = allowedValues
    }

    fun constraintDescription(constraintDescription: String) {
        this.constraintDescription = constraintDescription
    }

    fun default(default: Any) {
        this.default = default
    }

    fun description(description: String) {
        this.description = description
    }

    fun maxLength(maxLength: Int) {
        this.maxLength = maxLength
    }

    fun maxValue(maxValue: Number) {
        this.maxValue = maxValue
    }

    fun minLength(minLength: Int) {
        this.minLength = minLength
    }

    fun minValue(minValue: Number) {
        this.minValue = minValue
    }

    fun noEcho(noEcho: Boolean) {
        this.noEcho = noEcho
    }
}

data class ParameterType(private val typeName: String) {
    companion object {
        val NUMBER = ParameterType("Number")
        val STRING = ParameterType("String")
        val LIST_NUMBER = ParameterType("List<Number>")
        val COMMA_DELIMITED_LIST = ParameterType("CommaDelimitedList")

        /**
         * An Availability Zone, such as us-west-2a.
         */
        val AWS_EC2_AVAILABILITYZONE_NAME = ParameterType("AWS::EC2::AvailabilityZone::Name")

        /**
         * An Amazon EC2 image ID, such as ami-ff527ecf. Note that the AWS CloudFormation console doesn't show a drop-down list of values for this parameter type.
         */
        val AWS_EC2_IMAGE_ID = ParameterType("AWS::EC2::Image::Id")

        /**
         * An Amazon EC2 instance ID, such as i-1e731a32.
         */
        val AWS_EC2_INSTANCE_ID = ParameterType("AWS::EC2::Instance::Id")

        /**
         * An Amazon EC2 key pair name.
         */
        val AWS_EC2_KEYPAIR_KEYNAME = ParameterType("AWS::EC2::KeyPair::KeyName")

        /**
         * An EC2-Classic or default VPC security group name, such as my-sg-abc.
         */
        val AWS_EC2_SECURITYGROUP_GROUPNAME = ParameterType("AWS::EC2::SecurityGroup::GroupName")

        /**
         * A security group ID, such as sg-a123fd85.
         */
        val AWS_EC2_SECURITYGROUP_ID = ParameterType("AWS::EC2::SecurityGroup::Id")

        /**
         * A subnet ID, such as subnet-123a351e.
         */
        val AWS_EC2_SUBNET_ID = ParameterType("AWS::EC2::Subnet::Id")

        /**
         * An Amazon EBS volume ID, such as vol-3cdd3f56.
         */
        val AWS_EC2_VOLUME_ID = ParameterType("AWS::EC2::Volume::Id")

        /**
         * A VPC ID, such as vpc-a123baa3.
         */
        val AWS_EC2_VPC_Id = ParameterType("AWS::EC2::VPC::Id")

        /**
         * An Route 53 hosted zone ID, such as Z23YXV4OVPL04A.
         */
        val AWS_ROUTE53_HOSTEDZONE_ID = ParameterType("AWS::Route53::HostedZone::Id")

        fun list(parameterType: ParameterType) = ParameterType("List<${parameterType}>")

        /**
         * The name of a Systems Manager parameter key.
         * Use this parameter when you want to pass the parameter key. For example, you can use this type to validate that the parameter exists.
         */
        val AWS_SSM_PARAMETER_NAME = ParameterType("AWS::SSM::Parameter::Name")

        fun ssm(parameterType: ParameterType) = ParameterType("AWS::SSM::Parameter::Value<${parameterType}>")
    }

    override fun toString() = typeName
}

@CloudFormationMarker
data class Parameters(private val map: MutableMap<String, Parameter> = linkedMapOf())
    : MutableMap<String, Parameter> by map {

    fun parameter(name: String, init: Parameter.() -> Unit): Parameter {
        return Parameter(name).also {
            it.init()
            put(name, it)
        }
    }
}
