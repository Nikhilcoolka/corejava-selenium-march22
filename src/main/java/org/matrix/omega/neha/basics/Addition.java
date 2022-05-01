package org.matrix.omega.neha.basics;

public class Addition {
    public void add(){
        int num=0;
        num=num+10;
        System.out.println("The number is:" + num);
    }

    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.add();
    }
}
