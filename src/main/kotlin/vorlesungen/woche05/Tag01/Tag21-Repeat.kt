package VORLESUNG.Woche05.Tag21

import kotlin.random.Random

fun main() {
    // repeat mit hardgecodetem Int
    repeat(10){
        println("${it + 1}. Hello World!")
        // Thread.sleep(2000)
        // irgendein krasser Funktionsaufruf
    }
    println("Repeat Schleife wurde 10x ausgeführt, der Code läuft weiter...")


    // repeat mit Variable und Counter
    // Wochentage rückwärts runterzählen
    val weekDays: Int = 7
    var counter: Int = 7
    repeat(weekDays){
        println("Es ist der $counter. Wochentag!")
        counter = counter-1
        // ODER
        // counter -= 1
        // ODER
        // counter--
    }

    println("Es wurde 7x was zum Wochentag gesagt, der Code läuft weiter von oben nach unten...")


    // repeat mit Funktionsaufruf, wo ein Int rauskommt
    repeat(randomInt()){
        println("${it+1}. Durchlauf")
    }


    // repeat über Liste mit it.
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch
    var herbstKleidung = mutableListOf("Wollsocken", "Winterschuhe", "gefütterte Jeans", "Daunenjacke", "Schal", "Handschuhe")
    repeat(herbstKleidung.size){ // in herbstKleidung.size steht 6 drin
        println("$it. Element in der Liste: ${herbstKleidung[it]}")
    }

    println("Liste erfolgreich durchlaufen, Schleife beendet...")


}

fun randomInt(): Int {
    val reps: Int = Random.nextInt(1,20)
    return reps
}