package vorlesungen.woche06.Tag03Vererbung

class Human(var name: String, var age: Int, var eyeColor: String = "braun") {
    // wird immer beim Erstellen (= Initialisieren) einer Instanz automatisch aufgerufen
    init {
        println("MIT 1K: Klasse Human namens ${this.name} initialisiert!")
        // Logik im init Block
        if (this.age >= 18){
            println("Dieser Mensch ist volljährig.")
        } else println("Dieser Mensch ist nicht volljährig.")
    }

    // sekundärer Konstruktor mit Default Wert für age in den Attributen und zusätzlicher Eigenschaft gender, die wir hier nicht initialisieren
    // { } direkt dahinter sind quasi der init Block, werden beim initialisieren aufgerufen
    constructor(name: String, gender: String): this(name, 0){
        println("MIT 2K: Klasse Human namens ${this.name} und Geschlecht $gender initialisiert!")
    }

    // this: sagt uns: die Klassenvariable ist gemeint
    fun nameChange(name: String){
        this.name = name
    }
}

fun main() {
    // Erster Konstruktor
    var mensch: Human = Human("Simon",20)
    var kind: Human = Human("Bella",7,"blau")

    // Zweiter Konstruktor
    var person: Human = Human("Johnny","male")
    var person2: Human = Human("James","male")
    mensch.nameChange("Simone")


}