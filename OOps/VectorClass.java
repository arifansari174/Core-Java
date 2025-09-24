package com.collection;

import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<String> mammals=new Vector<> ();
		mammals.add("Dog");
		mammals.add("horse");
		
		mammals.add(2,"Cat");
		System.out.println("vector:"+ mammals);
		
		Vector<String> animals=new Vector<>();
		animals.add("Crocodile");
		animals.addAll(mammals);
		System.out.println("New Vector:"+ animals);
		
		
	}

}