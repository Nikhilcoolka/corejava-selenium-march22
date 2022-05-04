package org.matrix.alpha.nikhilesh.Construstor;

public class ConstructorOverloading {
    public ConstructorOverloading() {
        System.out.println(" This in No Parameter");
    }

    public ConstructorOverloading(int age) {
        System.out.println("Age :" + age);
    }

    public ConstructorOverloading(String Name) {
        System.out.println("Name :" + Name);
    }

    public ConstructorOverloading(int age, String Name, String Comp, Double height) {
        System.out.println("Name :" + Name);
        System.out.println("Age :" + age);
        System.out.println("Company Name :" + Comp);
        System.out.println("Height :" + height);
    }

    public static void main(String[] args) {
        ConstructorOverloading par =new ConstructorOverloading();
        System.out.println("---------------------");
        ConstructorOverloading par1 = new ConstructorOverloading(20);
        System.out.println("---------------------");
        ConstructorOverloading par2 = new ConstructorOverloading("Nikhil");
        System.out.println("---------------------");
        ConstructorOverloading par3 = new ConstructorOverloading(20, "Shri", "TCS", 1.2);


    }
}