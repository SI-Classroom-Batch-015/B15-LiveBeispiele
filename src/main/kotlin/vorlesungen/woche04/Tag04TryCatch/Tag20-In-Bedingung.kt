package VORLESUNG.Woche04.Tag20Wiederholung


fun main(){

    // Beispiel 1: einfachstes in-Beispiel
    val inString = "In diesem String ist in drin"
    var x = "in" in inString
    if (x){
        println("Ja, es ist in in diesem String")
    } else {
        println("Nein, kein in in diesem String.")
    }

    // Beispiel 2: einfachstes in-Beispiel
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    if (3 in numbers) println("Die 3 ist vorhanden")

    // Beispiel 3: In-Beispiel mit Listenindizen
    val namensListe: List<String> = listOf("Stephan", "Merlin", "Hannes", "Emily", "Nico", "Benni", "Brian")
    val notenListe: List<Int> = listOf(1, 2, 3, 4, 1, 2, 3)
    // Wie muss ich vorgehen, um an die Note einer Person ranzukommen?

    println("Bitte Namen, der Person, deren Note du erfahren willst, eingeben...")
    // 1. Schritt: Namen in Variable speichern
    val gesuchterName = readln()
    if (gesuchterName in namensListe){
        // 2. Schritt: Index des Namens in der namensListe in Variable speichern
        val index: Int = namensListe.indexOf(gesuchterName) // Im Falle Merlin: Index = 1
        // 3. Schritt: über den Index an die entsprechende Note in der Notenliste rankommen:
        val note = notenListe[index]
        println("$gesuchterName hat die Note $note")
    } else {
        println("$gesuchterName existiert nicht im Klassenbuch.")
    }

    // Beispiel 4: In-Beispiel mit Map
    val sortiment = mutableMapOf(
        "Apfel" to 0.49,
        "Banane" to 0.39,
        "Kiwi" to 0.19,
        "Brezel" to 0.75
    )
    // Neues Produkt zum Sortiment hinzufügen
    println("Bitte Produkt eingeben...")
    val newProduct = readln()
    println("Bitte Preis eingeben...")
    val newPrice = readln().toDouble()

    // falls das produkt bereits im sortiment ist: den preis einfach aktualisieren
    if (newProduct in sortiment) { // sortiment.contains(newProduct)
        println("Das Produkt existiert bereits")
        if (sortiment[newProduct] != newPrice) {
            sortiment[newProduct] = newPrice
            println("Der Preis wurde aktualisiert!")
        }
    } else { // abfangen, dass ein neues Produkt hinzugefügt wird
        sortiment[newProduct] = newPrice
        println("Das Produkt $newProduct wurde neu hinzugefügt.")

    }

    if (sortiment["Schokolade"] != null) {
        println("Schokolade ist vorhanden")
    } else {
        println("Schokolade nicht vorhanden")
    }



}
