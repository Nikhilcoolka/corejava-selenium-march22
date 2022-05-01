package org.matrix.sigma.ashish.AccessSpecifier;

public class ParentsSpecifier {

    //access anywhere publiv
    public void m1(){
        System.out.println("in public m1 method");
    }

    //access only in same class not outside class
    private void m2(){
        System.out.println("in private m2 method");
    }

    //within package
    // outside package using extends i.e inheritance
    protected void m3(){
        System.out.println("in protected method");
    }

    //Access only in same package
    void m4(){
        System.out.println("in default method");
    }
    public static void main(String[] args) {

    }
}
