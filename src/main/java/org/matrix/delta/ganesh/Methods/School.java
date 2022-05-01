package org.matrix.delta.ganesh.Methods;

public class School {

    public static Student getStudentData() {
        return new Student();

    }

    public static void main(String[] args) {
        Student student = getStudentData();
        System.out.println(student.stuId);
        System.out.println(student.stuName);
        System.out.println(Student.school);
        student.getStudent();

    }
}
