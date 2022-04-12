package org.matrix.lambda.komal.corejava.variables;

// instance variables are inside class but outside methods/constructor/blocks

public class InstanceVariable {
    static int i;                   // no need to initialize it'll take default values
    int b;                         // scope/accessible  - inside whole class

    // constructors are never static
    InstanceVariable() {
        System.out.println(i);      // we can use static and non static var in constructors
        System.out.println(b);
    }

    public void display() {         // non static method
                                   // can use static and non static var both here
        System.out.println(i);
        System.out.println(b);
    }

    public static void main(String[] args) {      //  static method
                                                 // can't use non static var and can use static only
        // System.out.println(b);               // non static var b can't use in static method --use obj creation
        System.out.println(i);                 // only static var we can access directly in static and non static method

        //object create
        InstanceVariable obj = new InstanceVariable(); // memory allocate at obj creations stored in heap
        System.out.println(obj.b);              // access non static var in static method by using object

        // using instance var from different class ... by using import tht class
        Employee emp= new Employee();         // create obj of imported class
        System.out.println(emp.empId);      // use var by using obj creation i.e emp.empId
        System.out.println(emp.empName);
    }
}
