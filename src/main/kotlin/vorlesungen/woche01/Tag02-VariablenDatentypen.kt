package vorlesungen.woche01

fun main() {
    // Variable anlegen:
    // Syntax: Schluesselwort var - variablenname - = - inhalt
    var firstName: String = "Harry"
    println(firstName)
    println("Hallo, firstName") // keine escapen/ Interpolation ($ benutzen, um Worte im String als Code zu erkennen)
    println("Hallo, $firstName") // Interpolation mit $, firstName wird jetzt als Variable/Logik/Code erkannt

    // Variable aktualisieren
    firstName = "Ron"
    println(firstName)
    println("Hallo, $firstName")
    // konkatenation: an einen string mit + einen weiteren string hängen
    println("Hallo, " + firstName)
    firstName = "Hermine"
    println(firstName)
    println("Hallo, $firstName")
    firstName = "Haryy"

    var lastName: String = "Potter"

    println("Hallo $firstName $lastName") // Hallo Harry Potter

    // weshalb wir camelCase benutzen: besser lesbar 🐫
    var isStatusPosted = true
    var isstatusposted = true


    // Konstante: Schluesselwort val, nicht veraenderbar.
    lastName = "Weasley"
    val birthDate: String = "01.01.2001"
    // birthDate = "02.02.2002" // <- Compilefehler, birthDate ist eine Konstante, darf nicht verändert werden



    // readln() benutzen, in Variable speichern
    println("Bitte gib dein Lieblingsessen ein....")
    var favoriteFoodInput: String = readln() // readln gibt das zurück, was in die Konsole reingeschrieben wurde. heißt also, die eingabe wird in der variable input gespeichert

    println(favoriteFoodInput)
    println("Dein Lieblingsessen ist also $favoriteFoodInput!") // mit $ variable input escaped/interpoliert


    // Variablen können deklariert (= ohne Inhalt angelegt) werden, indem man den Datentyp explizit angibt
    var fullName: String
    fullName = "Lord Voldemort"

    // \n = Zeilenumbruch
    println("Hallo,\n$fullName")

    // \ mit zB "
    println("$fullName sagte: \"Ich bin Gott!\" ")


    // Datentyp Integer, man darf mit ihnen *, /, +, -, etc rechnen
    var number1: Int = 5
    println(number1)
    println("Die Zahl ist eine $number1")
    var number2: Int = 10
    println(number2)
    println("Das Ergebnis von $number1 + $number2 ist = ${number1 + number2}")
    var number3: Int = (number1 + number2) * 10
    println("number3 = $number3")


    // Datentyp Double: Zahl mit Komma, man darf mit ihnen *, /, +, -, etc rechnen
    var doubleNr1: Double = 10.5
    println(doubleNr1)
    var doubleNr2: Double = 100.5
    println(doubleNr2)
    var doubleResult: Double = doubleNr1 * doubleNr2
    println("$doubleNr1 * $doubleNr2 = $doubleResult")
    println(doubleNr2*doubleNr1)


    // Datentyp Boolean:
    var isSunShining: Boolean = true
    println("Es ist $isSunShining, dass heute die Sonne scheint.")
    isSunShining = false
    println("Es ist $isSunShining, dass heute die Sonne scheint.")



}