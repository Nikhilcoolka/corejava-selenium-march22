package org.matrix.alpha.shamal.java.interfaceconcept;
class Rectangle implements Drawable1{
    public void draw(){
        System.out.println("Drawing the Rectangle");
    }

    public void getSides(){
        System.out.println("I have 4 sides");
    }

    @Override
    public void getArea() {
        int length = 10;
        int breath = 20;

        System.out.println("Area of rectangle is :" +(length * breath));
    }
}
