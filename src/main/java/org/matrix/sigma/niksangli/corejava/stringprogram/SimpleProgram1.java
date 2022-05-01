package org.matrix.sigma.niksangli.corejava.stringprogram;

public class SimpleProgram1 {
    public static void main(String[] args) {
        String str1 = new String("Nikhil"); // 2. By using Object creation - Heap Memory
        String str2 = "Nik"; // 1. String literal (SCP - String Constant Pool Memory)

        String str3 = "Nikhil";
        String str4 = "Nik";
        String str5 = new String("Nikhil");

        System.out.println("--------------------------");

        String str6 = "Nikhil";

        str6 = str6.concat("Coolkarni");
        System.out.println(str6);

        System.out.println("--------------------------");

        StringBuffer s1 = new StringBuffer("niwas");
        s1.append("shah");
        System.out.println(s1);

        String emp1 = "Microsoft";
        String emp2 = "Microsoft";
        String emp3 = "Microsoft";
        emp3 = emp3.concat("Microsoft IBM");

        System.out.println(emp3);
    }


}

