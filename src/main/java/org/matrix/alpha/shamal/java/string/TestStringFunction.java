package org.matrix.alpha.shamal.java.string;

public class TestStringFunction {

    public static void main(String[] args) {

        String str = "Shamal";
                   //[012345]
        String str1 = "Jadhav";

        String s = "shreenika";
                 //[012345678]

        System.out.println("The length of the String Is:" +str.length());

        System.out.println("The character at this location is:" +str.charAt(4));
        System.out.println("The character at this location is:" +str.charAt(3));
        System.out.println("The character at this location is:" +str.charAt(5));
        //System.out.println("The character at this location is:" +str.charAt(6)); throws string nulll pointer exception

        System.out.println("The comparision of two string is:" +str.compareTo(str1));
        System.out.println("The comparision of two string is:" +str.compareTo(s));

        System.out.println("substring is:" +s.substring(0,3));
        System.out.println("substring is:" +s.substring(0,5));
        System.out.println("substring is:" +s.substring(5,9));

        System.out.println("The index of this character is:" +s.indexOf('r'));
        System.out.println("The index of this character is:" +s.indexOf('s'));
        System.out.println("The index of this character is:" +s.indexOf('n'));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println("The Concatination will be:"  +s.concat(str));
    }
}
