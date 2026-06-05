import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {

        assertEquals(80, calculator.add(74, 6));
        assertEquals(-9, calculator.add(5, -14));
        assertEquals(0, calculator.add(0, 0));

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);

    }

    @Test
    void dif() {

        assertEquals(10, calculator.dif(14, 4));
        assertEquals(-5, calculator.dif(0, 5));
        assertEquals(0, calculator.dif(7, 7));

        Calculator calculator = new Calculator();

        int result = calculator.dif(10, 5);

        assertEquals(5, result);

    }

    @Test
    void div() {

        assertEquals(11, calculator.div(121, 11));
        assertEquals(-5, calculator.div(-10, 2));

        Calculator calculator = new Calculator();

        int result = calculator.div(10, 5);

        assertEquals(2, result);

    }

    @Test
    void divByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.div(228, 0)
        );

        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));

    }

    @Test
    void times() {

        assertEquals(143, calculator.times(13, 11));
        assertEquals(0, calculator.times(3, 0));
        assertEquals(-20, calculator.times(-4, 5));
    }

    @Test
    void solverTwoRoots() {

        double[] result = calculator.solver(1, -5, 6);

        assertEquals(2, result.length);
        assertEquals(3.0, result[0], 0.001);
        assertEquals(2.0, result[1], 0.001);
    }

    @Test
    void solverOneRoot() {

        double[] result = calculator.solver(1, -4, 4);

        assertEquals(1, result.length);
        assertEquals(2.0, result[0], 0.001);
    }

    @Test
    void solverNoRoots() {

        double[] result = calculator.solver(1, 0, 1);

        assertEquals(0, result.length);
    }

    @Test
    void solverNotQuadraticEquation() {

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.solver(0, 5, 6)
        );

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