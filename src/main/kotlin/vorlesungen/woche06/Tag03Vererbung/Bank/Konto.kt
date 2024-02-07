package vorlesungen.woche06.Tag03Vererbung.Bank

class Konto(var name: String, var betrag: Double, var pin: Int) {

    init {
        println("---Primärer Konstruktor---")
        println("--${name}s Konto---")
        println(name)
        println(betrag)
        println(pin)
    }

    // 2. Konstruktor: nur Name, Default Werte für Betrag und Pin
    constructor(name: String) : this(name,100.0,1111){
        println("---Sekundärer Konstruktor---")
        println("--${name}s Konto---")
        println(name)
        println(betrag)
        println(pin)
    }

    fun pinAendern(pin: Int){
        println("Pin ändern Prozess beginnt... Die neue Pin ist bereits eingegeben.")
        do {
            println("Bitte dennoch die alte Pin zum überprüfen eingeben...")
            val altePin: Int = readln().toInt()


            if (altePin == this.pin){
                println("Alte Pin stimmt mit Pin überein!")
                this.pin = pin
                break
            } else{
                println("Alte Pin falsch eingegeben! Versuch's nochmal")

            }
        } while (altePin != this.pin)


    }
}

fun main() {
    // 1. Konstruktor
    var konto1: Konto = Konto("Dagobert Duck", 999.99,1234)



    // 2. Konstruktor
    var konto2: Konto = Konto("Simon Bauer")

}