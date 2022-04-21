package org.matrix.alpha.kamlesh.corejava.string;
//Program to reverse Strings in sentence

public class ReverseString {

    public static void main(String[] args) {
        String[] str = "Food loves kamal".split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
            System.out.print(" ");
        }
        System.out.println();
        String[] str1 = "coding in man perect makes practicing ".split(" ");
        for (int k = str1.length - 1; k >= 0; k--) {
            System.out.print(str1[k]);
            System.out.print(" ");
        }
    }
}