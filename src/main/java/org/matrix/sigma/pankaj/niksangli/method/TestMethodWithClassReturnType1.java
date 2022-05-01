package org.matrix.sigma.niksangli.method;

import org.matrix.sigma.niksangli.Employee;

public class TestMethodWithClassReturnType1
{
    public Employee getData(Employee e1)
    {
        return e1;
    }

    public String getName(String str)
    {
        return str;
    }

    public static void main(String[] args)
    {
        TestMethodWithClassReturnType1 obj=new TestMethodWithClassReturnType1();
        Employee e4=new Employee();
        obj.getName("Nik");
        obj.getData(e4);
        System.out.println(e4.empid);
        System.out.println(e4.empname);
        System.out.println(Employee.company);

    }
}
