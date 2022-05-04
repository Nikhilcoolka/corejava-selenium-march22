package org.matrix.alpha.kamlesh.corejava.programs;

/*
Program for Character, String, Digits replace and convert String to in and vice versa
 */
public class Program5 {

    public static void main(String[] args) {
        // Replace the character 'B' with 'C' from 1st word i.e Battle
        String str = "Battle Field";
        str = str.replace("B", "C");
        System.out.println(str);

        String str2 = "Kenovo";
        str2 = str2.replaceFirst("o", "l");         //replacefirst
        System.out.println(str2);

        String str3="I am using haptop";
        str3=str3.replace("using", "preferring");
        System.out.println(str3);

        // It will replace all non digits from String
        String s1 = "helloThisIsA1234Sample";
        s1 = s1.replaceAll("\\D","");
        System.out.println("Only Number : "+s1);

        // It will replace all non digits from String
        String s2="Testingthetask568742";
        s2=s2.replaceAll("\\d","");
        System.out.println("Only string :" +s2);


        String ktr="I am 24 year old";
        ktr=ktr.replaceAll("I(.)", "Hi");
        System.out.println(ktr);

        // Convert int to String
            int i=5000;
            String s3=Integer.toString(i);
            System.out.println(s3);

        // Convert String to int
        String s4="500";
        int i4=Integer.parseInt(s4);
        System.out.println(i4);

        // Convert int to String using valueOf
            int k= 5000;
            String s5=String.valueOf(k);
            System.out.println(s5);
    }


}