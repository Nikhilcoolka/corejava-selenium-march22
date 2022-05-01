package org.matrix.sigma.ashish.Method;


public class ReturnTypeClass {
    public static Employee getEmployeedata() {
        Employee emp = new Employee();
        return emp;
    }

    public Employee getEmployee(Employee ee1) {

        return ee1;
    }

    public String getName(String str) {
        return str;

    }

    public String getData() {
        return getName("Amit");
    }

    public static void main(String[] args) {
        Employee ee = getEmployeedata();//calling class veriables
        System.out.println(ee.empid);
        System.out.println(ee.empname);

        ee.getData();

        ReturnTypeClass obj = new ReturnTypeClass();
        Employee ee1 = new Employee();
        obj.getEmployee(ee1);

        String str1 = obj.getName("Ashish Thopate");
        System.out.println(str1);

        String str2 = obj.getData();
        System.out.println("new name:-" + str2);
    }
}