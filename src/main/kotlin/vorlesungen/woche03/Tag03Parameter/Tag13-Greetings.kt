package VORLESUNG.Woche03.Tag13Parameter

fun main(){
     var nameMap: Map<String, Int> = mapOf(
         "Jonas" to 11,
         "Marie" to 19,
         "Jennie" to 50
         )

    var max: String = "Max"
    greetPerson(max)
    greetPerson("Moritz")
    greetPerson("Anne")
    greetPerson("Joseph")
    // auch möglich: Parametername = vor den individuellen Wert schreiben
    greetPerson(name = "Joseph")

    // auch möglich: Parameter = funktionsaufruf
    println("GreetPerson mit readln aufrufen, bitte Namen eingeben:")
    greetPerson(readln())

}


// in den () deklarieren wir eine Platzhalter Variable, die uns sagt: beim Aufruf gebe ich einen Wert von diesem Datentyp (hier String) ein, der dann in der Funktion benutzt wird
fun greetPerson(name: String){
    // name = "Moritz" // NICHT möglich, Parameter gelten als vals also Konstanten.
    println("Hi, $name du siehst gut aus.")
}



