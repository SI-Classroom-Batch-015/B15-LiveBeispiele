import vorlesungen.woche04.Tag03Videothek.getCheapestPrice
import vorlesungen.woche04.Tag03Videothek.getFilmGenre
import vorlesungen.woche04.Tag03Videothek.getFilmPrice

// Diese Datei kannst du benutzen, um deine Funktionen zu testen

fun main() {

    val ratingsList = generateRatings()
    println(ratingsList)

    val randomPrice = generateRandomPrice()
    println(randomPrice)

    getFilmPrice("Barbie")
    getFilmPrice("Oppneheimer")
    getFilmPrice("Indiana Jones")

    var x = getFilmGenre("Barbie")

    var cheapest : Double = getCheapestPrice()
    println(cheapest)

}