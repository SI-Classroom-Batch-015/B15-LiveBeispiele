package vorlesungen.woche06.Tag05.Fahrzeuge

// die Attribute muessen nicht zwingend gleich wie bei ihren Eltern heissen. name steht fuer das Attribut, was ueberall sonst bezeichner heisst. sind beides Strings, ist ok. ist dann aber eine "neue" variable und braucht ein var davor, sonst gilt es als temporäre konstruktorvariable. kann aber trotzdem an der stelle von bezeichner hochgereicht werden, solange der datentyp uebereinstimmt (hier String)
class Segelboot(var name: String, price: Double):Wasserfahrzeug(name,40,price) {

    constructor(name: String):this(name,49.99){}

    override fun printInfo() {
        println("----PrintInfo aus dem Segelboot----")
        super.printInfo()
    }

    fun entladen(){
        println("Das Segelboot ${this.name} wird entladen")
    }

}

fun main() {
    var boot = Segelboot("Destiny", 99.99)
}