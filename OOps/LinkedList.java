package com.collection;

import java.util.LinkedList;

public class LinkedlistProgram {
	public static void main(String[] args) {
		LinkedList  l=new LinkedList();
		l.add(23);
		l.add(65);
		l.add(6);
		l.add(23);
		l.add(98);
		
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.peek());
		System.out.println(l.peek());
		
		System.out.println("---------------------------");
		System.out.println(l.poll());
		System.out.println(l.poll());
		
		System.out.println("----------------------------");
		System.out.println(l);
	}

}