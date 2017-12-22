package nl.jqno.talks.donthacktheplatform.demo4;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnicodeSymbols1 {
    public static void main(String... args) {
        true_lambda();
        physics();
    }

    private static void true_lambda() {
        List<Integer> ints = List.of(1, 2, 3);

        Consumer<Integer> λ = i -> System.out.println(i);
        ints.forEach(λ);
    }

    private static void physics() {
        double ΔL = 8;
        double L = 2;
        double ε = ΔL / L;

        System.out.println(ε);
    }
}
