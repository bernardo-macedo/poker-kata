data class Card(val value: String, val suit: Char) {

    init {
        validateValue()
        validateSuit()
    }

    private fun validateValue() {
        if (value !in ROYAL_VALUES) {
            try {
                val intValue = Integer.parseInt(value)
                if (intValue < 2 || intValue > 10) {
                    throw IllegalArgumentException()
                }
            } catch (e: NumberFormatException) {
                throw IllegalArgumentException(e)
            }
        }
    }

    private fun validateSuit() {
        if (suit !in POSSIBLE_SUITS) {
            throw IllegalArgumentException()
        }
    }

    companion object {
        val ROYAL_VALUES = listOf("J", "Q", "K", "A")
        val POSSIBLE_SUITS = listOf('D', 'S', 'H', 'C')
    }

}
