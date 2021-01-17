fun interfaces() { //main()
    //the class implementing a interface need to implement all its members. For abstract class we need not.

    val windows = Windows2()
    println(windows.operatingSystem())
    println(windows.buildYear())
    println(windows.buildBy()) //we can access this since all members of interface are inherited
}

interface Computer2 {
    fun operatingSystem(): String
    fun buildYear(): Int
    fun buildBy() = "ABC"  //can have default values - non abstract
}

interface Type {
    fun dummyType()
}

class Windows2() : Computer2, Type { //more than one interface can be implemented
    override fun operatingSystem(): String { //only abstract members can be overridden
        return "Windows"
    }

    override fun buildYear(): Int {
        return 2021
    }

    override fun dummyType() {
    }

}