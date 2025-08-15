public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Blud thinks he can divide that 🙂");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println("Hey there Welcome to my simple Calculator :)");

        double num1 = 10;
        double num2 = 5;

        System.out.println(num1 + " + " + num2 + " = " + myCalculator.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + myCalculator.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + myCalculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + myCalculator.divide(num1, num2));

        try {
            System.out.println("\nAttempting to divide " + num1 + " by 0...");
            myCalculator.divide(num1, 0);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
