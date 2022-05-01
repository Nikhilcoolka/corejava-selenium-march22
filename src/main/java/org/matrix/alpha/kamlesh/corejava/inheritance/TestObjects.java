package org.matrix.alpha.kamlesh.inheritance;

public class TestObjects {

    public static void main(String[] args) {
        String str1 = "ABC1";
        String str2 = "ABC2";
        String str3 = "ABC3";
        String str4 = "ABC1";
        String str5 = new String("ABC1");
        String str6 = new String("AB1");

        System.out.println("Equals to Object method testing ");
        System.out.println(str1.equals(str2));      //These is an example of equals object
        System.out.println(str2.equals(str3));
        System.out.println(str4.equals(str1));
        System.out.println(str1==str4);
        System.out.println(str1==str2);
        System.out.println(str5.equals(str6));

        StringBuffer a = new StringBuffer("aaa");
        StringBuffer b = new StringBuffer("aaa");

        System.out.println(a.equals(b));

        StringBuffer c = b;
        System.out.println(c.equals(b));

    }

}
