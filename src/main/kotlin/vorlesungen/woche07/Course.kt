package vorlesungen.woche07

class Course(var name:String, var freeSpots: Int) {

    override fun toString(): String {
        return """
            Kurs $name
            Freie Plätze: $freeSpots
            
        """
    }

}
