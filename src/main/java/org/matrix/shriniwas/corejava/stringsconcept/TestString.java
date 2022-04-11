package org.matrix.shriniwas.corejava.stringsconcept;

public class TestString {

    public static void main(String[] args) {
        String str1 = new String("Shriniwas"); // 2. By using Object creation - Heap Memory
        String str2 = "Shri"; // 1. String literal (SCP - String Constant Pool Memory)

        String str3 = "Shriniwas";
        String str4 = "Shriniwas";
        String str5 = new String("Shriniwas");

        System.out.println("--------------------------");

        String str6 = "Ganesh";
        str6 = str6.concat("Shri"); // String is immutable
        System.out.println(str6);

        System.out.println("--------------------------");
        StringBuffer st = new StringBuffer("Shri");
        st.append("niwas"); // StringBuffer is mutable

        System.out.println(st);

//        String emp1 = "Microsoft";
//        String emp2 = "Microsoft";
//        String emp3 = "Microsoft";
//        emp3 = emp3.concat("Microsoft IBM");
    }
}
