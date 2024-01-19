package VORLESUNG.Woche03.Tag15Wiederholung

fun main(){

    var firstABC: String = getFirstElement(listOf("A","B","C"))
    var firstProduct: String = getFirstElement(productList)
    println(firstABC)
    println(firstProduct)

    val rabattResult = calculatePrice(3,2.99,0.15)
    println("Der ausgerechnete Preis abzüglich des Rabatts ist: $rabattResult")

    // Map Operationen
    val allePreise = productToPrice.values
    val alleProdukte = productToPrice.keys

    val anzahlProdukte: Int = 5
    val rabatt: Double = 0.5
    val rabattErdbeere = calculatePrice(anzahlProdukte, productToPrice["Erdbeeren"]!!,rabatt)
    println("Der ausgerechnete Preis von $anzahlProdukte Erdbeeren abzüglich des Rabatts von $rabatt ist: $rabattResult")


    var elementAusListe = productList.get(5) // das gleiche wie productList[5]
    println(elementAusListe)

    var lastMapElement = getLastMapValue(productToPrice)
    println(lastMapElement)

}

fun getLastMapValue(map: MutableMap<String,Double>) : Double {
    var alleValues = map.values
    var letzterValue = alleValues.last()

    // kurze Schreibweise
    return map.values.last()
}


fun getFirstElement(list: List<String>): String {
    return list[0]
}

// rabatt rechner

/**
 * Gibt den reduzierten Preis einer bestimmten Anzahl eines bestimmten Produkts zurück
 * @param anzahlProdukte die Anzahl an Produkten, die man kaufen moöchte
 * @param produktPreis: Preis des Produkts
 * @param rabatt: Rabatt in %, per Default 0.0
 * @return discountPreis ausgerechneter preis
 */

fun calculatePrice(anzahlProdukte: Int, produktPreis: Double, rabatt: Double = 0.0): Double {

    val gesamtPreis: Double = anzahlProdukte*produktPreis
    val discountPreis = gesamtPreis * (1-rabatt) // zB 10 * (1-0.15) -> 10 * 0.85
    val discountAlternative = gesamtPreis - (gesamtPreis*rabatt)
    println("discountPreis = $discountPreis")
    println("discountAlternative = $discountAlternative")
    return discountPreis
}


// Value Type vs. Reference Type: wichtiger Unterschied

fun doubleUebergeben(double: Double){
    // ich kann einen Value Type (Double, Int, String, Boolean) NICHT innerhalb einer Funktion aktualisieren
    // double += 10 // zum ausprobieren einkommentieren
}


fun listeUebergeben(list: MutableList<String>){
    // einen Reference Type kann man aber innerhalb der Funktion verändern, solange er Mutable ist!
    list.add("Apfel")
    list.removeAt(0)
}



