package nl.jqno.talks.donthacktheplatform.demo3;

import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnicodeSymbols1 {

    private static final List<Integer> ints = List.of(1, 2, 3);

    @Test
    public void true_lambda() {
        Consumer<Integer> λ = i -> assertTrue(i > 0);
        ints.forEach(λ);
    }

    @Test
    public void physics() {
        double ΔL = 1.23;
        double L = 3.21;
        double ε = ΔL / L;
        assertEquals(0.383, ε, 0.001);
    }
}
