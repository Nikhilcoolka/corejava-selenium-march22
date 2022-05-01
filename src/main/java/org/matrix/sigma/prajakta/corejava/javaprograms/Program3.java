package org.matrix.sigma.prajakta.corejava.javaprograms;

public class Program3 {

    public static void main(String[] args) {

        // to count words in sentences
        String str = "Prajakta Ashok Deshpande";
        int count = 1;

        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Total number of words ::" + count);
    }
}
