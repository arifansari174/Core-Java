package com.basic.java;

public class GlobalVariable {

    // Instance variable (like a global for this object)
    int instanceVar = 10;

    // Static variable (shared across all objects - acts like a global variable for the class)
    static String staticVar = "I am a static (global) variable";

    public void showVariables() {
        // Local variable
        int localVar = 5;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static (Global) Variable: " + staticVar);
    }

    public static void main(String[] args) {
        GlobalVariable obj1 = new GlobalVariable();
        GlobalVariable obj2 = new GlobalVariable();
        GlobalVariable obj3 = new GlobalVariable();

        obj1.showVariables();
System.out.println("-------------------------");
        // Changing static (global) variable
        GlobalVariable.staticVar = "Changed global value";

        obj2.showVariables(); // staticVar change will reflect here too
        System.out.println("------------");
        obj3.showVariables();
    }
}

