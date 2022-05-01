package org.matrix.delta.laxmi;

public class TestMethodWithClassReturnTypeEg {

    public static AreaCalculation getCalculatedArea() {
        return new AreaCalculation();
    }

    public static void main(String[] args) {
        AreaCalculation obj1 = getCalculatedArea();
        int a = obj1.areaOfRectangle(10, 20);
        System.out.println("Calculated area of rectangle using function return type is:" + a);
    }
}
