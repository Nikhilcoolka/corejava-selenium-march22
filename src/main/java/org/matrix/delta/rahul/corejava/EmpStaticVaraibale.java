package org.matrix.delta.rahul.corejava;

public class EmpStaticVaraibale {
    int age1;
    String name1 = "Rahul";
    static String compnay = "WNS";
    int age2 = 25;
    String name2 = "Suresh";

    public void getData1() {
        // static int rollNumber; we can not create static varibale in method
        System.out.println(age1);
        System.out.println(name1);
        System.out.println(EmpStaticVaraibale.compnay);// we can access without class name
        System.out.println(Employee.compay);
    }


    public void getData2() {
        System.out.println(age2);
        System.out.println(name2);
        System.out.println(compnay);
    }

    public static void main(String[] args) {

        EmpStaticVaraibale e = new EmpStaticVaraibale();
        e.getData1();
        System.out.println("----------------------------");
        e.getData2();

        // System.out.println(age);

    }

}
