fun classObject() { //main()
    //Class is a blueprint and Object is implementation of the blueprint

    //object
    val person = Person()
    println(person.age)
    person.myAge(30)
    println(person.age)
}

class Person() {
    //it can have properties and functions

    var age = 0
    fun myAge(myAge: Int) {
        age = myAge
    }

}