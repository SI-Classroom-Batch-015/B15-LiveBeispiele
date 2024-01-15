package vorlesungen.woche03.Tag01VoidFunktionen

fun main() {
    calculateAge()
    println("----")
    calculateAge()
    println("----")
    calculateAge()
    println("----")
    calculateAge()

    // Bonus: repeat, 10x calculateAge aufrufen
    repeat(10){
        calculateAge()
    }

}

// Funktion schreiben, die den User sein Geburtsjahr eingeben lässt und das aktuelle Alter in 2024 ausrechnen lässt
fun calculateAge() {
    // 1. println mit sinnvollem Output, damit User weiß, was zu tun ist:
    println("Bitte gib dein Geburtsjahr ein...")

    // 2. Int-Variable, in die User das Geburtsjahr eingeben kann:
    val birthYear: Int = readln().toInt()

    // 3. Variable, in der ausgerechnetes Alter gespeichert wird
    val age: Int = 2024-birthYear

    // 4. sinnvolles println
    println("Du bist $birthYear geboren und damit in 2024 $age Jahre alt.")
}



