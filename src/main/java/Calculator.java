public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int sum = add(10, 5);
        int multiplication = times(sum, 2);
        int division = div(6, 3);

        return dif(multiplication, division);
    }
}