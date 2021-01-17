fun exceptions() { //main()
    //when an exception occurs, the execution of program stops
    //we use try and catch to handle exceptions efficiently
    //try-catch doesn't terminate the program

    val age = 28
    try {
        getAge(age)
    } catch (e: Exception) {
        println(e) //prints-> MyAgeException: 28 is invalid
    }

    //finally block -> always called whether exception happens or not
    finally {
        println("Finally")
    }

    println("Program Running")
}

fun getAge(age: Int) {
    if (age < 30) {
        throw MyAgeException(age)//throwing exception
    }
}

//creating own custom exception
class MyAgeException(val age: Int) : Exception("$age is invalid") {

}

