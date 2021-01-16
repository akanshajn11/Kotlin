fun  lists(){ //main()
    //lists are dynamic arrays. Their size can be modified
    //they can be mutable or immutable

    val listOne = listOf(1, 2, 3, 4) //we cannot add/update/remove element in immutable list
    val listTwo = mutableListOf(5, 6, 7, 8)

    //element at a position
    println(listOne[0])
    println(listTwo[0])

    //add an element - it can be added only to mutable list
    listTwo.add(9)
    listTwo.add(10)
    println(listTwo)

    //remove element from list
    //pass the element to be removed in remove() function

    listTwo.remove(8)
    println(listTwo)

    //if we have more than one occurrence of the element then the first occurrence will be removed
    listTwo.add(6)
    println(listTwo)
    listTwo.remove(6)
    println(listTwo)

    //replace a value
    listTwo[0] = 50
    println(listTwo)

    //check if the list contains an element
    println(listTwo.contains(50))

    //get first and last elements
    println(listOne.first())
    println(listOne.last())

    //find an element satisfying a condition

    val element = listTwo.find {  //this would return the first element satisfying the condition
        it % 2 == 0
    }
    println(element)

    //to find all the elements satisfying the condition, use filter

    val elements = listTwo.filter {
        it % 2 == 0
    }
    println(elements)

    //to do transformations on every element of list, use map

    val newList = listTwo.map {
        it * it
    }
    println(newList)

    //to remove all elements matching a condition use filterNot

    val oddList = listOne.filterNot {
        it % 2 == 0
    }
    println(oddList)

    //to get a sub list we use slice. We need to provide the range of index
    val sliceList = listTwo.slice(0..3) //Immutable
    println(sliceList)

    //to exclude the last index in sliced list use subList
    val sList = listTwo.subList(0, 3) //Mutable
    println(sList)

    //to take first few elements
    val takeList = listTwo.take(3)
    println(takeList)

    //to take last few elements
    val lastList = listTwo.takeLast(3)
    println(lastList)

    //handling out of bounds exception
    println(listTwo.elementAtOrNull(9))//even if element is not found at 9th index,it will not terminate the program, it will just return null

    //create an empty list
    val elist = emptyArray<Int>()
    println(elist)

    //checking if a list is empty
    println(elist.isEmpty())
    println(listTwo.isEmpty())

    //sorting list
    val sortedList = listTwo.sorted()
    val sortedDesList = listTwo.sortedDescending()
    println(sortedList)
    println(sortedDesList)


}