// Attribute -> werden verwendet um den Zustand eines Objektes zu definieren
class Person {
    var name: String = ""
    var age: Int = 0
    var gender: String = ""

    fun introduce() {
        println("Hello, my name is $name. I am $age years old and I am $gender.")
    }
}

// Konstruktor -> werden verwendet um ein Objekt zu initialisieren und seinen Anfangszustand festzulegen
class Car(
    val brand: String,
    val model: String,
    val year: Int) {

    fun info() {
        println("This is a $year $brand $model.")
    }
}

// Primär + Sekundär
class Auto(
    val marke: String,
    val modell: String,
    val farbe: String) {
    // Primärer Konstruktor

    // Sekundärer Konstruktor
    constructor(marke: String, modell: String) : this(marke, modell, "unbekannt")
    // this -> damit wird der primärkonstruktor aufgerufen -> dieser übergibt die argumente und ändert den string in "unbekannt"

    fun info() {
        println("Marke: $marke, Modell: $modell, Farbe: $farbe")
    }
}

// Überklasse open -> bedeutet das eine Klasse oder Methode von einer abgeleiteten Klasse überschrieben werden kann
open class Tier(
    val name: String,
    val alter: Int) {

    open fun info() { // Unterklassen können diese Methode überschreiben
        println("Name: $name, Alter: $alter Jahre")
    }
}

// Unterklassen
class Hund(
    name: String,
    alter: Int,
    val rasse: String) : Tier(name, alter) {

    override fun info() { // Methode darf eine vorhandene Methode aus einer übergeordneten Klasse überschreiben
        println("Hund - Name: $name, Alter: $alter Jahre, Rasse: $rasse")
    }

    fun bellen() {
        println("$name bellt: Wuff! Wuff!")
    }

}

// private klassen -> Die Klasse und ihre Member sind nur innerhalb der Datei sichtbar (gesamte klasse)

private class Person2 {
    private val name: String = "Max"
    private fun greet() {
        println("Hello, my name is $name")
    }
    fun get() {
        return greet()
    }
}

// protected -> erlaubt den Zugriff auf bestimmte Elemente einer Klasse nur innerhalb der Klasse selbst und in abgeleiteten Klassen
open class Tier2 { // überklasse
    protected val sound: String = "Generic sound"

    protected fun makeSound() {
        println(sound)
    }
}

class Hund2 : Tier2() { // unterklasse
    fun bellen() {
        makeSound() // Zugriff auf die geschützte Methode der Basisklasse
    }
}

/*fun main() {
    val person2 = Person2()
    person2.get()
}
 */