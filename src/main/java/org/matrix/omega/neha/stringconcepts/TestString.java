package org.matrix.omega.neha.stringconcepts;

public class TestString {

    public static void main(String[] args) {
        String str1 = "Madhushri";  // This is string literal
        String str2 = new String("Madhushri");  //using object creation.

        String str3 = "Madhu";
        str3 = str3.concat("shri");
        System.out.println(str3);

        StringBuffer sb = new StringBuffer("Madhu");
        sb.append("shri");
        System.out.println(sb);
    }
}
