package demos.languagefeatures;

public class Zalgo {

    private static final int ŹĄŁĜØ = -1;

    public static void main(String... args) throws Exception {
        System.out.println(ŹĄŁĜØ);

        String fieldName = Zalgo.class.getDeclaredField("ŹĄŁĜØ").getName();
        System.out.println(fieldName);
    }
}
