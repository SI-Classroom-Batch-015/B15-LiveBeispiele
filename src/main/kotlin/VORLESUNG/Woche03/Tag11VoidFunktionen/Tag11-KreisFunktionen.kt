package VORLESUNG.Woche03.Tag11VoidFunktionen

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round

fun main() {
    // Funktionsaufrufe:
    radiusToSurface()
    circumference()
    roundExample()
}

private fun roundExample() {
    // runden ausprobieren
    val double: Double = 9.219483
    val roundedDouble = round(double)
    println("$double gerundet auf die nächste ganze Zahl ist: $roundedDouble")
}

// Fläche eines Kreises ausrechnen. Formel: Radius * Radius * pi (also radius^2 mal pi)
// Funktions namens: radiusToSurface: User gibt Radius ein, Funktion berechnet daraus die Fläche eines Kreises mit diesem Radius
fun radiusToSurface(){
    // 1. Schritt: sinnvolles println
    println("Bitte gib einen Radius ein, für den du die Kreisfläche haben möchtest...")

    // 2. Schritt: radius eingeben = mit readln in einer Variable speichern
    val radius: Double = readln().toDouble()

    // 3. Schritt: Flächenberechnung aus diesem Radius mit der Formel Radius * Radius * PI
    val surface: Double = radius.pow(2) * PI // 28,74

    // zum abpausen:
    // preis = "%.2f".format(preis).replace(',', '.').toDouble()


    // Doubles auf x Nachkommastellen runden: String.format("%.xf", double)
    val surfaceRounded: Double = "%.2f".format(surface).replace(",",".").toDouble()

    // 4. Schritt: sinnvolles Ergebnis-println
    println("Die Fläche eines Kreises mit dem Radius $radius ist $surfaceRounded.")
}

// Umfang eines Kreises ausrechnen, Formel: 2 * radius * pi
fun circumference() {
    // 1. Schritt: sinnvolles println
    println("Bitte gib einen Radius ein, für den du die Kreisfläche haben möchtest...")

    // 2. Schritt: radius eingeben = mit readln in einer Variable speichern
    val radius: Double = readln().toDouble()

    // 3. Schritt: Rechnung, also 2*radius* PI
    val circ: Double = 2*radius* PI

    // zum abpausen:
    // preis = "%.2f".format(preis).replace(',', '.').toDouble()
    val circRounded: Double = "%.2f".format(circ).replace(",",".").toDouble()

    println("Der Umfang des Kreises mit dem Radius $radius ist $circRounded")

}




