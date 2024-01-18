package VORLESUNG.Woche03.Tag14Kdocs

fun main() {
    println(calculateAge())
    println(calculateAge(1995))

    val ageBornIn90: Int = calculateAge(1990)
    println(ageBornIn90)

    println("Im Jahr 2050 bist du ${ageBornIn90+27} Jahre alt")

}

/**
 * Berechnet das Alter einer Person im Jahr 2024 basierend auf dem Geburtsjahr
 * @param birthYear das Geburtsjahr, per Default ist es 2000
 * @return age das ausgerechnete Alter der Person
 */
fun calculateAge(birthYear: Int = 2000): Int {
    var age = 2024-birthYear
    return age
}
