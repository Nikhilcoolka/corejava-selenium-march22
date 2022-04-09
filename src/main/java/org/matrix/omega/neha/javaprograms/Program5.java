package org.matrix.omega.neha.javaprograms;

//Program for Character, String, Digits replace and convert String to int and vice versa.
public class Program5 {

    public static void main(String[] args) {

        //Replace the character 'o' with 't' from 2nd word i.e. 'World
        String input = "Hello World";
        String[] words = input.split(" ");
        String newWord = words[1].replace("o" , "t");

        //It replace all non-digits from String
        String s1 = "helloThisIs1234Sample";
        s1 = s1.replaceAll("\\D"," ");
        System.out.println("Only Numbers: "+s1);

       //It will replace all digits from string.
        String str = "HelloThisIs1234Sample";
        str = str.replaceAll("\\d", " ");
        System.out.println("Only characters: "+str);

        //Convert int into String
        int i = 100;
        String s2 = Integer.toString(i);
        System.out.println(s2);

        //Convert String to int.
        String s3="100";
        int i1 = Integer.parseInt(s3);
        System.out.println(i1);

        //Convert Int to String using valueOf.
        int i2 =1000;
        String str4 = String.valueOf(i2);
        System.out.println(str4);

    }
}
