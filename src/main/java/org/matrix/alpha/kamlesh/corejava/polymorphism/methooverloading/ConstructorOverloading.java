package org.matrix.alpha.kamlesh.polymorphism.methooverloading;

public class ConstructorOverloading {

    public ConstructorOverloading(int a,int b) {
        System.out.println(a-b);
    }
    public ConstructorOverloading() {
        System.out.println("Non parameterized constructor");
    }
    public ConstructorOverloading(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10, 5);
        new ConstructorOverloading("Display method");
    }
}
