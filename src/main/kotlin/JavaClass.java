import java.util.Date;

public class JavaClass {
    String result = Utils.INSTANCE.doSomething(); // if JvmStatic annotation not used
    String result2 = Utils.doSomething(); //if JvmStatic annotation is used


    EventClass event = new EventClass("Akansha");
    //if JvmOverloads annotation is used skipping default parameter would work
    //else would throw error

    // Date date= event.date//cannot access date field directly
    // Date date = event.getDate()// we need to use getter
    Date date2 = event.date; //can access date field directly if we use Jvm Field annotation
}
