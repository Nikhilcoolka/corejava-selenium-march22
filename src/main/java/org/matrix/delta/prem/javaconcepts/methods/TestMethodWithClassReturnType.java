package org.matrix.delta.prem.javaconcepts.methods;

public class TestMethodWithClassReturnType {

    public static StudentData getStudentData(){
        StudentData obj = new StudentData();
        obj.getData();
        return obj;
    }

    public static void main(String[] args) {
        StudentData stu = getStudentData();
        stu.getData();
    }
}
