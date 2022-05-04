package org.matrix.sigma.sunanda.JavaPragrams;

public class ProgramNo02 {
    public static void main(String[] args) {
        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */
        String str = new String("I am Learning Core Java");

        String[] strA = str.split(" ");

        for (int i = strA.length - 1; i >= 0; i--) {

            System.out.println(strA[i]);
        }
    }
}
