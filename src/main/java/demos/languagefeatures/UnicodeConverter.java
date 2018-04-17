package demos.languagefeatures;

import java.util.stream.Collectors;

public class UnicodeConverter {
    private static final String PROGRAM =
            "\npublic class UnicodeEscapism {" +
            "\n    public static void main(String... args) {" +
            "\n        System.out.println(\"Hello Utrecht!\");" +
            "\n    }" +
            "\n}";

    public static void main(String... args) {
        var strings = PROGRAM.chars()
                .mapToObj(UnicodeConverter::convertChar)
                .collect(Collectors.toList());

        var output = String.join("", strings);
        System.out.println(output);
    }

    private static String convertChar(int c) {
        if (c == 10) {
            return "\n";
        }
        else {
            return "\\u00" + Integer.toHexString(c);
        }
    }
}
