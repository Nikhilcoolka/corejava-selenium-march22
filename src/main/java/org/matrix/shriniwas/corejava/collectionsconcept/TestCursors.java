package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCursors {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        list.add("Shri4");
        list.add("Shri5");

        // For loop
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // For each loop
        for (String str: list) {
            System.out.println(str);
        }

        // Using Iterator
        Iterator<String>  itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using ListIterator
        ListIterator<String> itr1 = list.listIterator();

        while(itr1.hasPrevious()) {
            System.out.println(itr1.previous());
        }
    }
}
