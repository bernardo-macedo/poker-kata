class Poker {

    fun areValuesEqual(firstCard: String, secondCard: String): Boolean {
        return firstCard[0] == secondCard[0]
    }

    fun areSuitsEqual(firstCard: String, secondCard: String): Boolean {
        return firstCard[1] == secondCard[1]
    }

    fun compareHands(hand1: Hand, hand2: Hand) {
        throw IllegalArgumentException()
    }


}
