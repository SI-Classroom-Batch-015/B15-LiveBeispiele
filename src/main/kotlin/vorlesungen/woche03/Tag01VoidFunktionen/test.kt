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
    // TODO: Schreibe hier deinen Code

    cards.shuffle()


    println("Spieler 1: geben Sie bitte ihren Spielernamen ein")
    var spieler1: String = readln()
    println("spieler1: ist $spieler1")

    println("Spieler 2: geben Sie ihren Spielernamen ein")
    var spieler2: String = readln()
    println("Spieler2: ist $spieler2")


    // Erster Zug des Spiels Pleyer 1 und 2
    println("$spieler1: zieh bitte deine erste Karte, bestätige mit Enter!")
    readln()
    var s1Zug1: String = cards.removeFirst()
    println(s1Zug1)

    println("$spieler2: zieh bitte deine erste Karte, bestätige mit Enter!")
    readln()
    var s2Zug01: String = cards.removeFirst()
    println(s2Zug01)


    // Zweiter Zug des Spiels Pleyer 1 und 2
    println("$spieler1: zieh bitte deine Zweite Karte, bestätige mit Enter!")
    readln()
    var s1Zug2: String = cards.removeFirst()
    println("$s1Zug1,$s1Zug2")

    println("$spieler2: zieh bitte deine Zweite Karte, bestätige mit Enter!")
    readln()
    var s2Zug02: String = cards.removeFirst()
    println("$s2Zug01,$s2Zug02")



    // Dritter Zug des Spiels Pleyer 1 und 2
    println("$spieler1: zieh bitte deine Dritte Karte, bestätige mit Enter!")
    readln()
    var s1Zug3: String = cards.removeFirst()
    println("$s1Zug1,$s1Zug2,$s1Zug3")

    println("$spieler2: zieh bitte deine Dritte Karte, bestätige mit Enter!")
    readln()
    var s2Zug03: String = cards.removeFirst()
    println("$s2Zug01,$s2Zug02,$s2Zug03")

    println("=====Zwischenstand=====")

    var pleyerOneHand: MutableList<String> = mutableListOf(s1Zug1,s1Zug2,s1Zug3)
    var pleyerTwoHand: MutableList<String> = mutableListOf(s2Zug01,s2Zug02,s2Zug03)


    println("Die Hand von $spieler1 / $pleyerOneHand")
    println("Die Hand von $spieler2 / $pleyerTwoHand")

    println("Weiter : mit Enter bestätigen")
    readln()

    println("$spieler1 ziehe eine Karte von $spieler2: Bestätige mit Enter")
    readln()
    var getauscht1: String = pleyerTwoHand.random()
    println(getauscht1)



    println("$spieler2 ziehe eine Karte von $spieler1: Bestätige mit Enter")
    readln()
    var getauscht2: String = pleyerOneHand.random()
    println(getauscht2)

    pleyerOneHand.remove(getauscht2)
    pleyerTwoHand.remove(getauscht1)

    pleyerOneHand.add(getauscht1)
    pleyerTwoHand.add(getauscht2)

    println("Zwischenstand")
    println(pleyerOneHand)
    println(pleyerTwoHand)

    println("Super jetzt dürft ihr eine Karte entfernen und eine neue ziehen!")
    readln()

    println("$spieler1 Entfern eine Karte: 1 / 2 / 3 ")
    println(pleyerOneHand)

    var abwerfenS1: Int = readln().toInt()-1
    println(pleyerOneHand.removeAt(abwerfenS1))
    println("$spieler1: Zieh eine neue Karte!")
    var newCardS1 = cards.removeFirst()
    pleyerOneHand.add(newCardS1)
    println(newCardS1)

    println("$spieler2 Entfern eine Karte: 1 / 2 / 3 ")
    println("$pleyerTwoHand")
    var abwerfenS2: Int = readln().toInt()-1
    println(pleyerTwoHand.removeAt(abwerfenS2))
    println("$spieler2: Zieh eine neue Karte! ")
    var newCardS2 = cards.removeFirst()
    pleyerTwoHand.add(newCardS2)
    println(newCardS2)

    var ergebnissS1 = cardValues.get(s1Zug1)!! +cardValues.get(s2Zug02)!! +cardValues.get(s1Zug3)!!

    var ergebnissS2 = cardValues.get(s2Zug01)!! +cardValues.get(s2Zug02)!! +cardValues.get(s2Zug03)!!



    println("Hand von: $spieler1 ist $pleyerOneHand $ergebnissS1 Punkte")
    println("Hand von: $spieler2 ist $pleyerTwoHand $ergebnissS2 Punkte")

    var gewinner: Int = max(ergebnissS1,ergebnissS2)


    println("Der Gewinner ist Spieler mit $gewinner Punkten")


}