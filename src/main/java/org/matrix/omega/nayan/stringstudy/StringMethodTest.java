package org.matrix.omega.nayan.stringstudy;

public class StringMethodTest {

    public static void main(String[] args) {

        String str0 = "google";


        System.out.println("concept length :" + str0.length());
        System.out.println(args.length);

        String str1 = "automation";
        String str2 = "TESTING";

        System.out.println("upper case :" + str1.toUpperCase()); // return type= String
        System.out.println("lower case :" + str2.toLowerCase());
        System.out.println("upper case :" + str0.toUpperCase());

        System.out.println("========================================= ");

        String str3 = "      facebook            ";
        System.out.println("remove spaces using trim : " + str3.trim()); // return type string

        System.out.println("===========================================");

        String str4 = "insta";
        String str5 = "insta";
        String str6 = "nayan";
        String str7 = "NaYaN";

        System.out.println("EQWALITIY : " + str4.equals(str5)); // true = return type Boolean
        System.out.println("EQWALITIY : " + str3.equals(str5)); // false

        System.out.println("===================================================");

        System.out.println("EqualIgnoreCase :" + str6.equalsIgnoreCase(str7)); // true = return type Boolean
        System.out.println("EqualsIgnoreCase :" + str6.equalsIgnoreCase(str5));

        System.out.println("=====================================================");

        String str8 = "selenium";

        System.out.println("char At  :" + str8.charAt(0));
        System.out.println("char At  :" + str8.charAt(1));
        System.out.println("Char At  :" + str8.charAt(7));

        System.out.println("======================================================");

        String str9 = "world";

        System.out.println("REPLACE    :" + str9.replace('w', 'W'));
        System.out.println("REPLACE ALL:" + str9.replaceAll("world", "WORLD"));

        System.out.println("========================================================");

        String str10 = "googlechrome";

        System.out.println("Index Of :" + str10.indexOf('g'));
        System.out.println("Index Of :" + str10.indexOf('c'));
        System.out.println("Last Index Of :" + str10.lastIndexOf('g'));

        System.out.println("==========================================");

        System.out.println("Substring :" + str10.substring(0, 6)); // google  -1
        System.out.println("substring :" + str10.substring(6, 12)); // chrome -1
        System.out.println("substring :" + str10.substring(6));
        System.out.println("substring :" + str10.substring(0));

        System.out.println("====================================================");

        System.out.println("Concat :" + str0.concat("CHROME"));

        System.out.println("Contains :" + str0.contains("google"));
        System.out.println("Contains :" + str0.contains("chrome"));

        System.out.println("Starts with :" + str0.startsWith("go"));
        System.out.println("Starts with :" + str0.startsWith("co"));

        System.out.println("Ends with :" + str0.endsWith("gel"));


    }

}
