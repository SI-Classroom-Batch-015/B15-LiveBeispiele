package VORLESUNG.Woche04.Tag20Wiederholung

import kotlin.random.Random


// Die gespeicherten User mit deren PW
// user sind außerhalb von main() : globale Konstanten, in anderen Dateien nutzbar. globale Konstanten werden GROSS geschrieben
val USER1 = "Batman"
val PW1 = "1234"

val USER2 = "Superman"
val PW2 = "password"

fun main(){

    val bool: Boolean = true
    // nextBoolean: Funktoin, die einen zufälligen Boolean zurueckgibt
    val randomBool: Boolean = Random.nextBoolean()
    val randomBool2: Boolean = listOf(true,false).random()
    val listContains10: Boolean = listOf(1,2,3,4,5).contains(10)

    // most basic if else
    // in die ( ) nach dem if kommt eine Variable, eine Funktion, eine Bedingung, etc. die ein Boolean ergibt (true oder false)
    if (listContains10){
        println("Die Bedingung ist true")
        println("Immernoch im true Block")
    } else {
        println("Die Bedingung ist false.")
    }

    // shortest if else: wenn nur 1 einzige Zeile Code im jeweiligen Block stattfindet
    if (false) println("Die Bedingung ist true")
    else println("Die Bedingung ist false.")

    // variablen, um zu tracken, ob die user jeweils eingeloggt sind
    var isUser1LoggedIn: Boolean = false
    var isUser2LoggedIn: Boolean = false


    // User1 einloggen, lange version (verschachtelte ifs)
    println("Gib deinen Usernamen ein...")
    val userName: String = readln()

    isUser1LoggedIn = loginUser1(userName) // loginUser1 gibt true/false zurueck, daher kann ich dann anhand der isUser1LoggedIn Variable weitere Logik schreiben.


    isUser2LoggedIn = loginUser2(userName)
    val passwort = "x"


    if (isUser1LoggedIn) {
        println("Willkommen in der App. Hier ist dein Home Screen")
    } else {
        println("Willkommen im Login Screen, bitte log dich ein.")
    }

    // Beispiel für NOT EQUALS !=
    if (userName != USER1 && passwort != PW1){
        println("Falscher Username und/oder Falsches Passwort...")
    }

    val isLocked: Boolean = true // Tür ist verschlossen
    val isSecure: Boolean = true // Bereich ist sicher

    // // Beispiel für ODER: Zugang verboten, wenn die Tür verschlossen ODER der Bereich sicher ist.
    if (isLocked || isSecure) {
        println("Zugang verboten.")
    }

    // Identisch: !(A || B) == !A && !B
        // Äquivalent: Zugang verboten, wenn weder die Tür verschlossen (nicht A) NOCH der Bereich unsicher (nicht B) ist.
        if (!(isLocked || isSecure)) {
            println("Hier kommt false raus, sobald entweder die Tür offen ist oder der Bereich unsicher ist.")
        }

        // Äquivalent: Zugang verboten, wenn die Tür nicht verschlossen (nicht A) UND der Bereich nicht unsicher (nicht B) ist.
        if (!isLocked && !isSecure) {
            println("Hier kommt false raus, sobald entweder die Tür offen ist oder der Bereich unsicher ist.")
        }

}
fun loginUser2(userName: String): Boolean {
    // User2 einloggen: sehr kurze Version (Verknüpfungsoperatoren)
    println("Bitte Passwort eingeben...")
    val pw: String = readln()
    if (USER2 == userName && pw == PW2) {
        println("Erfolgreich eingeloggt, Name PW stimmen beide.")
        return true
    }
    else return false

}

fun loginUser1(userName: String): Boolean {
    // 1. pruefen, ob der Nutzername stimmt
    if (userName == USER1) {
        // 2.1 passwort eingeben lassen
        println("Bitte gib dein Passwort ein...")
        val userPW: String = readln()
        // 2.2 pruefen, ob das Passwort stimmt
        if (userPW == PW1) {
            println("Erfolgreich eingeloggt.")
            return true
        } else {
            println("Passwort falsch eingegeben. Abbruch.")
            return false
        }
    } else {
        println("Ungültigen Usernamen eingegeben. Abbruch.")
        return false
    }
}
