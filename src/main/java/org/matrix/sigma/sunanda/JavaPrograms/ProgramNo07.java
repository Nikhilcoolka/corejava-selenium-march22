package org.matrix.sigma.sunanda.JavaPrograms;

public class ProgramNo07 {
    public static void main(String[] args){
        String str = "My name is Sunanda";
        String[] words = str.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (String word : words) {

            StringBuilder reverseWord = new StringBuilder();
            for (int j = (word.length() - 1); j >= 0; j--) {
                reverseWord.append(word.charAt(j));
            }

            reverseString.append(reverseWord).append(" ");
        }
        System.out.println("Input : " + str);
        System.out.println("Output : " + reverseString);

    }
}
