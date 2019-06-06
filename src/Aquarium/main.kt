package Aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()  //new instance by calling it's constructor

    println("length: ${myAquarium.length} " +
            "width: ${myAquarium.width} " +
            "height: ${myAquarium.height}")

    myAquarium.width = 30

    println("width: ${myAquarium.width}")

    println("volume: ${myAquarium.volume}")  //volume is accessed as a property
}