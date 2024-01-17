package VORLESUNG.Woche03.Tag13Parameter

fun main(){

    // mehrere Argumente sind möglich:
    println(sum(7,10))
    println(sum(50,70))
    println(mult(50,10))

    // Argumente als variablen
    var x = 10
    var y = 9
    println(sum(x,y))

    // Argumente als Funktionen
    // sum(9,3) ergibt 12. heißt also, ich kann den Aufruf davon direkt als Argument schreiben
    println(sum(no1 = sum(no1 = 9,no2 = 3),no2 = mult(8,3)))

    // sum Rechnen mit readln()
    println(sum(no1=getReadlnInt(), no2=getReadlnInt()))

    var a: Int = getReadlnInt()
    sum(a,4)


    preisRechner(10,29.99) // kein Rabatt: standardwert 0.0 wird automatisch angenommen
    preisRechner(5,1.99,0.2) // 0.2 = 20%

}


// DEFAULT PARAMETER: name: Datentyp = Default-Wert

fun preisRechner(anzahlProdukte: Int, produktPreis: Double, rabatt: Double = 0.0 ): Double {
    val gesamtPreis: Double = anzahlProdukte*produktPreis
    val rabattPreis: Double = gesamtPreis* (1-rabatt) // zB I. 100 * (1-0,2) II. 100 * 0,8 = Preis bei 20% rabatt

    println("Originalpreis für $anzahlProdukte Produkte zum Preis von je $produktPreis Euro: $gesamtPreis")
    println("Rabattpreis mit einem Rabatt von $rabatt = $rabattPreis")
    return rabattPreis

}

// sum: Rechnen mit Parametern, ich will die beiden Zahlen, die ich als Parameter übergebe, addieren und das Ergebnis zurückgeben
fun sum(no1: Int, no2: Int): Int {
    val result = no1+no2
    return result
    //return nr1+nr2
}



// add: andere Signatur, gleiche Benennung möglich, solange die Parameter unterschiedliche Datentypen haben


// statisch, addiert immer dieselben zahlen, deshalb etwas sinnlos. lieber numbers als parameter nehmen
fun oldCalculate(): Int {
    var nr1: Int = 19
    var nr2: Int = 5
    return nr1+nr2
}



fun mult(nr1: Int, nr2: Int): Int {
    val result = nr1*nr2
    return result
    //return nr1+nr2
}



