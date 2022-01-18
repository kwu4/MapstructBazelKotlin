package org.mapstruct.example

import org.junit.Test

open class FailingKotlinMapperTest {
    @Test
    open fun testTest() {
        val source = Source(listOf("a", "b"))
        val target = SourceTargetMapper.INSTANCE.sourceToJavaTarget(source)
        assert(source.arg == target.arg)
    }
}
