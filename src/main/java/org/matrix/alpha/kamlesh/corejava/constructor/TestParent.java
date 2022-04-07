package org.matrix.alpha.kamlesh.constructor;

public class TestParent {

    TestParent() {
        System.out.println("I am Parent Class");
    }

    TestParent(int n) {
        System.out.println("Parent overloaded cons");
    }

    public void display(){
        System.out.println("I am Parent Class display");

    }
}
