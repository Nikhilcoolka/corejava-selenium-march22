package org.matrix.lambda.komal.corejava.constructors;

// constructors are never static coz access static we need class name.constructor but both are same so error
// but constructors can be public private protected
// if we do not write constructor in class then compiler will provide by default constructor
// then jvm will assign default values to data types variables in class

public class ConstructorsConcepts1 {
    int empId;
    String empName;

    //ConstructorsConcepts1(int i ,String str)          // constructor used for initialising instance var in constructor

    ConstructorsConcepts1(int empId, String empName) {     // use same name as instance var in parameters in constructor
        this.empId = empId;
        this.empName = empName;  // this refers to instance var for assigning values

    }

    public void getData() {
        System.out.println("EmpId:" + empId);  // can use this here also
        System.out.println("EmpName:" + empName);
    }

    public static void main(String[] args) {
        ConstructorsConcepts1 obj = new ConstructorsConcepts1(10, "rohan");// assigning value at obj creation
        ConstructorsConcepts1 obj1 = new ConstructorsConcepts1(20, "ram");
        // constructors are called first, so we access or use values in method

        obj.getData();
        obj1.getData();
    }
}
