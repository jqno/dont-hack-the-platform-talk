package demos.languagefeatures;

public class Generics {
    public static void main(String... args) {

        var listOfInt = new ArrayListᐸintᐳ();

        listOfInt.add(42);
        int i = listOfInt.get(0);

        System.out.println("The answer is " + i);
    }









    /* HOW DOES IT WORK? */

    public static class ArrayListᐸintᐳ {
        public void add(int i) {}

        public int get(int i) {
            return 42;
        }
    }
}
