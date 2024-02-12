fun main() {
    // Attribute
    val person = Personnnn()
    person.name = "Alice"
    person.age = 30
    person.gender = "female"
    person.introduce()
    val person2 = Personnnn()
    println("name eingeben: ")
    person2.name = readln()
    person2.age = 27
    person2.gender = "male"
    person2.introduce()

    // Konstruktor
    val car = Car("Toyota", "Camry", 2020)
    val car2 = Car("BMW", "X6", 2024)
    car2.info()

// primär + sekundär
// Verwendung des primären Konstruktors
    val auto1 = Autooo("Volkswagen", "Golf", "Blau")
    auto1.info() // Farbe: Blau"

// Verwendung des sekundären Konstruktors
    val auto2 = Autooo("BMW", "3er")
    auto2.info() // Farbe: unbekannt

    // überklasse // Unterklasse
    val hund = Hund("Bello", 5, "Dackel")
    hund.info()
    hund.bellen()

    // private
    // val person2 = Person2() -> kann nicht initaliziert werden und somit auch nicht auf die methoden zugegriffen werden

    // protected
    val hund2 = Hund2()
    hund2.bellen() // Ausgabe: "Generic sound"
    //println(hund2.sound) // Nicht erlaubt, da sound als protected deklariert ist und nicht außerhalb der Basisklasse oder ihrer abgeleiteten Klassen zugegriffen werden kann
}

