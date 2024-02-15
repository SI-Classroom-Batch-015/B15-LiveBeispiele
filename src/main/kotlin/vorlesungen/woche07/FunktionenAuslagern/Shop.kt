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
        val foundWare = warenListe.find { it == ware }
        foundWare?.preis = newPrice
    }


    fun updateWarenQuantity(ware: Ware, newQuantity: Int) {
        warenListe.find { it == ware }!!.menge = newQuantity
    }


    fun addWareToCart(ware: Ware, quantity: Int) {
        ware.menge -= quantity // Reduziere die Menge der Ware im Shop
        aktuellerKunde!!.warenkorb.add(ware)
    }


    fun removeWareFromCart(ware: Ware, quantity: Int) {
        ware.menge += quantity // Füge die Menge der Ware dem Shop hinzu
        var wareImKorb = aktuellerKunde!!.warenkorb.find { it.name == ware.name }
        if (wareImKorb != null && wareImKorb.menge == 1) {
            aktuellerKunde!!.warenkorb.remove(wareImKorb)
        } else if (wareImKorb != null && wareImKorb.menge >1){
            wareImKorb.menge--
        }
    }


    fun displayCart() {
        aktuellerKunde!!.warenkorb.forEach {
            println("${it.name} - ${it.preis} - ${it.menge}")
        }
    }
}
