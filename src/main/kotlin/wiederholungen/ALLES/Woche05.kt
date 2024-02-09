package wiederholungen.ALLES

fun main() {
    var liste = listOf(1,2,3,4,5,6,7,8,9)

    for (number in liste ){
        println(number)
    }


    var strings: List<String> = listOf("Hi","Moin","Ho","Yo")
    for (greeting in strings){
        println(greeting)
    }
    println("--Alternative Lambda--")
    // alternative: als Lambda
    strings.forEach { println(it) }

}