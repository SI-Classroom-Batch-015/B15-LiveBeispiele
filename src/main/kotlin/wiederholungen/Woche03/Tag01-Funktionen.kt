package wiederholungen.Woche03

fun main(){
    //Aufgabe 1
    //Ruft eine Funktion auf, die eine Addition von zwei Zahlen durchführt
    //hier benötigen wir KEINE println
    plus()

    //Aufgabe 2
    //Ruft eine Funktion auf, die den Text "Hallo, schneit es bei euch auch?" in der richtigen Reihenfolge ausgibt
    snow()

}

//Aufgabe 1:
// Erstellt eine Funktion, die eine Addition von zwei Zahlen durchführt
fun plus(){
    var ersteZahl: Int = 3
    var zweiteZahl: Int = 3

    //Lösungsvariante 1: Zwischenspeichern in einer Variablen, Aufruf der Variable in println()
    var ergebnis: Int = ersteZahl + zweiteZahl
    println(ergebnis)

    //Lösungsvariante 2: direkte Rechenoperatione in println()
    println(ersteZahl + zweiteZahl)
}

//Aufgabe 2:
fun snow(){
    var string1: String = "Hallo,"
    var string2: String = "schneit es"
    var string3: String = "bei euch"
    var string4: String = "auch?"

    //Lösungsvariante 1: als Liste
    var snowToday: List<String> = listOf("$string1", string2, string3, string4)
    println(snowToday)

    //Lösungsvariante 2: als String
    var snowToday2: String = string1 + " " + string2 + " " + string3 + " " + string4
    println(snowToday2)

    //Lösungsvariante 3: direkt in der println ohne Variablenerstellung
    println(string1 + " " + string2 + " " + string3 + " " + string4)

    //shift + opt + Pfeiltasten, um Zeilen hin und her zu schieben
}



