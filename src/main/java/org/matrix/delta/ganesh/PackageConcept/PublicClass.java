package org.matrix.delta.ganesh.PackageConcept;

public class PublicClass  {

    public void publicMethod(){
        System.out.println("In public method");
    }

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();
//        publicClass.privateMethod();
//        publicClass.protectedMethod();

    }
}
