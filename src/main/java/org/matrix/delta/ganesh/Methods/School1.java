package org.matrix.delta.ganesh.Methods;

public class School1 {

    public Student1 getStudentData(Student1 student1) {
        return student1;

    }

    public static void main(String[] args) {
        School1 school1 = new School1();
        Student1 stu1 = new Student1();
        school1.getStudentData(stu1);

        System.out.println(stu1.stuId);
        System.out.println(stu1.stuName);
        System.out.println(Student1.school);

        stu1.getStudent();


    }
}
