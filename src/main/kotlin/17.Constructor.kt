fun constructors() { //main()
    //constructor is called everytime an object is created
    //Primary constructor - Not mandatory - Can have at most one
    //Secondary constructor - Not mandatory - Can be one or more

    //Primary constructor call
    val person = PersonAge(50, "Akansha", "Jain")
    println(person.myAge)
    println(person.userName)

    //Secondary constructor call
    val sPerson = PersonAge("Akansha Jain")
    println(sPerson.userName)

    //Named parameter in constructor
    val scPersonAge = PersonAge(firstN = "Anku", lastN = "Jain", age = 29)
    println(scPersonAge.userName)

    //Skipping default parameter
    val dPersonAge = PersonAge()
    println(dPersonAge.userName)


}

//primary constructor
class PersonAge(val age: Int, val firstN: String, val lastN: String) {

    //secondary constructor - Initialize class and add some extra logic
    constructor(fullName: String = "Akansha J") : this(0, fullName, "") {
        userName = fullName
    }

    var myAge = age
    var userName = "$firstN $lastN"
}