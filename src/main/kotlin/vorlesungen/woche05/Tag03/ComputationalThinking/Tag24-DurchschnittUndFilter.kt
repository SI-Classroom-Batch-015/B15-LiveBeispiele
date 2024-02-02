package vorlesungen.Woche05.ComputationalThinking

fun main() {
    val namesAndAges = listOf(
        Pair("Alice", 30),
        Pair("Bob", 25),
        Pair("Charlie", 40),
        Pair("David", 22)
    )
    // Durchschnittsalter

    val averageAge = namesAndAges.map { it.second }.average()
    // map -> transformiert die liste und gibt eine neue aus

    println("Durchschnittsalter ist $averageAge")
}
/*
fun calculateAverageAge(namesAndAges: List<Pair<String, Int>>): Double {
    val totalAge = namesAndAges.sumBy { it.second }
    return totalAge.toDouble() / namesAndAges.size
}

fun main() {
    val namesAndAges = listOf(
        Pair("Alice", 30),
        Pair("Bob", 25),
        Pair("Charlie", 40),
        Pair("David", 22)
    )

    val averageAge = calculateAverageAge(namesAndAges)

    println("Der Durchschnitt des Alters beträgt: $averageAge")
}
*/
