package vorlesungen.woche06.Tag01

class Pizza(
    val name: String,
    var preis: Double,
    val sizeInCm: Int,
    var toppings: MutableList<String>) {

    fun addToppings(topping: String){
        toppings.add(topping)

    }

}

fun main() {
    var pizzaTonno: Pizza =
        Pizza(
            "Tonno",
            8.99,
            30,
            mutableListOf(
                "Käse",
                "Zwiebeln",
                "Thunfisch"
            )
        )

    println(pizzaTonno.name)
    println(pizzaTonno.preis)
    println(pizzaTonno.sizeInCm)
    println(pizzaTonno.toppings)

    // Kunde will extra Oliven haben
    pizzaTonno.addToppings("Oliven")
    pizzaTonno.addToppings("Tomaten")
    pizzaTonno.addToppings("extra Käse")
    println(pizzaTonno.toppings)


}