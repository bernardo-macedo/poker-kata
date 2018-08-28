data class Hand(val card1: Card,
                val card2: Card,
                val card3: Card,
                val card4: Card,
                val card5: Card) {

    fun isBetterThan(otherHand: Hand): Boolean {
        return true
    }

    fun isRoyalFlush(): Boolean {
        return true
    }

}
