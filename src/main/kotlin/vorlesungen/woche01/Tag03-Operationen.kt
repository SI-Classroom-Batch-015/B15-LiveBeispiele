package vorlesungen.woche01

import java.time.LocalDate

fun main() {

    // Wiederholung:
        // Initialisierung
        var greeting: String = "Halli Hallo"
        println("1. println: $greeting")
        // Aktualisierung: alter Inhalt geht verloren
        // theoretisch 1000 Zeilen Code.....
        greeting = "Hello World"
        println("2. println: $greeting")

        // Konstanten: unveränderbare Variablen

        // 10.000 Zeilen Code später...
        val birthDay = "01.01.1999"
        // birthDay = "08.08.1988"

        // Bonus: Datentyp Date, gerne ergooglen/ChatGPT dazu befragen
        val birthDate = LocalDate.of(2021, 9, 21) // Jahr, Monat, Tag



    // Operationen

    // +, -, *, / -> funktionieren alle sowohl auf Ints als auch auf Doubles

    // Plus (Addition), Ergebnis nennt sich Summe
    val sumOfTwoInts: Int = 10 + 40
    println(sumOfTwoInts)
    val sumOfTwoDoubles: Double = 9.5+19.5
    println(sumOfTwoDoubles)

    // Minus (Subtraktion) mit Doubles, Ergebnis nennt sich Differenz, deshalb doubleDiff
    val doubeDiff: Double = 100.0-50.0 // Ergebnis: 50.0


    val mult: Double = sumOfTwoDoubles * doubeDiff // Ergebnis: 1450.0
    println("$mult ist das Ergebnis on $sumOfTwoDoubles * $doubeDiff")

    val divident: Double = 15.0/3.0 // Ergebnis: 5.0

    // Ergebnis von Int und Double ist immer Double
    val divideDoubleByInt: Double = 20.0/4
    println("Double durch ein Int teilen: $divideDoubleByInt")

    val multIntWithDouble: Double = 9 * 10.0
    println(multIntWithDouble)

    // Rechnung mit Klammer: Klammerinhalt wird zuerst berechnet
    var result = 16/(2*2) // quasi 16 geteilt durch 4, ergibt 4
    println("Punkt vor Strich: $result")

    // weiteres Beispiel: Punkt vor Strich ohne Klammer
    var resultWoBracket = 20/2+2 // quasi: 10+2, Ergebnis: 12
    println("Result2 = $resultWoBracket")

    var resultWithBracket = 20/(2+2) // Ergebnis: 5
    println("Result Mit Klammern = $resultWithBracket")

    // Rest (Modulo %)
    val rest: Int = 100%30
    println("Der Rest, wenn man 100/30 rechnet, ist: $rest")

    var moduloResult = 5 % 2 // Ergebnis: 5/2 = 2 geht 2mal rein und erreicht 4, es fehlt noch 1 bis zur 5 --> 1 kommt raus
    println("ModuloResult: $moduloResult")

    var evenNumber = 20
    var result2 = evenNumber%2 // Ergebnis: 0,  20/2 = 10, die 10*2 ergbit 20 --> kein Rest, Ergebnis ist 0
    println("Ist $evenNumber gerade? Wenn ja, ist result2=0, stimmt das? -> $result2")

    // String Konkatenation mit +
    var nr: String = "13 "
    var nr2: Int = 13

    var nrsCombined = nr + nr2
    println("Ergebnis nrsCombined: $nrsCombined")









}