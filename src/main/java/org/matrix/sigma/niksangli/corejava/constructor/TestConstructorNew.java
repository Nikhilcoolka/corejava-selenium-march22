package org.matrix.sigma.niksangli.corejava.constructor;


public class TestConstructorNew
{
    int empid=100;
    String empname="Shree";

    public TestConstructorNew(int eid,String ename)
    {
        this.empid=eid;
        this.empname=ename;
    }
    public void getEmployeeData()
    {
        System.out.println("The employee id"+empid);
        System.out.println("The employee name"+empname);

    }

    public TestConstructorNew()
    {

    }

    public static void main(String[] args)
    {
        TestConstructorNew tc2=new TestConstructorNew();
        tc2.getEmployeeData();


        System.out.println("**********************");

        TestConstructorNew tc=new TestConstructorNew(200,"Nikhil");
        tc.getEmployeeData();

        System.out.println("**********************");

        TestConstructorNew tc1=new TestConstructorNew(201,"Amit");
        tc1.getEmployeeData();






    }


}

