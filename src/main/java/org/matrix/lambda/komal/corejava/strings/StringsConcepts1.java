package org.matrix.lambda.komal.corejava.strings;

public class StringsConcepts1 {


    public static void main(String[] args) {
        String str1 = new String("komal");
        String str2 = new String("komal");

        System.out.println("address of str1:" +System.identityHashCode(str1)); //for checking memory address
        System.out.println("address of str2:" +System.identityHashCode(str2));

        String str3= "rohan";
        String str4= "rohan";

        System.out.println(str1 == str2);  // false  check ref var memory add  that's different
        System.out.println(str3 == str4); // true  no obj there same memory address coz that's in scp

        System.out.println(str1.equals(str2));  // true     // check value not memory address
        System.out.println(str3.equals(str4));  // true
    }
}
