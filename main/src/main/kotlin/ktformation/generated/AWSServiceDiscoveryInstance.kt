
package ktformation.generated

import ktformation.*

/**
 * [AWS::ServiceDiscovery::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
 */
@CloudFormationMarker
class AWSServiceDiscoveryInstance(logicalId: String) : Resource<AWSServiceDiscoveryInstance.Properties>(logicalId, "AWS::ServiceDiscovery::Instance") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [instanceAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        @JvmField
        var instanceAttributes: Any? = null

        /**
         * [instanceAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun instanceAttributes(value: Json) {
          this.instanceAttributes = value
        }
        
        /**
         * [instanceAttributes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceattributes)
         *
         * _Required_: yes
         *
         * _Type_: Json
         */
        fun instanceAttributes(value: IntrinsicFunction) {
          this.instanceAttributes = value
        }

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var instanceId: Any? = null

        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: String) {
          this.instanceId = value
        }
        
        /**
         * [instanceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-instanceid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun instanceId(value: IntrinsicFunction) {
          this.instanceId = value
        }

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var serviceId: Any? = null

        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceId(value: String) {
          this.serviceId = value
        }
        
        /**
         * [serviceId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html#cfn-servicediscovery-instance-serviceid)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun serviceId(value: IntrinsicFunction) {
          this.serviceId = value
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
 * [AWS::ServiceDiscovery::Instance - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-instance.html)
 */
fun Resources.awsServiceDiscoveryInstance(logicalId: String, init: AWSServiceDiscoveryInstance.() -> Unit = {}): AWSServiceDiscoveryInstance {
    return AWSServiceDiscoveryInstance(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
