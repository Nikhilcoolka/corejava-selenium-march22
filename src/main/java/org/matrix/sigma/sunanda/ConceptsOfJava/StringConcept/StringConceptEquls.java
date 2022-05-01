package org.matrix.sigma.sunanda.ConceptsOfJava.StringConcept;

public class StringConceptEquls {
    public static void main(String[] args) {
        String str1 = "Sunanda"; //Address1607521710
        String str2 = "Sunanda"; //Address764977973
        System.out.println("Address of str1:" +System.identityHashCode(str1)); // to get the memory address location of str1
        System.out.println("Address of str2:" +System.identityHashCode(str2)); // to get the memory address location of str2
        String str3 = "Sun";  //Address381259350
        String str4 = "Sun";  //Address381259350
        System.out.println("Address of str3:" +System.identityHashCode(str3)); // to get the memory address location of str3
        System.out.println("Address of str4:" +System.identityHashCode(str4)); // to get the memory address location of str4
        System.out.println(str1==str2);  // false:will do the reference comparison
        System.out.println(str3==str4);  // true:will do the reference comparison

        System.out.println("________________");

        System.out.println(str1.equals(str2));  //true : will do the comparison
        System.out.println(str3.equals(str4));  //true : will do the comparison
    }
}
