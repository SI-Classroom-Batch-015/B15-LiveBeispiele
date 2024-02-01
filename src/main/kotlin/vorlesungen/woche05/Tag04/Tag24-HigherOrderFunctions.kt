package VORLESUNG.Woche05.Tag24

import kotlin.math.min


fun main() {
    // WICHTIGSTE HIGHER ORDER FUNCTIONS / LAMBDAS

    // count mit selbst geschriebener Schleife:
    var text: String = "Das sind zwei as"

    val searchedChar: Char = 'a'
    var counter: Int = 0
    for (letter in text ){
        if (letter == searchedChar){
            counter++
        }
    }

    println("Anzahl an a's mit for Schleife rausgefunden: $counter")

    // count:
    // lange Variante mit eigenem parameternamen
    val aCounter: Int = text.count { letter -> letter == 'a' }
    // kurze variante mit it
    // ideale Lösung mit it, erspart uns Tipparbeit und Kopfzerbrechen über Parameternamen
    val aCounterIt: Int = text.count { it == searchedChar }
    println("Anzahl an a's mit count Lambda rausgefunden: $aCounterIt")



    println("---")
    // filter
    val reviews = listOf(1,2,3,4,5,4,3,4,5,4,3,2,1,2,3)
    val goodReviews: List<Int> = reviews.filter { it > 3 } // oder it >= 4
    println(goodReviews)


    // zum Vergleich: filter mit Schleife. mühsam und lang
    val loopGoodReviews: MutableList<Int> = mutableListOf()
    for (r in reviews){
        if (r >= 4){
            loopGoodReviews.add(r)
        }
    }


    println("---")
    // sortedBy: sortiert entweder aufsteigend (mit it.eigenschaft: nach einer Eigenschaft (wie length)
    val dogs = mutableListOf("Mops","Pitbull","Bulldogge","Schäferhund","Chihuahua")
    val sortedDogs: List<String> = dogs.sortedBy { it }
    println(sortedDogs)

    val sortedDogsLength: List<String> = dogs.sortedBy { it.length }
    println(sortedDogsLength)

    println("---")
    // sortedByDescending: descend = absteigen, sortiert absteigend
    val sortedDogsDesc: List<String> = dogs.sortedByDescending { it }
    println(sortedDogsDesc)

    val sortedDogsLengthDesc: List<String> = dogs.sortedByDescending { it.length }
    println(sortedDogsLengthDesc)


    // forEach: geht jedes Element durch und wir können darauf zugreifen und zB drucken. nicht bearbeiten! das geht nur mit map

    dogs.forEach {
        println(it)
    }


    // nur für jeden 2. Hund: wir muessen die Liste mit jedem 2. Hund vorher vorbereiten, dann auf diese gefilterte Liste forEach anwenden.
    val everySndDog: MutableList<String> = mutableListOf()

    // jeden 2. Hund aus Liste loeschen: mit for nicht moeglich, IndexOutOfBounds
//    for (i in dogs.indices step 2){
//        dogs.removeAt(i)
//    }
//
//    println(dogs)

    // neue Liste mit jedem 2. Hund anlegen
    for (i in dogs.indices step 2){
        everySndDog.add(dogs[i])
    }

    // jeden 2. Hund ausdrucken
    println(everySndDog)
    everySndDog.forEach { println(it) }

    println("---")


    // map: führt Operation in den { } für jedes Element aus. damit können wir Elemente bearbeiten
    val modifiedDogs: MutableList<String> = dogs.map { it + " ist ein Hund" }.toMutableList()
    println(modifiedDogs)



    // map mit Zahlen
    val reviewsDoubled: MutableList<Int> = reviews.map { it*2 }.toMutableList()
    println(reviewsDoubled)



    println("---")
    // minBy: sucht kleinstes Element raus
    val shortestDog: String = dogs.minBy { it } // hier ginge auch it.length etc
    println(shortestDog)



    println("---")
    // maxBy: sucht größten Hund nach Länge raus
    val longestDog: String = dogs.maxBy { it.length }
    println(longestDog)


    println("---")
    // any: true oder false: gibt es irgendein ein Element, das die Bedingung erfüllt? (Zahl gerade)
    val areAnyReviewsEven: Boolean = reviews.any { it % 2 == 0 } // true, 2,4 sind gerade

    println("---")
    // all: true oder false: erfüllen ALLE Elemente in der Liste die Bedingung? (durch 2 teilbar)
    val areAllReviewsEven: Boolean = reviews.all { it % 2 == 0 } // false, 1,3,5 sind nicht gerade


    println("---")

    // mehrere Lambdas in Kombination benutzen: gerade zahlen rausfiltern, verdoppeln
    val evenReviewsDoubled: List<Int> = reviews.filter { it % 2 == 0 }.map { it*2 }
    println(evenReviewsDoubled)



    // nur woerter die länger als 4 sind
    // alphabetisch sortieren
    // alle in ALL CAPS schreiben
    val dogsLongerFourSortedAndAllCaps: List<String> = dogs.filter { it.length > 4 }.sortedBy { it }.map { it.uppercase() }
    println(dogsLongerFourSortedAndAllCaps)


}