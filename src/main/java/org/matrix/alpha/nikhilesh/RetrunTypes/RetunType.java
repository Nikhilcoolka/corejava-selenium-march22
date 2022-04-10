package org.matrix.alpha.nikhilesh.RetrunTypes;

public class RetunType {

    public NewEmployee getData(){
        NewEmployee nm=new NewEmployee();  // Return type Creation
        return nm;
    }
    public NewEmployee setData(){
        return new NewEmployee();   //  Shortcut keyword
    }
    public static void main(String[] args) {
        RetunType rn=new RetunType();
        NewEmployee emp=rn.getData();
        System.out.println(emp.empName);
        System.out.println(emp.empId);
        NewEmployee emp2=rn.setData();
    }
}
