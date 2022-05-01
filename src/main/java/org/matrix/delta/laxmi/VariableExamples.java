package org.matrix.delta.laxmi;

public class VariableExamples {
    int rollNo = 11; //non-static instance variable
    String studentName = "Laxmi"; //non-static instance variable
    static String collegeName = "SIT";//static instance variable

    public void getData() {
        System.out.println("RollNo:" + rollNo + "\nStudent Name:" + studentName + "\nCollege Name:" + collegeName);
    }

    public static void main(String[] args) {
        int collegeCode = 968;    //local variable declaration
        System.out.println("This is main method");
        // System.out.println("Roll No:"+rollNo); // non-static instance variable can't access directly from class level


        VariableExamples obj = new VariableExamples();
        System.out.println(obj.rollNo);
        System.out.println(obj.studentName);
        System.out.println("College Name:" + collegeName); //static instance variable accessed from class level
        System.out.println("College Code:" + collegeCode); //local variable accessed here
        obj.getData(); //non-static class method accessed here using class object.

    }
}
