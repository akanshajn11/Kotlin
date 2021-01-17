fun forEachLoops() { //main()
    val list = listOf("Akansha", "Jain", "AJ")

    list.forEach {
        println(it)
    }

    list.forEach { name ->
        println(name)
    }

    list.forEach { name ->
        if (name == "Akansha")
            println(true)
    }

    //take both index and value
    list.forEachIndexed { index, name ->
        println(index)
        println(name)
    }
}