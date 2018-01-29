package demos.reflection;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Locale;

public class AvoidingCheckstyle {

    private static final String DIRTY_CLASS =
            "\npublic class dirty_CLASS {" +
            "\n    public static void DO_stuff() {" +
            "\n        System.out.println(\"dirty words\");" +
            "\n    }" +
            "\n}";

    public static void main(String... args) throws Exception {

        File tempFolder = new File(System.getProperty("java.io.tmpdir"));
        MyCompiler compiler = new MyCompiler(tempFolder);


        Class<?> dirtyClass = compiler.compile("dirty_CLASS", DIRTY_CLASS);
        Method method = Reflector.getDeclaredMethod(dirtyClass, "DO_stuff");
        method.invoke(null);
    }
}





/* HOW DOES IT WORK? */


class MyCompiler {
    private final File tempFolder;
    private final URLClassLoader classLoader;


    public MyCompiler(File tempFolder) throws MalformedURLException {
        this.tempFolder = tempFolder;
        this.classLoader = createClassLoader(tempFolder);
    }

    public Class<?> compile(String className, String code) throws Exception {
        JavaFileObject sourceFile = new StringJavaFileObject(className, code);
        compileClass(sourceFile);
        return classLoader.loadClass(className);
    }

    private void compileClass(JavaFileObject sourceFile) throws IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = null;
        DiagnosticCollector<JavaFileObject> collector = new DiagnosticCollector<>();

        try {
            fileManager = compiler.getStandardFileManager(collector, Locale.ROOT, null);
            fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Collections.singletonList(tempFolder));
            JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, collector, null, null, Collections.singletonList(sourceFile));

            task.call();
        }
        finally {
            if (fileManager != null) {
                fileManager.close();
            }
        }
    }

    private static URLClassLoader createClassLoader(File tempFolder) throws MalformedURLException {
        URL[] urls = { tempFolder.toURI().toURL() };
        return new URLClassLoader(urls);
    }




    /* HERE IS SOME BORING STUFF */


    private static class StringJavaFileObject extends SimpleJavaFileObject {
        private final String code;

        protected StringJavaFileObject(String className, String code) {
            super(URI.create("string:///" + className.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
            this.code = code;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return code;
        }
    }
}

