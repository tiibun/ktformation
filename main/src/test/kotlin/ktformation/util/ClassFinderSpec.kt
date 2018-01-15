package ktformation.util

import ktformation.IntrinsicFunction
import ktformation.Ref
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertTrue

object ClassFinderSpec : Spek({
    describe("ClassFinder") {
        it("contains Ref as an IntrinsicFunction child") {
            assertTrue(ClassFinder.getChildren(IntrinsicFunction::class.java).contains(Ref::class.java))
        }
    }
})
