package org.matrix.sigma.sunanda.JavaPragrams;

public class ProgramNo06 {
    public static void main(String[] args) {
        // Replace the character 'O' with 't' from 2nd word i.e. World
        String input = "Hello World" ;
        String [] words =input.split(" ");
        String newword = words [1].replace("o","t");
        System.out.println(words[0]+""+newword);
        // It will replace all non digits from String
        String s1 ="helloThisIsA1234Sample";
        s1=s1.replaceAll("\\D","");
        System.out.println("Only number:"+s1);
        // It will replace all digits from String
        String s2 = "helloThisIsA1234Sample";
        s2=s2.replaceAll("\\d","");
        System.out.println("Only String:"+s2);
    }
}
