package spice

fun main() {
    val mySpice = SimpleSpice()
    println("Spice name: ${mySpice.name}")
    println("Level of spiciness: ${mySpice.heat}")

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")
    println(spice)

    val spicelist = spices1.filter {it.heat < 5}
    println(spicelist)

    fun makeSalt() = Spice("Salt")
    println(makeSalt())
}