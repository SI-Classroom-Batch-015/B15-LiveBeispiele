package VORLESUNG.Woche03.Tag13Parameter

fun main(){
    // String zum Int: mühsam 2 Funktionen aufrufen
    //var number: Int = readln().toInt()

    // eigene Funktion aufrufen: etwas kürzer
    var number2: Int = getReadlnInt()

}

// getReadlnInteger: Funktion, die uns ein readln() immer direkt zum Int konvertiert

fun getReadlnInt(): Int {
    println("Bitte Zahl eingeben:")
    var number: Int = readln().toInt()
    return number
    // ODER:
    // return readln().toInt()
}




// geburtsjahr ausrechnen
fun calculateAge2(): Int {
    // 1. println mit sinnvollem Output, damit User weiß, was zu tun ist:
    // println("Bitte gib dein Geburtsjahr ein...")

    // 2. Int-Variable, in die User das Geburtsjahr eingeben kann:
    val birthYear: Int = getReadlnInt()

    // 3. Variable, in der ausgerechnetes Alter gespeichert wird
    val age: Int = 2024-birthYear

    // 4. sinnvolles println
    println("Du bist $birthYear geboren und damit in 2024 $age Jahre alt.")

    // die Funktion springt nach return wieder raus. das heisst, jegliche Code Zeilen unter return sind unerreichbar
    return age
    println("Dieses println wird niemals ausgeführt, da unter dem return.")


}
