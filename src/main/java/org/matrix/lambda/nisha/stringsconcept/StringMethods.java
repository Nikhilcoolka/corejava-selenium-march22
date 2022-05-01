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

        String my = "Kajal";
        //01234 //
        System.out.println("Character at : " + my.charAt(3));       // a

        String name = "LAPTOP";
        System.out.println("Replace a single char = " + name.replace('P','n'));

        String box = "Deepakkumar";
        System.out.println("Replace all ==> " + box.replaceAll("Deepak","DEEPAK"));

        String baby = "Hello world";
        //012345678910
        System.out.println("Index of : " + baby.indexOf('l'));
        System.out.println("Lat index of : " + baby.lastIndexOf('o'));
        System.out.println("Some part of String == " + baby.substring(6,11));           // (11-1=10)

        System.out.println();


    }
}
