fun operations(){

    var number = 50

    //convert to other types
    var double =number.toDouble()
    var string=number.toString()

    //operations
    var num1=10
    var num2=20
    println(num1.plus(num2))
    println(num1.minus(num2))
    println(num1.div(num2))

    //string operations
    var first="Akansha"
    var second="Jain"
    var fullName="$first $second" //concat
    println(fullName)

    println(fullName.length) // string size
    println(fullName[0]) //index
    println(fullName.toLowerCase())

    //line change: use triple quotes. Then line change will be as per the string
    println(("""
        Hello there!!
        Akansha here 
        """).trimIndent())

}