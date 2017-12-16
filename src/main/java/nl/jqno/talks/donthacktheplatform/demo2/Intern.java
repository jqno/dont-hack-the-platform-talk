package nl.jqno.talks.donthacktheplatform.demo2;

import java.lang.reflect.Field;

public class Intern {
    public static void main(String... args) throws Exception {
        System.out.println("Hello world!");

        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set("Hello world!", field.get("Hello JVMCON!"));

        System.out.println("Hello world!");
    }
}
