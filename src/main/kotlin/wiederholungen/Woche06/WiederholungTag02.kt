fun main () {
    // init einer adresse
    println("Initalisierung adresse")
    val address = Address("ABCStraße", "ABCHausen", "090909")

    // init eine haus
    val house = House(address)

    // inint einer person
    var person = Person("Max", house)

    println("\n Haus Adresse von ${person.name}")
    person.displayHouseAddress() // CMD + Linksklick -> durchsuchen der codebasis!

    // init eines 2. hauses

    var house2 = House("zweiteAdresse", "LA", "21212", "beton")

    val house3 = House(true)

}

class Address(val street: String, val city: String, val zipCode: String) { // Klasse Address hat ein primär konstruktor und 3 parameter

}

class House {
    val address: Address // Klasse implementiert

    constructor(address: Address) { // das ist ein sekundärer konstruktor -> kann mehere parameter enthalten (bzw. zusätzliche)
        this.address = address // this bezieht sich auf die parameter in der klasse address
    }

    constructor(street: String, city: String, zipCode: String, material: String) {
        this.address = Address(street, city, zipCode)
    }

    /*
    constructor(pool: Boolean) {
        this.address =
    }
    */


    fun displayAddress() {
        println(" Dieses Haus befindet sich in folgender adresse ${address.street}, ${address.zipCode}, ${address.city}")
    }
}

class Person(val name: String, val house: House) {
    init { // init -> Initalisierung -> alles was in diesem block steht wird direkt aufgerufen nach dem primären konstruktor
        println("Eine neue Person wird initalisiert: ")
        println("Name: $name")
    }

    fun displayHouseAddress() {
        println("$name wohnt hier:")
        house.displayAddress()
    }
}

