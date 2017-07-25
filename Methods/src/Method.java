import java.util.Arrays;

public class Method {

    private static int inc(int a) {
        return ++a;
    }

    private static int inc(int[] a) {
        return ++a[0];
    }

    private static double inc(double a) {
        return ++a;
    }

    private static double inc(double a, double b) {
        return a + b;
    }

    private static void inc(String... a) {
        for (String b : a) System.out.println(b);
    }

    private static void inc(int b, String... a) {
        do {
            for (String c : a) System.out.println(c);
        } while (--b > 0);
    }

    private static double calc(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("No such operation");
        }
    }

    private static double megacalc(String[] operators, double[] arguments) {
        if (Math.abs(arguments.length - operators.length) > 1) {
            throw new IllegalArgumentException("Lack of arguments");
        } else {
            double result = calc(arguments[0], arguments[1], operators[0]);
            for (int i = 1; i < operators.length; i++) result = calc(result, arguments[i + 1], operators[i]);
            return result;
        }
    }

    private static long revertNumber(long number) {
        long newNumber = 0;
        while (number > 0) {
            newNumber += (number % 10);
            newNumber *= ((number < 10) ? 1 : 10);
            number /= 10;
        }
        return newNumber;
    }

    private static long factorial(long f) {
        if (f < 0) throw new IllegalArgumentException("Argument cannot be less than 0.");
        return (f <= 1) ? 1 : f * factorial(f - 1);
    }

    public static void main(String[] args) {

        System.out.println(calc(1, 2, "+"));
        System.out.println(calc(1, 2, "-"));
        System.out.println(calc(1, 2, "*"));
        System.out.println(calc(1, 2, "/"));

        int b = 5;
        inc(b);
        System.out.println(b);

        int[] a = {1};
        inc(a);
        System.out.println(a[0]);

        double c = 1;
        inc(c);

        inc("a", "b", "c");
        inc(2, "a", "b", "c");

        System.out.println(megacalc(new String[]{"+", "-", "*", "/"}, new double[]{5, 4, 3, 2, 1}));

        System.out.println(factorial(5));
        System.out.println(factorial(0));
        // System.out.println(factorial(-1));

        long d = 123456789;
        long e = revertNumber(d);

        System.out.println(d);
        System.out.println(revertNumber(d));
        System.out.println(revertNumber(123));

    }
}
