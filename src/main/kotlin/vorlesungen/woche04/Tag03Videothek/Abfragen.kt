package vorlesungen.woche04.Tag03Videothek

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
