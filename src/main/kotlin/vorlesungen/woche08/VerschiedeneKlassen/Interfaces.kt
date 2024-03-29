// Interface Beispiel
interface Animal {
    // Abstrakte Eigenschaften ohne Implementierung: nicht initialisiert. wirft bei normalen Klassen Fehler.
    val name: String
    val breed: String

    // Abstrakte Methode ohne Implementierung - man kann lediglich Funktionsköpfe definieren, die dann von den Kindern implementiert werden
    fun makeSound()

    // Konkrete Methode mit Implementierung
    fun sleep() {
        println("$name (${this::class.simpleName}) schläft.")
    }
}

// Implementierung des Interface durch die Klasse
class Dog(override val name: String, override val breed: String) : Animal {
    // Überschreiben der abstrakten Methode
    override fun makeSound() {
        println("$name (${this::class.simpleName}) bellt.")
    }
}



// Implementierung von 2 Interfaces durch eine Klasse
class Cat(override val numberOfLegs: Int, override val hasFur: Boolean, override val name: String, override val breed: String) : Animal, Mammal {
    // Überschreiben der abstrakten Methode
    override fun makeSound() {
        println("$name (${this::class.simpleName}) miaut.")
    }

    // Überschreiben der konkreten Methode
    override fun sleep() {
        // this(diese)::class(greift auf Metadaten einer Klasse zu, Klassenbezeichner) simpleName (gibt den einfachen Namen der aktuellen Klasse zurueck)

        println("$name (${this::class.simpleName}) schläft.")
    }
}


interface Mammal {
    val numberOfLegs: Int
    val hasFur: Boolean

}

fun main() {
    // Verwendung der Klasse Dog
    val dog = Dog("Bello", "Golden Retriever")
    dog.makeSound()
    dog.sleep() // Aufruf der konkreten Methode


    // Verwendung der Klasse Cat
    val cat = Cat(4,true,"Whiskers", "Maine Coon")
    cat.makeSound()
    cat.sleep() // Aufruf der überschriebenen konkreten Methode
    // erbt auchvon Mammal:
    println(cat.numberOfLegs)
    println(cat.hasFur)
}
