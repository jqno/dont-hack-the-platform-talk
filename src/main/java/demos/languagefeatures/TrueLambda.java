package demos.languagefeatures;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrueLambda {
    public static void main(String... args) {
        trueLambda();
        System.out.println("---");
        physics();
    }

    private static void trueLambda() {
        var ints = List.of(1, 2, 3);

        Consumer<Integer> λ = i -> System.out.println(i);

        ints.forEach(λ);
    }

    private static void physics() {
        var ΔL = 8.0;
        var L = 2.0;
        var ε = ΔL / L;

        System.out.println(ε);
    }
}
