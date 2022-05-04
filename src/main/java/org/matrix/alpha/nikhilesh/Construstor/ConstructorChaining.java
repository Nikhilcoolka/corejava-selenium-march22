package org.matrix.alpha.nikhilesh.Construstor;

public class ConstructorChaining {
    public ConstructorChaining() {
        this(25);
        System.out.println(" I AM IN 1ST CONSTRUCTOR ");

    }
    public ConstructorChaining(int age) {
        this("nikhil");
        System.out.println("Age " + age);
        System.out.println(" I AM IN 2 nd CONSTRUCTOR ");
    }

    public ConstructorChaining(String name) {
        System.out.println("Name " + name);
        System.out.println(" I AM IN 3 rd CONSTRUCTOR ");
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();

    }
}

