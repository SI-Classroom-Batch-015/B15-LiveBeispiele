package vorlesungen.woche06.Tag05.streichelzoo

class Streichelzoo {
    var kuh1: Kuh = Kuh("Berta", 700.0, 4, "Weiblich")
    var schaf1: Schaf = Schaf("Shawn", 150.0, 4, "Männlich", false)
    var pony1: Pony = Pony("Xavier", 400.0, 4, "Männlich", 15.0)
    var pony2: Pony = Pony("Ilse", 350.0, 4, "Weiblich", 17.0)
    var huhn1: Huhn = Huhn("Samuel", 4.0, 2, "Männlich", 1)
    var huhn2: Huhn = Huhn("Ulla", 3.0, 2, "Weiblich", 2)
    var tiere : MutableList<Tier> = mutableListOf(kuh1, schaf1, pony1, pony2, huhn1, huhn2)
    var besucher: MutableList<Besucher> = mutableListOf()

    fun neuerBesucher(b: Besucher)
    {
        b.vorstellen()
        if (besucher.size < 5) {
            besucher.add(b)
            println("Herzlich Willkommen in unserem Zoo ${b.name}, du bist der ${besucher.size}te Besucher!")
            tiereUndIhreGeraeusche()
        }
        else
            println("Leider ist der Streichelzoo bereits voll")
    }

    fun exit(b: Besucher)
    {
       if (besucher.contains(b)) {
            besucher.remove(b)
            println("Auf Wiedersehen ${b.name}!")
        } else {
            println("Der Besucher hat sich nicht angemeldet!")
        }
    }

    fun tiereUndIhreGeraeusche() {
        println()
        for(tier in tiere) {
            tier.geraeuscheMachen()
        }
    }

    fun rennen(pony1: Pony, pony2: Pony) {
        if (pony1.geschwindigkeit > pony2.geschwindigkeit) {
            println("${pony1.name} hat das Rennen gewonnen!")
        } else if (pony1.geschwindigkeit < pony2.geschwindigkeit) {
            println("${pony2.name} hat das Rennen gewonnen!")
        } else {
            println("Beide waren gleich schnell! Unentschieden!")
        }
    }

}