package org.matrix.sigma.niksangli.corejava.stringprogram;

public class StringProgram3 {
    public static void main(String[] args) {
        String str1 = "nikhil";
        String str3 = "   Nikhil   coolkarni   ";
        System.out.println(str3);
        System.out.println("Trim:" + str3.trim());

        String str4 = "Shri";
        String str5 = "Shri";
        String str6 = "ShRi";

        //Each and every character should same case sensitive
        System.out.println("Equals : " + str4.equals(str5)); // T
        // Each and every character should same case in-sensitive
        System.out.println("EqualIgnoreCase:" + str5.equalsIgnoreCase(str6)); // t
        System.out.println("Char At" + "  " + str1.charAt(5));//

        /// nikhil neekhil
        System.out.println(" Replace:" + str1.replace('e', 'i'));
        System.out.println("ReplaceAll :" + str1.replaceAll("i", "ee"));

        System.out.println("Index Of :" + str1.indexOf('n')); // Always it will give first index of char
        System.out.println("Index Of :" + str1.indexOf('i'));
        System.out.println("Last IndeX Of" + str1.lastIndexOf('i'));
        System.out.println("Last IndeX Of" + str1.lastIndexOf('l', '2'));
        System.out.println("*************************************");
        //System.out.println("Substring :" +str1.substring(1, 2));///startIndex, endIndex-1 (4-1 = 3)nikh
        String al = str1.substring(1, 2);
        System.out.println(al);

        System.out.println("SubString:" + str1.substring(1));  // start from 1 index ikhil

        System.out.println("***********************************");
        String al1 = str1.concat("coolkarni");
        System.out.println(al1);

        System.out.println("Contains :" + al1.contains("cool"));
        System.out.println("Starts with :" + al1.startsWith("nik"));
        System.out.println("Ends with :" + al1.endsWith("op"));
        System.out.println("***********************************");

        System.out.println("Compare to :" + str1.compareTo(str3));
        System.out.println("Is Empty :" + str1.isEmpty());

    }
}
