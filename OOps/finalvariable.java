class FinalVariableExample {
    public static void main(String[] args) {
        // final variable
        final int age = 25;

        System.out.println("Age: " + age);

        // Trying to change the value will give an error
        // age = 30;  // ❌ Error: cannot assign a value to final variable
    }
}