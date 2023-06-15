import kotlin.random.Random

class Die {
    var color: String
        private set
    var sides: Int
        private set
    var currentSideUp: Int
        private set

    constructor() : this("d6", 6)

    constructor(sides: Int) : this("$sides", sides)

    constructor(color: String, sides: Int) {
        this.color = color
        this.sides = sides
        this.currentSideUp = roll()
    }

    fun roll(): Int {
        currentSideUp = Random.nextInt(1, sides + 1)
        return currentSideUp
    }

    fun setCurrentSide(side: Int) {
        println(side)
        currentSideUp = side;
    }
  
    override fun toString(): String {
        return "A $color die with $sides faces and currently showing a $currentSideUp."
    }
}
