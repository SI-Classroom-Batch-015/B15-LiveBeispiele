package vorlesungen.woche06.Tag05.streichelzoo

class Schaf(
        name: String,
        gewicht: Double,
        alter: Int,
        geschlecht: String,
        var wolleSauber: Boolean
) : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen() {
        println("määäh!")
    }

    fun baden() {
        wolleSauber = true
    }
}
