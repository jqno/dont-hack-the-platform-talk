package demos.reflection;

public class Loopy {
    public static void main(String... args) throws Exception {

        Reflector.setPrivateFieldValue(Integer.class, "value", 5, 4);

        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
