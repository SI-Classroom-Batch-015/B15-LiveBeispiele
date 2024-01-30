package vorlesungen.woche05.Tag02

fun main() {

    // 1. Liste erstellen: Pizzasorten
    var sorten = mutableListOf("Hawaii","Salami","Tonno")

    // 2. Liste erstellen: Pizzabestellung
    var order: MutableList<String> = mutableListOf<String>()

    // 3. order liste mit random zufälligen Pizzasorten befüllen


    // 3.1 mit repeat
    // repeat heisst wiederhole
    repeat(49){
        order.add("${it+1}. ${sorten.random()}")

    }


    // 3.2 mit while
    // 3.2.1 Laufvariable erstellen (wir fangen bei 50 an zu zählen, weil wir die 1. Hälfte der Order bereits mit repeat erfüllt haben
    var i = 50
    // while = während, solange
    while (i <= 100){
        // Logik, was wir tun wollen
        order.add("$i. ${sorten.random()}")
        // Laufvariable inkrementieren, sonst droht Endlosschleife
        i++
    }


    println(order)

}