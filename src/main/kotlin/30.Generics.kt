fun generics() { //main()
    Event<String>("Akansha")
    Event("Jain") //we need not pass <T>, it will take String here
    Event<String>()
    Event2<String, Int>("Akansha", 29)
    Event2(1, 2)
}

class Event<T>(value: T? = null) {
    init {
        if (value != null)
            println(value.toString().length)
        else
            println("Empty parameter")
    }
}

class Event2<T, V>(value: T, data: V) {
    init {
        println(value.toString().length)
        println(data.toString().length)
    }
}