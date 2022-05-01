package org.matrix.lambda.komal.corejava.methods;

// Method with this keyword
public class MethodsConcepts6 {

    public void m1() {
        System.out.println("i'm in m1");
    }

    public void m2() { // if there are 2 m1() methods 1 present in parent etc so calling from current class use this
        this.m1();               // this use for calling current present method and instance var of current class
        System.out.println("i'm in m2");
    }

public String m3(){
        this.m1();
        m2();
        String str ="i'm in m3";   // remove this line and use return "i'm in m3" it'll show correct
        return str;

}
    public static void main(String[] args) {
        MethodsConcepts6 obj =new MethodsConcepts6();
        //obj.m2();

        //obj.m3();               // it will not show I'm in m3
        String st = obj.m3();
        System.out.println(st); // now it will show I'm in m3
    }
}
