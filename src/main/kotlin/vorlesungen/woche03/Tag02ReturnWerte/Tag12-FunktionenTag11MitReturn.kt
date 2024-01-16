package vorlesungen.woche03.Tag02ReturnWerte

import kotlin.math.PI


fun main(){
    // in age wird das Ergebnis von calculateAge gespeichert, nämlich der Inhalt von age
    val age: Int = calculateAge()
    println("Das Ergebnis von calculateAge ist jetzt auch hier in der main verfügbar: $age")

    // getName: zurückgegebener Name soll in die main kommen
    val nameFromFunction: String = getName()
    println("Das Ergebnis von getName ist $nameFromFunction")

    // Ergebnis von Funktion in Liste speichern:
    val listOfNames: List<String> = listOf(
        getName(),
        getName(),
        getName(),
        getName(),
        // readln() auch möglicht, ist aber ohne schönes println prompt vorher
    )

    println("Liste aller Namen, die wir gerade eingegeben haben: $listOfNames")
    println("Erster eingegebener Name: ${listOfNames[0]}")
    println("Länge der letzten eingegebenen Namens (${listOfNames.last()}): ${listOfNames.last().length}")

    // Ergebnis Kreisumfang in der main weiterbenutzen:
    val circle: Double = getCircumference()
    val result = circle*2
    // ODER
    // val result2 = getCircumference()*2
    println("Umfang Kreis ($circle) *2 = $result")
}
fun getName(): String {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    return name
}

// Umfang eines Kreises ausrechnen, Formel: 2 * radius * pi
fun getCircumference(): Double {
    // 1. Schritt: sinnvolles println
    println("Bitte gib einen Radius ein, für den du die Kreisfläche haben möchtest...")

    // 2. Schritt: radius eingeben = mit readln in einer Variable speichern
    val radius: Double = readln().toDouble()

    // 3. Schritt: Rechnung, also 2*radius* PI
    val circ: Double = 2*radius* PI

    // zum abpausen:
    // preis = "%.2f".format(preis).replace(',', '.').toDouble()
    val circRounded: Double = "%.2f".format(circ).replace(",",".").toDouble()

    // println("Der Umfang des Kreises mit dem Radius $radius ist $circRounded")

    return circRounded
}



