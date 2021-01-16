fun conditionalExp() {

    var age = 20

    var type: String = if (age < 20)
        "Child"
    else if (age in 20..50)
        "Adult"
    else
        "Old"
    print(type)

    type = when (age) {
        10 -> "Ten"
        20 -> "Twenty"
        else -> "Not valid age"
    }

    print(type)
}