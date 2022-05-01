package org.matrix.delta.laxmi;

public class JavaPractice {
    AreaCalculation area=new AreaCalculation();

    public void getArea() {
       // area=new AreaCalculation();
        System.out.println("Area of Rectangle is:"+area.areaOfRectangle(2,3));
    }
    public void display(){
        System.out.println("This is in JavaPractice class");
    }


    public static void main(String[] args) {
        int age = 24;
        System.out.println("Print Age:" + age);
        JavaPractice jp = new JavaPractice();
        jp.getArea();
    }
}
