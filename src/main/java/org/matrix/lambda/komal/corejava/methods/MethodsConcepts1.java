package org.matrix.lambda.komal.corejava.methods;

// value assign to variables type

public class MethodsConcepts1 {
    int i = 100;
    int j = 200;

    public void add(int i, int j) {
        // System.out.println(this.i+this.j); //by using this. it refers to current class instance i.e.100 200
        System.out.println(i + j);
    }

    public void getData(String str, int j, String abc) {
        // System.out.println(this.i+this.j); //by using this. it refers to current class instance i.e.100 200
        System.out.println(str);
        System.out.println(j);
        System.out.println(abc);
    }

    public static void main(String[] args) {
        MethodsConcepts1 obj = new MethodsConcepts1();
        // obj.add(10,20);          //values go to instance i,j coz of this keyword
        obj.add(10, 20);      //values go to methods parameters i,j

        obj.getData("komal", 33, "rohan");
    }
}
