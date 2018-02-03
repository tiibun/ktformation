
package ktformation.generated

import ktformation.*

/**
 * [AWS::Glue::DevEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
 */
@CloudFormationMarker
class AWSGlueDevEndpoint(logicalId: String) : Resource<AWSGlueDevEndpoint.Properties>(logicalId, "AWS::Glue::DevEndpoint") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var endpointName: Any? = null

        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointName(value: String) {
          this.endpointName = value
        }
        
        /**
         * [endpointName](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-endpointname)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun endpointName(value: IntrinsicFunction) {
          this.endpointName = value
        }
        
        /**
         * [extraJarsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var extraJarsS3Path: Any? = null

        /**
         * [extraJarsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraJarsS3Path(value: String) {
          this.extraJarsS3Path = value
        }
        
        /**
         * [extraJarsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrajarss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraJarsS3Path(value: IntrinsicFunction) {
          this.extraJarsS3Path = value
        }
        
        /**
         * [extraPythonLibsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var extraPythonLibsS3Path: Any? = null

        /**
         * [extraPythonLibsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraPythonLibsS3Path(value: String) {
          this.extraPythonLibsS3Path = value
        }
        
        /**
         * [extraPythonLibsS3Path](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-extrapythonlibss3path)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun extraPythonLibsS3Path(value: IntrinsicFunction) {
          this.extraPythonLibsS3Path = value
        }
        
        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var numberOfNodes: Any? = null

        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfNodes(value: Int) {
          this.numberOfNodes = value
        }
        
        /**
         * [numberOfNodes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-numberofnodes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun numberOfNodes(value: IntrinsicFunction) {
          this.numberOfNodes = value
        }
        
        /**
         * [publicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var publicKey: Any? = null

        /**
         * [publicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun publicKey(value: String) {
          this.publicKey = value
        }
        
        /**
         * [publicKey](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-publickey)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun publicKey(value: IntrinsicFunction) {
          this.publicKey = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var roleArn: Any? = null

        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: String) {
          this.roleArn = value
        }
        
        /**
         * [roleArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-rolearn)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun roleArn(value: IntrinsicFunction) {
          this.roleArn = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        @JvmField
        var securityGroupIds: Any? = null

        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(value: List<String>) {
          this.securityGroupIds = value
        }
        
        /**
         * [securityGroupIds](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-securitygroupids)
         *
         * _Required_: no
         *
         * _Type_: List<String>
         */
        fun securityGroupIds(vararg value: IntrinsicFunction) {
          this.securityGroupIds = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html#cfn-glue-devendpoint-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
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
 * [AWS::Glue::DevEndpoint - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-devendpoint.html)
 */
fun Resources.awsGlueDevEndpoint(logicalId: String, init: AWSGlueDevEndpoint.() -> Unit = {}): AWSGlueDevEndpoint {
    return AWSGlueDevEndpoint(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
