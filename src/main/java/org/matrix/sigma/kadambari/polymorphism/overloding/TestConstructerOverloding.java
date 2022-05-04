package org.matrix.sigma.kadambari.polymorphism.overloding;

public class TestConstructerOverloding {
    public TestConstructerOverloding(int a){
        System.out.println(a);
    }
    public TestConstructerOverloding(String s) {
        System.out.println(s);
    }
        public TestConstructerOverloding(String s,int b){
            System.out.println(s+b);
        }

    public static void main(String[] args) {
        new TestConstructerOverloding(10);
         new TestConstructerOverloding("Kadambari");
         new TestConstructerOverloding("shravi",4);
    }

}
