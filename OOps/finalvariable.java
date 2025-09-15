public class FinalVariableExample {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // compile error: cannot assign a value to final variable x

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");          // allowed — reference unchanged, object mutated
        System.out.println(sb);      // prints: Hello World

        // sb = new StringBuilder("Other"); // compile error: cannot reassign final reference
    }
}