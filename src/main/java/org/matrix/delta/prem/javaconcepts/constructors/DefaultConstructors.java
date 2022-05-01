package org.matrix.delta.prem.javaconcepts.constructors;

public class DefaultConstructors {

    //if there is no constructor in a class then compiler will create a default constructor automatically
     // at time of compilation
    //if user has created a constructor then compiler won't create a constructor
    //Default constructor assign default values to instance variables
    //if user want to assign values to instance variables then they must create a parameterized constructor

    int empId;
    String empName;

    DefaultConstructors(int empId, String empName){
        this.empId= empId;
        this.empName=empName;
        System.out.println(empId + empName);
    }

    public static void main(String[] args) {
        DefaultConstructors e1 = new DefaultConstructors(15,"prem");
        DefaultConstructors e2 = new DefaultConstructors(26,"shyam");
        DefaultConstructors e3 = new DefaultConstructors(24,"vishal");
    }
}
