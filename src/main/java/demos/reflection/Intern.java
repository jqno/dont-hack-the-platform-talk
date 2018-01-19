package demos.reflection;

import static demos.reflection.Reflector.getPrivateField;
import static demos.reflection.Reflector.setPrivateField;

public class Intern {
    public static void main(String... args) throws Exception {
        String s = "Hello world!";
        System.out.println(s);

        Object newValue = getPrivateField(String.class, "value", "Hello JVMCON!");
        setPrivateField(String.class, "value", s, newValue);

        System.out.println("Hello world!");  // not `s`!
    }
}
