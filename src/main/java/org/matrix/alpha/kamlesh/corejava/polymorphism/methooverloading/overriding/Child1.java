package org.matrix.alpha.kamlesh.polymorphism.methooverloading.overriding;

public class Child1 extends Parent1{

    public void d2(){
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Parent1 p1 = new Parent1();
        Parent1 cp1 = new Child1();
        c1.d2();
        p1.d2();
        cp1.d2();
    }
}
