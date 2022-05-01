package org.matrix.delta.rahul.corejava;

public class SuperKeywordUse extends ExampleClass2 {
    public void getdata() {
        System.out.println(super.idNumber);
        System.out.println(super.studName);
        super.getdata();

    }

    public static void main(String[] args) {
        SuperKeywordUse sp=new SuperKeywordUse();
        sp.getdata();

    }
}
