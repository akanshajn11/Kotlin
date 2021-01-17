fun runScope() { //main()
//run is used when we need to initialize object, perform operation on it and return result

    val info = PersonRun("Akansha", "Jain").run {//this context object can be accessed within run block
        address = "xyz" //we need not write this.address or this.getInfo() since it is context object scope only
        getInfo()  //will return result which will be stored in info
    }
    print(info)

}

class PersonRun(val firstName: String, val lastName: String) {
    var address: String = "Unknown"
    fun getInfo() = "first name $firstName \n last name $lastName \n address $address"
}