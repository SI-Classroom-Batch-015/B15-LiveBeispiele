package vorlesungen.woche06.Tag001

// Katze mit Default-Attributen
// Primaerer Konstrutkor ist unser Grundgerüst, wird immer von den anderen Konstrutkoren aufgerufen
class Cat(
    var name: String,
    var alter: Int,
    var rasse: String,
) {


    // initialisiert beim ersten erstellen einer instanz, wird jedes mal aufgerufen
    init {
        println("Katze $name mit dem ERSTEN Konstruktor erstellt!")
    }
    // kein var vor bereits existierenden Attributen, es gibt sie ja schon
    // sekundärer Konstruktor
    // braucht keinen extra init block, bekommt einfach einen koerper fuer initialisierungslogik
    // Zusätzliche Gerüste für zusätzliche Eigenschaften
    constructor(name: String,alter: Int,rasse: String, favoriteToy: Toy, sterilized: Boolean) : this(name,alter,rasse){
        println("Katze $name mit dem ZWEITEN Konstruktor initialisiert!")
    }

    constructor(name:String): this(name,0,""){
        println("Katze $name mit dem DRITTEN Konstrutkor initialisiert!")
    }


}

fun main() {
    // 1. Konstruktor nutzen
    var cat: Cat = Cat("Betty",12,"Perser")

    // 2. Konstruktor nutzen
    var cat2: Cat = Cat("Mausi",3,"Wildkatze",Toy("Katzenangel", "gelb"),true)

    // 3. Konstruktor benutzen
    var cat3: Cat = Cat("Dobbie")

    var catList: List<Cat> = listOf(cat,cat2,cat3)

}
