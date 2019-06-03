fun main(args: Array<String>) {
    println(canAddFish2(10.0, listOf(), 7, true))
}

fun canAddFish2(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}