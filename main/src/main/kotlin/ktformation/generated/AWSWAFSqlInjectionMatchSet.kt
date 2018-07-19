
package ktformation.generated

import ktformation.*

/**
 * [AWS::WAF::SqlInjectionMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html)
 */
@CloudFormationMarker
class AWSWAFSqlInjectionMatchSet(logicalId: String) : Resource<AWSWAFSqlInjectionMatchSet.Properties>(logicalId, "AWS::WAF::SqlInjectionMatchSet") {

    @CloudFormationMarker
    class Properties : ResourceProperties() {
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        @JvmField
        var name: Any? = null

        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: String) {
          this.name = value
        }
        
        /**
         * [name](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun name(value: IntrinsicFunction) {
          this.name = value
        }

        /**
         * [sqlInjectionMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<SqlInjectionMatchTuple>
         */
        @JvmField
        var sqlInjectionMatchTuples: Any? = null

        /**
         * [sqlInjectionMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<SqlInjectionMatchTuple>
         */
        fun sqlInjectionMatchTuples(value: List<SqlInjectionMatchTuple>) {
          this.sqlInjectionMatchTuples = value
        }
        
        /**
         * [sqlInjectionMatchTuples](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
         *
         * _Required_: no
         *
         * _Type_: List<SqlInjectionMatchTuple>
         */
        fun sqlInjectionMatchTuples(vararg value: IntrinsicFunction) {
          this.sqlInjectionMatchTuples = value
        }

        /**
        * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html)
        */
        fun fieldToMatch(init: FieldToMatch.() -> Unit = {}): FieldToMatch {
            return FieldToMatch().also {
                it.init()
            }
        }
        /**
        * [SqlInjectionMatchTuple](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html)
        */
        fun sqlInjectionMatchTuple(init: SqlInjectionMatchTuple.() -> Unit = {}): SqlInjectionMatchTuple {
            return SqlInjectionMatchTuple().also {
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
    class FieldToMatch {
            /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        var data: Any? = null

        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: String) {
          this.data = value
        }
        
        /**
         * [data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data)
         *
         * _Required_: no
         *
         * _Type_: String
         */
        fun data(value: IntrinsicFunction) {
          this.data = value
        }

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var type: Any? = null

        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: String) {
          this.type = value
        }
        
        /**
         * [type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun type(value: IntrinsicFunction) {
          this.type = value
        }

    }

    @CloudFormationMarker
    class SqlInjectionMatchTuple {
            /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        var fieldToMatch: Any? = null

        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: FieldToMatch) {
          this.fieldToMatch = value
        }
        
        /**
         * [fieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-fieldtomatch)
         *
         * _Required_: yes
         *
         * _Type_: FieldToMatch
         */
        fun fieldToMatch(value: IntrinsicFunction) {
          this.fieldToMatch = value
        }

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        var textTransformation: Any? = null

        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: String) {
          this.textTransformation = value
        }
        
        /**
         * [textTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation)
         *
         * _Required_: yes
         *
         * _Type_: String
         */
        fun textTransformation(value: IntrinsicFunction) {
          this.textTransformation = value
        }

    }

}

/**
 * [AWS::WAF::SqlInjectionMatchSet - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html)
 */
fun Resources.awsWAFSqlInjectionMatchSet(logicalId: String, init: AWSWAFSqlInjectionMatchSet.() -> Unit = {}): AWSWAFSqlInjectionMatchSet {
    return AWSWAFSqlInjectionMatchSet(logicalId).also {
        it.init()
        put(logicalId, it)
    }
}
