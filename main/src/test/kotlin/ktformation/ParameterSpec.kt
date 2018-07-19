package ktformation

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object ParameterSpec: Spek({
    describe("toJson") {
        it("outputs JSON") {
            assertEquals("String", ParameterType.STRING.toJSON())
        }
    }
})
