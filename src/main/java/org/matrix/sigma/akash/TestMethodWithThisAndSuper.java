package org.matrix.sigma.akash;

public class TestMethodWithThisAndSuper extends TestMethod{
    public void getData() {
        System.out.println("i am in getdata class");
    }
    public void getDa(){
        System.out.println("i am in getdata1");
        this.getData();
        super.getData();
    }
    public static void main(String[] args) {
        TestMethodWithThisAndSuper obj = new TestMethodWithThisAndSuper();
        obj.getData();
        obj.getDa();
    }
}
