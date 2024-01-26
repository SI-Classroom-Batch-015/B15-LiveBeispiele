package wiederholungen.Woche04


var store: MutableMap<String, Double> = mutableMapOf(
    "MacBook Pro" to 1499.99,
    "Samsung S10" to 899.89,
    "Eames Lounge Chair" to 12567.00,
    "Nivea Gesichtscreme" to 1.99,
    "Labelo" to 1.99,
    "Zewa" to 3.99
)

fun main() {
    println("***-----------Store Anfang-----------***")
    println(store)

    // faengt die Exception, die in addArticle() geworfen werden kann ab.
    println("\n***-----------Store nach addArticle()-----------***")
    try {
        addArticle("Labelo", 399.99)
    }
    catch (e: Exception) {
        println(e)
    }
    println(store)

    // ruft den Preis der Fanta ab und gibt eine Fehlermeldung aus,w enn Artikel nicht existiert
    val priceFanta = getPrice("Fanta")
    println("\n***-----------Preis einer Fanta-----------***")
    if (priceFanta == null)
        println("Dieser Artikel existiert nicht")
    println(priceFanta)

    // MacBook Pro wir dum 50% mit Hilfe der sale-funktion reduziert
    sale(0.5, "MacBook Pro")
    println("\n***-----------Store nach Sale-----------***")
    println(store)

}

/**
 * fuegt einen neuen Artikel der map store hinzu.
 * Falls der Artikel bereits existiert wird eine Exception geworfen.
 * @param name Der Artikelname des neuen Artikels
 * @param price Der Artikelpreis des neuen Artikels
 */
fun addArticle(name: String, price: Double) {
    if (name in store) {
        throw Exception("Der Artikel existiert bereits")
    }
    else {
        store[name] = price
    }
}

/**
 * sucht den Preis eines Artikels in der mao store
 * @param productName der Name dessen Preis ermittelt werden soll
 * @return Den Preis des Artikels oder null, falls Artikel nicht existiert
 */
fun getPrice(productName: String) : Double? {
    if (productName in store) {
        return store[productName]
    }
    else {
        return null
    }
}

/**
 * reduziert einen Artikel um eine gegebene Prozentzahl.
 * Benutzt die Funktion getPrice() um den Preis yu bekommen und abyufangen ob der Artikel existiert
 * @param discount Prozentzahl, um die Artikel reduyiert werden soll z.B. 0.5
 * @param productName Produkt, welches reduyiert werden soll
 */
fun sale(discount: Double, productName: String) {
    val priceProduct = getPrice(productName)
    if (priceProduct != null) {
        val reducedPrice: Double = priceProduct * discount
        store[productName] = reducedPrice
    }
}
