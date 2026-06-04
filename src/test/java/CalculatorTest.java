import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();

        int result = calculator.dif(10, 5);

        assertEquals(5, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();

        int result = calculator.div(10, 5);

        assertEquals(2, result);
    }

    @Test
    void divByZero() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();

        int result = calculator.times(10, 5);

        assertEquals(50, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();

        int result = calculator.solver();

        assertEquals(28, result);
    }
}