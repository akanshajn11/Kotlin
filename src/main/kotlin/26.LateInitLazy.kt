fun lateInitLazy() {//main()

    val declaration = Declaration()
    println(declaration.getValue())
    declaration.setValue("Akansha")
    println(declaration.getValue())

    //when we create an object, memory gets allocated to it
    val user = UserDetail("Akansha", "29")

    //if we don't want the memory to get allocated until the object is used(called) somewhere, we use 'lazy'
    val user2: UserDetail by lazy {
        UserDetail(
            "Akansha",
            "29"
        )
    } //we can use only immutable variable with lazy, var cannot be used here-it is initialized only once
    println(user2.toString())//it is called here, so now memory would be allocated

}

class Declaration {
    //lateinit(late initialize)- used to create a global variable without initialization
    lateinit var myName: String

    fun setValue(name: String) {
        myName = name
    }

    //if getValue() is called before myName is initialized it should be handled
    fun getValue() = if (::myName.isInitialized) myName else "Not initialized"
}

class UserDetail(val name: String, val age: String) {
    init {
        println("$name")
        println("$age")
    }
}

//Both lateinit and lazy cannot take null value.
//Because they are created for the purpose of getting value at some point in program