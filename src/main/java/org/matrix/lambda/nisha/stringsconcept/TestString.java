package org.matrix.lambda.nisha.stringsconcept;

import java.lang.String;

public class TestString {

    public static void main(String[] args) {

        String str1 = "Nisha";                          // 1.String Literal(SCP = String Constant Pool)
        String str2 = new String("Nisha");      //  2.Object Creation
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "Deepak" ;
        str3 =str3.concat("Kumar");
        System.out.println(str3);

        System.out.println("----------------------------");

        String emp1 = "Microsoft";
        String emp2 = "Microsoft";
        String emp3 = "Microsoft";
        emp3 = emp3.concat("IBM");


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp3);

    }
}

//String is a final class that means we cannot inherit the class.
