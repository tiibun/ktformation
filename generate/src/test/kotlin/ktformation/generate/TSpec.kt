package ktformation.generate

import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import javax.script.ScriptEngineManager

class Tmpl {
    companion object {
        val engine by lazy {
            ScriptEngineManager().getEngineByName("kotlin") as KotlinJsr223JvmLocalScriptEngine
        }
    }
}

object TSpec: Spek({
    describe("bindings") {
        it("is what to do") {
            val script = Tmpl.engine.compile("""bindings""")
            Tmpl.engine.put("x", 1)
            println(script.eval()::class)
        }
    }
})