package org.matrix.alpha.shamal.java.string;

public class TestStringComparison {

    public static void main(String[] args) {

        String str = new String("Shamal");

        String str1 = "Shamal";

        String str2 ="Shamal";

        String str3 = "Jadhav";

        System.out.println(str.equals(str1)); //true

        System.out.println(str1.equals(str2)); //true

        System.out.println(str.equals(str3)); //false
    }
}

