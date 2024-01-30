package wiederholungen.Woche05

//Funktion Dividieren (Teilen) mit den Parametern a und b (beides Integer) und einem Integer als Rückgabewert
fun divide(a: Int, b: Int): Int {

    //try (versuchen), solange eine exception (Ausnahme) nicht besteht {
    try {
        // Variable Ergebnis, die Zahl a durch Zahl b teilt
        var ergebnis = a/b
        // Rückgabewert Ergebnis
        return ergebnis


        //} catch (auffangen/abfangen) bei Bestehen der exception (Ausnahme)
        //(e: ArithmeticException) --> von Kotlin vorgefertigte exception (Ausnahme)
        //Kotlin hat noch viele weitere exceptions
    } catch (e: ArithmeticException) {
        //println mit Fehlermeldung
        //e.message ist von Kotlin vorgefertigte Nachricht, die zu: ArithmeticException gehört
        println("Fehler beim Teilen: ${e.message}")
        // Variable Ergebnis wird auf 0 gesetzt
        var ergebnis = 0
        // Rückgabewert Ergebnis
        return ergebnis
    }
}

fun main() {
    //Beispiel 1:
    //Variablen Zahl 1 und Zahl 2
    val zahl1 = 10
    val zahl2 = 2

    //Aufrufen der divide Funktion mit Parameter zahl1 und zahl2
    //keine println in Konsole, da in try-Block keine println
    val ergebnis = divide(zahl1, zahl2)

    //Printen des Ergebnis mithilfe des returnWerts
    //--> Ergebnis: 5
    println("Ergebnis: $ergebnis")


    //Beispiel 2:
    //Variablen Zahl 3 und Zahl 4
    val zahl3 = 10
    val zahl4 = 0

    //Aufrufen der divide Funktion mit Parameter zahl1 und zahl2
    //println: Fehler beim Teilen: / by zero (aus Zeile 14)
    val ergebnis2 = divide(zahl3, zahl4)

    //Printen des Ergebnis mithilfe des returnWerts
    //--> Ergebnis: 0
    println("Ergebnis: $ergebnis2")
}
