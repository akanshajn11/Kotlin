fun companionObject() { //main()
    //companion objects in Kotlin are like static methods in Java
    //we need not create instance of class. Companion object can be called directly by Class

    val sum = PersonCom.add(2, 5)
    println(sum)


}

class PersonCom(val name: String) {
    companion object {
        fun add(num1: Int, num2: Int) = num1.plus(num2)
    }
}