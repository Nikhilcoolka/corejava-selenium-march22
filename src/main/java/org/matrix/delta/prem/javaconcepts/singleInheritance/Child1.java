package org.matrix.delta.prem.javaconcepts.singleInheritance;

public class Child1 extends Parent {

        public void m1(){
            System.out.println("i m in child method ");
        }

    public static void main(String[] args) {
        Child1 obj =new Child1();
        obj.m1();
        obj.m2();
    }
}
