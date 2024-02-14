package vorlesungen.woche07

class Student(var name: String, var enrolledCourses: MutableList<Course> = mutableListOf()) {

    fun enroll(course: Course){
        // ist der Kurs noch frei?
        if (course.freeSpots > 0){
            // Student bekommt den Kurs
            enrolledCourses.add(course)
            // Kurs hat einen Platz weniger als vorher frei
            course.freeSpots--
            println("$name wurde erfolgreich in ${course.name} eingeschrieben!")
            println("${course.name} hat noch ${course.freeSpots} Plätze frei.")
        } else {
            println("Sorry, der Kurs ${course.name} hat ${course.freeSpots} Plätze frei.\n$name kommt nicht rein. ")
        }
    }

    fun quitCourse(course: Course){
        // Student verlaesst den Kurs
        enrolledCourses.remove(course)
        // Kurs hat einen Platz mehr frei
        course.freeSpots++
    }

    override fun toString(): String {
        return """
            Schüler $name 
            Kurse: $enrolledCourses
            
        """
    }

}





