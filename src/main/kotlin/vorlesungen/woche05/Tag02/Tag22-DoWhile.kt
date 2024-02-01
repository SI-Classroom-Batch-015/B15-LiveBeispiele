package vorlesungen.woche05.Tag02


fun main() {


    // Unterschied do while / while
    // while: Bedingung muss stimmen, sonst kommen wir niemals in die Schleife
//    var i = 11
//    while (i < 10){
//        println("Hurra wir sind in der Schleife!")
//        println(i)
//    }
//    println("---Ende der while Schleife---")
//
//    // do while: wird immer mind 1x ausgefuehrt, auch wenn die Bedingung nicht true ist
//    var j = 11
//    do {
//        println("Hurra wir sind in der Schleife!")
//        println(j)
//    } while (j < 10)
//    println("---Ende der DO while Schleife---")
//


    // Elemente aus der Liste entfernen, bis nur noch das letzte Element, The Dark Knight, übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")

    removeMoviesWhile(movies)

    removeMoviesDoWhile(movies)


    // Zahl eingeben und prüfen, ob sie gerade ist. wenn nicht: nochmal eingeben


}

fun removeMoviesDoWhile(movies: MutableList<String>) {
    // Elemente aus Liste entfernen, bis nur noch Inception, das erste Element, übrig ist
    var it = movies.size-1 // reminder: size-1 liefert uns immer den letzten Index
    // solange wir nicht beim Index 0 angekommen sind:
    do {
        // film am Index it entfernen
        movies.removeAt(it)
        println(movies)
        // it dekrementieren, damit wir nicht fuer immer an index movies.size-1 hängen bleiben
        it--
        // it > 0 heisst, wir stoppen am 0. index, der film an diesem index bleibt also
    } while (it > 0)
    println("Movies nach der Schleife: $movies")
}

private fun removeMoviesWhile(movies: MutableList<String>) {
    // Schleife benutzen, um alles bis auf den letzten Film zu entfernen:
    var it: Int = 0
    while (it < movies.size - 1) {
        movies.removeAt(it)
        println(movies)
    }

    println(movies)
}
