package VORLESUNG.Woche03.Tag11VoidFunktionen

fun main(){
    // schön schlanke Main, eine einzige Zeile Code, die nur 1 Funktionsaufruf ist.
    snackAutomat()
}

fun snackAutomat() {
    val snackMachine: Map<String, String> = mapOf(
        "A1" to "Schokoriegel",
        "A2" to "Chips",
        "A3" to "Gummibärchen",
        "B1" to "Nüsse",
        "B2" to "Popcorn",
        "B3" to "Kekse",
        "C1" to "Cola",
        "C2" to "Limonade",
        "C3" to "Wasser"
    )


    // Programm schreiben, das User einen Key eingeben lässt und die passende Süßigkeit ausgibt

    // 1. Schritt: sinnvolles println, was User Bescheid sagt, er/sie soll Essen auswählen
    println("Hier ist unsere Snackmaschine:")
    println(snackMachine)
    println("Bitte wähle anhand der Zahlenkombination aus, worauf du Appetit hast...")

    // 2. Schritt: Variable für die Süßigkeiten Wahl des Users erstellen, Wahl darin speichern
    val choice: String = readln()

    // 3. Schritt: zur Wahl passende Süßigkeit aus der Map schälen
    val sweet: String? = snackMachine.get(choice)
    // ODER:
    val sweet2: String? = snackMachine[choice]

    // 4. Schritt: Süßigkeit ausgeben
    println("Du hast dich für $sweet entschieden, guten Hunger!")
}






