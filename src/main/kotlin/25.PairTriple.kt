fun pairTriple() {//main()
    //pair is collection of 2 variable
    //triple is collection of 3 variable

    val pair = Pair<String, Int>("Akansha", 29)
    val pairTwo = Pair<String, String>("Akansha", "29")

    println(pair)
    println(pairTwo)

    //access first variable of pair
    println(pair.first)

    //access second variable of pair
    println(pair.second)

    //Another way of defining a pair - Destructuring of pair
    val (firstName, age) = Pair("AJ", 28)
    println(firstName)
    println(age)

    //Converting pair to list
    val list = pair.toList()
    println(list)
    println(list[0])
    println(list[1])

    //Triple
    val triple = Triple("Akansha", "Jain", 29)

    //accessing first, second and third variable
    println(triple.first)
    println(triple.second)
    println(triple.third)

    //destructuring a triple
    val (fName, lastName, ag) = Triple("Akansha", "Jain", 29)
    println(fName)
    println(lastName)
    println(ag)

    //converting it to list
    val list2 = triple.toList()
    println(list2[0])
    println(list2[1])
    println(list2[2])


}
