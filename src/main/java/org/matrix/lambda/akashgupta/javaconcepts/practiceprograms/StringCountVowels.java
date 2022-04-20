package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

import java.util.Locale;

public class StringCountVowels {
    int count;

    void usingSwitchCase(String s) {
        count = 0;
        char[] chars = s.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'a': //count++;
                case 'e': //count++;
                case 'i': //count++;
                case 'o': //count++;
                case 'u':
                    count++;
                    break;
                default:
                    break;

            }
        }
        System.out.println(count);
    }

    void usingORoperator(String s) {
        count = 0;
        String temp = s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'a' ||
                    temp.charAt(i) == 'i' ||
                    temp.charAt(i) == 'o' ||
                    temp.charAt(i) == 'u' ||
                    temp.charAt(i) == 'e') count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        String s = "Hello my name is ujwal";
        StringCountVowels o = new StringCountVowels();
        o.usingORoperator(s);
        o.usingSwitchCase(s);
    }
}
