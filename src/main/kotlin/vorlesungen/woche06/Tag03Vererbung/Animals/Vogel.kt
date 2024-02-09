package vorlesungen.woche06.Tag03Vererbung.Animals

open class Vogel(name: String, canFly: Boolean = true): Animal(name,canFly,false) {

    init {
        println("VOGEL $name initialisiert!")
    }

    // kann NICHT ueberschrieebn werden, final schluessel wort verhindert das
    final override fun essen(){
        println("Der VOGEL $name frisst... yummy.")
    }

    // kann im Papagei ueberschrieben werden
    override fun fortBewegung() {
        // super: ruft Methode aus der Mutter auf
        super.fortBewegung()
        println("Der Vogel $name fliegt!")
    }

    override fun toString(): String {
        // super.toString gibt uns die Adresse im Speicher
        return "Vogel: $name"
    }

    fun vogelFunktion(){

    }


}