package pwo.seq;

import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {

    public FibonacciGenerator() {
        reset();
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);

        // Resetujemy indeks do wartości 100
        lastIndex = 100;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex >= 0) {
            current = f_2;
            f_2 = f_1;
            f_1 = current.add(f_2);
        } else {
            // Zabezpieczenie przed próbą pobrania kolejnego elementu po osiągnięciu indeksu 0
            current = null;
        }

        lastIndex--;
        return current;
    }
}
