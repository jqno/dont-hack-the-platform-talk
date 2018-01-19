package demos.reflection;

public class Loopy {
    public static void main(String... args) throws Exception {
        Integer five = 5;

        Reflector.setPrivateField(Integer.class, "value", five, 4);

        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
