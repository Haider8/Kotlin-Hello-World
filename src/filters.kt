fun main() {
    eagerExample()
}

fun eagerExample() {
    val fruits = listOf<String>("papaya", "pineapple", "mango", "banana", "guava")

    val eager = fruits.filter { it[0] == 'p' }

    println(eager)

    val eagerSequence =fruits.asSequence().filter { it[0] == 'p' }

    println(eagerSequence)
    println(eagerSequence.toList())
}