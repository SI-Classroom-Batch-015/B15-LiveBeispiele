package vorlesungen.woche03.Tag04Dokumentation

fun main() {
    // Funktionen ohne return Wert geben immer Kotlin.Unit zurück
    var greeting: Unit = greeting() // greeting = Kotlin.Unit

    // Funktionen mit return geben immer das Ergebnis, das hinter dem return Schlüsselwort am Ende der Funktion steht, zurück
    var result: Double = divide() // result = 5.0

    val result1:  Double = divide(16.0,4.0)
    val result2:  Double = divide(26.0,4.0)
    val result3:  Double = divide(30.0,2.0)
    println(result1)
    println(result2)
    println(result3)

    // Funktionsaufrufe können unendlich tief geschachtelt werden
    val divideSum: Double = result1 + 9.0 + divide(result1,2.0) + divide(divide(100.0,10.0),result3)

    // um Ergebnis weiter zu benutzen, müssen wir es in eine Variable packen. Sonst wird es in Zeile 19 sofort wieder vergessen
    /* val result 4 = */ divide(9.0,3.0) // 3.0


    val intResult: Int = divide(20.0,5.0).toInt()

    // Funktionen mit Listen
    // ohne Parameter:
    val shuffledABC: MutableList<String> = shuffleMutableList()

    // mit Parameter:
    // Datentyp Any: darf any (= jeglicher) Datentyp sein, ob String, Int, Double, etc.
    val shuffledInts: MutableList<Any> = shuffleMutableList(listOf(1,5,7,3,4,8))
    val shuffledAgain: MutableList<Any> = shuffleMutableList(shuffledInts.toList())
    val stringList: MutableList<Any> = mutableListOf("Apfel","Kirsche","Banane")
    val stringListShuffled: MutableList<Any> = shuffleMutableList(stringList.toList())

    println(shuffledInts)
    println(shuffledAgain)
    println(stringList)
    println(stringListShuffled)

}


// 1. Stufe: einfache Void-Funktion (Void = ohne return Wert)

/**
 * Druckt einen Gruß "Hallo, wie geht es euch?" in die Konsole aus.
 */
fun greeting(): Unit {
    println("Hallo, wie geht es euch?")
}

// 2. Stufe: einfache return Funktion (mit return Wert)
    // braucht return Wert Datentypen und return Ausdruck mit Ergebnis dahinter

/**
 * Dividiert 10.0 geteilt durch 2.0 und gibt das Ergebnis zurück
 * @return 5.0
 */
fun divide(): Double {
    return 10.0/2.0
}

// 3. Stufe: Funktion mit Parametern
// btw: Funktionen dürfen gleich heißen, solange sie unterschiedliche Signaturen haben (heißt: solange sie unterschiedliche Parameter haben)
/**
 * Dividiert nr1 durch nr2, die zwei als Parameter übergebenen zahlen
 * @param nr1 ein Double, durch das geteilt werden soll (Divident)
 * @param nr2 ein Double, das teilen soll (Divisor)
 * @return result das Ergebnis der Division
 */
fun divide(nr1: Double, nr2: Double): Double{
    // Funktionen sind überall, auch ineinander, aufrufbar
    greeting()
    val result = nr1/nr2
    return result
}


// 3.1. Stufe: Liste als return

fun shuffleMutableList(): MutableList<String> {
    // hardgecodete Liste, ist immer die gleiche
    return listOf("a","b","c").shuffled().toMutableList()
}

// 3.2. Stufe: Liste als Parameter und als return
// dynamische Liste, ist je nachdem, womit ich die Funktion aufrufe, unterschiedlich

/**
 * Mischt die übergebene Liste durch und gibt sie als MutableList zurück
 * @param list Eine Liste jedes Datentyps (Any)
 * @return die gemischte mutable list
 */
fun shuffleMutableList(list: List<Any>): MutableList<Any> {
    return list.shuffled().toMutableList()
}

// theoretisch kann man unendlich viele Parameter setzen
/**
 * Eine Funktion mit vielen Params
 * @param x ist ein Integer, der irgendwas darstellen soll
 * @param y
 * @param z
 * @param f
 */
fun funWithParams(x: Int, y: Double, z: String, f: MutableList<String>){

}






