package org.matrix.delta.ganesh.Strings;

public class StringFunction {

    public static void main(String[] args) {
        String str1 = new String("Ganesh");
        String str2 = new String("Rohit");
        String str3 = new String("Ganesh");

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println("Address of str1:" +System.identityHashCode(str1));
        System.out.println("Address of str1:" +System.identityHashCode(str2));

    }

}
