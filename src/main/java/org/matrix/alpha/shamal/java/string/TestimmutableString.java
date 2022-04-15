package org.matrix.alpha.shamal.java.string;

public class TestimmutableString {

    public static void main(String args[]) {
        String s = "Shamal";
        s.concat(" Jadhav");//concat() method appends the string at the end
      //  System.out.println(s);//will print Shamal because strings are immutable objects
        s = s.concat(" Jadhav");
        System.out.println(s); //explicitly assign it to the reference variable
    }
}
