package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

public class StringCountTypeOfCharacters {

    public static void main(String[] args) {
        int upperCase = 0, lowerCase = 0, digit = 0, other = 0;
        String s = "My name is AKASH and email is akash12345@gmail.com";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else other++;
        }

        System.out.println("UpperCase letters are: " + upperCase);
        System.out.println("LowerCase letters are: " + lowerCase);
        System.out.println("Digit are: " + digit);
        System.out.println("Other are: " + other);
    }
}
