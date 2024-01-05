package vorlesungen.woche01

fun main() {

    // Typenkonvertierung: Ergebnis in neuer Variable speichern
    val stringNr: String = "4.20"
    println(stringNr) // 4.20
    println(stringNr.toDouble()) // 4.20

    // String konvertieren
    stringNr.toDouble() // Vorsicht: stringNr verändert sich gar nicht, wird nicht zum Double, sondern bleibt ein String!
    println("stringNr + 1.0:")
    println(stringNr + 1.0)   // 4.201.0, hier findet Konkatenation (Verkettung) statt

    // toDouble, toInt, etc. verändern nicht den Originalwert.
    // Stattdessen wird ein neuer Wert, der in eine Variable gespeichert werden muss, zurückgegeben
    var doubleNr: Double = stringNr.toDouble()
    println("doubleNr + 1.0:")
    println(doubleNr + 1.0)

    // Scope/Code Block/Logik innerhalb eines Strings
    var nr1: Int = 2
    var nr2: Int = 2
    println("Hier ist eine Rechnung: 2 + 2 = ${nr1 + nr2}")

    // readln
    println("Gib eine Zahl ein...")
    var eingegebeneZahl: String = readln()
    println("Die eingegebene Zahl ist: $eingegebeneZahl")
}
