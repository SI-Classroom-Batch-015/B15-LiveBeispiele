import vorlesungen.woche04.Tag03Videothek.*

fun main() {

    // Aufgabe 1: Film Oppenheimer zum Sortiment mit Logik hinzufügen

    // 1.1 in die filmliste
    filmListe.add("Oppenheimer")
    // 1.2 in filmToPrice
    filmToPrice["Oppenheimer"] to generateRandomPrice()
    // 1.2 in filmToGenre
    filmToGenre["Oppenheimer"] to "Drama"
    // 1.3 in filmRatings
    filmRatings["Oppneheimer"] to generateRatings()


    println("Willkommen!")
    // Aufgabe 6
    println("Unser Sortiment (alphabetisch sortiert): ")
    println(getMoviesSortedByTitle())
    println(
        "Wir besitzen ${getNumberOfMovies()} Filme und unserer Preisspanne " +
                "liegt bei ${getCheapestPrice()} € bis ${getMostExpensivePrice()} €"
    )
    println("Durchschnittlich kosten unsere Filme ${getAverageMoviePrice()}€")
    println("Wählen Sie einen Film für mehr Informationen (geben Sie den Index ein): ")
    val inputIndex = readln().toInt()
    val movie = getMoviesSortedByTitle()[inputIndex]
    println(
        "Der Film $movie kostet ${getFilmPrice(movie)}€, " +
                "gehört dem Genre ${getFilmGenre(movie)} an " +
                "und hat eine durchschnittliche Bewertung von ${getAverageFilmRatings(movie)}"
    )

    sellMovie()

}