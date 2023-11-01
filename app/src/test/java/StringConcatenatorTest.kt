import org.junit.Test
import org.junit.Assert.assertEquals

class StringConcatenatorTest {
    @Test
    fun testConcatenatorStrings() {
        val concatenator = StringConcatenator()

        val result = concatenator.concatenate("Hello, ", "World!")
        assertEquals("Hello, World!", result)
    }
}
