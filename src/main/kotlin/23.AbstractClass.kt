fun abstractClass() { //main()
    //we cannot create object of abstract class
    //it is a set of rules/principles
    println(getOperatingSystem(Windows()))
    println(getOperatingSystem(Mac()))

}

abstract class Computer() {
    abstract fun operatingSystem(): String //abstract function don't have a body
}

//in this function we can pass objects of the class implementing the abstract class Computer
fun getOperatingSystem(computer: Computer) = computer.operatingSystem()

class Windows() : Computer() {
    override fun operatingSystem(): String {
        return "Windows"
    }

}

class Mac() : Computer() {
    override fun operatingSystem(): String {
        return "Mac"
    }

}