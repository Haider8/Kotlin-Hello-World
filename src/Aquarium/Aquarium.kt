package Aquarium

import kotlin.math.PI

open class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    // constructor arguments creating member properties, common practise in Kotlin

    fun volume() = (width * height * length).div(1000)

    open var volume: Int
        get() = (width * height * length).div(1000)
        set(value) { height = (value * 1000)/(width * length) }

    open var water = volume * 0.9
    var fishes = 0

    constructor(numberOfFish: Int): this() {
        fishes = numberOfFish
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank: Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * length * height / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }
}