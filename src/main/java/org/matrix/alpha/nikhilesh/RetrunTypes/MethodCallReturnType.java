package org.matrix.alpha.nikhilesh.RetrunTypes;
// This is Simple Program of Return-Type

public class MethodCallReturnType {
    public NewEmployee EmpData(){
        NewEmployee em=new NewEmployee(); // obj creation of other class on this class to intialized the return valve
        return em; // Return the Employee Class Variable ie name,id,companyname
    }

    public static void main(String[] args) {
        MethodCallReturnType obj=new MethodCallReturnType();
        NewEmployee abc=obj.EmpData();  // Other Class obj Creation and Memory Allocate By using abc Obj its  Class
        System.out.println(abc.empName); // Return Valve Print
        System.out.println(abc.empId);
        System.out.println(abc.comName);
    }
}
