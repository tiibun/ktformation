package ktformation

typealias Json = LinkedHashMap<Any, Any?>

fun json(vararg pairs: Pair<Any, Any?>): Json {
    return Json(mapOf(*pairs))
}
