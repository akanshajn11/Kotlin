import java.util.*

//Jvm annotations are used for Kotlin interoperability with Java


class KotlinClass {
    val result = Utils.doSomething()

    val eventOne = EventClass(name = "Akansha") //second parameter need not be passed since default value is present
    private val yesterdayDate = Date(Date().time.minus(24 * 60 * 60 * 1000L))
    val eventTwo = EventClass(name = "Akansha", date = yesterdayDate)
}
