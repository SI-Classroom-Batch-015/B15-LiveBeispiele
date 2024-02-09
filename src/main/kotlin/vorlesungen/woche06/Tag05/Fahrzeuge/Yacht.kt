package vorlesungen.woche06.Tag05.Fahrzeuge

class Yacht(bezeichner: String,maxKmh:Int,price:Double): Wasserfahrzeug(bezeichner,maxKmh, price) {

    constructor(name: String):this(name,50,199.99){
        println("Yacht $name mit dem Sekundaeren Konstruktor erstellt!")
        printInfo()
    }

    override fun printInfo() {
        println("----PrintInfo aus der Yacht----")
        super.printInfo()
    }

    fun feiern(){
        println("Die Leute auf der Yacht $bezeichner feiern eine Party!")
    }
}