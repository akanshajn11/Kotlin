fun enums() {//main()
    //enumeration
    //set of constant values
    val studentOne = Student("Akansha", StudentType.FEMALE)
    val studentTwo = Student2("ABC", StudentType2.MALE)

    //iterating through enums
    for (type in StudentType.values()) {
        println(type)
        //properties of enum
        println(type.name)
        println(type.ordinal) //position of the constant
    }


}

class Student(val name: String, val type: StudentType) {
    init {
        println("$name is $type")
    }
}

enum class StudentType {
    MALE,
    FEMALE
}

class Student2(val name: String, val type: StudentType2) {
    init {
        println("$name is ${type.type}")
    }
}


//enum with constructor
enum class StudentType2(val type: String) {
    MALE("Male"), //each constant in enum is itself an object
    FEMALE("Female")
}