package vorlesungen.woche02.Woche02Musterloesungen/*
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
    println("Bitte gib den Namen von Spieler 1 ein:")
    val spieler1 = readln()
    println("Bitte gib den Namen von Spieler 2 ein:")
    val spieler2 = readln()

    // Aufgabe 3: abwechselnd 3 karten aufnehmen
    // 3.1 leere listen anlegen
    val s1Hand = mutableListOf<String>()
    val s2Hand = mutableListOf<String>()

    // 3.2 abwechselnd 3 karten ziehen. removeFirst gibt die 1. Karte in cards zurück und entfernt sie gleichzeitig, mit add wird sie zur jeweiligen spielerhand geaddet
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())
    s1Hand.add(cards.removeFirst())
    s2Hand.add(cards.removeFirst())

    // 3.3 sinnvolles println, was uns informationen liefert
    println("$spieler1: $s1Hand")
    println("$spieler2: $s2Hand")

    // Aufgabe 4: spieler 1 und 2 klauen sich gegenseitig eine zufällige karte
    // 4.1: zufällige karte identifizieren
    val randoms1Card = s1Hand.random()
    // 4.2: diese karte entfernen
    s1Hand.remove(randoms1Card)
    // gleiches spiel für spieler2
    val randoms2Card = s2Hand.random()
    s2Hand.remove(randoms2Card)

    // 4.3: diese karte jeweils dem anderen spieler geben
    s1Hand.add(randoms2Card)
    s2Hand.add(randoms1Card)

    println("$spieler1: $s1Hand")
    println("$spieler2: $s2Hand")

    // 5: Karte abwerfen lassen über den index
    // 5.1 sinnvolles println

    println("$spieler1, welche deiner Karten willst du abwerfen? 1/2/3")
    // 5.2 eingabe zum int machen, damit sie als index benutzt werden kann, 1 abziehen, damit der index passt (geht von 0-2, nicht von 1-3)
    val s1ToRemove = readln().toInt()-1
    // 5.3 mit removeAt die karte an dem index entfernen
    val s1Removed = s1Hand.removeAt(s1ToRemove)
    // 5.4 neue karte ziehen
    var s1New = cards.removeFirst()
    // 5.5 neue karte zur hand von s1 hinzufuegen
    s1Hand.add(s1New)

    // 5.6 sinnvolles println, was informationen gibt, was passiert ist
    println("$spieler1 hat $s1Removed abgeworfen und $s1New gezogen.")

    // 5 gleiches spiel für spieler2
    println("$spieler2, welche deiner Karten willst du abwerfen? 1/2/3")
    val s2ToRemove = readln().toInt()
    val s2Removed = s2Hand.removeAt(s2ToRemove-1)
    var s2New = cards.removeFirst()
    s2Hand.add(s2New)
    println("$spieler2 hat $s2Removed abgeworfen und $s2New gezogen.")

    // Aufgabe 6 - wer hat die besseren karten
    // werte der karten anhand der einzelnen karten in den spielerhänden aus der map ziehen und zusammenrechnen
    // alternative: .plus funktion nutzen, die nullables addiert. + will keine nullables
    var s1Values = (cardValues[s1Hand[0]]!!.plus(cardValues[s1Hand[1]] ?: 0)).plus(cardValues[s1Hand[2]] ?: 0)
    println("$spieler1 Hand ($s1Hand) Wert gesamt: $s1Values")

    // oder: mit !! forcieren, dass die values nicht nullable sind, normal das + nutzen
    var s2Values = cardValues[s2Hand[0]]!! + cardValues[s2Hand[1]]!! + cardValues[s2Hand[2]]!!
    println("$spieler2 Hand ($s2Hand) Wert gesamt: $s2Values")


}
