package org.matrix.alpha.shamal.java.string;

public class TestStringComparison1 {

    public static void main(String[] args) {
        String s = "Shamal";
        String s1 = "SHAMAL";
        System.out.println(s.equals(s1)); //false
        System.out.println(s.equalsIgnoreCase(s1)); //true

    }
}
