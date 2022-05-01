package org.matrix.sigma.prajakta.corejava.stringconcept;

public class StringMethod2 {

    public static void main(String[] args) {

        String str1 = "Prajakta";
        String str2 = "Deshpande";

        System.out.println("Chat at::" + str1.charAt(1));  //find character from index
        System.out.println("-------------");
        System.out.println("Replace::" + str2.replace('p', 's'));
        System.out.println("--------------");

        System.out.println("Replace all string::" + str1.replaceAll("jakta", "ju"));
        System.out.println("--------------");
        System.out.println("IndexOf::" + str1.indexOf('j'));
        System.out.println("---------------");

        System.out.println("Last index of::" + str2.lastIndexOf('e'));
        System.out.println("=================================");

        System.out.println("substring::" + str1.substring(1, 6)); // startIndex , endIndex-1[6-1]
        System.out.println("substring::" + str2.substring(0, 4));
        System.out.println("substring::" + str1.substring(0));
        System.out.println("----------------------");
        System.out.println("concate::" + str1.concat("ashok"));

        System.out.println("----------");
        System.out.println("contains::" + str1.contains("jak"));
        System.out.println("contains::" + str1.contains("pak"));

        System.out.println("=====================");
        System.out.println("starts with::" + str1.startsWith("Pra"));
        System.out.println("starts with::" + str1.startsWith("pra"));
        System.out.println("ends with::" + str2.endsWith("de"));
        System.out.println("-------------");

        System.out.println("compareTo::" + str1.compareTo(str2));
        System.out.println("-----------");
        System.out.println("isEmpty::" + str1.isEmpty());

        System.out.println("-----------------");
        String name = "sayalee ayachit";
        String arr[] = name.split(" ");
        System.out.println("array length::" + arr.length);

        System.out.println("For loop----------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("for each loop--------");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("character array for each loop----");
        char c[]={'p','r','a','j','u'};

        for (char s : c) {
            System.out.println(s);
        }

        System.out.println("================");
        char [] ch1=name.toCharArray();
        for (char arr1:ch1) {
            System.out.println(arr1);
        }

    }
}
