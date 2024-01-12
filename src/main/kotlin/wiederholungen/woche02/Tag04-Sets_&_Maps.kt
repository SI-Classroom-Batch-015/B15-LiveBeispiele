package wiederholungen.woche02

fun main() {
    val liste = listOf<String>("Reis", "Kartoffel", "Bohnen", "Bohnen", "Reis", "Kartoffel", "Bohnen")

    val name = setOf("Reis", "Kartoffel", "Bohnen", "Reis", "Kartoffel", "Bohnen")

    val listeZuSet = liste.toSet()

    println("Set: $listeZuSet")

    var namee: String? = null

    val cities = mutableListOf("Deutschland" to "Berlin", "Italien" to null, "Frankreich" to "Paris" )

    val liste2 = listOf<String?>("Reis", "Kartoffel", "Bohnen", "Bohnen", "Reis", "Kartoffel", null , "Bohnen")



    println(cities)

}



