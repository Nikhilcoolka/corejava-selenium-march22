package org.matrix.sigma.prajakta.corejava;

public class LocalVariable {
    //local variable are access only in methods,constructor and blocks.

    LocalVariable(){
        int a=20;
        System.out.println(a);
    }

    void getVariable(){
        int i=10;
        System.out.println("This is method local variable"+i);
    }
    public static void main(String[] args) {
        // System.out.println(i);   // we can not acess local variable in static method.

        LocalVariable obj=new LocalVariable();
        obj.getVariable();
    }
}
