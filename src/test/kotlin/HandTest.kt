import org.junit.Assert
import org.junit.Test

class HandTest {

    @Test
    fun shouldInitializeWithFiveGivenCards() {
        val card1 = Card("2", 'D')
        val card2 = Card("2", 'D')
        val card3 = Card("2", 'D')
        val card4 = Card("2", 'D')
        val card5 = Card("2", 'D')
        val hand = Hand(card1, card2, card3, card4, card5)

        Assert.assertEquals(card1, hand.card1)
        Assert.assertEquals(card2, hand.card2)
        Assert.assertEquals(card3, hand.card3)
        Assert.assertEquals(card4, hand.card4)
        Assert.assertEquals(card5, hand.card5)
    }

    @Test
    fun shouldReturnTrueIfIsRoyalFlush() {
        val hand = Hand(
                Card("10",'D'),
                Card("J",'D'),
                Card("Q",'D'),
                Card("K",'D'),
                Card("A",'D')
        )

        Assert.assertTrue(hand.isRoyalFlush())
    }

    @Test
    fun shouldReturnTrueIfHandIsBetter() {
        val hand1 = Hand(
                Card("5",'H'),
                Card("5",'C'),
                Card("6",'S'),
                Card("7",'S'),
                Card("K",'D')
        )

        val hand2 = Hand(
                Card("2",'H'),
                Card("2",'C'),
                Card("2",'S'),
                Card("2",'S'),
                Card("2",'D')
        )

        Assert.assertTrue(hand1.isBetterThan(hand2))
    }

}