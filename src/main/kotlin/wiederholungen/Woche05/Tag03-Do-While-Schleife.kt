package wiederholungen.Woche05

//Diese Funktion isValidPasswort ist bereits vorgegeben.
//Sie übernimmt als Parameter ein Passwort in Stringformat
//Dieses Passwort wird auf 3 Anforderungen überprüft (Siehe Z. 10-12 )

//Sind die drei Anforderungen erfüllt, wird true returned
//Ist mindestens eine Anforderung nicht erfüllt, wird false returned
fun isValidPassword(password: String): Boolean {
    // Überprüfe, ob das Passwort mindestens 12 Zeichen lang ist
    // Überprüfe, ob das Passwort einen Großbuchstaben enthält
    // Überprüfe, ob das Passwort ein Sonderzeichen enthält
    return (password.length >= 12) && (password.any { it.isUpperCase() }) &&
            (password.any { it.isLetterOrDigit().not() })
}

fun main() {
    //Variable, die angibt, ob Passwort gültig ist
    var isValid = false

    //do-Schleife
    do {
        //println Bitte Passwort eingeben
        println("Geben Sie ihr Passwort ein:")
        //Abspeichern von readln in Variable Passwort
        var passwort: String = readln()

        //Wenn Passwort gültig ist,
        if (isValidPassword(passwort)) {
            // wird is Valid aktualisiert
            isValid = true
            // und Kunde darauf hingewiesen, dass Passwort gültig war
            println("Ihr Passwort ist gültig.")

                //Ergänzung: Zweite Passworteingabe (Wird oft zur Sicherheit gemacht)
                println("Geben Sie ihr Passwort erneut ein")
                var passwortZweiteEingabe = readln()
                if (passwortZweiteEingabe == passwort){
                    println("Super das Passwort ist richtig")
                }else {
                    isValid = false
                    println("Da hast du dich wohl vertippt. Gib das Passwort noch einmal von vorne ein")
                }

        //In allen anderen Fällen
        } else {
            //wird Kunde darauf hingewiesen, dass das Passwort nicht den Anforderungen entspricht
            println("Das Passwort entspricht nicht den Anforderungen")
            //Der Kunde soll es erneut versuchen
            println("Versuchen Sie es noch einmal")
        }

    //Schleife wird durchgeführt, solange das Passwort nicht gültig ist.
    } while (!isValid)
}
