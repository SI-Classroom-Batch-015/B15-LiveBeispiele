package vorlesungen.woche03.Tag02ReturnWerte



// Funktion schreiben, die den User sein Geburtsjahr eingeben lässt und das aktuelle Alter in 2024 ausrechnen lässt.
// UND das Ergebnis zurück gibt!
fun calculateAge(): Int {
    // 1. println mit sinnvollem Output, damit User weiß, was zu tun ist:
    println("Bitte gib dein Geburtsjahr ein...")

    // 2. Int-Variable, in die User das Geburtsjahr eingeben kann:
    val birthYear: Int = readln().toInt()

    // 3. Variable, in der ausgerechnetes Alter gespeichert wird
    val age: Int = 2024-birthYear

    // 4. sinnvolles println
    println("Du bist $birthYear geboren und damit in 2024 $age Jahre alt.")

    // die Funktion springt nach return wieder raus. das heisst, jegliche Code Zeilen unter return sind unerreichbar
    return age
    println("Dieses println wird niemals ausgeführt, da unter dem return.")


}