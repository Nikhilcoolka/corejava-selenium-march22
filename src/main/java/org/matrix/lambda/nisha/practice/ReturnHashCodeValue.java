package org.matrix.lambda.nisha.practice;

public class ReturnHashCodeValue {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        int returnValue1 = System.identityHashCode(str1);
        System.out.println("Hashcode value of Hello is " + returnValue1);

        int returnValue2 = System.identityHashCode(str2);
        System.out.println("Hashcode value of World is " + returnValue2);
    }
}
