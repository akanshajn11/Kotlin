fun transformations() {

    //Map : transforms each element of list based on certain conditions
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map {
        it * it
    }
    println(squaredNumbers)

    //FlatMap : to combine all items of different lists to one list

    data class MotorVehicle(
        val name: String,
        val model: Int,
        val manufacturer: String
    )

    val cars = listOf(
        MotorVehicle("Swift", 2016, "Maruti"),
        MotorVehicle("Altroz", 2020, "Tata"),
        MotorVehicle("Verna", 2019, "Hyundai")
    )

    val bikes = listOf(
        MotorVehicle("R-15", 2018, "Yamaha"),
        MotorVehicle("Gixxer", 2017, "Suzuki")
    )

    val vehicles = listOf(cars, bikes)

    val allVehicles = vehicles.flatMap { it }

    println(allVehicles)

    //using them together
    val manufacturerList = vehicles.flatMap { it }.map { it.manufacturer }
    println(manufacturerList)
}