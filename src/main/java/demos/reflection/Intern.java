package demos.reflection;

import static demos.reflection.Reflector.getPrivateFieldValue;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class Intern {
    public static void main(String... args) throws Exception {
        String world = "Hello world!";
        String jvmcon = "Hello JVMCON!";

        System.out.println(world);
        System.out.println(jvmcon);

        Object newValue = getPrivateFieldValue(String.class, "value", jvmcon);
        setPrivateFieldValue(String.class, "value", world, newValue);

        System.out.println("Hello world!");
    }
}
