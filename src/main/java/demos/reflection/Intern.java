package demos.reflection;

import static demos.reflection.Reflector.getPrivateFieldValue;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class Intern {
    public static void main(String... args) throws Exception {
        String world = "Hello world!";
        String hackers = "Hello hackers!";

        System.out.println(world);
        System.out.println(hackers);

        Object newValue = getPrivateFieldValue(String.class, "value", hackers);
        setPrivateFieldValue(String.class, "value", world, newValue);

        System.out.println("Hello world!");
    }
}
