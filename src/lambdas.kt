fun main() {
    val dirty = 20

    val dirtyFilter = { dirty: Int -> dirty/2 }  //lambda function

    println(dirtyFilter(dirty))

    println(waterFilter(dirty))

    dirtyProcessor()
}

// kotlin syntax for function type
//waterFilter function takes an Int and returns an Int
val waterFilter: (Int) -> Int = { dirty -> dirty.div(2) }

fun feedFish(dirty: Int) = dirty + 10

//higher order function, receives function as an argument
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    var dirty = 20
    dirty = updateDirty(dirty, waterFilter)

    // '::' is used because feedFish is not a lambda function
    dirty = updateDirty(dirty, ::feedFish)

    //last parameter called syntax, when lambdas are combined
    //with higher order functions like updateDirty
    dirty = updateDirty(dirty) { dirty -> dirty + 50 }
    println(dirty)
}
