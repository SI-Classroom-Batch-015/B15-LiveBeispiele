package vorlesungen.woche01

fun main() {

    // toDouble()
    val stringNr: String = "199.0"
    println(stringNr+1.0) // lediglich konkatenation: "199.01.0"

    var stringNrToDouble: Double = stringNr.toDouble()
    println(stringNrToDouble+1.0)

    // toInt()
    val doubleNr: Double = 10.9
    val doubleToInt: Int = doubleNr.toInt() // schneidet Nachkommastelle ab, ohne zu runden
    println("Double $doubleNr zum Integer machen ergibt $doubleToInt")

    // toString()
    val doubleNumber: Double = 100.7
    // doubleNumber = doubleNumber + " ist eine Zahl." // geht nicht, da wir in ein Double keinen String, der jetzt rauskommen würde, speichern dürfen
    println(doubleNumber+0.3) // Ergebnis: 101.0

    var doubleToString: String = doubleNumber.toString()
    doubleToString = doubleToString + " ist eine Zahl."






    // LANGE VERSION: mit mehreren Variablen
        // Mini Taschenrechner Programm, bei dem User 2 Zahlen eingeben kann, die addiert werden
        // Zahleneingaben:
        println("Bitte gib eine Zahl ein....")
        val x: String = readln() // String, nicht zum Rechnen brauchbar, deshalb konvertieren
        val xInt: Int = x.toInt()
        println("Bitte gib eine weitere Zahl ein....")
        val y: String = readln()
        val yInt = y.toInt()

        // Rechnung:
        val z = x + y // x und y sind beide Strings, deshalb wird nicht gerechnet sondern konkateniert (verkettet)
        println("Das Ergebnis deiner Zahlen $x + $y ist = $z")

        val zInt = xInt + yInt // xInt und yInt sind beide Integers, deshalb kann normal gerechnet werden
        println("Das Ergebnis deiner Zahlen $xInt + $yInt ist = $zInt")

    // KURZE VERSION: weniger Variablen
    println("Bitte gib eine Zahl ein....")
    val number1: Int = readln().toInt() // in einem einzigen Schritt wird direkt eine Int Variable angelegt, indem .toInt() an readln() gehängt wird
    val number2: Int = readln().toInt()
    println("Das Ergebnis von $number1 + $number2 ist: ${number1+number2}")





}