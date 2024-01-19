package VORLESUNG.Woche03.Tag15Wiederholung

val productList: MutableList<String> = mutableListOf(
    "Erdbeeren",
    "Kirschen",
    "Pflaumen",
    "Bananen",
    "Melonen",
    "Trauben",
    "Orangen",
)

val productToPrice: MutableMap<String,Double> = mutableMapOf(
    "Erdbeeren" to 1.99,
    "Kirschen" to 2.99,
    "Pflaumen" to 0.49,
    "Bananen" to 1.49,
    "Melonen" to 2.49,
    "Trauben" to 3.99,
    "Orangen" to 0.99,

)

val productRating: MutableMap<String,MutableList<Int>> = mutableMapOf(
    "Erdbeeren" to mutableListOf(1,2,3,4,5,6,4,3,2),
    "Kirschen" to mutableListOf(),
    "Pflaumen" to mutableListOf(),
    "Bananen" to mutableListOf(),
    "Melonen" to mutableListOf(),
    "Trauben" to mutableListOf(),
    "Orangen" to mutableListOf(),
)

val numberList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10)

