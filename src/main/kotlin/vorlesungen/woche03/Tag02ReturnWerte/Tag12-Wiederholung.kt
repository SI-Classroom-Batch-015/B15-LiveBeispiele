package vorlesungen.woche03.Tag02ReturnWerte

fun main(){
    printRandomNameWithList()

    printRandomAnimalWithMap()



}


// Es soll eine Liste von Vor- und eine an Nachnamen geben, von denen jeweils 1 zufällig rausgezogen wird, um einen vollen Namen zu printen
fun printRandomNameWithList(){
    val firstNames: List<String> = listOf("Marius", "Mona", "Simone","Tom")
    val lastNames: List<String> = listOf("Müller","Schmidt","Bauer","Fleischer")

    val randomFirstName: String = firstNames.random()
    val randomLastName: String = lastNames.random()

    println("$randomFirstName $randomLastName")
    // ODER:
    println("${firstNames.random()} ${lastNames.random()}")
}
fun printRandomAnimalWithMap(){

    val animalMap: Map<String,String> = mapOf(
        "brauner" to "Bär",
        "weißer" to "Tiger",
        "schwarzer" to "Hund"
    )

    val firstWord: String = animalMap.keys.random()
    val sndWord: String = animalMap.values.random()

    println("$firstWord $sndWord")
    // ODER
    println("${animalMap.keys.random()} ${animalMap.values.random()}")
}




