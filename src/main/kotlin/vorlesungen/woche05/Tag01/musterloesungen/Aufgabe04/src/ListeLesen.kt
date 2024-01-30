fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")

    var i = 0
    while (i < fruits.size){ // alternative: (i <= fruits.size-1)
        println(fruits[i]) // zB fruits[0] = Strawberry
        i++
    }


}