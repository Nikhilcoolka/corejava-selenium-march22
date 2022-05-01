package org.matrix.delta.ganesh;

public class MethodsAccess {

    public static void college() {
        String empName = "Raj";
        int empID = 101;
        System.out.println("Methods Access: " + empName);
        System.out.println("Methods Access: " + empID);

    }

    public void university() {
        String name = "BOMBAY";
        System.out.println("Methods Access: " + name);

    }

    public static void main(String[] args) {
        MethodsAccess access = new MethodsAccess();
        access.university();
        college();
        MethodsAccess.college();
    }


}
