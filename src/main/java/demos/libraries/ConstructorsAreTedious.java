package demos.libraries;

import org.objenesis.ObjenesisStd;

public class ConstructorsAreTedious {

    static class Something {
        public Something() {
            throw new IllegalStateException(" (╯°□°）╯︵ ┻━┻ ");
        }

        @Override
        public String toString() {
            return " (☞ﾟヮﾟ)☞ ";
        }
    }

    public static void main(String... args) {
        var objenesis = new ObjenesisStd();
        var something = objenesis.newInstance(Something.class);

        System.out.println(something);
    }
}
