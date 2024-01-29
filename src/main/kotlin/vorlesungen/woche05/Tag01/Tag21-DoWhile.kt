package VORLESUNG.Woche05.Tag21


fun main() {
    // Elvis Operator:
    var name: String? = null
    // ?: -> wenn name null ist, schreib "Gast" rein
    val displayName = name ?: "Gast"
    println("Willkommen, $displayName")


    //doWhileString()

    // Elemente aus der Liste entfernen, bis nur noch 1 Element übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")
    //doWhileMovies(movies)

    // positive Zahl eingeben und prüfen, ob sie positiv ist. wenn nicht nochmal eingeben
    var number: Int
    do {
        println("Bitte positive Zahl über 0 eingeben....")
        number = readln().toInt()

    } while (number <= 0)
    println("Prima, du hast die $number eingegeben und sie ist > 0")

}

private fun doWhileMovies(movies: MutableList<String>) {
    var i = movies.size - 1 // fangen beim letzten element an
    do {
        println("Zu entfernendes Element: ${movies[i]}")
        // das element entfernen
        movies.removeAt(i)
        println("Länge der Liste nach dem Entfernen: ${movies.size}")
        println("Übrige Elemente: $movies")
        i--
    } while (i > 0)
}

private fun doWhileString() {
    var input: String
    // do körper wird mind. 1x ausgeführt
    do {
        println("Namen eingeben....")
        input = readln()
    } while (input.isEmpty())

    println("Hallo, $input")
}