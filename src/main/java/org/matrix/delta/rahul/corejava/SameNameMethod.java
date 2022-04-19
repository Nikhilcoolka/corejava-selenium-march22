package org.matrix.delta.rahul.corejava;

/*
We can not use same method name &date type of parameter
 */
public class SameNameMethod {
    public void getData(int a) {
        System.out.println("Excute the getData()");
        System.out.println(a);
    }
    /*
   public void getData(int a){
        System.out.println("Excute the Getdata()");

    }*/

    public static void main(String[] args) {
        SameNameMethod obj = new SameNameMethod();
        obj.getData(25);
    }
}
