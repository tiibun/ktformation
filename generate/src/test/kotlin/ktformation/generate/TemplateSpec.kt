package ktformation.generate

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.net.URL
import kotlin.test.assertEquals

object TemplateSpec : Spek({
    describe("template") {
        it("return string") {
            val template = Template.compile("\"spek\"")
            assertEquals("spek", template.eval())
        }

        it("load template") {
            val template = Template.load("spec.template".asResource())
            assertEquals("spek", template.eval())
        }
    }
})

fun String.asResource(): URL = Thread.currentThread().contextClassLoader.getResource(this)
