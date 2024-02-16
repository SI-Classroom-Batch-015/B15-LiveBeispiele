package vorlesungen.woche07.FunktionenAuslagern

class Kunde(name: String, pw: String): Account(name,pw) {

    var warenkorb: MutableList<Ware> = mutableListOf(
        Ware("Warenkorb Item 1",9.99,3),
        Ware("Jacke XXL",9.99,3),
    )

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

    // macht die Klasse (das gesamte Objekt) zu einem lesbaren String, in dem vernünftige Infos drin stehen.
    // wenn wir toString nicht selber schreiben, kommt die Speicheradresse raus
    override fun toString(): String {
        return "---Kunde--\nName: $name".trimIndent()
    }

}

fun main() {
    var kunde1 = Kunde("bla","blabla")
    var kunde3 = Kunde("blapfjiha","blhuhabla")
    println(kunde3)
    println(kunde1.name)
    println(kunde1)
}