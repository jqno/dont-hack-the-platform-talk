package demos.demo5;

import java.lang.reflect.Field;

public class Intern {
    public static void main(String... args) throws Exception {
        String s = "Hello world!";
        System.out.println(s);

        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(s, field.get("Hello JVMCON!"));

        System.out.println("Hello world!");
    }
}
