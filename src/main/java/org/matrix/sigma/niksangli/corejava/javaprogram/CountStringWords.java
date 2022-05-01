package org.matrix.sigma.niksangli.corejava.javaprogram;

public class CountStringWords {
    public static void main(String[] args) {
        String s1 = "I am from sangli";   /// use char at function
        System.out.println(s1);
        System.out.println(s1.length());
        int count=1;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count);


    }
}
