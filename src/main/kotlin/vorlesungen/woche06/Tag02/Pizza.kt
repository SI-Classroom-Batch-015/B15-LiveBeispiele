package vorlesungen.woche06.Tag02


// temporäre Konstruktorvariable zutaten: hat kein var/val davor, "lebt" nur während der Initialisierung
class Pizza(var name: String, var groesse: Int, var preis: Double, grundZutaten: List<Zutat>, var extraZutaten: MutableList<Zutat>){

    // funktion nicht mehr nutzbar: zutaten sind jetzt temporär
//    fun addToppings(toppings: List<Zutat>){
//        zutaten.addAll(toppings)
//    }

    // neue Funktion mit nicht-temporären extraZutaten
    fun addExtraToppings(extraZutaten: MutableList<Zutat>){
        extraZutaten.addAll(extraZutaten)
    }

    // Initialisierungslogik: der init Block wird IMMER direkt beim Erstellen einer neuen Instanz aufgerufen
    // wir brauchen die Grundzutaten nur, um in init Block den Grundpreis der Pizza auszurechnen. danach vergessen wir sie wieder
    init {
        println("Neue Instanz der Klasse Pizza namens $name initialisiert!")
        println("Gesamtpreis mit den aktuellen Zutaten wird berechnet...")
        grundZutaten.forEach {
            println("Zutat: ${it.name}, Preis: ${it.preis}")
            preis += it.preis
            println("Zwischenpreis: $preis")
        }
        println("Gesamtpreis der Pizza: $preis")
    }

}

class Zutat(var name: String, var preis: Double) {

    init {
        println("Neue Zutat namens $name mit dem Preis $preis erstellt!")
    }

}


fun main() {
    var tonnoZutaten: MutableList<Zutat> = mutableListOf(
        Zutat("Zwiebel", 0.99),
        Zutat("Tomate", 0.89),
        Zutat("extra Käse", 1.09)
    )

    var tonno: Pizza = Pizza(
        "Tonno",
        30,
        7.99,
        listOf(
        Zutat("Pizza Teig",0.90),
        Zutat("Tomatensauce", 0.80)
        ),
        tonnoZutaten
    )
    // nicht möglich: grundZutaten sind temporär, existieren nur beim Initialisieren
    //tonno.grundZutaten

    // alle Zutaten meiner tonno ausdrucken
    tonnoZutaten.forEach { println(it.name) }
    println("---")

    println(tonnoZutaten[0].name)

    tonno.extraZutaten.addAll(tonnoZutaten)
    // ODER:
    tonno.addExtraToppings(tonnoZutaten)
    tonnoZutaten.forEach { println(it.name) }

    var mozarella: Pizza = Pizza("Mozarella",30,5.99, mutableListOf(), mutableListOf())

}


//TODO
    // Wiederholung
    // Parameter, die keine Eigenschaften sind (ohne val/var, nur für Initialisierungslogik)
    // init Block
    // sekundärer Konstruktor
    // .toString()
