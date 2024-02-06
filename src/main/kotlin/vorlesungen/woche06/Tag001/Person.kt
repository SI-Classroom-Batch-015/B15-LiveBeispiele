package vorlesungen.woche06.Tag001


// Klasse definieren: Blaupause/Bauplan
class Person(var name: String, var lastName: String, var alter: Int, var cat: Cat){

    fun greeting(){
        println("Hi, mein Name ist $name $lastName, ich bin $alter Jahre alt.")
    }

   /**
    // birthDay: erhöht das Alter der Person um 1 Jahr
    // keine Parameter, kein return. Wir greifen lediglich direkt auf die Eigenschaft alter zu und verändern diese
    **/
    fun birthDay(){
        alter++
    }

    fun wedding(newLastName: String){
        lastName = newLastName

    }


}


fun main() {
    // Instanziierung: Baugerüst, um eine konkrete Instanz der Klasse erstellen,
    var katze: Cat = Cat("Betty", 5, "Bengale",Toy("Ball", "rot"))
    var person1: Person = Person("Simon", "Meyer", 24, katze)

    var zahl1: Int = add(9,3)


    // einfach ganze Instanz der Klasse ausdrucken liefert uns lediglich die Speicheradresse
    println("Person1: ${person1.toString()}")

    // einzelne Eigenschaften ausdrucken:
    println("Name: ${person1.name}")
    println("Alter: ${person1.alter}")
    println("Katze: ${person1.cat.name}")
    //println("Lieblingsspielzeug von ${person1.name}s Katze ${person1.cat.name}: ${person1.cat.favoriteToy.name}, Farbe des Lieblingsspielzeugs: ${person1.cat.favoriteToy.color}")

    // Verhalten der Klasse nutzen / Methode aufrufen
    println("---person1.greeting---")
    person1.greeting()
    person1.birthDay()
    println("-person1.greeting nach birthday-")
    person1.greeting()

    println("---person2.greeting---")
    var person2: Person = Person("Laura", "Müller", 18, katze)
    person2.greeting()

    // Instanz der Katze erstellen:
    var toy1: Toy = Toy("Katzenangel", "gelb")
    var cat1: Cat = Cat("Bonnie",2,"Perser", toy1)

    println(cat1.name)
    println(cat1.alter)
    println(cat1.rasse)

    var cat2: Cat = Cat("Alfie", 3, "BKH", Toy("Katzenminze", "grün")) // sterilized ist per default false, wenn ich nichts anderes reinschreibe
    println(cat2.name)
    println(cat2.alter)
    println(cat2.rasse)
    println("${cat2.name} ist per default nicht sterilisiert:")
    println(cat2.sterilized)
    println("${cat2.name} wird sterilisiert:")
    cat2.sterilize()
   println(cat2.sterilized)

    // Person1 und Person2 heiraten: Wedding Funktion aufrufen
    person2.wedding(person1.lastName)
    person2.greeting()

    // per punktnotation eigenschaften verändern
    person1.name = "Jakob"

    // Liste bestehend aus Klassen
    var hausBewohner: List<Person> = listOf(
        person1,
        person2,
      //  Person("Hans", "ImGlueck", 30, Cat("Luzie",4,"Perser", Toy("Angel", "braun"))),
        Person("Sofia", "Richie", 22,cat1)

    )

    println(hausBewohner)
    for (bewohner in hausBewohner){
        println(bewohner.name)
    }

    // sortedBy macht jetzt mehr Sinn: nach bestimmten Eigenschaften aufsteigend sortieren, zB nach Name alphabetisch oder nach Alter aufsteigend
    var sortedAgeBewohner = hausBewohner.sortedBy { it.alter }
    println("---Bewohner nach Alter sortiert---")
    sortedAgeBewohner.forEach { println("${it.name}: ${it.alter}") }

    var sortedNameBewohner= hausBewohner.sortedBy { it.name }
    println("---Bewohner nach Name sortiert---")
    sortedNameBewohner.forEach { println("${it.name}: ${it.alter}") }






}

fun add(nr: Int, nr2: Int): Int {
    return nr+nr2
}