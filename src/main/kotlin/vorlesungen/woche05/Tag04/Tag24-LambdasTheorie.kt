package VORLESUNG.Woche05.Tag24

fun greaterFive(nr: Int): Boolean {
    return nr > 5
}


fun main() {
    // Aufruf von normaler Funktion greaterFive
    var x = greaterFive(10) // true
    println(greaterFive(3)) // false


    // Gegenüberstellung: greaterFour als Lambda
    // Lambda kann in einer Variable gespeichert werden:
    var greaterFour = {nr: Int -> nr > 4}
    println(greaterFour(9))

    var lengthGreaterFour = {word: String -> word.length > 4}

    // Lambda mit println: kein Einzeiler mehr
    var greaterSix: (Int) -> Boolean = { nr: Int ->
        val stringReturnTest = "Test"
        val isGreater: Boolean = nr > 6
        println("Ist die Zahl $nr > 6? -> $isGreater")
        isGreater // quasi return isGreater
        // stringReturnTest // hier muesste der return Wert (gerade Boolean in Z. 22) zum String werden
    }
    println("--Lamda Variable ohne Parameter/Argumente drucken:--")
    println(greaterSix)

    println(greaterSix(66))

    // Lambda, das Int zurück gibt
    var addNrWithTwo: (Int) -> Int = {nr: Int -> nr+2}
    var add: (Int, Int) -> Int = {nr: Int, nr2 -> nr+nr2}
    var resultTwo: Int = addNrWithTwo(8)
    var result: Int = add(10,10)



    val planets = listOf("Mein ", "Vater ", "erklaert ", "mir ", "jeden ", "Sonntag ", "unsere ", "neun ", "Planeten")
    // Planeten Liste mit for-Schleife durchgehen
    for (planet in planets) {
        println(planet)
    }

    // 4 Zeilen Code, sehr lang. Lambda ist kürzer
    var i = 0
    while (i < planets.size){
        println(planets[i])
        i++
    }


    println("---- Lambda aufruf in Higher Order Function: ----")
    // Gegenüberstellung
    // Planeten Liste mit ForEach Lambda:
    planets.forEach { println(it) }


    // lange Variante:
    planets.forEach { planet ->
        println(planet)
    }







}