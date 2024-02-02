package vorlesungen.woche05.Tag05

fun main() {
    // TODO Schachbrett Beispiel: geschachtelte Schleife

    var abc: CharRange = 'a'..'h'

    for (i in abc){
        for (j in 1..8){
            for (k in 'i'..'p'){
                print("$i,$j,$k ")
            }

        }
        println("")
    }



}