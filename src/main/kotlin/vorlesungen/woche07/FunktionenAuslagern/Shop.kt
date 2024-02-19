package vorlesungen.woche07.FunktionenAuslagern

import kotlin.math.log


class Shop {
    var warenListe: MutableList<Ware> = mutableListOf(
        Ware("Hose",9.99,3),
        Ware("Kaese",9.99,3),
        Ware("Jacke",9.99,3),
        Ware("Bla",9.99,3),
        Ware("Bla",9.99,3),
    )

    var accountListe: MutableList<Account> = mutableListOf(
        Kunde("john","1234"),
        Kunde("marc","1234"),
        Kunde("josie","1234"),
        Admin("johnAdmin","1234"),
        Admin("johnAdmin","1234")
    )

    var eingeloggterUser: Kunde? = null
    var eingeloggerAdmin: Admin? = null





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
        eingeloggterUser!!.displayCart()
        println("Was willst du mit deinem Warenkorb machen?")
        println("[1] Ein Produkt entfernen")
        var input = readln().toInt()
        when(input){
            1 -> {
                println("Welche Ware willst du entfernen?")
                var zuEntfernenderWarenName = readln()
                println("Wie viele davon willst du entfernen?")
                var zuEntfernendeMenge = readln().toInt()
                removeWareFromCart(zuEntfernenderWarenName,zuEntfernendeMenge)
            }
        }
    }



    fun startShop(){
        println("Willkommen im Store!")
        println("Was willst du tun?")
        println("[1] Kunden Login")
        println("[2] Admin Login")
        // Login Logik
        // 1. Schritt: input variable
        try {
            var input = readln().toInt()
            // 2. Schritt: je nach Input Aktion auswaehlen
            when (input) {
                1 -> login()
                2 -> login()
                else -> startShop()
            }
        } catch(e: Exception){
            println("FEHLER!!!! $e")
            startShop()

        }
    }

    fun returnTest(): Int{
        return try {
            println("Zahl eingeben...")
            var x = readln().toInt()
            println("Zahl ist $x, wird returned...")
            return 1
        } catch (e: Exception){
            println("Die Eingabe war keine Zahl, wir geben einfach 0 zurueck..")
            return 0
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
        var account: Account? = accountListe.find { it.name == name && it.pw == pw } // .first wuerede abstuerzen, wenn kein Account gefunden wird
        // 3. wenn ja einloggen,
        if (account != null){
            // entscheiden, ob Kunde oder Admin eingeloggt wird
            // Kunde:
            if (account is Kunde){
                // Kunden einloggen
                eingeloggterUser = account
                showCustView()
                // Admin
            } else if (account is Admin){
                // Admin einloggen
                eingeloggerAdmin = account
                // showAdminView()
            }
            // HIER WIRD DER KUNDE TATSAECHLICH EINGELOGGT:

            println("Erfolgreich eingeloggt mit Account von $name")
            showCustView()
        } // 4. wenn nein Bescheid sagen und nochmal probieren
        else {
            println("Account existiert nicht! Probier's nochmal...")
            login()
        }
    }




    fun showCustView() {
        println("Willkommen, ${eingeloggterUser!!.name} ")
        println("Was willst du tun?")
        println("1 - Produkte anzeigen")
        println("2 - Warenkorb anzeigen")
        var input = readln()
        when(input){
            "1" -> displayWaresInShop()
            "2" -> displayCart()
        }
    }


}

fun main() {
    var store: Shop = Shop()
    // Test des Login
    //println(store.eingeloggterKunde) // null
    //store.startShop()
    store.login()
    //println(store.eingeloggterKunde) // ---Kunde--- Name: john
    //store.returnTest()
}
