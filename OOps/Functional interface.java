// Step 1: Create a functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();  // only one abstract method
}

// Step 2: Implement using Lambda Expression
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        
        // Using Lambda Expression
        MyFunctionalInterface greet = () -> System.out.println("Hello, this is a Functional Interface!");
        
        // Calling the method
        greet.sayHello();
    }
}