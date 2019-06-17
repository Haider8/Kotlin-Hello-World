package Aquarium.decorations

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println(d2==d3)
    println(d1==d2)

    val d4: Decorations = d3.copy()
    //creates a new object with same property values
    println(d3)
    println(d4)

    val d5 = Decorations2("crystal", "wood", "diver")
    println(d5)

    val (rock: String, wood: String, diver: String) = d5
    //decomposition
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val diver: String) {}