package org.matrix.alpha.nikhilesh.Demo;

public class TestStaticVariable {
    int empId1=100;
    String empName1="Harika";

    static String companyName="Shri";

    int empId2=101;
    String empName2="Aadhira";

    int empId3=103;
    String empName3="Aakashra";

    int empId4=104;
    String empName4="Prajkata";

    int empId5=105;
    String empName5="Arjun";

    public void show1(){
        System.out.println(empId1);
        System.out.println(empName1);
        System.out.println(TestStaticVariable.companyName);
        System.out.println("------------------------");
    }
    public void show2(){
        System.out.println(empId2);
        System.out.println(empName2);
        System.out.println(TestStaticVariable.companyName);
        System.out.println("------------------------");
    }
    public void show3(){
        System.out.println(empId3);
        System.out.println(empName3);
        System.out.println(TestStaticVariable.companyName);
        System.out.println("------------------------");
    }
    public void show4(){
        System.out.println(empId4);
        System.out.println(empName4);
        System.out.println(TestStaticVariable.companyName);
        System.out.println("------------------------");
    }
    public void show5(){
        System.out.println(empId5);
        System.out.println(empName5);
        System.out.println(TestStaticVariable.companyName);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        TestStaticVariable abc=new TestStaticVariable();
        abc.show1();
        abc.show2();
        abc.show3();
        abc.show4();
        abc.show5();
    }
}
