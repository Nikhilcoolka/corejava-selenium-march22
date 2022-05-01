package org.matrix.delta.rahul.variable;

public class LocalVariable2 {

    public void showStudentDetails()
    {
        int rollNumber=100;
        String studName="Rahul";
        //local variable must be initianlize
        System.out.println(rollNumber);
        System.out.println(studName);
    }

    public static void main(String[] args) {
        LocalVariable2 obj=new LocalVariable2();
        obj.showStudentDetails();
    }
}
