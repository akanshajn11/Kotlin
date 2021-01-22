fun extensionFunctions() { //main()

    val number = 10
    number.airthmetic(20)

    "Akansha".midValue()
}

fun Int.airthmetic(number: Int) {
    println("Addition is ${this + number}")
    println("Subtraction is ${this - number}")
    println("Multiplication is ${this * number}")
}

fun String.midValue() {
    if (this.length % 2 == 0)
        println("It has no mid value")
    else
        println(this[this.length / 2])
}