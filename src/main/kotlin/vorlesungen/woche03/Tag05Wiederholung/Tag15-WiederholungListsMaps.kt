package VORLESUNG.Woche03.Tag15Wiederholung

fun main(){


    // 1 Element zu Liste hinzufuegen
    productList.add("Birnen")
    println(productList)


    // in der Map in existierendes Element neuen Preis setzen
        productToPrice.replace("Melonen",5.49)
        // ODER Alternative Syntax:
        productToPrice["Orangen"] = 0.98
        // ODER weitere Alternative:
        productToPrice.set("Kirschen",3.99)

    println(productToPrice)

    // neues Element ans Ende der Map hinzufügen
        productToPrice.put("Zitrone",0.33)
        // alternative Syntax:
        productToPrice["Birne"] = 0.22

    println(productToPrice)


    // Key-Value-Paar entfernen
    // Pflaumen werden entfernt, egal, welchen Preis sie haben
    productToPrice.remove("Pflaumen")
    // Orangen werden nur entfernt, wenn sie 6.99 kosten
    productToPrice.remove("Orangen", 6.99)

    // Preis eines Elements ausgeben
    var kirschenPreis: Double = productToPrice["Kirschen"]!!


    // Element mit höchsten Preis identifizieren: Wie komme ich bei einer Map da ran?
    var sortedMap: MutableMap<String,Double> = productToPrice.toSortedMap()
    println("----------")
    println(sortedMap)

    var highestPrice: Double = productToPrice.values.max()
    // ODER
    var functionHighestPrice = getHighestPrice(productToPrice)
    // ODER
    var maxPriceOneStep: Double = productToPrice.values.sorted().last()


    // Wie bei einer Liste?
    var highestNumber = numberList.max()


}

fun getHighestPrice(map: MutableMap<String,Double>): Double {
    var prices = map.values
    var sortedPrices = prices.sorted()
    return sortedPrices.last()
    // oder einfach: map.values.max()
}


