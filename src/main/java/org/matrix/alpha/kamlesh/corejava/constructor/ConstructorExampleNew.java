package org.matrix.alpha.kamlesh.constructor;

public class ConstructorExampleNew {
    int empId;
    String empName;

    public ConstructorExampleNew(int empId, String empName) {
        empId = empId;
        empName = empName;
        System.out.println("Value assigned to employee " + empId);
        System.out.println("Company assined to " + empName);
    }

    public static void main(String[] args) {

        ConstructorExampleNew con = new ConstructorExampleNew(10, "Zeta");
    }
}
