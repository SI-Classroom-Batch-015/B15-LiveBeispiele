package VORLESUNG.Woche05.Tag21

import kotlin.random.Random

fun main() {

    val colors = mutableListOf("red","green","blue","black")

    // finde die Frucht namens "Mango" in der Frucht Liste
    // 1. Laufvariable erstellen, mit der wir ueber die fruits liste iterieren koennen
    // 2. die fruits liste durchlaufen: solange, bis wir ihre .size erreicht haben. also abbrechen, bevor ein IndexOutOfBounds Fehler kommt
    // 3. checken, ob die aktuell angeschaute Frucht == Mango ist
    // 4. abbrechen, wenn dem so ist

    // Liste, über die wir mit Schleifen durchiterieren können
    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")
    // i < size bedeutet: wir brechen genau beim letzten Index ab, das heisst, wir kommen nicht in eine IndexOutOfBounds
    var i = 0
    var mangoFound = false
    while (i < fruits.size && !mangoFound){ // in die Klammern muss ein Boolean rein, fruits.size ist 6.
        if (fruits[i] == "Mango") { // pruefen, ob in aktuellem Listenelement Mango drin ist
            println("Mango gefunden an Index $i!")
            mangoFound = true
            // break // bricht die Schleife ab, kennen wir aber noch nicht. daher hilfsboolean mangoFound
        } else {
            println("Mango noch nicht gefunden, sondern ${fruits[i]}, weitersuchen...")
        }
        // theorie: i kann auch zufaellig gesetzt werden, macht beim Listen durchsuchen aber praktisch keinen Sinn, da man so effizient wie moeglich suchen moechte...
        //i = Random.nextInt(0,5)
        i++
    }
    println("Fruit Liste durchlaufen und abgebrochen, sobald Mango gefunden wurde.")




//    simpleWhile()
//    simpleWhileCountdown()




}

fun simpleWhileCountdown() {
    // simpelste rückwärts while Schleife
    var j = 10
    while (j >= 1) {
        println("Countdown: $j")
        Thread.sleep(500)
        j-- // das gleiche wie j = i-1 oder j-= 1
    }
    println("Schleife wurde 10x aufgerufen, danach geht es weiter, denn die Bedingung / >= 1 stimmt nicht mehr, j ist jetzt $j")
}

fun simpleWhile() {
    // simpelste while Schleife
    var i = 1
    while (i <= 10) {
        println("Die Schleife läuft zum $i. Mal durch. ")
        // Thread.sleep(1000)
        i++ // das gleiche wie i = i+1 oder i+= 1
    }
    println("Schleife wurde 10x aufgerufen, danach geht es weiter, denn die Bedingung i <= 10 stimmt nicht mehr, i ist jetzt $i")
}


