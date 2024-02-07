package Kartenspiel

fun main(){


    var karoAss: Karte = Karte("Karo", "Ass")
    println(karoAss)
    println("${karoAss.suit} ${karoAss.wert}")

    // Wir können die Werte der Instanz verändern
    karoAss.suit = "Pik"
    karoAss.wert = "7"
    println(karoAss)    // druckt die Referenz aus
    println("${karoAss.suit} ${karoAss.wert}")  // Druckt die Informationen aus

    // Wir können die Referenz auf die Instanz auch in mehreren Variablen haben
    var pik7 = karoAss

    karoAss.suit = "Karo"
    karoAss.wert = "Ass"

    karoAss = Karte("Pik", "7")
    println(karoAss)

    karoAss = Karte("Karo", "Ass")
    println(karoAss)

    // Wir erzeugen ein Deck von Karten. Dieses Erstellt 52 Instanzen von Karten
    var stapel = Deck()
    stapel.neuMischen()
    println(stapel)

    var stapel2 = Deck()
}