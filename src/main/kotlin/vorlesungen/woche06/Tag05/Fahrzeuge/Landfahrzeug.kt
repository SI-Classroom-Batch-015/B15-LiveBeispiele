package vorlesungen.woche06.Tag05.Fahrzeuge

open class Landfahrzeug(bezeichner: String, maxKmh: Int, price: Double, anzahlRaeder: Int = 4): Fahrzeug(bezeichner, maxKmh, price, anzahlRaeder) {

    constructor(bezeichner: String, anzahlRaeder: Int) : this(bezeichner, 120, 45.0, anzahlRaeder) {
        // init Logik im Konstruktor: wird immer ausgeführt, sobald eine Instanz erstellt wird
        println("Landfahrzeug mit Sekundaerem Konstruktor erstellt!")
        // super = printInfo aus der Mutter aufrufen
        super.printInfo()
    }

    constructor(bezeichner: String):this(bezeichner,100,30.0)

    override fun printInfo() {
        println("---PrintInfo aus dem Landfahrzeug---")
        // printInfo aus der Mutter aufrufen
        super.printInfo()
        // zusätzliche funktionalität
        println("---PrintInfo aus dem Landfahrzeug beendet---")
    }

    override fun testDrive(){
        println("Das Landfahrzeug $bezeichner wird zur Probe gefahren...")
    }



}