package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Employee;

public class MethodWithClassReturn {
    static Employee obj1 =getEmpData();

    public static Employee getEmpData(){
        return new Employee();                // used to return initialization of class
    }

    public static void testScope(){
        obj1.setData(3,"class s-obj in testScope");
        Employee obj = getEmpData();
        obj.getData();
    }
    public static void changeStaticVariable(){
        Employee.company = "MicroSoft";
    }

    public static void main(String[] args) {
       Employee obj = getEmpData();
       obj.getData();
       obj.setData(24,"local object");
       changeStaticVariable();           // comment out to check scope of static variable.
       obj.getData();
       testScope();
       obj1.getData();
       obj1.setData(2,"class s-obj in main");
       obj1.getData();
    }

}

/*
1
Akash
eInfochip    >>>> main local obj with default
24
local object     >>>> main local obj with updated data by setData();
Microsoft       >>>>> changed a static variable by Emplopyee.company
1
Akash           >>>>> method local obj with default
Microsoft        >>>>> default changed due to static variable of that class(withing this program only)
note : each object stores its instance data separately so static-variable is shared.
iq: why use static? ---> ease of data sharing & scope throughout program execution life .
*/