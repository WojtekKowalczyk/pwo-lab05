package pwo.seq;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    private BigDecimal f_3;

    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex >= 0) {
            current = f_3;
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current.add(f_2).add(f_3);
        } else {
            // Zabezpieczenie przed próbą pobrania kolejnego elementu po osiągnięciu indeksu 0
            current = null;
        }

        lastIndex--;
        return current;
    }
}
