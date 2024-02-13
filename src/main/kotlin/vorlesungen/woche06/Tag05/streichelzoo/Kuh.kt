package vorlesungen.woche06.Tag05.streichelzoo

class Kuh : Tier {

    var gibtMilch: Boolean

    constructor(name: String, gewicht: Double, alter: Int, geschlecht: String) :
            super(name, gewicht, alter, geschlecht) {
        gibtMilch = alter >= 3 && geschlecht == "Weiblich"
    }

    override fun geraeuscheMachen() {
        println("Muuuh")
    }

    fun melken(besucher: Besucher) {
        if (gibtMilch) {
            println("${besucher.name} melkt das Tier $name und erhält einen Eimer voll Milch!")
        } else {
            println("$name schaut ${besucher.name} komisch an. Hier gibt es keine Milch zu holen.")
        }
    }
}