package org.matrix.alpha.shamal.java.string;

public class TestString {
    public static void main(String[] args) {
        /*There are two ways tol declared string objects*/

        String str = new String();  // creating Java string by new keyword

        str = "Shamal-Jadhav-Matale";

        System.out.println(str);

        String str1 = new String("Shamal-Jadhav"); // creates two objects and one reference variable

        System.out.println(str1);

        /*Literal way*/

        String s = "ShamalJadhav"; //creating string by Java string literal

        System.out.println(s);
    }
}

