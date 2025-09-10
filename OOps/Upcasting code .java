// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void play() {
        System.out.println("Dog plays with ball");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting (Child → Parent)
        Animal a = new Dog();  

        // Method overriding works (runtime polymorphism)
        a.sound();   

        
    }
}