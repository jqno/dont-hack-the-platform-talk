package demos.reflection;

import static demos.reflection.Reflector.getPrivateFieldValue;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class Intern {
    public static void main(String... args) throws Exception {
        var world = "Hello world!";
        var hackers = "Hello hackers!";

        System.out.println(world);
        System.out.println(hackers);

        var newValue = getPrivateFieldValue(String.class, "value", hackers);
        setPrivateFieldValue(String.class, "value", world, newValue);

        System.out.println("---");
        System.out.println(world);
        System.out.println("Hello world!");
    }
}
