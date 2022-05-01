package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

public class MethodStaticOverrideError extends TestMethod {
    public void getData() {
        System.out.println("i am in getdata class");
    }
 /*   public void getData1(){
        System.out.println("i am in getdata1");
        this.getData();
        super.getData();
    }*/    // un-comment for override error
    public static void main(String[] args) {
        MethodStaticOverrideError obj = new MethodStaticOverrideError();
        obj.getData();
        //obj.getData1();
    }
}
/* override error cause : because there is a static method in parent which conflicts
                          when u have i-method with same name in child.
 note : line 6 gives u override symbol by jvm/ide/intellij java interpreter
        override :- Same Signature method in parent class and child class
                     you cannot override s-method of parent class as i-method in child class */