package org.matrix.lambda.komal.corejava.variables;

// Static var are inside class outside method like instance var
// bounded with class and memmory allocate at compilation i.e. generation of .class file

public class StaticVariable {
    int empId1 = 1;
    String empName1="komal";
    static String empComapany="tcs"; //same comapany name so make it static for memory management

    int empId2 = 2;
    String empName2="ram";

    public  void getData1() {
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(empComapany);
        System.out.println(Employee.empCompany);   // used from another class
    }
    public  void getData2() {
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(StaticVariable.empComapany);   //static var can call like classname.static var name
        //System.out.println(empComapany);    // can access directly by name in non static and static method
    }
    public static void main(String[] args) {
        //static int i = 10;                 // static variable not allowed in methods only in class
        StaticVariable emp1=new StaticVariable();
        emp1.getData1();
        System.out.println("..................");
        System.out.println(empComapany);     // can use directly in main method also
        System.out.println("..................");
        StaticVariable emp2=new StaticVariable();
        emp2.getData2();

    }
}
