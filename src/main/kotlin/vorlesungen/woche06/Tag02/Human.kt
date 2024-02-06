package vorlesungen.woche06.Tag02


// var variable: Datentyp --> normale Variable
// variable: Datentyp (ohne var davor) --> Konstruktorvariable, temporär, nicht außerhalb des Konstruktors oder der Klasse erreichbar
class Human(var name: String, var age: Int, initInfo: String) {


    // init Block wird immer beim Instanziieren einer Klasse ausgefuehrt
    init {
        println("Instanz der Klasse vorlesungen.woche06.Tag02.Human namens ${this.name} erstellt!")
        if (this.age >= 18){
            println("Diese Instanz der Klasse Human ist volljährig, ${this.age} Jahre alt")
        } else {
            println("Diese Instanz der Klasse Human ist nicht volljährig, ${this.age} Jahre alt")
        }

        println(initInfo)
    }

    fun changeName(name: String){
        this.name = name
    }


}

fun main() {
    var mensch = Human("Betty White",99,"InitialisierungsInfo für den Init Block, sonst nirgendwo verfügbar")
    var kind = Human("Harry Potter", 11,"InitialisierungsInfo für den Init Block, sonst nirgendwo verfügbar")
    println(mensch.name)
    println(mensch.age)
    mensch.changeName("Betty Black")
}