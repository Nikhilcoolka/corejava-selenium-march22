package org.matrix.alpha.shamal.javaprograms;

public class Program3 {

    public static void main(String[] args) {

        String str = "Wellcome To Java Programming";
        System.out.println(str);
        int count = 1;
        for (int i = 0; i < (str.length() - 1); i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("No of words in a String: " + count);

    }
}

/*Initialize count with 1 as if there are no spaces in the string, then there will be one word in the String.
Check if you encounter any space.
Once you find the space, check it next character. If it is not space then we found a word in the String.Increment the count variable.
Once you reach end of String, count variable will hold number of words in the String.*/
