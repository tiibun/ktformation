package ktformation.generate

// Hack for intellij compile error.
lateinit var bindings: Map<String, Any?>

infix fun Boolean?.then(then: Any) = if (this == true) then else ""

fun <K, V> Map<K, V>.joinToLines(separator: CharSequence = "", transform: (Map.Entry<K, V>) -> String): String {
    return map(transform).joinToString(separator.toString() + "\n") {
        it.removePrefix("\n").removeSuffix("\n")
    }
}
