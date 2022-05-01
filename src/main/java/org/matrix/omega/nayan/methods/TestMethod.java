package org.matrix.omega.nayan.methods;

public class TestMethod {


    public void parameters(){

        System.out.println("no parameters default method");
    }
    public void  parameters(int i){

        System.out.println(i);

    }
    public void parameters(int a,String str){
        System.out.println(a);
        System.out.println(str);

    }
    public void parameters(int b,String str,float f){
        System.out.println(b);
        System.out.println(str);
        System.out.println(f);

    }

    public static void main(String[] args) {
        TestMethod obj = new TestMethod();
        obj.parameters();
        obj.parameters(12);
        obj.parameters(12, "raviraj");
        obj.parameters(34, "nayan");
        obj.parameters(100, "rn", 10.11f);
    }

}
