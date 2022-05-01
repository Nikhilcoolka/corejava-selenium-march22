package org.matrix.shriniwas.corejava.collectionsconcept;

import java.util.ArrayList;

public class TestWrapperClass {

    // Wrapper classes in Java

    /* int -> Integer
       char -> Character
       boolean -> Boolean
       short -> Short
       long -> Long
       float -> Float
       double -> Double
    * */

    public static void getData1(Integer i) {
        System.out.println(i);
    }

    public static void getData2(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10); // 10 -> new Integer(10)

        // Auto Unboxing
        // Converting Primitive to Wrapper class Object
        int j = 10;
        Integer k = j; // new Integer(10); // Auto Boxing

        // Auto Unboxing
        // Converting wrapper class object to Primitive
        Integer i1 = new Integer(20);
        int j1 = i1; // Auto Unboxing

        int data = 100;
        TestWrapperClass.getData1(data); // Auto Boxing

        Integer data1 = new Integer(100);
        TestWrapperClass.getData2(data1); // Auto Unboxing
    }
}
