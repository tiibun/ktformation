package ktformation.serializer

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import ktformation.IntrinsicFunction
import ktformation.JSONotable

class JacksonJsonSerializer {

    private val jsonSerializer = jacksonObjectMapper().apply {
        propertyNamingStrategy = PropertyNamingStrategy.UpperCamelCaseStrategy()
        setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
        enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
        enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING)
        registerModule(SimpleModule().addSerializer(IntrinsicFunction::class.java, FunctionSerializer())
            .addSerializer(JSONotable::class.java, JSONotableSerializer()))
    }

    fun serialize(source: Any, pretty: Boolean): String {
        return jsonSerializer.run {
            if (pretty) writerWithDefaultPrettyPrinter().writeValueAsString(source)
            else writeValueAsString(source)
        }
    }

    private class FunctionSerializer : JsonSerializer<IntrinsicFunction>() {
        override fun serialize(attribute: IntrinsicFunction?, gen: JsonGenerator?, serializers: SerializerProvider?) {
            gen?.writeObject(mapOf(attribute?.name to attribute?.value))
        }
    }

    private class JSONotableSerializer: JsonSerializer<JSONotable>() {
        override fun serialize(value: JSONotable?, gen: JsonGenerator?, serializers: SerializerProvider?) {
            gen?.writeString(value?.toJSON())
        }
    }
}
