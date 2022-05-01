package org.matrix.sigma.pankaj.StringConcept;

public class StringMethod1 {

    public static void main(String[] args) {
        String name = "PankajKurhade";
                       //[12345678910111213]
        System.out.println("LENGTH:" +name.length()); // length() is the method of string
        System.out.println(args.length); //length in array is a property/Attribute

        String str1= "KURHADE";
        System.out.println("LOWER CASE :" +str1.toLowerCase());
        System.out.println("upper case :" +name.toUpperCase());

        String str2= "pankaj";
        System.out.println("trim :" +str2.trim());

        String str3 = "shri krishna";
        String str4 = "shri krishna";
        String str5 = "sHri kriShna";
        System.out.println("equal:" +str3.equals(str4));
        System.out.println("equal ignore case :" +str3.equalsIgnoreCase(str5));
        System.out.println("char at :" +name.charAt(9));
        System.out.println("char at :" +name.charAt(6));
        System.out.println("char at :" +name.charAt(13));

        System.out.println("replace :"+name.replace('r','R')); // char in single inverted quama



    }
}
