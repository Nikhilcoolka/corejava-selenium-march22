package org.matrix.delta.rahul.method;

public class MethodWithRT {
    int add,sub,mul;
    float div;
    public int addtion(int a, int b) {

        return add=a + b;
    }

    public int substarction(int a, int b) {
        return sub=a - b;
    }

    public int multiplication(int a, int b) {
        return mul=a * b;
    }

    public float division(int a, int b) {
        return div= a / b;
    }
 void show(){
     System.out.println("Addition is "+add);
     System.out.println("---------------------");
     System.out.println("Addition is "+sub);
     System.out.println("---------------------");
     System.out.println("Addition is "+mul);
     System.out.println("---------------------");
     System.out.println("Addition is "+div);

 }
    public static void main(String[] args) {
        MethodWithRT obj=new MethodWithRT();
        obj.addtion(10,52);
        obj.substarction(25,20);
        obj.multiplication(10,3);
        obj.division(30,3);
        obj.show();
    }
}
