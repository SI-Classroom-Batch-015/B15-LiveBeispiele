package Kartenspiel

class Spieler (val name: String) {
    // Spieler bekommt 3 Eigenschaften
    var kontoStand: Double = 25.0
    var hand: MutableList<Karte> = mutableListOf()


    fun kartenAuswahl(): Karte?{
    /**
     * Diese Funktion lässt den Spieler einer seiner Karten auswählen.
     * Wenn er keine Karten auf der Hand hat, oder eine falsche Eingabe macht, wird null zurückgegeben.
     *
     * Aktuell wird die Karte noch nicht aus der Hand entfernt, sondern nur ausgewählt.
     */
        // Alle Karten anzeigen
        print("$name: ")
        for (karte in hand){
            print("${karte.printKarte()},")
        }
        println("")
        println(" Wählen sie jetzt eine Karte: 1 - ${hand.size}")

        try {
            var index = readln().toInt() - 1
            return hand[index]
        } catch (ex: Exception){
            return null
        }
    }

}