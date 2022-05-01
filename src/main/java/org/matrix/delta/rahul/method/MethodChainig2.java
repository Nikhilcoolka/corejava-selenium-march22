package org.matrix.delta.rahul.method;

public class MethodChainig2 extends MethodChaining {
    int empId=45;
    static String companyName="Google";
    public void employeeDetails() {
        super.bothDetails();                        // super is used for calling the parent class method and varibles
        System.out.println(empId+" "+companyName);
    }
    public static void main(String[] args) {
        MethodChainig2 obj=new MethodChainig2();
        obj.employeeDetails();

    }
}
/*
* << super keyword is used to call parent class data members and method
* << this keyword is used for calling the current class method and data member
* */