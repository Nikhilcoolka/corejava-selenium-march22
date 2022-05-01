package org.matrix.delta.ganesh.Methods;

import org.matrix.delta.ganesh.PackageConcept.ProtectedClass;

public class School extends ProtectedClass {

    public static Student getStudentData() {
        return new Student();

    }

    public static void main(String[] args) {
        Student student = getStudentData();
        System.out.println(student.stuId);
        System.out.println(student.stuName);
        System.out.println(Student.school);
        student.getStudent();

        School school = new School();
//        school.publicMethod();
        school.protectedMethod();
    }
}
