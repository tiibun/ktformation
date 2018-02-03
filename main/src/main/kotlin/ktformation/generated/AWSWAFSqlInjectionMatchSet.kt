
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
        
    }

    fun properties(init: Properties.() -> Unit): Properties {
        return Properties().also {
            it.init()
            properties = it
        }
    }


    class FieldToMatch(
            /**
             * [Data](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-data)
             *
             * _Required_: no
             *
             * _Type_: String
             */
            val data: String? = null,
            /**
             * [Type](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html#cfn-waf-sizeconstraintset-sizeconstraint-fieldtomatch-type)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val type: String
    )

    class SqlInjectionMatchTuple(
            /**
             * [FieldToMatch](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-fieldtomatch)
             *
             * _Required_: yes
             *
             * _Type_: FieldToMatch
             */
            val fieldToMatch: FieldToMatch,
            /**
             * [TextTransformation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sqlinjectionmatchset-sqlinjectionmatchtuples.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples-texttransformation)
             *
             * _Required_: yes
             *
             * _Type_: String
             */
            val textTransformation: String
    )

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
