package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(10); // 0th
        arr.add(20); // 1st
        arr.add(30); // 2nd
        arr.add(10);
        arr.add("Shri1");
        arr.add("Shri2");
        arr.add(true);
        arr.add(null);
        arr.add(null);

        System.out.println(arr);

        // Iterate using for each loop
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println("------------------------");
        // Using for loop
        for(int i = 0; i < 9; i++) {
            System.out.println(arr.get(i));
        }

        // Generics Concept
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(20);
        ar1.add(10);
        ar1.add(50);
        Collections.sort(ar1);

        System.out.println("After Sorting" +ar1);

        // ar1.add("Shriniwas");

        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add("Shri");
        l.add(true);

        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println("Size:" +l.size());
        l.add("Shriniwas");
        l.remove("Shri");
        l.remove(10); //10th Index, 11th Elements
        l.remove(true);
        System.out.println(l);
    }

}
