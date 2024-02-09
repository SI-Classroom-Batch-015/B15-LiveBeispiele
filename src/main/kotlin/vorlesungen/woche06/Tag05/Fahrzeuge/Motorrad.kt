package vorlesungen.woche06.Tag05.Fahrzeuge

// override: braucht auch val/var, denn: wir ueberschreiben das originale Attribut und erstellen quasi eine "neue" frische Variable anzahlRaeder
class Motorrad(bezeichner: String, override val anzahlRaeder: Int = 2):Landfahrzeug(bezeichner) {

    override fun testDrive() {
        println("Das Motorrad $bezeichner wird zur Probe gefahren...")
    }
}