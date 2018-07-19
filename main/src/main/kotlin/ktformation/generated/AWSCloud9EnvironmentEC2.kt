
package ktformation.generated

import ktformation.*

/**
 * [AWS::Cloud9::EnvironmentEC2 - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html)
 */
@CloudFormationMarker
class AWSCloud9EnvironmentEC2(logicalId: String) : Resource<AWSCloud9EnvironmentEC2.Properties>(logicalId, "AWS::Cloud9::EnvironmentEC2") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [automaticStopTimeMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        @JvmField
        var automaticStopTimeMinutes: Any? = null

        /**
         * [automaticStopTimeMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automaticStopTimeMinutes(value: Int) {
          this.automaticStopTimeMinutes = value
        }
        
        /**
         * [automaticStopTimeMinutes](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-automaticstoptimeminutes)
         *
         * _Required_: no
         *
         * _Type_: Int
         */
        fun automaticStopTimeMinutes(value: IntrinsicFunction) {
          this.automaticStopTimeMinutes = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var instanceType: Any? = null

        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: String) {
          this.instanceType = value
        }
        
        /**
         * [instanceType](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-instancetype)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun instanceType(value: IntrinsicFunction) {
          this.instanceType = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [ownerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var ownerArn: Any? = null

        /**
         * [ownerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ownerArn(value: String) {
          this.ownerArn = value
        }
        
        /**
         * [ownerArn](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-ownerarn)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun ownerArn(value: IntrinsicFunction) {
          this.ownerArn = value
        }

        /**
         * [repositories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
         *
         * _Required_: no
         *
         * _Type_: List<Repository>
         */
        @JvmField
        var repositories: Any? = null

        /**
         * [repositories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
         *
         * _Required_: no
         *
         * _Type_: List<Repository>
         */
        fun repositories(value: List<Repository>) {
          this.repositories = value
        }
        
        /**
         * [repositories](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-repositories)
         *
         * _Required_: no
         *
         * _Type_: List<Repository>
         */
        fun repositories(vararg value: IntrinsicFunction) {
          this.repositories = value
        }

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var subnetId: Any? = null

        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: String) {
          this.subnetId = value
        }
        
        /**
         * [subnetId](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html#cfn-cloud9-environmentec2-subnetid)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun subnetId(value: IntrinsicFunction) {
          this.subnetId = value
        }

        /**
        * [Repository](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html)
        */
        fun repository(init: Repository.() -> Unit = {}): Repository {
            return Repository().also {
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
    class Repository {
            /**
         * [pathComponent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var pathComponent: Any? = null

        /**
         * [pathComponent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathComponent(value: String) {
          this.pathComponent = value
        }
        
        /**
         * [pathComponent](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun pathComponent(value: IntrinsicFunction) {
          this.pathComponent = value
        }

        /**
         * [repositoryUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var repositoryUrl: Any? = null

        /**
         * [repositoryUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repositoryUrl(value: String) {
          this.repositoryUrl = value
        }
        
        /**
         * [repositoryUrl](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun repositoryUrl(value: IntrinsicFunction) {
          this.repositoryUrl = value
        }

    }

}

/**
 * [AWS::Cloud9::EnvironmentEC2 - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html)
 */
fun Resources.awsCloud9EnvironmentEC2(logicalId: String, init: AWSCloud9EnvironmentEC2.() -> Unit = {}): AWSCloud9EnvironmentEC2 {
    return AWSCloud9EnvironmentEC2(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
