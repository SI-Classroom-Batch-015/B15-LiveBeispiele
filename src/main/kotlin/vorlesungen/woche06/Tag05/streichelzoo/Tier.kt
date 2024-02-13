package vorlesungen.woche06.Tag05.streichelzoo

open class Tier(
    var name: String,
    var gewicht: Double,
    val alter: Int,
    val geschlecht: String
) {
    fun bewegung() {
        println("$name bewegt sich durchs Gehege.")
    }

    open fun geraeuscheMachen() {
        println("Das Tier $name macht ein Geräusch!")
    }

    fun streicheln(besucher : Besucher) {
        println("Der Besucher ${besucher.name} streichelt das Tier $name.")
    }

    open fun fuettern(besucher : Besucher) {
        println("${besucher.name} gibt $name etwas zu Essen. $name stürzt sich aufs Essen und frisst sich satt.")
        gewicht *= 1.02
    }
}