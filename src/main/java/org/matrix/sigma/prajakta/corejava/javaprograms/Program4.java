package org.matrix.sigma.prajakta.corejava.javaprograms;

public class Program4 {

    public static void main(String[] args) {

        //String SCP (String Constant Pool) immutable
        String str="Praju";
        str.concat("Deshpande");
        System.out.println("Concate string :"+str);

        //String Object class Immutable
        String str1=new String("Micro");
        str1.concat("Soft");
        System.out.println("String Object :"+str1);

        //StringBuffer class Mutable
        StringBuffer sf=new StringBuffer("Praju");
        System.out.println("Append string ::"+sf.append("Deshpande"));

        //StringBuilder class Mutable
        StringBuilder sb=new StringBuilder("Micro");
        System.out.println("Append String ::"+sb.append("Soft"));
    }

}
