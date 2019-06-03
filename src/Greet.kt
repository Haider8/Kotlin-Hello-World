import java.util.*

fun main(args: Array<String>) {
    println("hello ${args[0]}")
    feedTheFish()
    swim(50,"slow")  // positional arguments
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")
//    println(randomDay())
}

fun randomDay(): String {
    val week = listOf("Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}

fun fishFood (day: String): String {
    var food = "fasting"

//    return when (day) {
//        "Mon" -> "flakes"
//        "Tues" -> "redworms"
//        "Wed" -> "granules"
//        "Thurs" -> "mosquitoes"
//        "Fri" -> "plankton"
//        else -> "fasting"
//    }

    when (day) {
        "Mon" -> food = "flakes"
        "Tues" -> food = "redworms"
        "Wed" -> food = "granules"
        "Thurs" -> food = "mosquitoes"
        "Fri" -> food = "plankton"
    }

    return food
}

fun swim(time: Int, speed: String = "fast") {
    // fast is the default speed
    println(time)
    println("The fish will swim $speed")
}
