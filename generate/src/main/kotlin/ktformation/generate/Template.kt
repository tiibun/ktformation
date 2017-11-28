package ktformation.generate

import java.net.URL
import javax.script.*

/**
 * Template Engine
 */
class Template private constructor(private val bindings: Bindings, private val compiledScript: CompiledScript) {

    companion object {
        fun load(url: URL): Template = compile(url.readText())

        fun compile(script: String): Template {
            val engine = ScriptEngineManager().getEngineByExtension("kts")
            return Template(engine.createBindings(), (engine as Compilable).compile(script))
        }
    }

    /**
     * put variables from bindings.
     */
    fun putAll(bindings: Map<String, Any?>): Template {
        this.bindings.putAll(bindings)
        return this
    }

    /**
     * put a variable.
     */
    fun put(key: String, value: Any?): Template {
        bindings.put(key, value)
        return this
    }

    /**
     * format the template.
     *
     * @throws TemplateException parse error.
     */
    fun eval(): String {
        try {
            return compiledScript.eval(bindings) as String
        } catch (e: ScriptException) {
            throw TemplateException("Failed to parse: ${e.message}")
        }
    }
}

/**
 * failed to parse template
 */
class TemplateException(message: String? = null,
                        cause: Throwable? = null,
                        enableSuppression: Boolean = false,
                        writableStackTrace: Boolean = false)
    : Exception(message, cause, enableSuppression, writableStackTrace)
