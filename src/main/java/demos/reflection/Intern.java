package demos.reflection;

import static demos.reflection.Reflector.getPrivateFieldValue;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class Intern {
    public static void main(String... args) throws Exception {
        var world = "Hello world!";
        var oslo = "Hello Oslo!";

        System.out.println(world);
        System.out.println(oslo);

        var newValue = getPrivateFieldValue(String.class, "value", oslo);
        setPrivateFieldValue(String.class, "value", world, newValue);

        System.out.println("---");
        System.out.println(world);
        System.out.println("Hello world!");
    }
}
