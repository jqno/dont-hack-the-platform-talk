package demos.reflection;

import java.lang.reflect.Field;

public class Loopy {
    public static void main(String... args) throws Exception {
        Integer five = 5;

        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(five, 4);

        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
