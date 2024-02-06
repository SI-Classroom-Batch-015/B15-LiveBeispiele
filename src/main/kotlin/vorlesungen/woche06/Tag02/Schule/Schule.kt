package vorlesungen.woche06.Tag02.Schule
class Schule(var name: String,
             var adresse: String,
             val klassen: MutableList<Klasse>) {


    fun addKlasse(klasse: Klasse) {
        klassen.add(klasse)
    }
}