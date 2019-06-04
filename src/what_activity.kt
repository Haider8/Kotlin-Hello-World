fun main() {
    println(whatShouldIDoToday(temperature = 35))
}

fun whatShouldIDoToday(mood: String = getMood(), weather: String = "sunny", temperature: Int = 24) : String {
    return when {  // no arguments for when while checking multiple variables
        isMoodHappy(mood) && isWeatherSunny(weather) -> "go for a walk"
        isMoodHappy(mood) && isWeatherSunny(weather) && isTemperatureHot(temperature) -> "stay in bed"
        isTemperatureHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isMoodHappy(mood: String) = mood == "happy"

fun isWeatherSunny(weather: String) = weather == "Sunny"

fun isTemperatureHot(temperature: Int) = temperature >= 30

fun getMood() = readLine()!!