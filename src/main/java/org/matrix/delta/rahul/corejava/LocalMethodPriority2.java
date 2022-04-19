package org.matrix.delta.rahul.corejava;

public class LocalMethodPriority2 {
    int a = 100;//instance Variable
    int b = 200;//instance Variable

    public void addition(int a, int b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
        /* if the same variable used instance and local and
         want to access instance variable in the method then use this keyword.
         */
    }

    public static void main(String[] args) {
        LocalMethodPriority2 l = new LocalMethodPriority2();
        l.addition(10, 20);
    }
}
