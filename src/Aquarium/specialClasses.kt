package Aquarium

object MobyDickWhale {
    const val author = "Herman Manville"
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "Walrus"
        is SeaLion -> "SeaLion"
    }
}

fun main() {
    println(MobyDickWhale.author)
    val seal = Walrus()
    println(matchSeal(seal))
}