class DiceGame {
    fun run() {
        val die1 = Die()
        println("Creating a default die value: $die1")
        die1.roll()
        println("After rolling value: $die1")
        val die2 = Die(10)
        die2.roll()
        println("After rolling: $die2")

        val die3 = Die("Blue", 8)
        die3.roll()
        println("After rolling: $die3")

        val die4 = Die("Green", 4)
        die4.roll()
        die4.setCurrentSide(die4.sides)
        println("After setting highest value: $die4")

        var rolls = 0
        val diceValue = mutableListOf<Die>()
        repeat(5) {
            diceValue.add(Die())
        }
        while (!hasFive(diceValue)) {
            rolls++
            diceValue.forEach { it.roll() }
        }
        println("Number of rolls to get 5 of a kind: $rolls")
    }

    private fun hasFive(dice: List<Die>): Boolean {
        val counts = dice.groupingBy { it.currentSideUp }.eachCount()
        return counts.containsValue(5)
    }
}

fun main() {
    val game = DiceGame()
    game.run()
}
