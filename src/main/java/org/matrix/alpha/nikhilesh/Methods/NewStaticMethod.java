package org.matrix.alpha.nikhilesh.Methods;

public class NewStaticMethod {
int total=5;
static String companyName="JAVA";

public void getData1(){
    System.out.println(total);

}
public void space() {
    System.out.println("----------------------"); //  Static Method
}

    public static void main(String[] args) {
        NewStaticMethod abc =new NewStaticMethod(); //Object Creation by Import

        abc.getData1();
       abc.space();

       Emplyee nm=new Emplyee(); //Object Creation by Import
        int q=nm.empId1; // We can call Also Using Data_Type & We can Store Value on Data_type ( i.e int q )

        System.out.println(q);

        System.out.println(nm.empId1); /* We Can Call Another Class Data (empId1 ) Using it's That Class Obj
                                         Creation & Call Data [ Obj.Data ( ie nm.empId)  */

        System.out.println(nm.empName1);

        abc.space(); // Satic Method We can Call By Using Obj Creation

        System.out.println(nm.empId2);
        System.out.println(nm.empName2);
        abc.space();

        System.out.println(nm.empId3);
        System.out.println(nm.empName3);
        abc.space();

        System.out.println(nm.empId4);
        System.out.println(nm.empName4);
        abc.space();

        System.out.println(nm.empId5);
        System.out.println(nm.empName5);


    }
}
