package org.matrix.lambda.nisha.stringsconcept;


public class StringMethods {

    //Java counts positions from zero.
    //0 is the first position in a string, 1 is the second, 2 is the third ...

    public static void main(String[] args) {

        String object = "Mobile";
        System.out.println("Length of String = " + object.length());
        System.out.println(args.length);

        String myFavColor = "YELLOW";
        System.out.println("To Lower Case => " + myFavColor.toLowerCase());

        String mobileCompany = "Readme note 10s";
        System.out.println("To Upper Case - " + mobileCompany.toUpperCase());

        String abc = "      Welcome      ";
        System.out.println("Trim the variable: " + abc.trim());

        String emp1 = "Corejava";
        String emp2 = "Corejava";
        System.out.println("Equals = " + emp1.equals(emp2));

        String xyz = "NISHA";
        String xyz1 = "nisha";
        System.out.println("Equals Ignore Case == " + xyz.equalsIgnoreCase(xyz1));



    }
}
