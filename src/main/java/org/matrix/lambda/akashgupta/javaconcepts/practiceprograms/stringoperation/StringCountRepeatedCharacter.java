package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms.stringoperation;

import java.util.HashMap;
import java.util.Locale;

public class StringCountRepeatedCharacter {
    public static void main(String[] args) {
        String s = "Akash Gupta @@@@@@@@".toLowerCase(Locale.ROOT);
        HashMap<Character, Integer> chMapCount = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (chMapCount.containsKey(c)) {
                chMapCount.put(c, chMapCount.get(c) + 1);
            } else {
                chMapCount.put(c, 1);
            }
            //System.out.println(chMapCount.keySet());
        }
        System.out.println(chMapCount);
    }
}
