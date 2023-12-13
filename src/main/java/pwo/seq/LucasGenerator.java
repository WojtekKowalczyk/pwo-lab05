package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
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
