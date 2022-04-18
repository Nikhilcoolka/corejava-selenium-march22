package org.matrix.delta.monika.program;

public class ConstructorWithParameter {
    int empId;
    String empName;
    public ConstructorWithParameter(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public void getData(){
        System.out.println("empId "+empId);
        System.out.println("empName "+empName);
    }

    public static void main(String[] args) {
        ConstructorWithParameter obj1 = new ConstructorWithParameter(10, "Monika");
        obj1.getData();
        System.out.println("---------");
        ConstructorWithParameter obj2 = new ConstructorWithParameter(20, "Mona");
        obj2.getData();
    }

    }

