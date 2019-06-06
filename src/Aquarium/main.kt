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

    val smallAquarium = Aquarium(length = 20, width =  15, height =  30)

    println("Volume of small aquarium: ${smallAquarium.volume()}")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small aquarium 2: ${myAquarium2.volume} liters with " +
            "length: ${myAquarium2.length} " +
            "width: ${myAquarium2.width} " +
            "height: ${myAquarium2.height} -- ${myAquarium2.fishes}")

//    fishExample()
//    makeDefaultFish()
}