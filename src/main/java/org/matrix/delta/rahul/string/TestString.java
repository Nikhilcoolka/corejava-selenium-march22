package org.matrix.delta.rahul.string;

public class TestString {
    String str = new String("Rahul");// object type of string.
    String str1 = new String("Rahul");
    String str2 = "Rahul";//SCP mean String constant pool
    String str3 = "Rahul";

    public static void main(String[] args) {
        TestString t = new TestString();
        System.out.println(t.str == t.str1);
        System.out.println(t.str2 == t.str3);// == operator is used for compare the referance object/address.
        System.out.println("----------------------------------------------------");
        System.out.println(t.str.equals(t.str1)); // equals method is used for equals the values of variable.
        System.out.println(t.str2.equals(t.str3));
    }

}