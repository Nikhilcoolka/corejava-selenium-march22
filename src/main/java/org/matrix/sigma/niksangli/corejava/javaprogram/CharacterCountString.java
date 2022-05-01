package org.matrix.sigma.niksangli.corejava.javaprogram;

public class CharacterCountString {
    public static void main(String[] args) {
        // logic string length- string length with replace function
        String s1 = "Java is java again java again".toLowerCase();
        System.out.println(s1 + " " + s1.length());  // 29

        String s2 = s1.replace("a", "");
        System.out.println(s2.length());  // 26

        int count = s1.length() - s2.length();
        System.out.println("Count of Char" + " " + count);

        System.out.println(" ********using loop and charAt function ***************");

        int charcount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='n') {
                charcount++;
            }

        }
        System.out.println(charcount);

        System.out.println(" ********using for each loop toCharArray()***************");
        int ct=0;
        for(char ch:s1.toCharArray())   //dt rfevar: string
        {
            if(ch=='n')
            {
                ct++;
            }
        }
        System.out.println(ct);



    }
}
