package org.matrix.sigma.Shamshad;

public class TestEmployeeStaticVariable {
    int empId1 =100;
    String empName1="shama";
    String empCompany1="ABC";

    int empId2 =100;
    String empName2="shama";
    String empCompany2="ABC";
    public void getData1(){
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(empCompany1);
    }
        public void getData2(){
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(empCompany2);

    }
    public static void main(String[]args){
        TestEmployeeStaticVariable emp1=new TestEmployeeStaticVariable();
        emp1.getData1();
   TestEmployeeStaticVariable emp2= new TestEmployeeStaticVariable();
   emp2.getData2();
    }
}
