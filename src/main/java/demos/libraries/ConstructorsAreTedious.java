package demos.libraries;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

public class ConstructorsAreTedious {

    static class Something {
        private final String hello;
        private final int x;

        public Something(String hello, int x) {
            this.hello = hello;
            this.x = x;
            throw new IllegalStateException(" ᕕ( ᐛ )ᕗ ");
        }

        @Override
        public String toString() {
            return hello + " " + x;
        }
    }

    public static void main(String... args) {
        Objenesis OBJENESIS = new ObjenesisStd();

        Something p = OBJENESIS.newInstance(Something.class);
        System.out.println(p);
    }
}
