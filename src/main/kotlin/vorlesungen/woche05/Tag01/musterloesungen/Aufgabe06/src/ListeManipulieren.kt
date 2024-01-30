fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)

    println(numbers)

    repeat(numbers.size){
        // speichern in die variable den aktuellen
        var number = numbers[it]
        // die neue nummer ausrechnen
        number += 5
        // die neue nummer in die liste speichern
        numbers[it] = number

        // ODER in einem Schritt:
        // numbers[it] = numbers[it]+5 // oder: numbers[it]+=5
    }

    println(numbers)

}