package wiederholungen.Woche05

fun main () {
    //Aufgabe 1: repeat
    // Konstante weekDays mit festem Wert 7
    val weekDays: Int = 7
    // Variable counter, die hochzählen soll
    var counter: Int = 1
    //Wochentagsliste
    val weekDaysList = listOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag")

    //repeat (Anzahl) {
    repeat(weekDays) {
        // Block mit Code}

        //Lösungsvariante 1: Nutzung der Variable counter
        //Schritt 1: println für Konsole, welche Tagnummer heute ist über counter-Variable
        println("Heute ist der $counter. Tag")
        //Schritt 2: println für Konsole, welcher Tag heute ist über Listenzugriff per Index (Index durch counter-Variable berechnet)
        println("Heute ist ${weekDaysList[counter - 1]}")
        println("-----------------------------")
        //Schritt 3: Counter hochsetzen/inkrementieren
        counter++

        //Lösungsvariante 2: Nutzung von it (Variable counter wäre hier überflüssig)
        //Schritt 1: println für Konsole, welche Tagnummer heute ist über it
            //it (Iterator) gibt an in welchem "Rundendurchlauf" sich die Schleife befindet
            //it startet bei 0 und endet in dieser Aufgabe bei 6, daher muss bei der Tagnummerangabe +1 gerechnet werden
        println("Heute ist der ${it + 1}. Tag")
        //Schritt 2: println für Konsole, welcher Tag heute ist über Listenzugriff per Index (Index durch it angegeben)
            //Beim Index muss keine Berechnung erfolgen, da it wie auch der Index bei 0 beginnt
        println("Heute ist ${weekDaysList[it]}")
        println("-----------------------------")

    }
}