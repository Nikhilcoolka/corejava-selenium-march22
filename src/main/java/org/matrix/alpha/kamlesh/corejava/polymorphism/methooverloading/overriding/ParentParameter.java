package org.matrix.alpha.kamlesh.polymorphism.methooverloading.overriding;

public class ParentParameter {
    public void m1(){
        int n =10;
        String str="PP1";

        System.out.println(n);
        System.out.println(str);
    }
    public static void main(String[] args) {
        ParentParameter obj = new ParentParameter();;
        obj.m1();
    }
}
