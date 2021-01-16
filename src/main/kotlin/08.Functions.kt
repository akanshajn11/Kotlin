fun functions() {//main()

    sayHello()
    sayHello("Akansha")
    println(sayHi())
    println(fullname("Akansha", "Jain"))
    println(greetings("Hey")) //default parameter can be skipped
    println(sendGreetings(name = "AJ", greet = "hello"))//named parameter
    println(singleGreeting(name = "Jain", greet = "hi"))//it is calling a single expression function
}

fun sayHello() {
    println("Hello")
}

fun sayHello(name: String): Unit { //Unit implies returning nothing. By default Unit is return type
    println(name)
}

fun sayHi(): String {
    return "Hey"
}

fun fullname(first: String, last: String): String {

    return "$first $last"
}

//Default Parameter
fun greetings(greet: String, name: String = "Akansha"): String {
    return "$greet $name"
}

//Named parameter
fun sendGreetings(greet: String = "Hey", name: String = "Akansha"): String {
    return "$greet $name"
}

//Single expression Functions
fun singleGreeting(greet: String = "Hey", name: String = "Akansha") = "$greet $name"

