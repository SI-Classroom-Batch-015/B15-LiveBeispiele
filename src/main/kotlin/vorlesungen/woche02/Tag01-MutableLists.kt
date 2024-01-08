package vorlesungen.woche02

fun main() {
    // MUTABLE LISTS: auch SCHREIBENDE Operationen möglich (zusätzlich zu allen lesenden Operationen)

    val mutableMovieList: MutableList<String> = mutableListOf("Barbie", "Oppenheimer", "The Nun 2", "Hunger Games")

    println(mutableMovieList)
    // lesende Operationen möglich
    println(mutableMovieList.reversed())
    println(mutableMovieList.sorted())

    // schreibende Operationen:

    // add(element): fügt Element ans Ende der Liste hinzu
    mutableMovieList.add("Harry Potter")
    println(mutableMovieList)
    mutableMovieList.add("Herr der Ringe")
    println(mutableMovieList)
    mutableMovieList.add("Twilight")
    println(mutableMovieList)

    // add(index,element): fügt Element am gegebenen Index hinzu
    mutableMovieList.add(0,"Das letzte Einhorn")
    println(mutableMovieList)
    // Das letzte Einhorn ist am Index 0 also am Anfang der Liste gelandet
    mutableMovieList.add(3,"Avengers")
    println(mutableMovieList)

    // remove: entfernt das Element aus der Liste
    mutableMovieList.remove("Twilight")
    println(mutableMovieList)
    mutableMovieList.remove("Das letzte Einhorn")
    println(mutableMovieList)

    // removeAt: entfernt Element am Index aus der Liste
    mutableMovieList.removeAt(0)
    println(mutableMovieList)


}