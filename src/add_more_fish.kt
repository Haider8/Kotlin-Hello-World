fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish (tankSize: Double,
                currentFish: List<Int> = listOf(2, 2, 2),
                fishSize: Int = 2,
                hasDecorations: Boolean = true): Boolean {
    var totalSize = 0
    var canAdd = false
//    for (size in currentFish) {
//        totalSize = totalSize + size
//    }
    totalSize = currentFish.sum()
    if (hasDecorations) {
        // 1 gallon -> 0.8 inches fish
        val totalFishLength = (0.8).times(tankSize)
        if (fishSize <= totalSize.minus(totalFishLength)) canAdd = true
    } else {
        // 1 gallon -> 1 inches fish
        if (fishSize <= totalSize.minus(tankSize)) canAdd = true
    }
    return canAdd
}