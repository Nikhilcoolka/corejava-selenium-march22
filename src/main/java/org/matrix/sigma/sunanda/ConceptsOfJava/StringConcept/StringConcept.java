package org.matrix.sigma.sunanda.ConceptsOfJava.StringConcept;

public class StringConcept {
    public static void main(String[] args) {
        String str1 = new String("Sunanda"); //a1234
        String str2 = new String("Sunanda"); //a1234
        String str3 = "Sun";
        String str4 = "Sun";
        System.out.println(str1 == str2);  // false : will do the reference comparison
        System.out.println(str3 == str4);  // true : will do the reference comparison
        System.out.println("________________");
        System.out.println(str1.equals(str2));   // true : will do the value comparison
        System.out.println(str3.equals(str4));  // true : will do the value comparison
    }
}
