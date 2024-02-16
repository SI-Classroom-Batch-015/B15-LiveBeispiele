package vorlesungen.woche07.FunktionenAuslagern


class Shop {
    var warenListe: MutableList<Ware> = mutableListOf()

    var kundenListe: MutableList<Kunde> = mutableListOf(
        Kunde("john","1234"),
        Kunde("marc","1234"),
        Kunde("josie","1234")
    )

    var eingeloggterKunde: Kunde? = null





    fun addWareToShop(ware: Ware) {
        warenListe.add(ware)
    }


    fun removeWareFromShop(ware: Ware) {
        warenListe.remove(ware)
    }


    fun displayWaresInShop() {
        println("Warenliste im Shop:")
        warenListe.forEach { println("${it.name} - ${it.preis}€ (${it.menge} verfügbar)") }
    }

    fun updateWarenPrice(ware: Ware, newPrice: Double) {
        ware.updateWarenPrice(newPrice)
    }


    fun updateWarenQuantity(ware: Ware, newQuantity: Int) {
        ware.updateWarenQuantity(newQuantity)
    }


    fun addWareToCart(ware: Ware, quantity: Int) {
      //  aktuellerKunde!!.addWareToCart(ware,quantity)
    }


    fun removeWareFromCart(ware: String, quantity: Int) {
      //  aktuellerKunde!!.removeWareFromCart(ware,quantity)
    }

    fun displayCart() {
//        aktuellerKunde!!.displayCart()
//        println("Was willst du mit deinem Warenkorb machen?")
//        println("[1] Ein Produkt entfernen")
//        var input = readln().toInt()
//        when(input){
//            1 -> {
//                println("Welche Ware willst du entfernen?")
//                var zuEntfernenderWarenName = readln()
//                println("Wie viele davon willst du entfernen?")
//                var zuEntfernendeMenge = readln().toInt()
//                removeWareFromCart(zuEntfernenderWarenName,zuEntfernendeMenge)
//            }
//        }
    }


    fun customerView(){
        println("Willkommen!")
        println("Was willst du tun?")
        println("[1] Warenkorb anzeigen")
        var choice = readln().toInt()
        when (choice){
            1 -> displayCart()
        }

    }

    fun startShop(){
        println("Willkommen im Store!")
        println("Was willst du tun?")
        println("[1] Login")
        // Login Logik
        // 1. Schritt: input variable
        var input = readln()
        // 2. Schritt: je nach Input Aktion auswaehlen
        when(input){
            "1" -> login()
        }
    }

    fun login() {
        // 1. Schritt: User Eingaben machen lassen
        println("Jetzt sind wir im Login.")
        println("Username eingeben")
        var name = readln()
        println("Passwort eingeben")
        var pw = readln()
        // 2. Schritt: schauen, ob Profil bereits im Store existiert,
        var kunde: Kunde? = kundenListe.find { it.name == name && it.pw == pw }
        // 3. wenn ja einloggen,
        if (kunde != null){
            // HIER WIRD DER KUNDE TATSAECHLICH EINGELOGGT:
            eingeloggterKunde = kunde
            println("Erfolgreich eingeloggt mit Account von $name")
            showCustView()
        } // 4. wenn nein Bescheid sagen und nochmal probieren
        else {
            println("Account existiert nicht! Probier's nochmal...")
            login()
        }

    }



    fun showCustView() {
        println("Willkommen, ${eingeloggterKunde!!.name} ")
        println("Was willst du tun?")
        println("1 - Produkte anzeigen")
        println("2 - Warenkorb anzeigen")
        // weitere Logik ....
    }


}

fun main() {
    var store: Shop = Shop()
    //store.startShop()
    // Test des Login
    println(store.eingeloggterKunde) // null
    store.login()
    println(store.eingeloggterKunde) // ---Kunde--- Name: john
}
