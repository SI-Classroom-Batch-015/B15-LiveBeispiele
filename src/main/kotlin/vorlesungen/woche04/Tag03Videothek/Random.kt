// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int {
    return (1..5).random()
}

// Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
fun generateRatings(): MutableList<Int> {
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()) {
        ratings.add(randomRating())
    }
    return ratings
}


fun generateRandomPrice(): Double {
    // Logik für zufälliges Double zwischen 2.0 und 4.99

    // Variante 1: 2 Ints zusammenfügen
    val euros: Int = (2..4).random()
    val cents: Int = (0..99).random()

    val betrag: Double = euros + cents.toDouble() / 100
    return betrag

    // Variante 2: Googlen

}