package org.matrix.sigma.kadambari.practice;

public class TestString1 {

    public static void main(String[] args) {
        String str1= new String("kadambari");// Address-460141958
        String str2=new String("shravi");// Address-1163157884
        System.out.println("Address of str1:"+System.identityHashCode(str1));//Find address
        System.out.println("Address of str2:"+System.identityHashCode(str2));

        String str3="Prashant";// Address-1956725890
        String str4="Prashant";//Address-1956725890
        System.out.println("Address of str3:"+System.identityHashCode(str3));
        System.out.println("Address of str4:"+System.identityHashCode(str4));

        System.out.println(str1==str2);//false :will do the reference comparison
        System.out.println(str3==str4);//true : will do the reference comparison

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

    }
}
