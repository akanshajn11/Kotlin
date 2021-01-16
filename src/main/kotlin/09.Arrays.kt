import java.util.*

fun arrays() { //main()

    val arrayInt = arrayOf(1, 2, 3, 4)  //type Int
    val arrayAny = arrayOf(1, 2, 3, "AJ") //type Any
    println(Arrays.toString(arrayInt))
    println(Arrays.toString(arrayAny))

    //to get element at a position
    println(arrayInt[3])

    //updating element at a position
    arrayInt[0] = 10
    println(Arrays.toString(arrayInt))

    //array.set(index,newValue) to update value
    arrayInt.set(3, 20) //update value at 3rd index to 20
    println(Arrays.toString(arrayInt))

    println(arrayInt.first())//first value of array
    println(arrayInt.last())//last value of array

    //get the index of any element
    println(arrayAny.indexOf("AJ"))

    //specify array as of specific type
    val arrayType = intArrayOf(1, 2, 3, 4) // for String it is is arrayOf()

    //operations on numeric array

    //sum of all elements
    println(arrayType.sum())

    //max value in array
    println(arrayType.maxOrNull())

    //min value in array
    println(arrayType.minOrNull())

    //no of elements in array
    println(arrayType.count())

    //sort the array
    println(Arrays.toString(arrayType.sortedArray()))

    //finding a number satisfying a condition
    val number = arrayType.find {
        it % 2 == 0        //will return first element satisfying this
    }
    println(number)

}