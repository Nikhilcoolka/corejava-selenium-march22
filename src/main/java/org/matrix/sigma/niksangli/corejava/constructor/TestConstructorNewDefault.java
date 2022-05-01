package org.matrix.sigma.niksangli.corejava.constructor;

public class TestConstructorNewDefault {

    int empid;
    String empname;

    TestConstructorNewDefault(int e1,String e2)
    {
        this.empid=e1;
        this.empname=e2;
    }

    public static void main(String[] args) {
        TestConstructorNewDefault Td1=new TestConstructorNewDefault(12,"Nikhil");
        TestConstructorNewDefault Td2=new TestConstructorNewDefault(13,"Amit");

    }

}
