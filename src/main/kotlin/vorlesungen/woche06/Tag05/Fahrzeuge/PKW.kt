package vorlesungen.woche06.Tag05.Fahrzeuge

class PKW(bezeichner: String, preis: Double):Landfahrzeug(bezeichner,120,preis,) {

    override fun testDrive() {
        println("Der PKW $bezeichner wird zur Probe gefahren...")
    }
}