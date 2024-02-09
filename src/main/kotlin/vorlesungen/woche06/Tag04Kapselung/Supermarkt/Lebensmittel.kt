package vorlesungen.woche06.Tag04Kapselung.Supermarkt

// protected: quasi private, aber wird vererbt. private wird nicht vererbt.
open class Lebensmittel(val name: String, protected var preis: Double, open val isVegan: Boolean = true){


//    constructor(name: String,preis: Double): this(name,preis,false){
//        println("Sekundaerer Konstruktor zum intitalisieren benutzt")
//    }

    fun getPrice(): Double {
        return this.preis
    }

    // von aussen nicht benutzbar, aber innerhalb der klasse schon. kann zB in einer anderen Methode aufgerufen werden
    private fun printInternalInfo(){
        println("--Secret Info--")
        println("Preis: $preis")
    }

    open fun printInfo(){
        println("--Open Info--")
        println("$name ist ${if (isVegan) " " else "nicht"} vegan")
        printInternalInfo()
    }



}

fun main() {
    var essen = Lebensmittel("Fisch",7.99,false)
    essen.printInfo()
    // essen.printInternalInfo()

    var fleisch: Fleisch = Fleisch("Steak",8.99,"Rind")

    fleisch.braten()
    fleisch.getPrice() // kommt aus dem Lebensmittel

    var obst: Obst = Obst("Apfel",0.49,"sehr vitaminreich")
    println(obst.isVegan)
    obst.getVitaminGehalte()

}