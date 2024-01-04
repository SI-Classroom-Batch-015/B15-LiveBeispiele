package wiederholungen.woche01

fun main() {

    // String Variable mit meinem Namen
    var name: String = "Maike"
    var age: Int = 24

    println("Ich heiße $name und bin $age Jahre alt.")

    var koerperGroesse: Double = 1.45

    koerperGroesse = 1.68

    val schuhgroesse: Double = 40.5 // nicht veränderbar!

    println("Meine Schuhgroesse ist $schuhgroesse und ist nicht veränderbar.")

    println("Ich bin $koerperGroesse m groß")

    var isSunny: Boolean = false

    println("Ist es bei Kalender sonnig? $isSunny")

    println("gib jetzt etwas ein")
    var eingabe: String = readln()


    println("Du hast $eingabe eingegeben.")

    var eingabeToDouble = eingabe.toDouble()



}