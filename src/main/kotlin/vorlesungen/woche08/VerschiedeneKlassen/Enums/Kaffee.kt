package vorlesungen.woche08.VerschiedeneKlassen.Enums

enum class Size {
    SMALL, TALL, GRANDE
}

class Kaffee (val kunde: String, val size: Size){
}

fun main(){
    var bestellung1 = Kaffee("Martin", Size.GRANDE)
    var bestellung2 = Kaffee("Petra", Size.TALL)
    var bestellung3 = Kaffee("Leon", Size.SMALL)
}