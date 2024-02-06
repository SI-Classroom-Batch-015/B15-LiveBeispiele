import java.lang.Exception

fun main() {
    val meinHaus = Haus(
        listOf(
            Lampe(true, "warmes Gelb", "Schlafzimmer"),
            Lampe(false, "kaltes Weiß", "Küche"),
            Lampe(true, "warmes Gelb", "Schlafzimmer"),
            Lampe(false, "kaltes Weiß", "Küche"),
            Lampe(true, "kaltes Weiß", "Küche"),
            Lampe(true, "warmes Gelb", "Schlafzimmer"),
            Lampe(false, "warmes Weiß", "Wohnzimmer"),
            Lampe(false, "warmes Weiß", "Wohnzimmer"),
            Lampe(true, "warmes Gelb", "Schlafzimmer")
        )
    )

    while (true) {
        println(
            """Was möchten Sie machen?
        1 - Lichter in einem Raum ihrer Eingabe einschalten (schaltet die restlichen Räume aus)
        2 - Allgemeinen status der Lichter des Hauses abfragen
        3 - Status der Lichter eines Raumes abfragen
        4 - Ändere die Farbe aller Lampen eines Raumes
        5 - Exit
    """.trimIndent()
        )
        try {
            when (readln().toInt()) {
                1 -> {
                    println("Welche Raum wollen Sie einschalten?")
                    val location = readln()
                    println("Wollen Sie alle anderen Räume ausschalten? (true/false)")
                    meinHaus.turnOnRoom(location, readln().toBoolean())
                }

                2 -> meinHaus.status()
                3 -> {
                    println("Von welchem Raum wollen Sie den Status erfahren?")
                    meinHaus.statusLocation(readln())
                }

                4 -> {
                    println("Von welchem Raum wollen Sie die Farben der Lichter ändern?")
                    val location = readln()
                    println("zu welcher Farbe sollen die Lichter im Raum $location geändert werden?")
                    meinHaus.changeColorRoom(location, readln())
                }

                5 -> break
            }
        } catch (e: Exception) {
            println("Keine gültige Eingabe, bitte nochmal versuchen")
        }
    }
}