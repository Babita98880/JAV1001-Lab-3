package game

import kotlin.random.Random

enum class Color {
    RED,
    WHITE,
    YELLOW,
    ORANGE,
    BLACK 
}

enum class Sides(val value: Int) {
    THREE(3),
    FOUR(4),
    SIX(6),
    TWENTY(20)
}


// Document this class

// Primary constructor is in the class signature
class Die(private val color: Color, private val numSides: Sides) {
    var sideUp: Int = 1
        private set

    // Called each time we initialize a new Die object.
    init {
        roll()
    }

    // Secondary constructors that call the primary constructor
    constructor(): this(Color.WHITE, Sides.SIX)
    constructor(numSides: Sides): this(Color.WHITE, numSides)

    fun roll() {
        println("rolling the die")
        sideUp = Random.nextInt(1, numSides.value + 1) 
    }

    override fun toString(): String {
        return "A ${color.name.lowercase()} die with ${numSides.value} faces and currently showing a $sideUp."
    }
}

