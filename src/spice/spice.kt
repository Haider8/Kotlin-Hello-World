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
