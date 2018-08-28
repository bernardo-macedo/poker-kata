import io.kotlintest.properties.assertAll
import io.kotlintest.shouldThrow
import org.junit.Assert
import org.junit.Test

class CardTest {

    @Test
    fun shouldAcceptValuesBetween2And10AndCorrectSuits() {
        (2..10).forEach { value ->
            listOf('D', 'H', 'C', 'S').forEach { suit ->
                val card = Card(value.toString(), suit)
                Assert.assertNotNull(card)
            }
        }
    }

    @Test
    fun shouldAcceptRoyalValues() {
        listOf("J", "Q", "K", "A").forEach { value ->
            val card = Card(value, 'D')
            Assert.assertNotNull(card)
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun shouldNotAcceptValuesLowerThan2() {
        Card("1", 'D')
    }

    @Test(expected = IllegalArgumentException::class)
    fun shouldNotAcceptValuesGreaterThan10() {
        Card("11", 'D')
    }

    @Test(expected = IllegalArgumentException::class)
    fun shouldNotAcceptLettersOtherThanRoyalValues() {
        Card("X", 'D')
    }

    @Test
    fun shouldNotAcceptAnyCharOtherThanCorrectOnesAsSuits() {
        assertAll { randomString: String ->
            if (randomString.isNotEmpty() && randomString[0] !in listOf('D', 'H', 'C', 'S')) {
                shouldThrow<IllegalArgumentException> {
                    Card("2", randomString[0])
                }
            }
        }
    }
}