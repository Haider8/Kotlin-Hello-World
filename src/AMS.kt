fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    val isUnit = "This is an expression"
    println(isUnit)

    val temperature = 45
    val hot = if (temperature  > 50) true else false
    println(hot)

    val message = "you are ${ if (temperature  > 50) "fried" else "safe" } fish"
    println(message)
}