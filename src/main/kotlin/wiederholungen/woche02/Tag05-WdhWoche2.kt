package wiederholungen.woche02

fun main() {
    // Lösungsansatz Aufgabe 3

    val listOfNumbers: MutableList<Int> = mutableListOf(
        10,
        20,
        30,
        40,
        50,
        60
    )

    listOfNumbers.add(999)
    println(listOfNumbers)

    listOfNumbers.removeFirst()
    println(listOfNumbers)

    val neuSpeichern: MutableList<Int> = mutableListOf()

    neuSpeichern.add(333)
    println(neuSpeichern)

    neuSpeichern.removeFirst()
    println(neuSpeichern)

    neuSpeichern.add(listOfNumbers.removeFirst())
    println(neuSpeichern)

    // --------------------

    // NULL wird verwendet zum Beispiel bei externen Benutzereinagebn -> leere Eingabe, falsche Eingabe etc.

    // !! -> NON NULL Operator

    var list: List<String?> = listOf(null, "geht?")

    println(list!!.get(0))

    var name: String? = "John"

    println("Name: $name")
    //name = null
    println(name)

    val length = name?.length
    println(length)

    /*

 Maps:

Enthält Schlüssel-Wert-Paare.
Eindeutigkeit der Schlüssel.
Effizienter Zugriff auf Werte über Schlüssel.
Beispiele: mapOf("key" to "value").

 Listen:

Geordnete Sammlung von Elementen.
Erlaubt Duplikate.
Zugriff über Index. -> [0] -> ist element 1
Beispiele: listOf(1, 2, 3).

 Sets:

Ungeordnete Sammlung von eindeutigen Elementen.
Keine Duplikate erlaubt.
Effiziente Überprüfung auf Elemente.
Beispiele: setOf(1, 2, 3).

  */
}