package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(20);
        tSet.add(10);
        tSet.add(30);

        TreeSet<String> tr = new TreeSet<>();
        tr.add("Shri1");
        // tr.add(null);

        System.out.println();

        System.out.println("Asc Order: " +tSet);
        System.out.println("Desc Order: " +tSet.descendingSet());

        for (Integer i : tSet) {
            System.out.println(i);
        }
    }
}
