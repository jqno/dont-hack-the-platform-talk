package demos.reflection;

import java.lang.reflect.*;

import static demos.reflection.Reflector.*;

public class ReflectorDemo {

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point: " + x + "," + y;
        }
    }

    public static void main(String... args) throws Exception {
        Constructor<Point> constructor = getDeclaredConstructor(Point.class, int.class, int.class);
        Point p = constructor.newInstance(1, 1);
        System.out.println(p);


//        Method method = getDeclaredMethod(Point.class, "getX");
//        int x1 = (int)method.invoke(p);
//        System.out.println(x1);


//        int x2 = (int)getPrivateField(Point.class, "x", p);
//        System.out.println(x2);


//        setPrivateField(Point.class, "x", p, 42);
//        System.out.println(p);
    }

}
