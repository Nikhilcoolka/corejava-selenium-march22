package org.matrix.sigma.ashish.Constructor;

public class TestConstructor1 {
    int EmpID;
    String EName;

    public TestConstructor1(int EmpId, String EName) {
        this.EmpID = EmpId;
        this.EName = EName;

        //System.out.println("Employee Id : " +EmpId);
        //System.out.println("Employee Name : "+EName);

    }

    public void getEmployee() {
        System.out.println("EmpId : " + EmpID);
        System.out.println("Employee Name : " + EName);
    }

    public static void main(String[] args) {
        TestConstructor1 obj = new TestConstructor1(10, "Ashish Thopate");
        obj.getEmployee();

        System.out.println("-----------------------------------------------");

        TestConstructor1 obj1 = new TestConstructor1(20, "Ajit Thopate");
        obj1.getEmployee();
    }


}
