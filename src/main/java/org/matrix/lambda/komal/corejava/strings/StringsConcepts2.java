package org.matrix.lambda.komal.corejava.strings;

// string is collection of characters
// String Methods

public class StringsConcepts2 {


    public static void main(String[] args) {
        String name = "Rohan";
        // 01234
        System.out.println("length:" + name.length());   // length is function

        System.out.println(args.length);   // in array length is property/attribute

        String str = "RAM";
        System.out.println("to lowercase :" + str.toLowerCase());
        System.out.println("to uppercase:" + str.toUpperCase());

        String str2 = "  Ram   ";
        System.out.println("trim :" + str2.trim()); // remove spaces from start and end not in between

        String str3 = "rohan";
        String str4 = "ram";
        String str5 = "Ram";
        System.out.println("equals :" + str3.equals(str4));  // return boolean  // case sensetive
        System.out.println("equalsIgnoreCase :" + str4.equalsIgnoreCase(str5));  // return type boolean
        System.out.println(" char at:" + name.charAt(1));    // o/p -R
        // System.out.println("char at :" +name.charAt(10)); //error

        System.out.println("replace:" + name.replace('h', 'H'));
        System.out.println("replaceAll:" + name.replaceAll("rohan", "ROHAN"));

        System.out.println("index of" + name.indexOf('a'));  // if multiple same char then give 1st index
        System.out.println("index of" + name.lastIndexOf('n')); //give last index

        System.out.println("substring:" + name.substring(0, 5)); // if 5 not there then last index-1 this will give so(5-1=4)
        System.out.println("substring:" + name.substring(0));   //it will give whole

        System.out.println("substring:" + name.substring(2));   // it gives an
        System.out.println("Substring:" + name.substring(6));   //blank space
        System.out.println("Substring:" + name.substring(0, 0));  // blank space

        System.out.println("concat:" + name.concat("shinde"));   //rohan shinde

        System.out.println("contains:" + name.contains("han")); //  true boolean return type
        System.out.println("contains:" + name.contains("Han"));  // false

        System.out.println("contains:" + name.startsWith("rohan"));   // boolean
        System.out.println("contains:" + name.endsWith("an")); //case sensetive

        String str6 = "AC";  //a is same so c //67
        String str7 = "AB";             //  b //66
        System.out.println("compare:" + str6.compareTo(str7)); //compare ascii code.o/p-1.it will gove -1/0/1

        System.out.println("is empty:" + name.isEmpty());  //boolean

        // char [] charr =name.toCharArray(); //to convert string to char array
        // use for each loop here

        String str8 = "rohan shinde";  //(rohan=0 shinde=1)   //split on base of space
        String[] arr = name.split(" ");     // given one space. two strings so arr string
        System.out.println("arrlength:" + arr.length);

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for each
        for (String st : arr) {
            System.out.println(st);
        }

        char[] ch = {'r', 'o', 'h', 'a', 'n'};
        for (char c : ch) {
            System.out.println(c + "");

        }
    }
}
