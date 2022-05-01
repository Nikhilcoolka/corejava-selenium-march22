package org.matrix.sigma.sunanda.ConceptsOfJava.MethodConcept;

public class MethodsConceptNo03 {
    int a = 100;
    int b = 200;
    public void add (int a,int b){
        System.out.println(this.a + this.b);  // this refers to current class instance
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodsConceptNo03 obj = new MethodsConceptNo03();
        obj.add(10,20);
    }
}
