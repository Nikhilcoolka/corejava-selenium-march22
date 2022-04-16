package org.matrix.alpha.shamal.javaprograms;

public class Program2 {

    public static void main(String[] args) {
        String str = new String("I Am Shamal");

        String[] strA = str.split(" "); //split the string on the basis of white space

        //System.out.println(strA);

        for (int i = strA.length-1; i >= 0; i--) {

            System.out.println(strA[i]);
        }
    }


}
