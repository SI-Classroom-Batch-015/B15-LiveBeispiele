package VORLESUNG.Woche05.Tag22


val PIZZAS: List<String> = listOf("Salami", "Mozarella", "Hawaii", "Tonno")

fun main(){
    // Pizza Aufgabe: 100 verschiedene Pizza sorten ausdrucken. mit repeat, while und do while lösen

    // Pizza mit do While Schleife
    // 1. leere Liste für die 100 Pizzen anlegen
    var pizzaOrder: MutableList<String> = mutableListOf()

    //pizzaDoWhile(pizzaOrder)
    //listPrinterWhile(pizzaOrder)
    pizzaWhile(pizzaOrder)

    val liste = listOf(1,2,3,4,5,6,1,2,3,4)
    liste.min()
    liste.max()

}

fun pizzaRepeat(pizzaOrder: MutableList<String>){
    repeat(100){
        pizzaOrder.add(PIZZAS.random())
    }
}

fun pizzaDoWhile(pizzaOrder: MutableList<String>) {
    var i = 0
    do {
        // Liste mit random Pizza befüllen:
        pizzaOrder.add(PIZZAS.random())
        //println(pizzaOrder[i]) // hiermit jede einzelne pizza ausdruckne, gleiches prinzip wie listPrinterWhile()
        i++
    } while (i < 100)
    println(pizzaOrder)

}

fun pizzaWhile(pizzaOrder: MutableList<String>) {
    var i = 0
    while (i < 100) {
        // Liste mit random Pizza befüllen:
        pizzaOrder.add(PIZZAS.random())
        i++
    }
    println(pizzaOrder)

}

private fun listPrinterWhile(pizzaOrder: MutableList<String>) {
    var j = 0

    while (j < pizzaOrder.size) {
        println(pizzaOrder[j])
        j++
    }
}


