fun maps() { //main()
    //maps are key-value pairs

    val ageMapper = mapOf("Akansha" to 30, "AJ" to 29) //Immutable
    val newAgeMapper = mutableMapOf("Akansha" to 30, "AJ" to 29) //Mutable
    println(ageMapper)

    //get the values from keys
    println(ageMapper["Akansha"])
    println(ageMapper["AJ"])

    //size
    println(ageMapper.size)
    println(ageMapper.count())

    //count of element satisfying a condition
    println(ageMapper.count {
        it.value > 28
    })

    //operations on mutable maps

    //add a value
    newAgeMapper.put("Jain", 28)
    println(newAgeMapper)

    //remove specific value, pass the key
    newAgeMapper.remove("Jain")
    println(newAgeMapper)

    //check if the map contains an element
    println(newAgeMapper.containsKey("AJ")) //by key
    println(newAgeMapper.containsValue(28))//by value


    //remove all values
    newAgeMapper.clear()
    println(newAgeMapper)

    newAgeMapper.put("Akansha", 29)
    newAgeMapper.put("AJ", 30)

    //get elements satisfying a condition - use filter
    println(newAgeMapper.filter {
        it.key == "Akansha" || it.value == 29
    })

    //filter only based on keys - use filterKeys
    println(newAgeMapper.filterKeys {
        it == "AJ"
    })

    //filter only based on values - use filterValues
    println(newAgeMapper.filterValues {
        it == 30
    })

    //sorted map - sorts based on key
    println(newAgeMapper.toSortedMap())

    //get a value and handle exception if not found
    println(newAgeMapper.getOrDefault("Anku", -1))

    //get all Keys
    println(newAgeMapper.keys)

    //get all Values
    println(newAgeMapper.values)

    //filter records not satisfying a condition - use filterNot
    println(newAgeMapper.filterNot {
        it.value == 30
    })

}