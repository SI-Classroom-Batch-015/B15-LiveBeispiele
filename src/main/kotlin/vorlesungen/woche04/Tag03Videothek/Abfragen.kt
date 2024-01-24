package vorlesungen.woche04.Tag03Videothek

import filmToPrice


// TODO schreibe deinen Code hier!

// Aufgabe 3a - Preisabfrage

fun getFilmPrice(filmTitle: String): Double {

    // return filmToPrice[filmTitle]!!
    // ODER
    return filmToPrice.get(filmTitle)!!



}