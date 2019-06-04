/* All things in Kotlin is an expression with a value
   with some exceptions like for loops and while loops,
   which means they can't be assigned to a variable:)
 */

fun main() {
    println(shouldChangeWater("Sunday"))

    repeat(2) {
        println("repeat")
    }

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println(bubbles)
}

fun shouldChangeWater(day: String,
                      temperature: Int = 22,
                      dirty: Int = getDirtySensorReading()): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" -> true
//        else -> false
//    }
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

//Compact functions
fun isTooHot (temperature: Int) = temperature > 30

fun isDirty (dirty: Int) = dirty > 30

fun isSunday (day: String) = day == "Sunday"

fun getDirtySensorReading() = 20