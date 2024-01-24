package vorlesungen.woche04.Tag03Videothek

import filmListe
import filmRatings
import filmToGenre
import filmToPrice


// TODO schreibe deinen Code hier!

// Aufgabe 3a - Preisabfrage

fun getFilmPrice(filmTitle: String): Double {

    // return filmToPrice[filmTitle]!!
    // ODER
    return filmToPrice.get(filmTitle) ?: 1.0
}

// Aufgabe 3b - Genreabfrage
fun getFilmGenre(filmTitle: String): String {
    return filmToGenre[filmTitle]!!
}

// Aufgabe 3c - Bewertungsabfrage

fun getFilmRatings(filmTitle: String): MutableList<Int> {
    return filmRatings[filmTitle]!!
}

fun getCheapestPrice(): Double {
    return filmToPrice.values.min()
}

fun getMostExpensivePrice(): Double {
    return filmToPrice.values.max()
}

fun getNumberOfMovies(): Int {
    return filmListe.size
//    return filmToPrice.size
//    return filmToGenre.size
}

fun getAverageMoviePrice() : Double {
    return (filmToPrice.values.sum()) / getNumberOfMovies()
    // ODER: direkt Funktion nutzen, die den Durchschnitt berechnet: average
    // return filmToPrice.values.average()
}

fun getMoviesSortedByTitle(): MutableList<String> {
    // sorted: erstellt sortierte kopie,
    // sort: sortiert das original, hätte keinen return Type da nichts neues rauskommt sondern lediglich das original bearbeitet wird
    return filmListe.sorted().toMutableList()
}