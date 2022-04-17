package org.matrix.alpha.nikhilesh.Methods;

public class NewStaticMethod {
int total=5;
static String companyName="JAVA";

public void getData1(){
    System.out.println(total);

}

    public static void main(String[] args) {
        NewStaticMethod abc =new NewStaticMethod(); //Object Creation by Import

        abc.getData1();

       Emplyee nm=new Emplyee(); //Object Creation by Import

        System.out.println(nm.empId1); //
        System.out.println(nm.empName1);
        System.out.println("------------------------");

        System.out.println(nm.empId2);
        System.out.println(nm.empName2);
        System.out.println("------------------------");

        System.out.println(nm.empId3);
        System.out.println(nm.empName3);
        System.out.println("------------------------");

        System.out.println(nm.empId4);
        System.out.println(nm.empName4);
        System.out.println("------------------------");

        System.out.println(nm.empId5);
        System.out.println(nm.empName5);


    }
}
