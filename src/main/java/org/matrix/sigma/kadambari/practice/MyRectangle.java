package org.matrix.sigma.kadambari.practice;

public class MyRectangle {
    int lenght;
    int breadth;

    MyRectangle() {
        lenght = 10;
        breadth = 20;
    }

    MyRectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    int area() {
        return lenght * breadth;
    }

    public static void main(String[] args) {
        MyRectangle obj = new MyRectangle();
        MyRectangle obj2 = new MyRectangle(20, 25);
        System.out.println("Area=" + obj2.area());
    }

}
