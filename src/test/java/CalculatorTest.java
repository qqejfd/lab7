import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(5, calculator.dif(2, -3));
        assertEquals(0, calculator.dif(0, 0));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(0, calculator.div(5, 0));
        assertEquals(-2, calculator.div(6, -3));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-6, calculator.times(2, -3));
        assertEquals(0, calculator.times(5, 0));
    }

    @Test
    void solver() {
        assertEquals(11, calculator.solver(2, 3, 5));
        assertEquals(5, calculator.solver(0, 10, 5));
        assertEquals(-1, calculator.solver(2, -3, 5));
    }
}