package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Shri1");
        list.add(10);
        list.add(true);
        list.add(10.5);

        System.out.println("---- Without Generic ----");
        // Without Generic
        for (Object obj :list) {
            // 1. Type Checking
            if(obj instanceof String) {
                String str = (String) obj; // 2. Type Casting
                str = str.replace("Shri1", "Shri33");
                System.out.println("String Length() = " +str.length());
            } else if(obj instanceof Integer) {
                System.out.println(obj);
            } else if(obj instanceof Boolean) {
                System.out.println(obj);
            } else if(obj instanceof Float) {
                System.out.println(obj);
            }
        }

        System.out.println("---- With Generic ----");

        // With Generic
        ArrayList<String> list1 = new ArrayList();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");
        list1.add("Shri4");
        // list1.add(true);

        for (String str :list1) {
            System.out.println(str);
        }

        List<String> list2 = new ArrayList();
        list2.add("Shri1");
        list2.add("Shri2");
        list2.add("Shri3");
        list2.add("Shri4");
    }
}
