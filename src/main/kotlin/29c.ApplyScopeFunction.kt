class PersonApply(val fName: String, val lName: String) {
    var address: String = "Unknown"
    var phoneNumber: String = "Unknown"
    fun getInfo() = "first name= $fName \n last name= $lName \n address= $address"

    override fun toString(): String {
        return "$fName $lName $address $phoneNumber"
    }
}

fun applyScope() { //main()
//we use apply when we need to initialize an object

    val person = PersonApply("Akansha", "Jain")
    person.address = "xyz"
    person.phoneNumber = "1234"


//in the above example we can get rid of writing person everytime
    val person2 = PersonApply("Akansha", "Jain").apply {
        address = "xyz"
        phoneNumber = "1234"
    }
// we did not use run in above context since we needed to return same object
    println(person2.toString())

//even if we use the return method getInfo() with apply,
//it will still return same object and not return value from function
    val person3 = PersonApply("Akansha", "Jain").apply {
        address = "xyz"
        phoneNumber = "1234"
        getInfo() //will not return this function
    }
    println(person3.toString())
}