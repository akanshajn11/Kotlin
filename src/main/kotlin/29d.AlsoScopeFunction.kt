fun alsoScope() { //main()
    val numbers = mutableListOf("one", "two", "three", "four")
    val finalResult = numbers.map { it.length }.filter { it > 3 }
    println(finalResult)

    //also can be used to break chain and perform a side operation without modifying object
    val finalResult2 = numbers.map { it.length }
        .also {
            println(it)
        }
        .filter { it > 3 }

    println(finalResult2)
}