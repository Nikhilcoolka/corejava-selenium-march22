package org.matrix.sigma.prajakta;

public class StaticVariable {

    int empId1=1;
    String empName1="Prajakta";

    int empId2=2;
    String empName2="Deshpande";

    static String company="Cognizant";

    public void getData1(){
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(company);
    }

    public void getData2(){
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(company);
    }

    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable();
        obj.getData1();
        obj.getData2();
    }
}
