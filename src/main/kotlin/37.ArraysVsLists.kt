import java.util.*

/*1.Arrays store data in sequential manner.
List storage depends on its type of implementation*/

fun arraysVsLists() {

    val coursesArray = arrayOf("Android Beginners", "Android Professionals")
    val coursesList = listOf("Android Beginners", "Android Professionals")

    println(coursesArray)
    println(coursesList)

/*2.Arrays are mutable.
Lists are immutable.To update values of list, we need to use mutable lists*/

    coursesArray[0] = "Android Basics"
    //coursesList[0]="Android Basics" //not allowed
    val coursesListMutable = mutableListOf("Android Beginners", "Android Professionals")
    coursesListMutable[0] = "Android Basics" //allowed

    println(Arrays.toString(coursesArray))
    println(coursesListMutable)

/*3.Arrays have fixed size. Elements cannot be added/removed.
We can change size of mutable list*/

    coursesListMutable.add("React-Native")
    println(coursesListMutable)

    coursesListMutable.remove("Android Basics")
    println(coursesListMutable)

/*4.Array<T> is invariant. Array<String> can't be assigned to Array<any>.
Passing an array of a subclass as an array of superclass to a kotlin method is prohibited.
List<T> is covariant*/

    val subArray = arrayOf("Java", "Kotlin")
    //val superArray: Array<Any> = subArray //not allowed

    val subList = listOf("Java", "Kotlin")
    val superList: List<Any> = subList //allowed
    println(superList)

/*5. To avoid the cost of boxing-unboxing, primitive data types such as int, char, double are used with arrays.
There are specialized classes for these primitive arrays.
Lists don't have optimizations for primitive datatypes*/

    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val intArray2 = IntArray(5) { 10 * it }
    println(Arrays.toString(intArray2))

    val charArray: CharArray = charArrayOf('a', 'b')
    val doubleArray: DoubleArray = doubleArrayOf(1.0, 2.0)

    println(Arrays.toString(charArray))
    println(Arrays.toString(doubleArray))
}