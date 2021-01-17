fun dataClass() { //main()
    //data class is used to hold data
    //For Class different memory is allocated to all objects, but for data class objects same memory is used
    //data class must have at least one parameter

    val userOne = User("Akansha", 29)
    println(userOne.userName)

    //another syntax to access properties of data class
    println(userOne.component1()) //no of component is equal to the no of parameters
    println(userOne.component2())

    //copy one object to another
    val userTwo = userOne.copy()
    println(userTwo)

    //if we need to change a property value when copying
    val userThree = userOne.copy(age = 28)
    println(userThree)

    //destructuring a data class object
    val (uName, age) = userOne
    println(uName)
    println(age)
}

data class User(val userName: String, val age: Int) //can be val or var

