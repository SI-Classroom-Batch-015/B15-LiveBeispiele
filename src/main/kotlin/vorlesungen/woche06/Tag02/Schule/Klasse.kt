package vorlesungen.woche06.Tag02.Schule

class Klasse {
    var name: String = ""
    var klassenlehrer: String = ""
    val schueler: MutableList<Schueler> = mutableListOf()

    fun addSchueler(schueler: Schueler) {
        this.schueler.add(schueler)
    }
}