package demos.reflection;

import java.lang.reflect.Constructor;

public class CallOfTheVoid {
    public static void main(String... args) throws Exception {
        Void v = newVoid();
        System.out.println(v);

        Void v2 = newVoid();
        System.out.println(v.equals(v2));
    }

    public static Void newVoid() throws Exception {
        Constructor<Void> constructor = Void.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }
}
