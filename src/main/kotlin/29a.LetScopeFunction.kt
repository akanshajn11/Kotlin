fun letScope() { //main()

    //let
    val numbers = mutableListOf("one", "two", "three", "four")
    //Case 1:let can be applied on a result set.Below we need not use a variable to store the result
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    //Case 2: when we need to perform a null check
    val nullableString: String? = "null"
    nullableString?.let {
        println(it)
    }


}