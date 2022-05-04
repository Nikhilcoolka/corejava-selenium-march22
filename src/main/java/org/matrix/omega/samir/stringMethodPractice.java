package org.matrix.omega.samir;

public class stringMethodPractice {
    public static void main(String[] args) {
        System.out.println("welcome");
        String name="Samir";
        String sirname="shaikh";
        System.out.println("Concat : "+ name.concat("Shaikh"));
        System.out.println("Lower Case : " +name.toLowerCase());
        System.out.println("Upper Case :" + name.toUpperCase());
        System.out.println("Lenght " + name.length());
        //System.out.println("equals :  "+name.equals(sirname));
       // System.out.println(name.equalsIgnoreCase(sirname));
        System.out.println("Char At :" +name.charAt(0));
        char[] s = name.toCharArray();
        for (char str:s) {
            System.out.print(str+" ");
        }
    }
}
