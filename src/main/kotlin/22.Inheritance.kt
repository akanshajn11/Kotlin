fun inheritance() { //main()

    val addition = Addition(5, 10)
    //accessing method of base class
    println(addition.add())

    val addition2 = Addition2(2, 4, 6)
    println(addition2.add())

}

//Base Class
open class BaseAddition(
    val num1: Int,
    val num2: Int
) { //we need to add val/var to access these parameter into the class
    open fun add() = num1 + num2 //open keyword makes it inheritable
}


class Addition(val numOne: Int, val numTwo: Int) : BaseAddition(numOne, numTwo) {
}

class Addition2(val numOne: Int, val numTwo: Int, val numThree: Int) : BaseAddition(numOne, numTwo) {

    //override function of base class - we can change the way it works
    override fun add(): Int {
        return numOne.plus(numTwo).plus(numThree)
        //return super.add() //this statement implies it would work similar to base class method
    }
}