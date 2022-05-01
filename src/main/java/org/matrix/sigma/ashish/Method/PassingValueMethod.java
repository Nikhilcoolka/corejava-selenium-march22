package org.matrix.sigma.ashish.Method;

public class PassingValueMethod {

    int a = 100;
    int b = 200;

    public static void main(String[] args) {

        PassingValueMethod PVM = new PassingValueMethod();
        PVM.add(10, 20);
        PVM.Mult();
    }

    public void add(int a, int b) {
        System.out.println("Addition of instance Varible Using this  " + (this.a + this.b));
        System.out.println("Addition of local variable   " + (a + b));
    }

    public void Mult() {
        System.out.println("Addition of instance variable " + (a * b));
    }
}
