package org.matrix.alpha.shamal.java.method;

public class Student {
    int rollNo = 21; int prnNo = 102310;
    String divName = "BE-COMP"; String stdName = "Shamal-Jadhav"; String bldGroup = "O+ve";
    int contact = 123654;
    String email = "abc@gmail.com";
    static String clgName = "SVCET" ;

    public void getData(){
        System.out.println("Student Roll No Is:" +rollNo);
        System.out.println("Student Name is :" +stdName);
        System.out.println("Student Division is" +divName);
        System.out.println("Student College Name Is :" +clgName);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.getData();
        String str = Student.clgName;  // Its the static variable
        System.out.println(str);
    }

    public void m1(){
        System.out.println("This is the Student class :: m1 method");
    }
}
