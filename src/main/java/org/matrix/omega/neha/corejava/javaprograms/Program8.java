package org.matrix.omega.neha.corejava.javaprograms;

// Program to removs to white spaces from sentence.

public class Program8 {
    public static void main(String[] args) {
        //Using replaceAll method
        String str = "My name is Shriniwas";
        System.out.println("Original String is : " +str);

        String strWithoutspace = str.replaceAll("\\s", "");
        System.out.println("Using replaceAll method : " +strWithoutspace);

        //Without replaceAll method
        String str2 = "My name is Shriniwas";
        char ch[] = str2.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< ch.length; i++){
            if(ch[i] != ' ' && ch[i] != '\t'){
                sb.append(ch[i]);
            }
        }
        System.out.println("Without using replaceAll method: " +sb);
    }

}
