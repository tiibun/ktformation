package ktformation.serializer

import ktformation.Serializer
import kotlin.reflect.KClass


class DefaultSerializer : Serializer {

    override fun toJSON(source: Any, pretty: Boolean): String {
        return JacksonJsonSerializer().serialize(source, pretty)
    }

    override fun toYAML(source: Any, short: Boolean): String {
        return SnakeYamlSerializer().serialize(source, short)
    }
}
