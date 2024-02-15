package vorlesungen.woche07.FunktionenAuslagern

class Shop {
    var warenListe: MutableList<Ware> = mutableListOf()
    var aktuellerKunde: Kunde? = null


    fun addWareToShop(ware: Ware) {
        warenListe.add(ware)
    }


    fun removeWareFromShop(ware: Ware) {
        warenListe.remove(ware)
    }


    fun displayWaresInShop() {
        println("Warenliste im Shop:")
        warenListe.forEach { println("${it.name} - ${it.preis}€ (${it.menge} verfügbar)") }
    }

    fun updateWarenPrice(ware: Ware, newPrice: Double) {
        ware.updateWarenPrice(newPrice)
    }


    fun updateWarenQuantity(ware: Ware, newQuantity: Int) {
        ware.updateWarenQuantity(newQuantity)
    }


    fun addWareToCart(ware: Ware, quantity: Int) {
        aktuellerKunde!!.addWareToCart(ware,quantity)
    }


    fun removeWareFromCart(ware: String, quantity: Int) {
        aktuellerKunde!!.removeWareFromCart(ware,quantity)
    }

    fun displayCart() {
        aktuellerKunde!!.displayCart()
        println("Was willst du mit deinem Warenkorb machen?")
        println("[1] Ein Produkt entfernen")
        var input = readln().toInt()
        when(input){
            1 -> {
                println("Welche Ware willst du entfernen?")
                var zuEntfernenderWarenName = readln()
                println("Wie viele davon willst du entfernen?")
                var zuEntfernendeMenge = readln().toInt()
                removeWareFromCart(zuEntfernenderWarenName,zuEntfernendeMenge)
            }
        }
    }


    fun customerView(){
        println("Willkommen ${aktuellerKunde!!.name}!")
        println("Was willst du tun?")
        println("[1] Warenkorb anzeigen")
        var choice = readln().toInt()
        when (choice){
            1 -> displayCart()
        }

    }


}
