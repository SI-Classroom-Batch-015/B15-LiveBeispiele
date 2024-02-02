val movieMap = mapOf(
    "Avatar" to listOf(10, 3, 6, 2, 8, 5, 9),
    "James Bond" to listOf(5, 3, 5, 7, 3, 1, 3),
    "One Piece" to listOf(8, 9, 10, 5, 7, 2, 3),
    "Der Schacht" to listOf(3, 3, 6, 9, 5, 4, 2),
    "Dragon Ball" to listOf(7, 8, 4, 5, 3, 8, 1),
    "Van Helsing" to listOf(8, 5, 1, 6, 8, 4, 5),
)

fun main() {

    // Ziel der Aufgabe ist es, die Filme zu finden, welche am meisten Bewertungen zwischen 3 und 7 bekommen haben.

    // 1. teilschritt: filtern
    println(movieMap
        .filter{ it.value
            // 2. Teilschritt: alle keys rausholen, die bewertungen zw 3 und 7 haben
            .any { rating -> rating in 3..7 } }.keys
        // 3. absteigend sortieren: alle listen
        .sortedByDescending { movieMap[it]!!
            // 4. und zwar danach sortieren, wie viele bewertungen zw 3 und 7 sie haben
            .count { rating -> rating in 3..7 } })

    // Pair
    //  first               second
    // "Van Helsing" to listOf(8, 5, 1, 6, 8, 4, 5),
    // Pair() kommt raus, wenn man zB eine map zu einer Liste konvertiert. dann sieht die Liste so aus:
    /*
    // listOf( Pair("Van Helsing",listOf(8, 5, 1, 6, 8, 4, 5)), ..., ... )
     */

   val moviesWRatings:List<Pair<String, Int>> = movieMap.map { (movies,ratings) -> movies to ratings.count { rating -> rating in 3..7 } }

    val moviesWRatingsSorted =  moviesWRatings.sortedByDescending { it.second }.map { it.first }

    println(moviesWRatingsSorted)

    // TODO oG musterloesung


    // alternative mit filterValues
    // 1. alle values rausfiltern, bei denen es bewertungen zw 3..7 gibt
    println(movieMap.filterValues { ratings -> ratings.any { it in 3..7 } }
        // die dazugehoerigen keys absteigend danach sortieren, wie oft 3..7 vorkommen
        .keys.sortedByDescending { movieMap[it]!!.count { it in 3..7 } })

}