package vorlesungen.woche04.Tag04TryCatch

fun main(){

    val list = listOf(1,2,3,4,5,6,7,8) // der Index geht von 0 bis 7

    try {
        triggerIndexOutOfBoundsEx(list)
    } catch (e: Exception) {
   //     println("Fehler in der main abgefangen, der aus der Funktion triggerIOOBE() rausgeschmissen wurde...")
    }


    println("...")
    println("...")
    println("...")
    println("Fehler erfolgreich abgefangen, der Code ist weiter gelaufen...")


    println(triggerNullPointerException("Hallo es ist Donnerstag"))
    println(triggerNullPointerException(null))


}

fun triggerIndexOutOfBoundsEx(list: List<Int>): Int {
    try {
        return list[100]
    } catch (e: IndexOutOfBoundsException) {
        println("Index-Fehler innerhalb der Funktion aufgetreten! Exception: $e")
        // throw = werfen, schmeißen: Fehler wird doch geworfen, Programm stürzt ab
        throw e
        var x = 9 // unerrreichbarer Code: throw ist wie return, danach wird aus dem Block rausgesprungen
    } catch (e: NullPointerException) {
        println("Null-Fehler innerhalb der Funktion aufgetreten: $e")
    } catch (e: Exception) {
        println("Unspezifizierter Fehler innerhalb der Funktion aufgetreten: $e")
    }
    return -1
}

fun triggerNullPointerException(string: String?): Int {

    try {
        return string!!.length
    } catch (ex: Exception){
        println("Fehler innerhalb der Funktion: $ex")
        return 0
    }

}

fun triggerNumberFormatEx(zahl: String ) : Int {
    try {
        return zahl.toInt()
    }
    catch (e: Exception){
        println("Fehler in triggerNumberFormatEx: $e")
        println("Bitte gib eine andere Zahl ein:")
        var input = readln()
        triggerNumberFormatEx(input)
        // alternative: return 0 // statt dem gewollten Int einfach 0 returnen, damit das Programm weiterlaufen kann
    }
    return 0
}

fun triggerArithmeticEx() : Int {
    var result = 0
    try {
        result = 10 / 0
        println("Ergebnis der Rechnung: $result")
        return result
    } catch (e: Exception) {
        println("Oh nein, Fehler in triggerArithmeticEx! $e")
        // Standardmäßig -1 in result schreiben, falls was schief läuft
        result = -1

    }

    println("Hier kommen wir nur an, wenn das Programm nicht abstürzt")
    println("Result ist jetzt $result")
    return result
}



