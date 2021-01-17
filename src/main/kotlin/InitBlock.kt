fun initBlocks() { //main()

    //init block gets called after the primary constructor and before secondary constructor
    //sequence: Primary constructor->Initializer->Secondary constructor
    //a class can have multiple different init blocks- called sequentially

    val person = PersonInit("Akansha", 30)

}

class PersonInit(val name: String) {

    init {
        println("Initializer") //1
    }

    init {
        println("Second initializer") //2
    }

    constructor(fullName: String, age: Int) : this(fullName) {
        println("secondary constructor") //3
    }


}