package vorlesungen.woche04.Tag04TryCatch

import kotlin.reflect.KProperty2

fun main() {

    try {
        println("Bitte 2 Integer eingeben...")
        var nr1 = readln().toInt()
        var nr2 = readln().toInt()
        var result = division(nr1,nr2)
        println("Ergebnis: von $nr1 / $nr2 = $result ")
        // Oder kurze version:
        // println("Ergebnis: ${division(readln().toInt(), readln().toInt())}")
    } catch (e: ArithmeticException){
        println("Exception $e \nin der main() aufgefangen")
    } catch (e: NumberFormatException){
        println("NFE in der main() aufgefangen")
        // The IllegalArgumentException class is a superclass of the NumberFormatException. alle NFEs sind auch IAEs.
        // das heisst, wenn wir den IAE block über den NFE Block setzen würden, würde dieser greifen
    } catch (e: IllegalArgumentException){
        println("Exception $e \nin der main() aufgefangen")
    }

    addition(3,5)
}

fun division(nr1: Int, nr2: Int): Int {

    if (nr2 == 0){
        throw ArithmeticException("Gefangen in division(): Division durch 0 ist nicht möglich.")
    }

    // wir wollen nur mit positiven Zahlen rechnen
    if (nr1 < 0 || nr2 < 0 ){
        throw IllegalArgumentException("Gefangen in division(): Ungültige Argumente - Wir wollen nur mit positiven Zahlen arbeiten.")

    }
    try {
        return nr1/nr2
    } catch (e: Exception){
        println("Unbekannte Exception $e in division!")
    }

    // Default return
    return 0

}


fun addition(nr1: Int, nr2: Int): Int {

    var dritteZahl: Int = 0

    try {
        dritteZahl = division(4,0)
    } catch (e: Exception){
        println("In der Funktion addition die Exception $e aufgefangen...")
        dritteZahl = 100

    }

    println("Ergebnis: ${nr1+nr2+dritteZahl}")
    return nr1+nr2+dritteZahl
}
