package demos.reflection;

import static demos.reflection.Reflector.getPrivateFieldValue;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class Intern {
    public static void main(String... args) throws Exception {
        var world = "Hello world!";
        var jfall = "Hello J-Fall!";

        System.out.println(world);
        System.out.println(jfall);

        var newValue = getPrivateFieldValue(String.class, "value", jfall);
        setPrivateFieldValue(String.class, "value", world, newValue);

        System.out.println("---");
        System.out.println(world);
        System.out.println("Hello world!");
    }
}
