package wiederholungen.Woche04
//if (Bedingungen){
//Folge, wenn Bedingungen erfüllt (true) ist z.B. println()
//} else {
//Folge, wenn Bedingung NICHT erfüllt (false) ist z.B. println()
//}


//Aufgabe 1: Erstelle eine if-else Verzweigung, die einem Nutzer angibt, ob er versandkostenfrei bestellt
//ab einem Warenkorb-Preis von 50.0 ist der Versand umsonst.

//fun Funktionsname(){
fun versandkostenfrei(){
    //Variable des aktuellen Warenkorbpreis
    var warenkorbPreis: Double = 10.0
    //Aktualisierung der Variable
    warenkorbPreis = 260.0

    //if (Bedingung 1: Warenpreis zwischen 50 (größer gleich 50) und 149.9 (kleiner gleich 149.9) Euro){
    if ((warenkorbPreis >= 50.0) && (warenkorbPreis <= 149.9)) {
        // Kommentar der bei Erfüllen der Bedingung 1 (true) folgt
        println("Du liegst über dem Wert von 50 und musst keine Versandkosten zahlen")
        //}
    }
    //else if (Bedingung 2: Warenpreis größer gleich 150.0){
    else if (warenkorbPreis >= 150.0){
        //Kommentar, der bei Erfüllen der Bedingung 2 (true) folgt
        println("Super, du erhälst noch ein Geschenk dazu.")
        //} else {
    } else{
        //Kommentar, der ber Nichterfüllen von Bedingung 1 und 2 (false) folgt
        println("Du liegst noch nicht über dem Wert. Du musst Versandkosten zahlen")
    }
}


//Aufgabe 2: Erstelle einen Schrittetracker mit einer if-else-Verzweigung.
// Bei 10000 Schritten hat die Person das Tagesziel erreicht und erhält Glückwünsche
// Hat sie das Tagesziel noch nicht erreicht, wird ihr angezeigt, wie viele Schritte noch fehlen.

//Aufgabe 2b): füge eine weitere Verzweigung hinzu, die ein zusätzliches Lob ausspricht,
// wenn mehr als 15000 Schritte gelaufen wurden

//fun Funktionsname(){
fun schrittetracker() {
    //Variable des täglichen Schrittziels
    val täglichesSchrittziel = 10000
    //Variable der aktuellen Schrittzahl
    var aktuelleSchritte = 8500
    //Aktualisierung der Variable der aktuellen Schrittzahl
    aktuelleSchritte = 16000
    //Variable des krassen Schrittziels
    var krassesSchrittziel = 15000

    //if (Bedingung 1: aktuelle Schritte größer als tägliches Schrittziel){
    if (aktuelleSchritte >= täglichesSchrittziel) {
        // Kommentar der bei Erfüllen der Bedingung 1 (true) folgt
        println("Schritte erreicht")
        //if (Bedingung A: aktuelle Schritte größer als krasses Schrittziel){
        if (aktuelleSchritte >= krassesSchrittziel) {
            // Kommentar der bei Erfüllen der Bedingung A (true) folgt
            println("Hast du super gemacht! Ziel übertroffen!")
        }
        //} else {
    } else {
        //Kommentar, der ber Nichterfüllen von Bedingung 1 (false) folgt
        println("Schritte noch nicht erreicht. ${täglichesSchrittziel - aktuelleSchritte} Schritte fehlen dir noch")
    }

}


//Aufgabe 3: Erstelle eine Funktion berechneTicketpreis, die
// 1. einen Parameter alter: Int erhält (Thema Woche 3)
// 2. einen Double als return-Wert zurückgibt (Thema Woche 3)
// über einen when-Verzweigung einen Ticketpreis anhand des Alters zurückgibt (Thema Woche 4)
//0 bis 12 Jährige zahlen 10.0
//13 bis 17 Jährige zahlen 12.0
//18 bis 64 Jährige zahlen 20.0
//alle anderen zahlen 12.50, da sie Senioren sind


//fun Funktionsname(Parameter: Datentyp von Parameter): Datentyp von Returnwert{
fun berechneTicketpreis(alter: Int) : Double {
    //return when (Parameter){
    return when (alter){
        //in range 1 -> Preis 1
        in 0..12 -> 10.0
        //in range 2 -> Preis 2
        in 13..17 -> 12.0
        //in range 3 -> Preis 3
        in 18..64 -> 25.0
        //Rest -> Preis 4
        else -> 12.50
    }
}

fun main(){
    println("Bitte gib dein Alter an")
    //Variable alterDesKunden, die Konsoleneingabe als Integer abspeichert
    var alterDesKunden: Int = readln().toInt()
    //println die
    //1. Alter durch Variablen Aufrug $alterDesKunden wiedergibt
    //2. Ticketpreis durch Funktionsaufruf ${berechnetTicketpreis(alterDesKunden)} mit Hilfe der Variable
    //alterDesKunden als Parameter wiedergegeben
    println("Du bist $alterDesKunden Jahre alt. Du muss ${berechneTicketpreis(alterDesKunden)} Euro zahlen.")

}


