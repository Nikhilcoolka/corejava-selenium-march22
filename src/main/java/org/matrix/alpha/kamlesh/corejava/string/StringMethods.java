package org.matrix.alpha.kamlesh.string;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Kamal";
        String str2 ="                                                                    Kamal1";


        System.out.println("Uppercase method " +str.toUpperCase());
        System.out.println("Lowercase method " +str.toLowerCase());
        System.out.println("Trim method " +str2.trim());
        System.out.println(str==str2);
        System.out.println("Length method " +str.length());
        System.out.println("Char at " +str.charAt(4));
        System.out.println("Replace " +str.replace('a','b'));
        System.out.println("Replace All " +str.replaceAll("Kamal","KAMAL"));
        System.out.println("Index Of : " + str.indexOf('a'));
        System.out.println("Index of : " +str.indexOf('l'));
        System.out.println("Index of : " +str.lastIndexOf('m'));
        System.out.println("Substring " +str.substring(0,1));

    }
}





