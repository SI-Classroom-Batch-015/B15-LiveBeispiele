package vorlesungen.woche07

class School(val students: MutableList<Student>, val allCourses: MutableList<Course>){

    // in Klassen muessen alle Attribute initialisiert sein
    var availableCourses: MutableList<Course>
    var fullCourses: MutableList<Course>


    init {
        availableCourses = allCourses.filter { it.freeSpots > 0 }.toMutableList() /* kurse danach filtern, ob sie noch freie plaetze haben */
        fullCourses = allCourses.filter { it.freeSpots < 1 }.toMutableList()
        students.addAll(
            listOf(Student("Marcel"),Student("Lisa"),Student("Jonas"),Student("Gabi"))
        )
    }

    // neue Studenten mit Kurs hinzufuegen
    fun register(student: Student, course: Course){
        // ist der gewollte Kurs verfuegbar?
        if (course in availableCourses) {
            // wenn ja -> Student mit Kurs einschreiben
            students.add(student)
            // Funktion, die den Student einschreibt
            student.enroll(course)
            println("Student in den Kurs ${course.name} eingeschrieben.")
        } else {
            // wenn nein -> Student ohne Kurs einschreiben
            students.add(student)
            println("Student ohne Kurs eingeschrieben, denn der Kurs ${course.name} war voll!")
        }

    }
}

fun main() {
    var mathe: Course = Course("Mathe",1)
    var bio: Course = Course("Biologie",0)
    var physik: Course = Course("Physik",1)
    var school: School = School(mutableListOf(), mutableListOf(mathe,bio,physik))
    var student: Student = Student("Simone")
    // school.register(student,mathe)
//    println(school.allCourses)
//    println(school.students)
    school.students[0].enroll(bio)
//    println(school.allCourses)
//    println(school.students)

    var list = mutableListOf(mathe,bio,physik)

    // HILFREICHE LAMBDAS

    // find lambda: findet einen Kurs, der mit dem Prädikat uebereinstimmt. find ist nullable, es koennte auch kein Kurs gefunden werden, dann kommt null raus
    var foundCourseNullable: Course? = list.find { it.freeSpots == 5 }
    // firt lambda: gibt den ERSTEN Kurs zurueck, der mit dem Prädikat uebereinstimmt. nicht nullable, programm stuerzt ab, wenn kein Kurs gefunden wird
    try {
        var foundCourse: Course = list.first { it.freeSpots == 5 }
        println(foundCourse)
    } catch (e: NoSuchElementException){
        println("$e: Kurs mit 5 Plätzen nicht gefunden, aber wir laufen weiter...")
    }
    println("Code ist trotz fehler weiter gelaufen...")
    println(foundCourseNullable)

    // filtern: alle Kurse, die frei sind
    println(list.filter { it.freeSpots > 0 })

    println(list.sortByDescending { it.freeSpots }) // kotlin.Unit, denn: sortBy gibt uns keine neue Liste zurueck, sondern sortiert nur das Original.
    println(list)
    println(list.sortedBy { it.freeSpots }) // hier gibt's die Liste raus, denn: sortedBy gibt eine Kopie der Liste zurueck, die sortiert wurde, die dann gedruckt wird






}