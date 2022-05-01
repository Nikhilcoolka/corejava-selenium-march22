package org.matrix.alpha.nikhilesh.Methods;

public class ClassCallingMethod {
    public void empCompany(){
        Emplyee emp=new Emplyee(); // Other Class Calling Using Object Emp in Non-Static Program
        emp.show();

    }
    public void empCompany2(){
        empCompany(); // Method Calling In Other Method

    }
    public static void main(String[] args) {
        ClassCallingMethod cl=new ClassCallingMethod();
        cl.empCompany();
    }
}
