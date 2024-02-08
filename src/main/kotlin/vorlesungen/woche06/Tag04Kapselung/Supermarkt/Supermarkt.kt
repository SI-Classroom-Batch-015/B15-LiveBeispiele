package vorlesungen.woche06.Tag04Kapselung.Supermarkt

class Supermarkt(val lebensMittelListe: MutableList<Lebensmittel> = mutableListOf()){

        init {
        println("----Init Block Logic----")
        addLebensmittelList(listOf(
            Fleisch("Rind",8.99,"Kuh"),
            Lebensmittel("Joghurt",1.49),
            Fleisch("Hühnerbrust",2.99,"Huhn"),
            Gemuese("Brokkoli"),
            Gemuese("Karotten",1.99,30),
            Obst("Kirsche"),
            Obst("Mandarine"),
            Gemuese("Paprika"),
            Obst("Kiwi"),
        )
        )

        printLebensmittel()
        println("----Ende Init Block Logic----")
    }

    fun addLebensmittelList(lebensmittelList: List<Lebensmittel>) {
        lebensMittelListe.addAll(lebensmittelList)
    }

    fun printLebensmittel() {
        for (food in lebensMittelListe){
            println(food.name)
        }

       // lebensMittelListe.forEach { println(it.name) }
    }

    //Funktion, um einzelne Lebensmittel zum Sortiment hinzuzufuegen
   fun addLebensmittel(item: Lebensmittel){
       lebensMittelListe.add(item)
   }

   fun printObst(){
       var obstList: List<Obst> = lebensMittelListe.filter { it is Obst }.map { it as Obst }
       obstList.forEach { println(it.name) }

   }

    fun printFleisch(){
        var fleischList: List<Fleisch> = lebensMittelListe.filter { it is Fleisch }.map { it as Fleisch }
        fleischList.forEach { println(it.name) }

    }

    fun printGemuese(){
        var gemueseList: List<Gemuese> = lebensMittelListe.filter { it is Gemuese }.map { it as Gemuese }
        gemueseList.forEach { println(it.name) }

    }

}

fun main() {
    val supermarkt: Supermarkt = Supermarkt()
    println("---Alle Lebensmittel---")
    supermarkt.printLebensmittel()
    println("---Nur Fleisch---")
    supermarkt.printFleisch()
    println("---Nur Obst---")
    supermarkt.printObst()
    println("---Nur Gemuese---")
    supermarkt.printGemuese()

}











