package VORLESUNG.Woche03.Tag15Wiederholung

// Void Funktionen
    // WelcomeScreen: zufällige begrüßung, zufälliger Name

fun main(){
    welcomeScreen()

}

/**
 * Void Funktion ohne return: Druckt einen zufälligen Gruß und einen zufälligen Namen in die Konsole aus, gibt nichts zurück
 */
fun welcomeScreen(){
    // zufälliges grußwort generieren
    var greeting = getRandomGreeting()

    // zufälligen namen generieren
    val name: String = getRandomName()

    // beides zusammen ausdrucken
    println("$greeting $name")
}


fun getRandomGreeting(): String {
    val greetings: List<String> = listOf("Hi", "Hallo", "Hey", "Moin")
    val greeting: String = greetings.random()
    return greeting
}

fun getRandomName(): String {
    val names: List<String> = listOf("Marco", "Simon", "Jenny", "Lea")
    val name: String = names.random()
    return name
}