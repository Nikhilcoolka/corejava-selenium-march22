package org.matrix.sigma.kadambari.practice;

public class TestString {

    public static void main(String[] args) {
        String st ="kadambari";//string literal (SCP-String Constanct Pool Memory)
        String st1=new String ("shravi");//by using object creation -heap memory
        String str3="Prashant";
         str3= str3.concat("Belavate");
        System.out.println(str3);

    }

}
