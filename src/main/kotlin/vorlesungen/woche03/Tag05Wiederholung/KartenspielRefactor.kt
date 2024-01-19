package vorlesungen.woche03.Tag05Wiederholung

import kotlin.math.max

/*
In der Variable cards ist ein Kartenset in Form einer Liste gespeichert.
Beispiel:
    "♥️7" steht für die Karte "Herz Sieben"
    "♥️A" steht für die Karte "Herz Ass"
 */
val cards: MutableList<String> = mutableListOf(
    "♥️7", "♦️7", "♠️7", "♣️7",
    "♥️8", "♦️8", "♠️8", "♣️8",
    "♥️9", "♦️9", "♠️9", "♣️9",
    "♥️10", "♦️10", "♠️10", "♣️10",
    "♥️B", "♦️B", "♠️B", "♣️B",
    "♥️D", "♦️D", "♠️D", "♣️D",
    "♥️K", "♦️K", "♠️K", "♣️K",
    "♥️A", "♦️A", "♠️A", "♣️A",
    "🃏JOKER"
)

/*
In der Variable values sind die Werte der Karten in einer Map gespeichert.
Beispiel:
    "♥️7" to 1 steht für einen Wert von 1 für die Karte "Herz Sieben"
    "♥️A" to 8 steht für einen Wert von 8 für die Karte "Herz Ass"
Bei einem Vergleich der Werte würde also das "Herz Ass" gewinnen
 */
val cardValues: Map<String, Int> = mapOf(
    "♥️7" to 1, "♦️7" to 1, "♠️7" to 1, "♣️7" to 1,
    "♥️8" to 2, "♦️8" to 2, "♠️8" to 2, "♣️8" to 2,
    "♥️9" to 3, "♦️9" to 3, "♠️9" to 3, "♣️9" to 3,
    "♥️10" to 4, "♦️10" to 4, "♠️10" to 4, "♣️10" to 4,
    "♥️B" to 5, "♦️B" to 5, "♠️B" to 5, "♣️B" to 5,
    "♥️D" to 6, "♦️D" to 6, "♠️D" to 6, "♣️D" to 6,
    "♥️K" to 7, "♦️K" to 7, "♠️K" to 7, "♣️K" to 7,
    "♥️A" to 8, "♦️A" to 8, "♠️A" to 8, "♣️A" to 8,
    "🃏JOKER" to 10
)

fun main() {

    // Aufgabe 1: cards mischen
    cards.shuffle()

    // Aufgabe 2: Spieler 1 und 2 namen geben
    val spieler1: String = inputPlayerName(1)
    val spieler2: String = inputPlayerName(2)

    // Aufgabe 3: abwechselnd 3 karten aufnehmen
    // 3.1 leere listen anlegen
    val s1Hand = mutableListOf<String>()
    val s2Hand = mutableListOf<String>()

    // 3.2 abwechselnd 3 karten ziehen. removeFirst gibt die 1. Karte in cards zurück und entfernt sie gleichzeitig, mit add wird sie zur jeweiligen spielerhand geaddet
    fillHands(s1Hand, s2Hand)

    // 3.3 sinnvolles println, was uns informationen liefert
    printPlayerHands(spieler1, s1Hand, spieler2, s2Hand)

    // spieler1 klaut karte von spieler2
    stealCard(s2Hand,s1Hand,spieler1,spieler2)
    // spieler2 klaut karte von spieler1
    stealCard(s1Hand,s2Hand,spieler2,spieler1)

    printPlayerHands(spieler1,s1Hand,spieler2,s2Hand)

    // spieler 1 wirft karte weg, zieht neue
    throwAwayCard(spieler1, s1Hand)
    // spieler 2 wirft karte weg, zieht neue
    throwAwayCard(spieler2,s2Hand)

    var player1Values: Int = calculateHandValue(s1Hand)
    println("$spieler1 Hand ($s1Hand) Wert gesamt: $player1Values")
    var player2Values: Int = calculateHandValue(s2Hand)
    println("$spieler2 Hand ($s2Hand) Wert gesamt: $player2Values")

    var winner = max(player1Values,player2Values)
    println("Der Spieler mit dem Handwert $winner hat gewonnen!")


}

/**
 * kalkuliert den Gesamtwert aller Karten eines spielers
 * @param playerHand die Hand des Spielers
 * @return Gesamtwert aller Karten
 */
fun calculateHandValue (
    playerHand: MutableList<String>
) : Int {
    // Aufgabe 6 - wer hat die besseren karten
    // werte der karten anhand der einzelnen karten in den spielerhänden aus der map ziehen und zusammenrechnen

    // mit !! forcieren, dass die values nicht nullable sind, normal das + nutzen
    return cardValues[playerHand[0]]!! + cardValues[playerHand[1]]!! + cardValues[playerHand[2]]!!

    // ODER: Alternative
    // alternative: .plus funktion nutzen, die nullables addiert. + will keine nullables
//    var s1Values = (cardValues[s1Hand[0]]!!.plus(cardValues[s1Hand[1]] ?: 0)).plus(cardValues[s1Hand[2]] ?: 0)
//    println("$spieler1 Hand ($s1Hand) Wert gesamt: $s1Values")
}

/**
 * lässt den spieler 1 karte abwerfen und eine neue karte vom deck cards ziehen
 * @param player name des spielers
 * @param playerHand hand des spielers
 */
fun throwAwayCard(player: String, playerHand: MutableList<String>) {
    // 5: Karte abwerfen lassen über den index
    // 5.1 sinnvolles println

    println("$player, welche deiner Karten willst du abwerfen? 1/2/3")
    // 5.2 eingabe zum int machen, damit sie als index benutzt werden kann, 1 abziehen, damit der index passt (geht von 0-2, nicht von 1-3)
    val cardToRemove = readln().toInt() - 1
    // 5.3 mit removeAt die karte an dem index entfernen
    val cardRemoved = playerHand.removeAt(cardToRemove)
    // 5.4 neue karte ziehen
    var newCard = cards.removeFirst()
    playerHand.add(newCard)
    // 5.5 neue karte zur hand von s1 hinzufuegen
    // ODER alternative:
    // playerHand.add(cards.removeFirst()), klappt aber nicht, da wir newCard in einer Variable brauchen, um es auszudrucken

    // 5.6 sinnvolles println, was informationen gibt, was passiert ist
    println("$player hat $cardRemoved abgeworfen und $newCard gezogen.")
}

/**
 * lässt einen spieler eine karte eines anderen spielers stehlen
 * @param opferHand die hand des diebstahl opfers
 * @param diebHand die hand des diebes, der eine neue karte klaut
 */
fun stealCard(
    opferHand: MutableList<String>,
    diebHand: MutableList<String>,
    diebName: String,
    opferName: String

) {
    // Aufgabe 4: spieler 1 und 2 klauen sich gegenseitig eine zufällige karte
    // 4.1: zufällige karte des Opfers identifizieren
    println("Es wird geklaut! $diebName stiehlt eine zufällige Karte von $opferName")
    val stolenCard = opferHand.random()
    // 4.2 diese Karte dem Opfer wegnehmen
    opferHand.remove(stolenCard)
    // 4.3 diese Karte dem Dieb geben
    diebHand.add(stolenCard)
    println("$diebName hat sich $stolenCard geangelt! Dreist...")

}

/**
 * Druckt die Namen und aktuellen Hände beider Spieler aus
 * @param spieler1 name von spieler 1
 * @param spieler2 name von spieler 2
 * @param s1Hand hand von spieler 1
 * @param s2Hand hand von spieler 2
 */
fun printPlayerHands(
    spieler1: String,
    s1Hand: MutableList<String>,
    spieler2: String,
    s2Hand: MutableList<String>)
{
    println("$spieler1: $s1Hand")
    println("$spieler2: $s2Hand")
}

/**
 * fügt jeweils einem Spieler eine neue Karte vom Kartenstapel cards hinzu, entfernt diese Karte auch von cards
 * @param s1Hand die hand des 1. Spielers, in die eine Karte hinzugefügt wird
 * @param s2Hand die hand des 2. spielers, in die eine Karte hinzugefügt wird
 */

fun fillHands(s1Hand: MutableList<String>, s2Hand: MutableList<String>) {
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())
}

/**
 * liefert einen Spielernamen, den wir in der Konsole eingeben, zurück
 * @param playerNumber nummer des jeweiligen spielers, dessen namen wir eingeben wollen
 * @return name des spielers, den wir eingegeben haben
 */
fun inputPlayerName(playerNumber: Int): String {
    println("Bitte gib den Namen von Spieler $playerNumber ein:")
    val playerName = readln()
    return playerName
    // ODER:
    // return readln()
}
