package vorlesungen.woche06.Tag03Vererbung.Animals

open class Animal(var name: String, var canFly: Boolean, var canSwim: Boolean) {

    init {
        println("TIER namens $name initialisiert!")
    }


    open fun essen(){
        println("Das TIER $name frisst... yummy.")
    }

    open fun fortBewegung(){
        println("Die Bewegung beginnt......")
    }

    override fun toString(): String {
        // super.toString gibt uns die Adresse im Speicher
        println(super.toString())
        return """
            Name: $name 
            Kann Fliegen: $canFly
            Kann Schwimmen: $canSwim
        """.trimIndent()
    }
}

fun main() {
    var tiger: Animal = Animal("Tiger",false,true)
    tiger.essen()
    tiger.fortBewegung()

    var adler: Vogel = Vogel("Adler")
    adler.essen()
    adler.fortBewegung()

    var pinguin: Vogel = Vogel("Pinguin",false)
    pinguin.canSwim = true

    var ara: Papagei = Papagei("Polly",true)
    ara.talk()

    println(ara) // vorlesungen.woche06.Tag03Vererbung.Animals.Papagei@3af49f1c

    println(tiger)
    println(adler)

        // Vogel und Papagei erben von Animal
    val animalList: MutableList<Animal> = mutableListOf(
        tiger,
        adler,
        pinguin,
        ara,
        Animal("Katze",false,false),
        Vogel("Birdie"),
        Papagei("Sabine",true)
        )

    // is Schlüsselwort: gibt true zurueck, wenn it der Klasse Vogel oder ihren Kindern angehört
    var vogelList = animalList.filter { it is Vogel }
    println("---- Vogel Liste ----")
    println(vogelList)

    // as Schlüsseelwort: kann eine KindKlasse zu seiner Mutterklasse machen
    var animalToBird = tiger as? Vogel
    println(animalToBird)
    var birdToAnimal: Animal = pinguin as Animal
    println(birdToAnimal)
    animalList.add(birdToAnimal)
    vogelList = animalList.filter { it is Vogel }
    println(vogelList)
    pinguin.vogelFunktion()
    // as ist bei den Methoden relevant: birdToAnimal hat nicht mehr die Methode vogelFunktion() weil es jetzt ein Animal ist. Taucht aber trotzdem in der Vogelliste auf...
    //birdToAnimal.vogelFunktion()



}