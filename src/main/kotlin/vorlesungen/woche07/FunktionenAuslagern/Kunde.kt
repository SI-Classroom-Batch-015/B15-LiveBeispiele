package vorlesungen.woche07.FunktionenAuslagern

class Kunde(var name: String) {

    var warenkorb: MutableList<Ware> = mutableListOf()

    fun addWareToCart(ware: Ware, quantity: Int) {
        ware.menge -= quantity // Reduziere die Menge der Ware im Shop
        warenkorb.add(ware)
    }

    fun removeWareFromCart(warenName: String, quantity: Int) {
        var wareImKorb: Ware? = this.warenkorb.find { name == warenName }
        if (wareImKorb != null && wareImKorb.menge == 1) {
            wareImKorb.menge += quantity
            this.warenkorb.remove(wareImKorb)
        } else if (wareImKorb != null && wareImKorb.menge >1){
            wareImKorb.menge--
        } else {
            println("Ware nicht im Warenkorb vorhanden! Tippfehler? Probier's nochmal")

        }
    }

    fun displayCart() {
        warenkorb.forEach {
            println("${it.name} - ${it.preis} - ${it.menge}")
        }
    }

}