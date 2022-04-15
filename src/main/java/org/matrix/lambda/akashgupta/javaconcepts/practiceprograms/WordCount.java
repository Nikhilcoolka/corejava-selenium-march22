package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

public class WordCount {

    static int count;

    public void usingStringArray(String s) {   // s :: "   d  bg Hello my name is akash\n   dd "
        count = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            //System.out.println(word + "......." + word.length());
            //if(word.charAt(0)!=0)   //error index out of bound i.e word[0].length()==0 because of split!
            if (word.length() != 0)
                count += 1;
        }
        System.out.println(count);
    }

    public void usingStringMethods1(String s) {
        int c = 0;
        count = 0;
        for (int i = 0; i < (s.length() - 1); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i + 1; j <= s.length() - 1; j++) {
                    if (s.charAt(j) != ' ') {
                        i = j - 1;
                        break;
                    }

                }
            } else if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
                c += 1;
        }
        count = c;
        System.out.println(count);
    }

    public void usingStringMethod2(String s) {   //better use to count char/string recursion
        count = 1;
        int lastIndex = s.lastIndexOf(' ');
        int index = 0;
        while (index != lastIndex + 1) {
            index = s.indexOf(' ', index);
            index += 1;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "   d  bg Hello my name is akash\n   dd ";
        WordCount ref = new WordCount();   // Class (reference) = new_keyword (object)
        ref.usingStringArray(str);
        //  ref.usingStringMethod2(str);
        ref.usingStringMethods1(str);
    }
}
