package org.matrix.lambda.nisha.constructors;

public class TestConstructorNewDefault {
    int empId;                                              // empId = 1001
    String empName;                                         // empName = "Nishu"
    static String empCompanyName = "Google";

    TestConstructorNewDefault(int empId, String empName) {
        this.empId = empId;                                 // empId = 1001
        this.empName = empName;                             // empName = "Nishu"
    }

    public static void main(String[] args) {
        TestConstructorNew ref = new TestConstructorNew(1234, "Python");
        TestConstructorNew ref1 = new TestConstructorNew(123, "Java");
        System.out.println(TestConstructorNew.empCompanyName);
    }
}
