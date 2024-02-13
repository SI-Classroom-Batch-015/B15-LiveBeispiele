package vorlesungen.woche07

class Store {
    var products: MutableList<Product> = mutableListOf(
       Kleidung("Hose",29.99),
       Product("Tasche",34.99),
       Kleidung("Jacke",19.99),
       Product("Gameboy",14.99),
       Kleidung("Shirt",8.99),
    )

    var accounts: MutableList<Account> = mutableListOf(
        Account("Owner","1234",18)
    )

    fun addProduct(){
        println("Du willst also ein Produkt hinzufügen, wie heisst es?")
        var nameInput = readln()
        println("Wie viel kostet das Produkt?")
        var priceInput = readln().toDouble()
        println("Welcher Kategorie gehört dein Produkt an?")
        println("[1] Produkt")
        println("[2] Kleidung")
        var kategorieInput = readln().toInt()
        when(kategorieInput){
            1 -> products.add(Product(nameInput,priceInput))
            2 -> products.add(Kleidung(nameInput,priceInput))
        }
        println("Wir fügen $nameInput mit dem Preis $priceInput hinzu...")
        // LOGIK, die das Produkt tatsächlich hinzufügt:
        products.add(Kleidung(nameInput,priceInput))

    }

    fun sortProduct(){
        products = products.sortedBy { it.price }.toMutableList()
    }

    fun filterProduct(){
        products.filter { it is Kleidung }
    }

}

class Account(name: String, pw: String, alter: Int) {

}

open class Product(var name: String, var price: Double){
    override fun toString(): String {
        return """
            Produkt: $name
            Preis: $price
        """
    }

}


fun main() {
    var store: Store = Store()
    for (product in store.products) println(product)
    println("----")

    // neues Produkt hinzufuegen (exakt das gleiche Prinzip, wie einen neuen Account hinzufuegen)
    store.addProduct()
    for (product in store.products) println(product)

}