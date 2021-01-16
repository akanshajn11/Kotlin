fun nullable() {

    var name: String? = "Akansha"
    println(name)
    name = null
    println(name)
    println(name?.length) //null safety operator

    //elvis operator ?:
    val length: Int = name?.length ?: 0
    println(length)

}