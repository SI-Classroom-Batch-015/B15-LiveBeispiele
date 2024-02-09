package vorlesungen.woche06.Tag05.Fahrzeuge

open class Wasserfahrzeug(bezeichner: String, maxKmh: Int, price: Double ):Fahrzeug(bezeichner,maxKmh,price,6) {

    constructor(bezeichner: String):this(bezeichner,100,49.99)


    override fun printInfo() {
        println("---PrintInfo aus dem Wasserfahrzeug---")
        super.printInfo()
    }

    override fun getTheMaxKmh(): Int {
        println("Maxgeschwindigkeit des Wasserfahrzeugs:")
        return super.getTheMaxKmh()
    }

    override fun testDrive() {
        println("Das Wasserfahrzeug $bezeichner wird zur Probe geschwommen...")
    }

}