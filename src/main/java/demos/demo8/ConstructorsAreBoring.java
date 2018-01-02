package demos.demo8;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

public class ConstructorsAreBoring {

    public static void main(String... args) {
        Objenesis OBJENESIS = new ObjenesisStd();

        Point p = OBJENESIS.newInstance(Point.class);
        System.out.println(p);
    }

    static class Point {
        private final String hello;
        private final int x;

        public Point(String hello, int x) {
            this.hello = hello;
            this.x = x;
        }

        @Override
        public String toString() {
            return hello + " " + x;
        }
    }
}
