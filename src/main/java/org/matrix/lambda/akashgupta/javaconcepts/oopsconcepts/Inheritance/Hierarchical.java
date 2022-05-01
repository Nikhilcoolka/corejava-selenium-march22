package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark();                          //C.T.Error (cannot because Cat doesn't extends Dog)
        Dog d = new Dog();
        d.bark();
    }
}
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}