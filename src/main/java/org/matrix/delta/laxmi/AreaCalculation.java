package org.matrix.delta.laxmi;

public class AreaCalculation {
    static int squareSide = 25;
    int radius = 5;

    public int areaOfRectangle(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {

        AreaCalculation ar = new AreaCalculation();
        System.out.println("Area of Square:" + (squareSide * squareSide));
        System.out.println("Area of Circle is:" + (3.142 * ar.radius * ar.radius));

        System.out.println("Area of Rectangle is:" + ar.areaOfRectangle(10, 20));
    }
}
