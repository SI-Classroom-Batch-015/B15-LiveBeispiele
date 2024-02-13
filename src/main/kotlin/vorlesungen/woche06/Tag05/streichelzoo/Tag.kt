package vorlesungen.woche06.Tag05.streichelzoo


fun main(){

        val streichelzoo: Streichelzoo = Streichelzoo()
        val besucher1: Besucher = Besucher("Seb", 15)
        val besucher2: Besucher = Besucher("Boris", 4)
        val besucher3: Besucher = Besucher("Timo", 5)
        val besucher4: Besucher = Besucher("Miriam", 18)
        val besucher5: Besucher = Besucher("Sahel", 14)
        val besucher6: Besucher = Besucher("Marek", 60)

        streichelzoo.neuerBesucher(besucher1)
        streichelzoo.neuerBesucher(besucher2)
        streichelzoo.neuerBesucher(besucher3)
        streichelzoo.neuerBesucher(besucher4)
        streichelzoo.neuerBesucher(besucher5)
        streichelzoo.neuerBesucher(besucher6)

        for (besucher in streichelzoo.besucher) {
            streichelzoo.pony1.reiten(besucher)
        }

        streichelzoo.schaf1.fuettern(besucher6)
        streichelzoo.huhn2.bewegung()
        streichelzoo.kuh1.streicheln(besucher1)
        streichelzoo.kuh1.streicheln(besucher1)

        streichelzoo.exit(besucher1)
        streichelzoo.exit(besucher2)

        streichelzoo.kuh1.melken(besucher4)

        for (tier in streichelzoo.tiere) {
            tier.fuettern(besucher3)
        }

        if (!streichelzoo.schaf1.wolleSauber)
            streichelzoo.schaf1.baden()

        streichelzoo.rennen(streichelzoo.pony1, streichelzoo.pony2)


        while (!streichelzoo.besucher.isEmpty()) {
            streichelzoo.exit(streichelzoo.besucher[0])
        }
    }



    