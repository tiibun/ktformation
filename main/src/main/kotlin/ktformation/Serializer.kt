package ktformation

import ktformation.serializer.DefaultSerializer

interface Serializer {
    fun toJSON(source: Any, pretty: Boolean = false): String
    fun toYAML(source: Any, short: Boolean = false): String
}

class SerializerFactory {
    fun build(): Serializer {
        return DefaultSerializer()
    }
}

fun Any.toJSON(pretty: Boolean = false): String = SerializerFactory().build().toJSON(this, pretty)

fun Any.toYAML(short: Boolean = false): String = SerializerFactory().build().toYAML(this, short)

