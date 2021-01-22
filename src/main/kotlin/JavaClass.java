public class JavaClass {
    String result = Utils.INSTANCE.doSomething(); // if JvmStatic annotation not used
    String result2 = Utils.doSomething(); //if JvmStatic annotation is used
}
