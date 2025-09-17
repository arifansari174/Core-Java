public class FinallyExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;   // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}