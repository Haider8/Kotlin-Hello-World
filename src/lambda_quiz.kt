import java.lang.Math.random

fun main() {
    val sides = 6

    // function type notation, type inference used to detect type
    val rollDice: (Int) -> Int = { sides -> if(sides == 0) 0 else (1..sides).random() }

    println(rollDice(sides))

    val rollDice2 = { sides: Int -> if(sides == 0) 0 else (1..sides).random() }
    println(rollDice2(sides))

    gamePlay(rollDice2(sides))
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}
