package org.matrix.alpha.shamal.java.string;

public class TestStringComparision3 {
    public static void main(String args[]){
        String s1="Shamal";
        String s2="Shamal";
        String s3="Prish";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
