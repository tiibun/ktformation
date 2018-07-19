package ktformation

interface JSONotable {
    fun toJSON(pretty: Boolean = false): String
    fun toYAML(short: Boolean = false): String
}
