
package ktformation.generated

import ktformation.*

/**
 * [AWS::Athena::NamedQuery - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
@CloudFormationMarker
class AWSAthenaNamedQuery(logicalId: String) : Resource<AWSAthenaNamedQuery.Properties>(logicalId, "AWS::Athena::NamedQuery") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [database](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var database: Any? = null

        /**
         * [database](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun database(value: String) {
          this.database = value
        }
        
        /**
         * [database](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-database)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun database(value: IntrinsicFunction) {
          this.database = value
        }

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var description: Any? = null

        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: String) {
          this.description = value
        }
        
        /**
         * [description](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-description)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun description(value: IntrinsicFunction) {
          this.description = value
        }

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-name)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var queryString: Any? = null

        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queryString(value: String) {
          this.queryString = value
        }
        
        /**
         * [queryString](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html#cfn-athena-namedquery-querystring)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun queryString(value: IntrinsicFunction) {
          this.queryString = value
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
 * [AWS::Athena::NamedQuery - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-namedquery.html)
 */
fun Resources.awsAthenaNamedQuery(logicalId: String, init: AWSAthenaNamedQuery.() -> Unit = {}): AWSAthenaNamedQuery {
    return AWSAthenaNamedQuery(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
