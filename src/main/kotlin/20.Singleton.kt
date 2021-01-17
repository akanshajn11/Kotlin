fun singleton() { //main()
    //Singleton - Only one object used
    //single memory allocated
    //no instance needs to be created
    println(Singleton.toString())
    println(Singleton.add(3, 4))
}

object Singleton { //instead of class, object keyword is used

    fun add(num1: Int, num2: Int) = num1.plus(num2)
}