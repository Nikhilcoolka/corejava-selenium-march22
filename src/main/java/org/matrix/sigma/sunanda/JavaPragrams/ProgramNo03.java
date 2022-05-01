package org.matrix.sigma.sunanda.JavaPragrams;

public class ProgramNo03 {
    public static void main(String[] args) {
        String str = "My Name Is Sunanda Mathapati";
        System.out.println(str);
        int count = 0;
        for (int i = 0; i < (str.length() - 1); i++)   //Counts all the spaces present in the string
        {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("No of words in a String: " + count);
    }
}

