fun higherOrderFunctions(){ //main()

    //higher order function takes function as parameter and return function

val addition=doAddition()
    println(addition(2,3))

printMyName { //the brackets here represents the print() function body
println("Akansha")
}

    printMyName2 {
        println(it)
    }

}
//above implements like below
//printMyName2{
//    fun print(){
//        println(it)
//    }
//}


fun addNumbers(numOne:Int,numTwo:Int) = numOne.plus(numTwo)

fun doAddition() : (Int,Int)->Int {
    return ::addNumbers  //returning function from function
}

fun printMyName(print : ()->Unit){  //passing function in a function
print()
}

fun printMyName2(print:(String)->Unit){
    print("Jain")
}

