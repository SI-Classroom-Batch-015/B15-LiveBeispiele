package vorlesungen.woche06.Tag02

class Car(var brand: String, var year: Int) {

    var color = "black"

    init {
        println("Mit dem 1. Konstruktor ein Auto erstellt!")
    }

    constructor(brand: String, year: Int, color: String) : this(brand,year) {
        println("Mit dem 2. Konstruktor ein Auto erstellt!")
        this.color = color
    }

    constructor(vendor: String): this("VW",1998){
        println("Mit dem 3. Konstruktor einen VW mit Verkäufer $vendor instanziiert ")
    }

}

fun main() {
    // primaerer konstruktor
    var auto = Car("Toyota", 1999)
    auto.color // black


    // sekundaerer konstruktor
    var sekAuto = Car("Audi", 1998, "red")
    println(sekAuto.color) // soll rot sein

    var vendorAuto = Car("Marcel Verkauf")

}