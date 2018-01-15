package demos.languagefeatures;

public class HashCode {
    public static void main(String... args) {
        String hello = "Hello world!";
        String another = stringWithSameHashCode(hello);

        System.out.println(hello.hashCode() == another.hashCode());
    }

    private static String stringWithSameHashCode(String original) {
        int level = 1;
        int length = original.length();
        if (length < 2) {
            return original;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length / 2; i++) {
            char c0 = original.charAt(i * 2);
            char c1 = original.charAt(i * 2 + 1);
            c0 = (char)(c0 + level);
            c1 = (char)(c1 - 31 * level);
            sb.append(c0);
            sb.append(c1);
        }
        if (length % 2 == 1) {
            sb.append(original.charAt(length - 1));
        }
        return sb.toString();
    }
}
