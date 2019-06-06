package spice

class SimpleSpice {
    var name = "curry"
    var spiciness ="mild"
    var heat: Int = 0
        get() = when (spiciness) {
            "low" -> 3
            "mild" -> 5
            "high" -> 10
            else -> 0
        }
}

class Spice (val name: String, val spiciness: String = "mild") {

    var heat: Int = 0
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }
}
