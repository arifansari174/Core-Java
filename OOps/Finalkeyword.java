class FinalExample {
    
    // final variable
    final int speedLimit = 80;

    // final method
    final void displayMessage() {
        System.out.println("This is a final method.");
    }
}

// Trying to extend the class
final class Bike {
    void run() {
        System.out.println("Bike is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Example of final variable
        FinalExample obj = new FinalExample();
        System.out.println("Speed Limit: " + obj.speedLimit);

        // Calling final method
        obj.displayMessage();

        // Using final class
        Bike b = new Bike();
        b.run();
    }
}