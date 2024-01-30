package wiederholungen.Woche05

fun main(){
    //Aufgabe 2: while-Schleife
    // Konstante weekDays2 mit festem Wert 7
    val weekDays2: Int = 7
    // Variable counter2, die hochzählen soll
    var counter2: Int = 1
    val weekDaysList2 = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")

    //Schreibe den Code von Aufgabe 1 nun als While-Schleife um
    //while (Bedingung) {
    while (counter2 <= weekDays2) {
        // Block mit Code}

        //Schritt 1: println für Konsole, welche Tagnummer heute ist über counter-Variable
        println("Heute ist der $counter2. Tag")
        //Schritt 2: println für Konsole, welcher Tag heute ist über Listenzugriff per Index (Index durch counter-Variable berechnet)
        println("Heute ist ${weekDaysList2[counter2-1]}")
        println("-----------------------------")
        //Schritt 3: Counter hochsetzen/inkrementieren
        counter2++
    }
}

