package vorlesungen.woche03.Tag01VoidFunktionen

fun main() {
    println("Es folgt der Funktionsaufruf von printName....")
    println("----")
    printName()
    println("----")
    printName()
    println("----")
    printName()
    println("----")
}

// Sinn von Funktionen: Wiederholbarer Code, der nicht immmer wieder geschrieben werden muss!
fun printName(    )      {
    println("Hi, wie ist dein Name?")
    val name: String = readln()
    println("Guten Morgen, $name!")
}
