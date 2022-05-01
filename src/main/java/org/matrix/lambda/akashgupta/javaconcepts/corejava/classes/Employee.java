package org.matrix.lambda.akashgupta.javaconcepts.corejava.classes;

public class Employee {
    public int empId = 1;
    public String empName = "Akash";
    public static String company = "eInfochip";

    public void getData() {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(company);
    }

    public void setData(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public static Employee createEmpObject(){
        return new Employee();
    }
    public void chainConcept(){
        System.out.println("This method is in class Employee ");
    }
}
