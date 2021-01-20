fun lambda() {//main()

    //lambda function - has no name
    //left side is input value
    //right side is return value

    val square: (Int) -> Int = { number ->
        number * number
    }
    println(square(6))

    val printName: (String) -> Unit = { //we need not pass anything inside body as parameter, kotlin provides 'it'
        println(it)
    }
    printName("Akansha")
}