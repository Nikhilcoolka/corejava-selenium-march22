package org.matrix.sigma.prajakta.corejava.methods;

import org.matrix.sigma.prajakta.corejava.EmployeeDemo;

public class MethodCallingConcept {

    //method calling from different class
    public void getData(){
        EmployeeDemo obj=new EmployeeDemo();
        obj.getData2();

    }

    //method with return type
    public int add(int a,int b){

        return a+b;
    }

    public String getName(String name){
        return name;
    }

    public static void main(String[] args) {
        MethodCallingConcept obj=new MethodCallingConcept();
        obj.getData();

        int c=obj.add(10,20);
        System.out.println("Addition:-"+c);

        String str= obj.getName("Prajakta");
        System.out.println("My name is :"+str);
    }
}
