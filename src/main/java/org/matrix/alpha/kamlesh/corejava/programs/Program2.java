package org.matrix.alpha.kamlesh.corejava.programs;

//Program to reverse Strings in sentence
public class Program2 {


    public static void main(String[] args) {
        String[] p1 = "Kamal loves food".split(" ");
        for (int i = p1.length - 1; i >= 0; i--) {
            System.out.print(p1[i]);
            System.out.print(" ");
        }
        System.out.println();
        String[] p2 = "coding in man perect makes practicing".split(" ");
        for (int k = p2.length - 1; k >= 0; k--) {
            System.out.print(p2[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("---------------------");
    }
}