package org.matrix.lambda.nisha.constructors;

// Create a Main class
public class TestConstructorNew {

    // Create a class attribute
    int empId;                                              // empId = 1001
    String empName;                                         // empName = "Nishu"
    static String empCompanyName = "Google";

    // Create a class constructor for the Main class
    TestConstructorNew(int empId, String empName) {
        this.empId = empId;                                 // empId = 1001
        this.empName = empName;                             // empName = "Nishu"
        // Instance Variables = Local Variable
    }

    public void getEmployeeData() {
        System.out.println("Employee ID = " + empId);
        System.out.println("Employee Name = " + empName);
        System.out.println("Employee Company Name = " + empCompanyName);
    }

    public static void main(String[] args) {

        // Create an object of class TestConstructorNew (This will call the constructor)
        TestConstructorNew myobj = new TestConstructorNew(1001, "Nisha");
        myobj.getEmployeeData();
        System.out.println("--------------------------------------------");

        TestConstructorNew myobj1 = new TestConstructorNew(1002, "Nanu");
        myobj1.getEmployeeData();
    }
}
