package nl.jqno.talks.donthacktheplatform.demo6;

import nl.jqno.talks.donthacktheplatform.demo6.helper.ConditionalCompiler;

import java.io.File;
import java.lang.reflect.Method;

public class AvoidingCheckstyle {

    private static final String DIRTY_CLASS =
            "public class DiRtYcLaSs {\n" +
            "    public static void DO_stuff() {\n" +
            "        System.out.println(\"dirty words\");\n" +
            "    }\n" +
            "}";

    private static final File tempFolder = new File(System.getProperty("java.io.tmpdir"));
    private static final ConditionalCompiler compiler = new ConditionalCompiler(tempFolder);

    public static void main(String... args) throws Exception {
        Class<?> dirtyClass = compiler.compile("DiRtYcLaSs", DIRTY_CLASS);
        Method method = dirtyClass.getDeclaredMethod("DO_stuff");
        method.invoke(null);
    }
}
