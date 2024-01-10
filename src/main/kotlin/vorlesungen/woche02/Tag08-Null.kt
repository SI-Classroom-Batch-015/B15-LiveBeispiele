package vorlesungen.Woche02

fun main() {
    // nullable Variable anlegen: braucht ? (nullable bedeutet: es darf null in der Variable stehen)
    var firstName: String? = null
    println(firstName)
    firstName = "Harry"
    println(firstName)
    firstName = null
    println(firstName)
    firstName = "Ron"
    println(firstName)

    // gilt für alle Datentypen
    var number: Int? = null
    // notNullable = null // darf nicht null sein, ? fehlt.
    var doubleNr: Double = 2.0
    // doubleNr = null



    // auch konstanten können null sein:
    val constNr: Int? = null
    // constNr = 1 // geht nicht, da val und unveränderbar


    // NullPointerException
    var list: List<String>? = listOf("hi", "moin")

    println(list!!.get(0))



    // SAFE CALL: den benutzen wir best practice mässig immer, umgeht programm absturz, falls null drin steht, gibt einfach null zurück und läuft dann weiter
    var integer: Int? = 10
    integer = null
    var intToDouble: Double? = integer?.toDouble()
    println("Ergebnis von .toDouble, wenn null in integer stand: $intToDouble")
//    var readln = readln()
//    println("Ergebnis readln mit nur enter: $readln")
//    var readline: String? = readlnOrNull()
//    println("Ergebnis readline (no null rauskommen kann) mit nur enter: $readline")



    // NON NULL ASSERTED CALL: garantiert dem Compiler: keine Sorge, hier steht kein null drin.
    // Gefahr: bringt Programm zum abstürzen, falls doch null in der Variable steht.
    // Zum gezielten Fehler suchen nutzbar
    var double: Double? = 9.0
    // double = null
    var doubleToInt: Int = double!!.toInt() // wirft NullPointerException, wenn Z. 50 einkommentiert ist
    println(doubleToInt)






    // nullable Variablen können zu jedem Zeitpunkt wieder auf null gesetzt werden
//    doubleToInt = null



    // null in Listen
    // Strings


    // Ints


}