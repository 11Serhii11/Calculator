public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplicacion: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));
        System.out.println("Division por cero: " + calculator.divide(10, 0));
        System.out.println("Modulus: " + calculator.modulus(10, 3));
        System.out.println("Modulus by zero: " + calculator.modulus(10, 0));
        System.out.println("Sqrt: " + calculator.sqrt(10));

    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulus with divisor zero.");
            return 0;
        }
        return a % b;
    }
    public double sqrt(double a){return Math.sqrt(a);}


}