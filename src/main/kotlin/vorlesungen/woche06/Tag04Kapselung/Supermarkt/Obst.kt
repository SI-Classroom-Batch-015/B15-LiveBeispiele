package vorlesungen.woche06.Tag04Kapselung.Supermarkt

// Kinderklasse Obst, erbt von Lebensmittel
class Obst(name:String,preis:Double,protected var vitaminGehalt: String): Lebensmittel(name,preis){

    constructor(name: String):this(name,0.50,"vitaminreich")

    override fun printInfo() {
        println("$name ist von der Klasse OBST")
        super.printInfo()
    }

    fun schnippeln(){
        println("Obst $name wird geschnippelt..")
    }

    protected fun printVitamine(){
        println(this.vitaminGehalt)
    }

    fun getVitaminGehalte():String {
        printVitamine()
        return this.vitaminGehalt
    }

    fun setVitaminGehalte(newVitaminGehalt: String){
        this.vitaminGehalt = newVitaminGehalt
    }


}