package org.matrix.sigma.kadambari.javaprogram;

public class FirstProgram {
    public static void main(String[] args) {
        String str = "Kadambari";
        //Using StringBulider
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        System.out.println("--------------------------");


        //Using StringBuffer*/
        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.reverse());
        System.out.println("-----------------------------");


        //Using toCharArray method
        char[] strChar = str.toCharArray();
        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.println(strChar[i]);
            System.out.println("------------------------------");


            //Using charAt() function
            for (int j = (str.length() - 1); j >= 0; j--) {
                System.out.println(str.charAt(j));


            }
        }
    }
}