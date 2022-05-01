package org.matrix.sigma.akash.method;

public class TestMethodWithThisAndSuper extends TestMethod {
    public void getData() {

        System.out.println("i am in getdata class");
    }
    public void getDa(){
        System.out.println("i am in getda");
        this.getData();
        super.getData();
    }
    public static void main(String[] args) {
        TestMethodWithThisAndSuper obj = new TestMethodWithThisAndSuper();
        obj.getData();
        obj.getDa();
    }
}
