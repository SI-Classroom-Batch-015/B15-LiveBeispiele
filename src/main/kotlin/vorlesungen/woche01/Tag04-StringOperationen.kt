package vorlesungen.woche01

import kotlin.math.max

fun main() {
    // length: gibt die Länge eines Strings zurück
    var stringExample: String = "Juhu, heute ist endlich Freitag!"
    println("Die Länge vom String \"Juhu, heute ist endlich Freitag!\" ist: ${stringExample.length}")

    // mit der Länge des Strings weiter rechnen: braucht wieder eine Variable
    var stringExampleLength: Int = stringExample.length // der String hat 32 Zeichen

    // ich will rausfinden, ob die Stringlänge oder die Zahl 50 größer ist
    var maxLength: Int = max(stringExampleLength,50)
    println(maxLength) // die 50 ist größer


    // equals (gleicht): gibt ein Boolean true oder false zurueck, je nachdem ob die beiden Elemente gleich sind oder nicht
    var anotherStringExample: String = "Oh nein, heute ist wieder Montag!"

    var areStringsEqual: Boolean = stringExample.equals(anotherStringExample) // false
    println("Sind $stringExample und $anotherStringExample gleich? -> $areStringsEqual")

    var equal: Boolean = "Hallo".equals("Hallo") // true

    // contains (beinhaltet): gibt Boolean true oder false zurueck, je nachdem, ob das linke Element das Element in den Klammern enthält

    var anthStrContainsWords : Boolean = anotherStringExample.contains("Oh nein") // true
    println("In $anotherStringExample ist die Phrase \"Oh nein\" enthalten? -> $anthStrContainsWords")

    // Schöne, lange Strings machen: 3 """

    val string: String = """
        Name: $anotherStringExample
        Alter: $stringExample
        Geschlecht:
        ...
        bla bla bla bla
    """.trimIndent()
    println(string)
}