package org.matrix.delta.prem.javaconcepts.stringsConcepts;

public class StringMethods {

    public static void main(String[] args) {
        String name="prem";
        //String    {0123}
        System.out.println("Length :: " +name.length()); //length is a method of String
        System.out.println(args.length); //length in array is property/attribute

        String str1="PREM";
        System.out.println("To Lower Case  : " +str1.toLowerCase());
        System.out.println("To Upper Case  : " +name.toUpperCase());

        String str2 = "         Prem        ";
        System.out.println("Trim  :: " +str2.trim());

        String str3="Prem";
        String str4="Prem";
        String str5="prem";
        System.out.println("EqualIgnoreCase  :: " +str4.equalsIgnoreCase(str5));
        System.out.println("Equals  :: " +str3.equals(str4));

        System.out.println("CharAt  :: "  +name.charAt(0));
        System.out.println("CharAt  :: "  +name.charAt(1));
        System.out.println("CharAt  :: "  +name.charAt(2));
        System.out.println("CharAt  :: "  +name.charAt(3));

        System.out.println(name.replace('p','P'));
        System.out.println(name.replaceAll("prem","PREM"));

        System.out.println(name.indexOf('r'));
    }
}
