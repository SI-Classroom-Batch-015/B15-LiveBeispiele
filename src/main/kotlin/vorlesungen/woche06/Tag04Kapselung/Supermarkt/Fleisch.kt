package vorlesungen.woche06.Tag04Kapselung.Supermarkt


// Kinderklasse Fleisch, erbt von Lebensmittel

class Fleisch(name: String, preis: Double, tierArt: String): Lebensmittel(name,preis){

    init {
        println("Tierart: $tierArt")
    }

    override val isVegan: Boolean = false

    override fun printInfo() {
        println("$name ist von der Klasse FLEISCH")
        super.printInfo()
    }

    fun braten(){
        println("Unser Fleisch $name wird gebraten... Lecker.")
    }


}