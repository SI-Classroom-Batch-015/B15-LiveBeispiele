package vorlesungen.woche03.Tag02ReturnWerte

// Globale Konstanten werden in SNAKE_CASE geschrieben
val VORNAMEN = mutableListOf(
    "Johannes",
    "Michael",
    "Thomas",
    "Andreas",
    "Daniel",
    "Stefan",
    "Markus",
    "Alexander",
    "Christian",
    "Martin",
    "Anna",
    "Maria",
    "Lisa",
    "Sarah",
    "Julia",
    "Christina",
    "Laura",
    "Jessica",
    "Melanie",
    "Sandra"
)
val NACHNAMEN = listOf(
    "Müller",
    "Schmidt",
    "Schneider",
    "Fischer",
    "Weber",
    "Wagner",
    "Becker",
    "Hoffmann",
    "Schäfer",
    "Koch",
    "Bauer",
    "Richter",
    "Klein",
    "Wolf",
    "Schröder",
    "Neumann",
    "Schwarz",
    "Braun",
    "Zimmermann",
    "Krüger"
)

fun main(){

    namensGenerator()
    namensGenerator()
    namensGenerator()
    namensGenerator()
    namensGenerator()
    zufallsZahl()


    // Void Funktionen gehören nicht in ein Println
    println(namensGenerator())
    println(zufallsZahl())


    // Unterschied zwischen sort und sorted
    var sort = VORNAMEN.sort()     // kein Rückgabewert, verändert die VORNAMEN mutable List
    var sorted = VORNAMEN.sorted()   // Rückgabewert: sortierte Kopie der Liste, auch auf nicht mutable Lists aufrufbar
    NACHNAMEN.sorted()

    println(sort) // kotlin.Unit, denn: sort gibt nicht eine sortierte Kopie zurück, sondern sortiert lediglich die VORNAMEN liste ohne return wert
    println(sorted) // [liste aller namen, sortiert] , da sorted eine sortierte Kopie zurückgibt und die originale Liste nicht bearbeitet
}


