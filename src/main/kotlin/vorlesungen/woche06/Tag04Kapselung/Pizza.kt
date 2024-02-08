package vorlesungen.woche06.Tag04Kapselung

class Pizza(private var name: String, val ingredients: MutableList<Ingredient>, var price: Double) {

    // Alternative, kürzere getter und setter Syntax:
    private var zubereitungsDauer: Int = 10
        get() = field
        set(value) {
            field = value
        }


    // Schnittstellen zum Zugriff auf privates Attribut name:
    // getter: holt den Namen raus
    fun getName(): String {
        return this.name
    }

    // setter: setzt den Namen neu
    fun setName(newName: String){
        this.name = newName
    }


    // protected Methode: nicht von aussen (zb in der main) aufrufbar, aber werden vererbt.
    protected fun protectedMethode(){

    }


    // private Methode: nicht von aussen (zb in der main) aufrufbar, werden auch NICHT vererbt!
    private fun privateMethode(){

    }


}

class Ingredient(var name: String, var price: Double) {

}

fun main() {
    var mozarella: Pizza = Pizza("Mozarella", mutableListOf(), 5.99)
    println(mozarella.getName())
    //mozarella.name // cannot access 'name': it is private in 'Pizza'
    val name = mozarella.getName()
    mozarella.setName("Mortadella")
    val newName = mozarella.getName()
    println(newName)

    mozarella.price
    // mozarella.privateMethode()
    // mozarella.protectedMethode()

}