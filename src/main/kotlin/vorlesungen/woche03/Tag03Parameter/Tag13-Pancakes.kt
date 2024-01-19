package VORLESUNG.Woche03.Tag13Parameter

fun main(){
    // konkrete Parameter beim Aufruf nennen sich Argumente
    //makePancakes(2,250,190,200)
   // makePancakes(4,500,300,400)
    makeBetterPancakes(2)
    makeBetterPancakes(10)

}


fun makePancakes(eier: Int, mehlInG: Int, wasserInMl: Int, milchInMl: Int){
    println("Schritte:")
    println("$eier Eier und $mehlInG g Mehl mischen...")
    Thread.sleep(2000)
    println("$milchInMl ml Milch und $wasserInMl ml Wasser dazu geben...")
    Thread.sleep(2000)
    println("Alles ordentlich verrühren... Fertig ist der Pfannkuchenteig!")
}

fun makeBetterPancakes(anzahlPortionen: Int){
    val eier: Int = 2*anzahlPortionen
    val mehl: Int = 100*anzahlPortionen
    val wasser: Int = 150*anzahlPortionen
    val milch: Int = 190*anzahlPortionen

    println("Schritte: \n")
    println("$eier Eier und $mehl g Mehl mischen...")
    Thread.sleep(2000)
    println("$milch ml Milch und $wasser ml Wasser dazu geben...")
    Thread.sleep(2000)
    println("Alles ordentlich verrühren... Fertig ist der Pfannkuchenteig!")
}