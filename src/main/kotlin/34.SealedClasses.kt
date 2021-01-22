fun sealedClass() { //main()

    println(Result.SUCCESS.message)
    println(Result.ERROR.message)

    val employee: Employee = SeniorDev("Akansha", 20, 10)

    //Flexibility to handle different states of sub classes
    val message = when (employee) {
        is Manager -> println("Manager")
        is SeniorDev -> println("Senior Dev")
        is JuniorDev -> println("Junior Dev")
        //no else here since we have restricted hierarchies
    }
}

enum class Result(val message: String) {
    //all need to have same parameters
    SUCCESS("Success"),
    ERROR("Error")
}

sealed class Employee

/*
1. has freedom of representation of abstract classes
2. has restricted set of types like enums
 */

//below classes extend the same class but have different parameters unlike enum
//flexibility of having different types of sub classes

data class Manager(val name: String, val age: Int, val team: List<String>) : Employee()
class SeniorDev(val name: String, val age: Int, val projects: Int) : Employee()
object JuniorDev : Employee()

