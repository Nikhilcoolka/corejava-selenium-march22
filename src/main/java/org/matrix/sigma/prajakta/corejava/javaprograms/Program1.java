package org.matrix.sigma.prajakta.corejava.javaprograms;

public class Program1 {
    public static void main(String[] args) {

        String str="Prajakta";
        System.out.println("String::"+str);

        //using StringBuilder
        StringBuilder sb=new StringBuilder(str);
        System.out.println("----using StringBuilder---");
        System.out.println("Reverse string ::"+sb.reverse());

        //using StringBuffer
        StringBuffer st=new StringBuffer(str);
        System.out.println("----using StringBuffer---");
        System.out.println("Reverse string ::"+st.reverse());

        //using toCharArray method
        char [] a=str.toCharArray();
        System.out.println("----Reverse string using toCharArray---");
        for (int i=(str.length()-1); i>=0; i--){
            System.out.println(a[i]);
        }

        System.out.println("----toCharAt()----");
        //using charAt()
        for (int i=(str.length()-1); i>=0; i--){
            System.out.println(str.charAt(i));
        }

    }
}
