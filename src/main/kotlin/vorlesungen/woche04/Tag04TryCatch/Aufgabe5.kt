package vorlesungen.woche04.Tag04TryCatch

import java.lang.Exception

/*
Unsere Stadt will einen neuene Park eröffnen und um ihn immergrün zu halten nur Nadelbäume pflanzen. Du programmierst ein Programm, das dem Bauamt mithilfe einer einzugebenen treeNr verraten soll um welche Baumart (Laub oder Nadel) es sich bei der abgefragten treeNr handelt und ob der Baum sich für unseren neuen Park auch eignet.

Deine Datenbank von Bäumen ist die vorgegebene Map trees, die für jeden Baum einen Key mit einer treeNr besitzt.
benutze die Funktion getTreeKind um herauszufinden um welche Baumart (Laub oder Nadel) es sich handelt und gib jene zurück (return). Alle Bäume, die mit einer 1 beginnen sind vom Typen "Laubbaum" und alle Bäume die mit einer 2 anfangen vom Typen "Nadelbaum" (Tipp: Modulo oder Stringmanipulation bieten sich hier an)
benutze die Funktion isValid um zurückzugeben, ob sich die Baumart für unseren Park eignet.
benutze die Funktion treeOutput um in der Konsole, mithilfe unserer Funktion isValid, auszugeben ob sich der Baum für unseren Park eignet. Die Ausgabe sollte wie folgt aussehen: Der Baum Nr. 1000, Eiche ist von der Art Laubbaum und somit nicht für unseren Park geeignet oder Der Baum Nr. 2000, Tanne ist von der Art Nadelbaum und somit für unseren Park geeignet
die Funktion baumAusgabe soll in der vorlesungen.woche06.Tag02.main aufgerufen werden und ihr soll mithilfe von readln() eine treeNr aus den Keys der trees Map mitgegeben werden.
behandle mögliche Exceptions
 */

fun main() {

    try {
        println(
            "Bitte geben Sie eine der folgenden Nummern ein um herauszufinden ob sie für unseren Park geeignet ist."
        )
        println(trees.keys)
        treeOutput(readln().toInt())
    } catch (e: Exception) {
        println("Die folgende Exception, die das Programmz um abstúrzen bringen würde, wurde gefangen:")
        print(e.message)
    }

}

val trees = mapOf<Int, String>(
    1000 to "Eiche",
    1010 to "Buche",
    1020 to "Birke",
    1030 to "Weide",
    1040 to "Ahorn",
    2000 to "Tanne",
    2010 to "Kiefer",
    2020 to "Elbe",
    2030 to "Konifere",
    2040 to "Wachholder"
)

//TODO Exception Handling einbauen
fun getTreeKind(treeNr: Int): String {
    // if (treeNr.toString().first() == '2') {
    // wenn die zahl hinter dem % größer ist als die zahl vor dem %, ist immer die zahl vor dem % das ergebnis
    if ((treeNr % 2000) < 1000) {
        return "Nadelbaum"
    }
    else return "Laubbaum"
}

fun treeOutput(treeNr: Int) {
    val treeKind = getTreeKind(treeNr)
    if (!trees.keys.contains(treeNr)) throw Exception("den Baum gibt es nicht - Programm bricht ab")
    print("Der Baum Nr. $treeNr, ${trees.get(treeNr)} ist von der Art $treeKind und somit ")
    if (!isValid(treeKind)) {
        print("nicht ")
    }
    print("für unseren Park geeignet")
}

fun isValid(treeKind: String): Boolean {
    return treeKind == "Nadelbaum"
}