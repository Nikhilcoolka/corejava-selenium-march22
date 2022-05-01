package org.matrix.sigma.kadambari.javaprogram;

public class ThirdProgram {
    static int i;

    public static void main(String[] args) {
        String str="I m a girl";
        System.out.println(str);
        int count=1;
        for(int i =0; i<(str.length()-1);i++);{
            if(str.charAt(i) == ' ' && str.charAt(i+1) !=' '){
    count++;
            }
        }
        System.out.println("No of words in a String:" +count);
    }
}
