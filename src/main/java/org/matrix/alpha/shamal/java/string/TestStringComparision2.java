package org.matrix.alpha.shamal.java.string;

public class TestStringComparision2 {

        public static void main(String args[]){
            String s1="Jadhav"; //a1230

            String s2="Jadhav"; //a1230

            String s3=new String("Jadhav"); //b1456

            System.out.println(s1==s2);//true (because both refer to same instance) //true
            System.out.println(s1==s3);//false(because s3 refers to instance created in Heap Memory) //false
        }
    }

