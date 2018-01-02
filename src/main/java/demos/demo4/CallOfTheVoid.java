package demos.demo4;

import java.lang.reflect.Constructor;

public class CallOfTheVoid {
    public static void main(String... args) throws Exception {
        Constructor<Void> constructor = Void.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Void v = constructor.newInstance();

        System.out.println(v);

        Void v2 = constructor.newInstance();
        System.out.println(v.equals(v2));
    }
}
