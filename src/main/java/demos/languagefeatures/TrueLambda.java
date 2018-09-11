package demos.languagefeatures;

import java.util.List;
import java.util.function.Consumer;

public class TrueLambda {
    public static void main(String... args) {
        trueLambda();
    }

    private static void trueLambda() {
        var ints = List.of(1, 2, 3);

        Consumer<Integer> λ = i -> System.out.println(i);

        ints.forEach(λ);
    }
}
