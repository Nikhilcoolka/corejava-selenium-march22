package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms.stringoperation;

public class StringRemoveWhiteSpace {
    static void usingReplaceAll(String s) {
        System.out.println(s.replaceAll("\\s", ""));
    }

    static void withoutReplaceAll(String s) {
        char[] c = s.toCharArray();
        StringBuffer result = new StringBuffer();
        for (char value : c) {
            if (value != ' ' && value != '\t') {
                result.append(value);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String input = "My  name    is akash";
        usingReplaceAll(input);
        withoutReplaceAll(input);
    }
}
