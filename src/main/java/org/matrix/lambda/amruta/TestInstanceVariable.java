package org.matrix.lambda.amruta;

public class TestInstanceVariable {

    public String name;
    private double salary;
    public TestInstanceVariable(String empName){
        name=empName;
    }
    public  void setsalary(double empSalary){
        salary=empSalary;
    }
    public void printemp(){
        System.out.printf("name:" +name);
        System.out.printf("salary" +salary);
    }

    public static void main(String[] args) {
        TestInstanceVariable obj=new TestInstanceVariable("Amruta");
        obj.setsalary(2000);
        obj.printemp();
    }
}
