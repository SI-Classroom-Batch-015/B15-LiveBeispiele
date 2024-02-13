package vorlesungen.woche06.Tag05.streichelzoo

import kotlin.random.Random

class Pony(name: String, gewicht: Double, alter: Int,
           geschlecht: String, var geschwindigkeit : Double) : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen(){
        println("Wiehiehie")
    }

    fun reiten(besucher : Besucher) {
        if(besucher.alter >= 6 && alter >= 1.0) {
            println("${besucher.name} reitet nun auf $name und fühlt sich wie ein Ritter!" +
                    " Sie erreichen ein Tempo von $geschwindigkeit km/h!")
        } else {
            println("Tut mir leid ${besucher.name}. Du bist leider noch zu jung zum Reiten oder das Pony ist zu jung.")
        }
    }

    override fun fuettern(besucher: Besucher) {
        println("${besucher.name} hält $name eine Karotte und ein Zuckerstück hin")
        if (Random.nextBoolean()) {
            println("$name frisst die Karotte. Die Karotte sah zu knackig aus")
        } else {
            println("$name verschlingt das Zuckerstück. Etwas Süßes geht immer")
        }
        gewicht *= 1.02
    }
}