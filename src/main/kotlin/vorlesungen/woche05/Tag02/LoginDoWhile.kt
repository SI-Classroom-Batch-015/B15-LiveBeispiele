package vorlesungen.woche05.Tag02

fun main() {
    doWhilePasswort()
}

fun doWhilePasswort() {

    // user will sich einloggen, darf 3x versuchen, wird danach ausgesperrt.
    var acceptedName = "user123"
    var acceptedPW = "passwort1"
    var versuchCounter = 1
    var loginSuccesful = false

    do {
        println("Bitte Name eingeben")
        var inputName = readln()
        println("Bitte Passwort eingeben")
        var inputPW = readln()

        // User hat Eingabe gemacht. Was passiert jetzt?
        if (inputPW == acceptedPW && inputName == acceptedName){
            println("Willkommen! Du bist eingeloggt!")
            loginSuccesful = true
            // break // beendet die Schleife

        } else {
            println("Falsche Eingabe. Versuch das ganze nochml...")
            println("Du hast noch ${3-versuchCounter} ${if ((3-versuchCounter) == 1) "Versuch" else "Versuche"}")
            versuchCounter++

        }

        // Abbruchbedingung: Schleife soll enden, wenn ( ) nicht mehr erfuellt ist
    } while (versuchCounter <= 3 && !loginSuccesful)

    if (!loginSuccesful) println("Du hast es zu oft probiert, Account wird 5min gesperrt...")

}
