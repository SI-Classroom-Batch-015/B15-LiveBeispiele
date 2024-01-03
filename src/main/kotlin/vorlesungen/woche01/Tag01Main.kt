package vorlesungen.woche01

/*
    main Funktion: der Ort, an dem unser Code ausgeführt wird
    jeglicher Code muss hier rein (zumindest, bis wir weitere Funktionen kennenlernen)
 */

// geschweifte Klammer { : option 8
fun main() {

    // einzeiliger Kommentar (forward slash /: shift 7)
    println("Hi")

    /* (stern * : shift +)
    mehrzeiliger
    kommentar
     */

    println(9*9)

    // unsere 1. Zeile Code
    // println: druckt Inhalt der Klammern mit einem Zeilenumbruch
    println("Hallo Welt!")
    println("Hello World!")
    println("Hola mundo") // hier immer zeilenumbruch hinter

    // print: druckt Inhalt der Klammern ohne Zeilen
    print("x") // hier kein Zeilenumbruch und kein Leerzeichen vor dem nächsten print
    print("Ich ")
    print("bin ")
    print("müde...")
    println()


    // Compilerfehler / Kompilierfehler
    // pirntln("Ups tippfehler...")


    // Bonus: String in Konsole einlesen, im Programm benutzen
    println("Bitte gib deinen Namen ein....")
    val name = readln() // readln: lese etwas aus der Konsole ein
    println("Hi, $name!")


}
