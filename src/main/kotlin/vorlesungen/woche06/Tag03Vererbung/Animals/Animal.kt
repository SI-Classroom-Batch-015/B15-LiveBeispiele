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

    val animalList: List<Animal> = listOf(tiger,adler,pinguin,ara,Animal("Katze",false,false))

}