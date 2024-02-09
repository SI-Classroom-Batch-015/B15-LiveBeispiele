package vorlesungen.woche06.Tag05.Fahrzeuge

// open Klasse: kann vererben
// protected: wie private, nur, dass es vererbt werden kann. private kann nichtmal vererbt werden
open class Fahrzeug(var bezeichner: String, protected val maxKmh: Int, var price: Double, open val anzahlRaeder: Int, var isVermietet: Boolean = false) {

    constructor(bezeichner: String) : this(bezeichner,150,49.99,4)

    // toString liefert bevor wir es overriden (ueberschreiben) die Adresse eines Objects im Speicher zurueck, wenn man das ganze Objekt printed. Wir machen daraus, dass es Informationen liefert
    override fun toString(): String {
        return """
            Fahrzeug $bezeichner
            MaxKmh: $maxKmh
            Preis: $price
            Anzahl an Rädern: $anzahlRaeder
            Ist Gerade Vermietet? $isVermietet
            -------------------------------------
           
           
        """.trimIndent()
    }

    // getMaxKmh: brauchen wir, weil maxKmh protected ist. nur durch diesen getter kriegen wir es nach außen, um ggf damit zu arbeiten
    open fun getTheMaxKmh(): Int {
        return this.maxKmh
    }

    // open Funktion: darf vom Kind überschrieben werden (override)
    open fun printInfo() {
        println("""
            --PrintInfo aus der Fahrzeug Mutter--
            Fahrzeug $bezeichner
            MaxKmh: $maxKmh
            Preis: $price
            Anzahl an Rädern: $anzahlRaeder
            -------------------------------------
        """.trimIndent())

    }

    open fun testDrive(){
        println("Das Fahrzeug $bezeichner wird zur Probe gefahren...")
    }





}

fun main() {
    var auto: Fahrzeug = Fahrzeug("Mercedes")
    var auto2: Fahrzeug = Fahrzeug("VW",140,39.99,4)

    // toString() muss nicht extra aufgerufen werden, es gilt für das ganze Objekt
    println(auto)
    println(auto2)

    auto.getTheMaxKmh()

    var dreiRad: Landfahrzeug = Landfahrzeug("Dreirad",3)

    dreiRad.printInfo()
    println("-------------")
    dreiRad.testDrive()
    auto.testDrive()

}