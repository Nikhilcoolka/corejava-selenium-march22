package org.matrix.alpha.shamal.java.interfaceconcept;

public class Circle implements Drawable1{

    public void draw(){
        System.out.println("Drawing the circle");
    }

    public void getSides(){
        System.out.println("I have circumfarese");
    }

    @Override
    public void getArea() {
        int pi = 214;
        int r = 10;
        System.out.println("This the area of circle Is :" +(pi * r * r));
    }
}
