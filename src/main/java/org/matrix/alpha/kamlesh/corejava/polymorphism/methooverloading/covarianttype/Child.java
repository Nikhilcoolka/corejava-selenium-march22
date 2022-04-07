package org.matrix.alpha.kamlesh.polymorphism.methooverloading.covarianttype;


public class Child extends Parent{

    public int m1() {
        System.out.println("In Child method");
        return 1;
    }


    public void display(){
        System.out.println("child m1 method");
    }
    public static void main(String[] args) {
    //Parent obj1 = new Child();
        //obj1.m1();

        Child c = new Child();
        c.m1();
        c.display();
        Parent p = new Parent();

    }
}
