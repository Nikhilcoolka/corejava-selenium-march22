package org.matrix.sigma.niksangli.corejava.stringprogram;

public class SimpleProgram {

    public static void main(String[] args) {

        String str1 = new String("Nikhil");
        String str2 = new String("Nikhil");
        System.out.println("Address  str1 is" + System.identityHashCode(str1));
        System.out.println("Address  str2 is" + System.identityHashCode(str2));

        String str3 = "Shree";
        String str4 = "Shree";
        System.out.println("Address  str3 is" + System.identityHashCode(str3)); //is1072408673
        System.out.println("Address  str4 is" + System.identityHashCode(str4)); //is1072408673

        System.out.println(str1 == str2); // F
        System.out.println(str3 == str4);  // T
    }


}
