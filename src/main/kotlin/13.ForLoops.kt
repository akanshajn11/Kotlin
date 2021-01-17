fun forLoops() //main()
{
    val list = listOf("Akansha", "Jain", "AJ")

    for (name in list) {
        println(name)
    }

    for (number in 1..100) {
        println(number)
    }

    //to exclude the last boundary
    for (number in 0 until 100) {
        println(number)
    }

    //to increment by some number
    for (number in 0 until 100 step 5) {
        println(number)
    }

    //run loop in descending order
    for (number in 100 downTo 0 step 10) {
        println(number)
    }

    //to loop on indices
    for (index in list.indices) {
        println(index)
        println(list[index])
    }

    //considering both index and value in loop
    for ((index, value) in list.withIndex()) {
        println(index)
        println(value)
    }
}
