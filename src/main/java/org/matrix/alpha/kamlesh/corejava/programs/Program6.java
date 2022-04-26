package org.matrix.alpha.kamlesh.corejava.programs;
/*
Note: Two strings are called anagrams if they contain the same set of characters but in different order.
 */

import java.sql.Array;
import java.util.Arrays;

public class Program6 {

    public static void main(String[] args) {

       /* String str1="Race";
        String str2="Cake";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //check if length is same
        if (str1.length()==str2.length()){

            //now covert string to char array
                char[] Chararray1=str1.toCharArray();
                char[] Chararray2=str2.toCharArray();

                //sort the char array
            Arrays.sort(Chararray1);
            Arrays.sort(Chararray2);


            //if sorted arrays are same then string are anagrams
            boolean result=Arrays.equals(Chararray1,Chararray2);

            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams ");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagrams ");
            }
        }


        */
        //Step 1 declared the string
        String ktr1="Ganesh";
        String ktr2="Nagesh";

        //Step 2 string converted is lowercase
        ktr1=ktr1.toLowerCase();
        ktr2=ktr2.toLowerCase();

        //Step 3

        if(ktr1.length()==ktr2.length()){

           char[] Chararray3=ktr1.toCharArray();
           char[] Chararray4=ktr2.toCharArray();

           Arrays.sort(Chararray3);
           Arrays.sort(Chararray4);

           boolean status=Arrays.equals(Chararray3,Chararray4);
           if (status){
               System.out.println(ktr1 + " " + ktr2 + " ");
           }
           else {
               System.out.println(ktr1 + "" + ktr2);
           }
        }


















/*
        String str1 = "Ganesh".replaceAll("\\s", "");
        String str2 = "Nagesh".replaceAll("\\s", "");
        boolean flag = true;

        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            flag = Arrays.equals(ch1, ch2);
        }
        if (flag == true) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }*/
    }
}

