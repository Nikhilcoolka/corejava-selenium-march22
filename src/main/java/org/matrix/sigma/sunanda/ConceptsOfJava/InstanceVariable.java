package org.matrix.sigma.sunanda.ConceptsOfJava;

public class InstanceVariable {
    int age = 100;
    public void display(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
    }
}
