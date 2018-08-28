import org.junit.Assert
import org.junit.Test

class PokerTest {

    @Test
    fun shouldCompareCardsValuesAndReturnFalseWhenDifferent() {
        val poker = Poker()
        val result = poker.areValuesEqual("5H", "2C")
        Assert.assertEquals(false, result)
    }

    @Test
    fun shouldCompareSuitsAndReturnTrueWhenEqual() {
        val poker = Poker()
        val result = poker.areSuitsEqual("5H", "2H")
        Assert.assertEquals(true, result)
    }

    @Test
    fun shouldCompareSuitsAndReturnFalseWhenDifferent() {
        val poker = Poker()
        val result = poker.areSuitsEqual("5S", "2H")
        Assert.assertEquals(false, result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun shouldThrowExceptionOnInvalidCardSuit() {
        val poker = Poker()
        val validHand = Hand(
                Card("5",'H'),
                Card("5",'C'),
                Card("6",'S'),
                Card("7",'S'),
                Card("K",'D')
        )
        val invalidHand = Hand(
                Card("2",'H'),
                Card("5",'E'),
                Card("6",'$'),
                Card("7",'S'),
                Card("K",'D')
        )
        poker.compareHands(validHand, invalidHand)
    }

}