fun sets() { //main()
    //set is like list
    //set is a collection of unique values, repeated elements won't be considered
    //Kotlin Collections: Lists, Maps, Sets

    val name = setOf("Akansha", "AJ") //immutable set
    val tech = mutableSetOf("Android", "iOS") //mutable set

    //if we add a duplicate value, set won't consider it
    val cities = mutableSetOf("Mumbai", "Bangalore", "Bangalore")
    println(cities) // result is [Mumbai, Bangalore]

    //add an element
    cities.add("Delhi")
    println(cities)

    //remove an element
    cities.remove("Bangalore")
    println(cities)

    //On Set we can perform mathematical operations of Set

    //Set operation-Union
    println(name union cities)

    //Set operation-Intersect
    println(name intersect cities)

    //count() would return no of unique elements
    cities.add("Delhi")
    println(cities)
    println(cities.count())


}