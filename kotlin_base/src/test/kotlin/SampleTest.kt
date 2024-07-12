import org.kot.Sample
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import kotlin.test.assertEquals

internal class SampleTest {

    private val testSample: Sample = Sample()

    @BeforeTest
    fun setup() {
    }

    @AfterTest
    fun tearDown() {
    }

    @org.testng.annotations.Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}