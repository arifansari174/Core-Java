package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(25);
        a.add(36);
        a.add(7);
        a.add(32);
        a.add(67);

        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}