package vorlesungen.woche06.Tag05.streichelzoo

class Huhn(name: String, gewicht: Double, alter: Int,
           geschlecht: String) : Tier(name, gewicht, alter, geschlecht) {

    var anzahlEierProTag : Int = 0

    constructor(name: String,
                gewicht: Double,
                alter: Int,
                geschlecht: String,
                anzahlEierProTag: Int) : this(name, gewicht, alter, geschlecht) {
        if (geschlecht == "Weiblich")
            this.anzahlEierProTag = anzahlEierProTag
    }

    override fun geraeuscheMachen() {
        println("ga-gack")
    }

    fun erschreckt() {
        if (gewicht < 5) {
            println("Das Huhn hat sich erschreckt und flattert etwas weg")
        }
        else {
            println("Das Huhn hat sich erschreckt und wollte wegfliegen, aber" +
                    "es war zu schwer...")
        }
    }
}