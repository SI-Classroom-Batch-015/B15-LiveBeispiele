package vorlesungen.woche04.Tag04TryCatch

fun main(){

//    val list = listOf(1,2,3,4,5,6,7,8) // der Index geht von 0 bis 7
//
//    try {
//        triggerIndexOutOfBoundsEx(list)
//    } catch (e: Exception) {
//   //     println("Fehler in der main abgefangen, der aus der Funktion triggerIOOBE() rausgeschmissen wurde...")
//    }
//
//
//    println("...")
//    println("...")
//    println("...")
//    println("Fehler erfolgreich abgefangen, der Code ist weiter gelaufen...")
//
//
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
