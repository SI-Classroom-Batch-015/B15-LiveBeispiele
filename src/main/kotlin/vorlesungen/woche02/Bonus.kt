package vorlesungen.woche02

fun main() {

    var adressList: List<String> = listOf("21938","49")

    var nameStreetPlaceList: List<String> = listOf("Gina Gerwig","Amselweg","Entenhausen")

    println(nameStreetPlaceList[0])

    println("${nameStreetPlaceList[1]} ${adressList[1]}")
    println("${adressList.first()} ${nameStreetPlaceList[2]}")




}