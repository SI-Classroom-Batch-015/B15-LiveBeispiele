package VORLESUNG.`W05-Schleifen`.d03


fun main() {
    val smoothies = mapOf(
        "Tropical" to 3.49,
        "Erdbeere Mango" to 2.99,
        "Banane Kirsch" to 2.99,
        "Detox" to 3.99,
        "Wild Berries" to 3.49
    )

    val orders = listOf(
        listOf("Tropical", "Detox"),
        listOf("Banane Kirsch"),
        listOf("Erdbeere Mango", "Erdbeere Mango"),
        listOf("Banane Kirsch", "Wild Berries", "Detox")
    )

    //TODO Preis von orders ausrechnen

    // mit Lambda
    // 1. Schritt: preis variable
    var totalPrice = 0.0
    orders.forEach {order -> order.forEach {smoothieInOrder ->
            println("Aktueller Smoothie: $smoothieInOrder, dessen Preis: ${smoothies[smoothieInOrder]} ")
            totalPrice += smoothies[smoothieInOrder] ?: 0.0 // += erlaubt keine nullables, deshalb !!
            println("Neuer Preis: $totalPrice")
        }
    }
    println("Gesamtpreis der Bestellung: $totalPrice")




    // mit Schleife


}

