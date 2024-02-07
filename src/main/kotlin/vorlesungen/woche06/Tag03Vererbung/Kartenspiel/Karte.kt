package Kartenspiel

class Karte{
    /**
     * Die Klasse Karte hat 2 Eigenschaften:
     *  - suit: Beschreibt den suit der Karte, zB "Herz", "Karo", etc..
     *  - wert: Beschreibt den Karten Wert der Karte, zB "Ass", "7", "Bube",etc...
     */

    var suit: String
    var wert: String

    constructor(suit: String, wert: String){
        // Dieser Konstruktor erzeugt mir eine konkrete, gültige Karte
        if (suit !in listOf("Herz", "Karo", "Pik", "Kreuz"))
            throw(Exception("Ungültiger Suit"))

        if (wert !in listOf("Ass", "2", "3", "4", "5", "6","7", "8", "9", "10", "B", "D", "K"))
            throw(Exception("Ungültiger Wert"))

        this.suit = suit
        this.wert = wert
    }

    constructor(){
        // Dieser Konstruktor erzeugt mir eine Zufällige Karte
        this.suit = listOf("Herz", "Karo", "Pik", "Kreuz").random()
        this.wert = listOf("Ass", "2", "3", "4", "5", "6","7", "8", "9", "10", "B", "D", "K").random()
    }



    fun farbe(): String{
        /**
         * Diese Funktion gibt an, ob die Karte Rot oder Schwarz ist
         */
        if (this.suit == "Herz" || this.suit == "Karo"){
            return "Rot"
        }
        else if (this.suit == "Pik" || this.suit == "Kreuz")
            return "Schwarz"
        else
            return "ungültig"
    }

    fun printKarte(): String{
        /**
         * Diese Funktion gibt einen String an,
         * mit dem man die Karte schön auf der Konsole ausdrucken kann.
         * Z.B [♠A]
         */
        var teil1: String = ""
        var teil2: String = ""

        teil1 = when(this.suit) {
            "Herz" -> "♥"
            "Karo" -> "♦"
            "Pik" -> "♠"
            "Kreuz" -> "♣"
            else -> "unbekannt"
        }

        teil2 = when (this.wert){
            "Ass" -> "A"
            "König" -> "K"
            "Dame" -> "D"
            "Bube" -> "B"
            else -> this.wert
        }

        return "[$teil1$teil2]"
    }



}