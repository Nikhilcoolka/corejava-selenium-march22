package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms.stringoperation;

public class StringReplace {
    public static void main(String[] args) {
        // replace Character from string
        String ref = "Hello123World";
        System.out.println(ref.replace("l", "*"));
        System.out.println(ref.replaceAll("\\D", ""));
        System.out.println(ref.replaceAll("\\d", ""));

        //convert basic data type to string
        int i = 100;
        double d = 10.01;
        Boolean b = true;
        String s1 = Integer.toString(i);
        System.out.println(s1);
        System.out.println(Integer.parseInt(s1));
        s1 = Double.toString(d);
        System.out.println(s1);
        //using String.valueOf();
        s1 = String.valueOf(b);
        System.out.println(s1);

    }
}
