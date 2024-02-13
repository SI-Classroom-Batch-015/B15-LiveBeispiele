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

    var currentAccount: Account? = accounts[0]

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

    fun showCustomerView(){
        println("--Willkommen im Store!--")
        println("Wähle eine Aktion aus:")
        println("[1] Alle Produkte anzeigen")
        println("[2] Warenkorb anzeigen")
        println("[3] Logout")

        try {
            val choice = readln().toInt()
            when(choice){
                1 -> showAllProducts()
                2 -> showCart()
                3 -> logout()
                else -> {
                    println("Keine Zahl zw 1-3 eingegeben! Versuch's nochmal...")
                    showCustomerView()
                }
            }
        } catch (e: NumberFormatException){
            println("$e: Keine gültige Zahl eingegeben! Versuch's nochmal...")
            showCustomerView()
        }

    }

    fun logout() {
        println("User wird ausgeloggt...")
    }

    fun showCart() {
        println("Der Warenkorb wird angezeigt...")
    }

    fun showAllProducts() {
        println("Alle Produkte werden angezeigt...")
    }

    fun showWarenkorb(){
        println("Hier ist dein Warenkorb:")
        // currentAccount.printWarenkorb()
    }


}

open class Account(var name: String, var pw: String, var alter: Int) {


}

class CustomerAccount(name: String, pw: String, alter: Int): Account(name,pw,alter){
    var warenKorb: MutableList<Product> = mutableListOf()

    fun printWarenkorb() {
        for (product in warenKorb) println(product)
        // oder
        warenKorb.forEach { println(it) }
    }


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
    store.showCustomerView()

//    for (product in store.products) println(product)
//    println("----")
//
//    // neues Produkt hinzufuegen (exakt das gleiche Prinzip, wie einen neuen Account hinzufuegen)
//    store.addProduct()
//    for (product in store.products) println(product)

}