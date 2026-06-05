public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {

            throw new ArithmeticException("Division by zero");
        }

            throw new ArithmeticException("Деление на ноль невозможно");
        }


        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }


    public double[] solver(double a, double b, double c) {

        if (a == 0) {
            throw new IllegalArgumentException("Это не квадратное уравнение");
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            return new double[]{x1, x2};

        } else if (discriminant == 0) {
            double x = -b / (2 * a);

            return new double[]{x};

        } else {
            return new double[]{};
        }

    public int solver() {
        int sum = add(10, 5);
        int multiplication = times(sum, 2);
        int division = div(6, 3);

        return dif(multiplication, division);

    }
}