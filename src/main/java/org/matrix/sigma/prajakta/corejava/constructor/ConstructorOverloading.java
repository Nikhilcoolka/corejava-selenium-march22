package org.matrix.sigma.prajakta.corejava.constructor;

public class ConstructorOverloading {

    int id;
    String name;

    public ConstructorOverloading() {
        super();
        System.out.println("This is no-srgs constructor");
    }

    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public ConstructorOverloading(String name) {
        this.name = name;
        System.out.println("Name : " + this.name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        System.out.println("--------------------------");
        ConstructorOverloading obj2 = new ConstructorOverloading(1, "Prajakta");
        System.out.println("-----------------------------");
        ConstructorOverloading obj3 = new ConstructorOverloading("Prajakta");
    }
}
