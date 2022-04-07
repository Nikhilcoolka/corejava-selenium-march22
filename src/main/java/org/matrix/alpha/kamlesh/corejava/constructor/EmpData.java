package org.matrix.alpha.kamlesh.constructor;

public class EmpData {
    String empName;
    int empId;
    double empPercent;

    public EmpData() {
      //  this.empName = empName;
      //  this.empId = empId;
      //  this.empPercent = empPercent;

        System.out.println("Emp name " + empName);  //This is also an parameterized example with deafult value
        System.out.println("empId " + empId);
        System.out.println("empPercent " + empPercent);
        System.out.println("-------------------");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        EmpData obj = new EmpData();
        EmpData obj1 = new EmpData();
        EmpData obj2 = new EmpData();
    }
}
