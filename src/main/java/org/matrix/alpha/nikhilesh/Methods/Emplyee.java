package org.matrix.alpha.nikhilesh.Methods;

public class Emplyee{
    int empId1 = 101;
    String empName1 ="Nikhil";

    int empId2 = 102;
    String empName2="Pratham";

    int empId3 = 103;
    String empName3 ="Sakhil";

    int empId4 = 104;
    String empName4 ="Vakhil";

    int empId5 = 105;
    String empName5 ="Rakhil";

   public void show(){
       System.out.println(empId1);
       System.out.println(empName1);

       System.out.println(empId2);
       System.out.println(empName2);

       System.out.println(empId3);
       System.out.println(empName3);

       System.out.println(empId4);
       System.out.println(empName4);

       System.out.println(empId5);
       System.out.println(empName5);
   }

    public static void main(String[] args) {
        Emplyee emp=new Emplyee();
        emp.show();
    }
}

