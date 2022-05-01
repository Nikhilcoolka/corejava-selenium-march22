package org.matrix.alpha.nikhilesh.Methods;

public class ClassCallingMethod_2 {
    Emplyee emp; // main Obj Created ie emp
    public void empCompany(){
        emp=new Emplyee(); // Other Class Calling Using Object Emp in Non-Static Program
        emp.show();

    }
    public void empCompany2(){
        emp.show(); // Without Create Obj In This Method We Use Obj For Main Class  ie:emp

    }
    public static void main(String[] args) {
        ClassCallingMethod cl=new ClassCallingMethod();
        cl.empCompany();
    }
}
