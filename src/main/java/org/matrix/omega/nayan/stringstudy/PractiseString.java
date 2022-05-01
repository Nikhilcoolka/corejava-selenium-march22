package org.matrix.omega.nayan.stringstudy;

public class PractiseString {

    public static void main(String[] args) {
        String str1 = new String("google");   //1:245257410   hash code ref
        String str2 = new String("google"); // 2:1705736037 ref

        String str3 = "rr";  // 455659002 ref
        String str4 = "rr";  // 455659002 ref

        System.out.println(str1 == str2); // false :  ref comparsion
        System.out.println(str3 == str4); // true :   ref comparsion

        System.out.println("=============================================================");

        System.out.println(str1.equals(str2)); // true : content comparison
        System.out.println(str3.equals(str4)); // true : content comparison


        System.out.println("==============================================================");

        System.out.println("Address of str 1:" + System.identityHashCode(str1));
        System.out.println("Address of str 2:" + System.identityHashCode(str2));
        System.out.println("Address of str 3:" + System.identityHashCode(str3));
        System.out.println("Address of str 4:" + System.identityHashCode(str4));

        System.out.println("=================================================================");

        String str5 = "Automation";
        str5 = str5.concat("Testing"); // immutable

        System.out.println(str5);

        System.out.println("=====================================================================");

        StringBuffer st = new StringBuffer("hello");
        st.append("world"); // mutable

        System.out.println(st);


    }
}
