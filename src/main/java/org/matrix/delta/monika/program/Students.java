package org.matrix.delta.monika.program;

import org.matrix.delta.monika.import1.CollagesStd;

public class Students {
    int empid = 100;
    String str = "Monika";
    static String companyName = "XYZ";

    public void getInfo1() {
        System.out.println(empid);
        System.out.println(str);
        System.out.println(companyName);
        System.out.println(CollagesStd.companyName1);
    }

    public static void main(String[] args) {
        Students emp = new Students();
        emp.getInfo1();
    }
}
