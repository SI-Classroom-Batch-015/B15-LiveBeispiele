fun main() {
    var filme1: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Grand Budapest Hotel",
        "Harry Potter"
    )
    var filme2: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Matrix",
        "Harry Potter"
    )
    var filme3: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Django",
        "Harry Potter"
    )

    findMatrix(filme1)
    findMatrix(filme2)
    findMatrix(filme3)

}

fun findMatrix(filmList: List<String>) {
    var i = 0
    var matrixFound = false
    while (i < filmList.size && !matrixFound){
        if (filmList[i] == "Matrix"){
            println("Ja, Matrix ist in folgender Liste: \n $filmList \nan ${i+1}. Stelle (Index $i)")
        }
        i++
    }
}