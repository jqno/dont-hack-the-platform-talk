package nl.jqno.talks.donthacktheplatform.demo6;

import java.lang.reflect.Constructor;

public class TheVoid {
    public static void main(String... args) throws Exception {
        Constructor<Void> constructor = Void.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Void v = constructor.newInstance();

        System.out.println(v);
    }
}
