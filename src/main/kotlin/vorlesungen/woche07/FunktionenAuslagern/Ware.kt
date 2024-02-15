package vorlesungen.woche07.FunktionenAuslagern

class Ware(var name: String, var preis: Double, var menge: Int) {

    fun updateWarenPrice(newPrice: Double) {
        this.preis = newPrice
    }

    fun updateWarenQuantity(newQuantity: Int) {
        this.menge = newQuantity
    }

}