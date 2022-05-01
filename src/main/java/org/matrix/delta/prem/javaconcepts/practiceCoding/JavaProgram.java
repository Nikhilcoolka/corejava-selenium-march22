package org.matrix.delta.prem.javaconcepts.practiceCoding;

public class JavaProgram {
    int schoolId=26142;
    String schoolName="S.T Pius";
    String stuName="prem";
    int classNum =12;
    String section="B";
    int rollNo=18;


    public void getData(){
        System.out.println("School Id = " + schoolId);
        System.out.println("School Name = "+ schoolName);
        System.out.println("Student Name = "+ stuName);
        System.out.println("Class"+classNum);
        System.out.println("Section"+section);
        System.out.println("RollNo."+rollNo);
    }

    public static void main(String[] args) {
        JavaProgram obj = new JavaProgram();
        obj.getData();
    }



}
