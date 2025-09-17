public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int number = 10 / 0;  // Division by zero
            System.out.println("Result: " + number);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // Always runs whether exception occurs or not
            System.out.println("Program finished.");
        }
    }
}