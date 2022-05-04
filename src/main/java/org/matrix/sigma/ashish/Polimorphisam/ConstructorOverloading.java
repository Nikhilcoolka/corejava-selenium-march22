package org.matrix.sigma.ashish.Polimorphisam;

public class ConstructorOverloading {

    public ConstructorOverloading(int a){
        System.out.println(a);
    }

    public ConstructorOverloading(){
        System.out.println("0 Arg. Constructor");
    }

    public ConstructorOverloading(String str,int b){
        System.out.println(str + b);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10);
        new ConstructorOverloading("Ashish",20);
    }

}
