package ktformation

interface IntrinsicFunction {
    val name: String
    val value: Any?
}

interface ListIntrinsicFunction : IntrinsicFunction

/**
 * [Fn::Base64 - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
 */
class FnBase64 private constructor(private val valueToEncode: Any) : IntrinsicFunction {
    constructor(valueToEncode: String) : this(valueToEncode as Any)
    constructor(valueToEncode: IntrinsicFunction) : this(valueToEncode as Any)

    override val name = "Fn::Base64"

    override val value get() = valueToEncode
}

/**
 * [Fn::FindInMap - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-findinmap.html)
 */
class FnFindInMap private constructor(
    private val mapName: Any,
    private val topLevelKey: Any,
    private val secondLevelKey: Any
) : IntrinsicFunction {
    constructor(mapName: String, topLevelKey: String, secondLevelKey: String) : this(
        mapName as Any,
        topLevelKey,
        secondLevelKey
    )

    constructor(mapName: String, topLevelKey: String, secondLevelKey: IntrinsicFunction) : this(
        mapName as Any,
        topLevelKey,
        secondLevelKey
    )

    constructor(mapName: String, topLevelKey: IntrinsicFunction, secondLevelKey: String) : this(
        mapName as Any,
        topLevelKey,
        secondLevelKey
    )

    constructor(
        mapName: String,
        topLevelKey: IntrinsicFunction,
        secondLevelKey: IntrinsicFunction
    ) : this(mapName as Any, topLevelKey, secondLevelKey)

    constructor(mapName: IntrinsicFunction, topLevelKey: String, secondLevelKey: String) : this(
        mapName as Any,
        topLevelKey,
        secondLevelKey
    )

    constructor(
        mapName: IntrinsicFunction,
        topLevelKey: String,
        secondLevelKey: IntrinsicFunction
    ) : this(mapName as Any, topLevelKey, secondLevelKey)

    constructor(
        mapName: IntrinsicFunction,
        topLevelKey: IntrinsicFunction,
        secondLevelKey: String
    ) : this(mapName as Any, topLevelKey, secondLevelKey)

    constructor(mapName: IntrinsicFunction, topLevelKey: IntrinsicFunction, secondLevelKey: IntrinsicFunction) : this(
        mapName as Any,
        topLevelKey,
        secondLevelKey
    )

    constructor(mapping: Mapping, topLevelKey: String, secondLevelKey: String) : this(
        mapping.name,
        topLevelKey,
        secondLevelKey
    )

    constructor(mapping: Mapping, topLevelKey: IntrinsicFunction, secondLevelKey: String) : this(
        mapping.name,
        topLevelKey,
        secondLevelKey
    )

    constructor(mapping: Mapping, topLevelKey: String, secondLevelKey: IntrinsicFunction) : this(
        mapping.name,
        topLevelKey,
        secondLevelKey
    )

    constructor(
        mapping: Mapping,
        topLevelKey: IntrinsicFunction,
        secondLevelKey: IntrinsicFunction
    ) : this(mapping.name, topLevelKey, secondLevelKey)

    override val name = "Fn::FindInMap"

    override val value get() = listOf(mapName, topLevelKey, secondLevelKey)
}

/**
 * [Fn::GetAtt - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
 */
class FnGetAtt private constructor(
    private val logicalNameOfResource: Any,
    private val attributeName: Any
) : IntrinsicFunction {

    constructor(logicalNameOfResource: String, attributeName: String) : this(
        logicalNameOfResource as Any,
        attributeName
    )

    constructor(logicalNameOfResource: Resource<*>, attributeName: String) : this(
        logicalNameOfResource.logicalId,
        attributeName
    )

    override val name = "Fn::GetAtt"

    override val value get() = listOf(logicalNameOfResource, attributeName)

    val shortValue get() = "$logicalNameOfResource.$attributeName"
}

/**
 * [Fn::GetAZs - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getavailabilityzones.html)
 */
class FnGetAZs private constructor(private val region: Any) : ListIntrinsicFunction {

    constructor(region: String) : this(region as Any)
    constructor(region: IntrinsicFunction) : this(region as Any)

    override val name = "Fn::GetAZs"

    override val value get() = region
}

/**
 * [Fn::ImportValue - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html)
 */
class FnImportValue private constructor(private val sharedValueToImport: Any) : IntrinsicFunction {
    constructor(sharedValueToImport: String) : this(sharedValueToImport as Any)
    constructor(sharedValueToImport: IntrinsicFunction) : this(sharedValueToImport as Any)

    override val name = "Fn::ImportValue"

    override val value get() = sharedValueToImport
}

/**
 * [Fn::Join - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-join.html)
 */
class FnJoin(private val delimiter: String, private vararg val listOfValues: Any) : IntrinsicFunction {
    override val name = "Fn::Join"

    override val value get() = listOf(delimiter, listOfValues)
}

/**
 * [Fn::Select - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-select.html)
 */
class FnSelect private constructor(private val index: Int, private val listOfObjects: Any) : IntrinsicFunction {
    constructor(index: Int, listOfObjects: List<*>) : this(index, listOfObjects as Any)
    constructor(index: Int, listOfObjects: ListIntrinsicFunction) : this(index, listOfObjects as Any)

    override val name = "Fn::Select"

    override val value get() = listOf(index, listOfObjects)
}

/**
 * [Fn::Split - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-split.html)
 */
class FnSplit private constructor(private val delimiter: String, private val sourceString: Any) : IntrinsicFunction {
    constructor(delimiter: String, sourceString: String) : this(delimiter, sourceString as Any)
    constructor(delimiter: String, sourceString: IntrinsicFunction) : this(delimiter, sourceString as Any)

    override val name = "Fn::Split"

    override val value get() = listOf(delimiter, sourceString)
}

/**
 * [Fn::Sub - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-sub.html)
 */
class FnSub private constructor(private val string: Any) : IntrinsicFunction {
    constructor(string: String, variables: Map<String, Any>) : this(listOf(string, variables))
    constructor(string: String) : this(string as Any)
    constructor(string: IntrinsicFunction) : this(string as Any)

    override val name = "Fn::Sub"

    override val value get() = string
}

/**
 * [Ref - AWS CloudFormation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
 */
class Ref(private val logicalName: String) : IntrinsicFunction {
    constructor(resource: Resource<*>) : this(resource.logicalId)
    constructor(pseudoParameter: AWS) : this(pseudoParameter.toString())
    constructor(parameter: Parameter) : this(parameter.name)

    override val name = "Ref"

    override val value get() = logicalName
}

fun <T : ResourceProperties> Resource<T>.ref(): IntrinsicFunction = Ref(this)

fun Parameter.ref(): IntrinsicFunction = Ref(this)

// Condition Functions
interface ConditionFunction : IntrinsicFunction

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-and
 */
class FnAnd(private vararg val conditions: Any) : ConditionFunction {

    override val name = "Fn::And"

    override val value get() = conditions
}

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-equals
 */
class FnEquals(private val value1: Any, private val value2: Any) : ConditionFunction {

    override val name = "Fn::Equals"

    override val value get() = listOf(value1, value2)
}

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-if
 */
class FnIf(private val conditionName: String, private val valueIfTrue: Any, private val valueIfFalse: Any) :
    ConditionFunction {

    override val name = "Fn::If"

    override val value get() = listOf(conditionName, valueIfTrue, valueIfFalse)
}

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-not
 */
class FnNot(private val condition: Any) : ConditionFunction {

    override val name = "Fn::Not"

    override val value get() = condition
}

/**
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-conditions.html#intrinsic-function-reference-conditions-or
 */
class FnOr(private vararg val conditions: Any) : ConditionFunction {

    override val name = "Fn::Or"

    override val value get() = conditions
}

/**
 * Pseudo Parameters
 */
enum class AWS {
    AccountId,
    NotificationARNs,
    NoValue,
    Partition,
    Region,
    StackId,
    StackName,
    URLSuffix;

    override fun toString(): String = "AWS::$name"

    fun ref() = Ref(this)
}

class Condition(override val value: Any) : ConditionFunction {
    override val name = "Condition"
}

// CodePipeline Functions
/**
 * [Using Parameter Override Functions with AWS CodePipeline Pipelines - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html#w2ab2c13c17b7)
 */
class FnGetArtifactAtt private constructor(
    private val artifactName: Any,
    private val attributeName: AttributeName
) : IntrinsicFunction {

    enum class AttributeName {
        BucketName,
        ObjectKey,
        URL
    }

    override val name = "Fn::GetArtifactAtt"

    override val value get() = listOf(artifactName, attributeName)
}

/**
 * [Using Parameter Override Functions with AWS CodePipeline Pipelines - AWS CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html#w2ab2c13c17b9)
 */
class FnGetParam private constructor(
    private val artifactName: Any,
    private val JSONFileName: Any,
    private val keyName: Any
) : IntrinsicFunction {

    override val name = "Fn::GetParam"

    override val value get() = listOf(artifactName, JSONFileName, keyName)
}
