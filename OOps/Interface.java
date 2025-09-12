// Defining an interface
interface Animal {
    // Abstract method (no body)
    void sound();

    // Another abstract method
    void sleep();
}

// Implementing interface in a class
class Dog implements Animal {
    // Providing implementation of sound()
    public void sound() {
        System.out.println("Dog barks");
    }

    // Providing implementation of sleep()
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Interface reference, Dog object
        myDog.sound();   // Calls Dog's implementation
        myDog.sleep();
    }
}