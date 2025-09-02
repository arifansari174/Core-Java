package com.basic.java;

public class LocalVariable {

    public void displayMessage() {
        // local variable inside method
        String message = "Hello, I am a local variable!";
        int j=20;
        System.out.println(j);
        		
        
        System.out.println(message);

        // local variable inside a block
        if (true) {
            int number = 100; // local to this if-block
            System.out.println("Number inside if-block: " + number);
        }
      //  System.out.println(number); //error

        // Trying to use 'number' here will cause an error because it's out of scope
        // System.out.println(number); // ❌ Compile-time error
    }

    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        obj.displayMessage();
        
   
    }
}
