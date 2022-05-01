package org.matrix.delta.ganesh.Strings;

public class ReverseString {

    public static void main(String[] args) {


    String str = new String("My name is Ganesh");

    String[] strA = str.split(" ");

        for (int i = strA.length-1; i >= 0; i--) {

//        System.out.print(strA[i]);
//            System.out.print(" ");
    }

        String str1 = "I am a boy";
        System.out.println(str1);
        int count = 1;
        for (int i = 0; i <= (str1.length() - 1); i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("No of words in a String: " + count);


    }


}
