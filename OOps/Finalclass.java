class Animal {
    // final method
    public final void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Trying to override will give error
    // public void sound() {  
    //     System.out.println("Dogs bark");  
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Calls Animal's sound() method
    }
}
